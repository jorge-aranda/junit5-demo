
package es.jaranda.poc.junit5demo.service;

import java.util.stream.Stream;

public interface DemoService {
    String sayHelloWorld();
    Stream<String> giveMeFruits();
    String delayedHelloWorld() throws InterruptedException;
}
