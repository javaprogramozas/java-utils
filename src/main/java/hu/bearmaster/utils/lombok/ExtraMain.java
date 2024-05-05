package hu.bearmaster.utils.lombok;

import lombok.Cleanup;
import lombok.SneakyThrows;
import lombok.Synchronized;
import lombok.extern.java.Log;

import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Log
public class ExtraMain {

    private static int counter = 0;

    public static void main(String[] args) {
        System.out.println(dontLikeCheckedExceptions());
        System.out.println(whatIsTryWithResources());
        countTo10();
        log.info("Houston, we have a problem!");
    }

    @SneakyThrows
    private static String dontLikeCheckedExceptions() {
        return String.join(" ", Files.readAllLines(Path.of("README.md")));
    }

    @SneakyThrows
    private static String whatIsTryWithResources() {
        @Cleanup BufferedReader reader = Files.newBufferedReader(Path.of("README.md"));
        return reader.lines().collect(Collectors.joining(" "));
    }

    @Synchronized
    private static void incrementCounter() {
        counter++;
    }

    private static void countTo10() {
        @Cleanup ExecutorService executors = Executors.newFixedThreadPool(5);
        List<? extends Future<?>> futures = Stream.generate(() -> executors.submit(ExtraMain::incrementCounter))
                .limit(10)
                .toList();

        for (Future<?> future : futures) { // very sloppy
            while (!future.isDone()) {}
        }

        System.out.println(counter);
        //executors.close();
    }

}
