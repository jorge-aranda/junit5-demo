
package es.jaranda.poc.junit5demo.service.impl;

import es.jaranda.poc.junit5demo.service.DemoService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;
import java.util.stream.Stream;

@Service
public class DemoServiceImpl implements DemoService {

    // TODO convert into property with default value
    private static final String GREETING_HELLO_WORLD_MESSAGE = "Hello JUnit 5!";
    // TODO convert into property with default value
    private static final long DELAY_IN_MILLIS = 5000L;

    @Override
    public String sayHelloWorld() {
        return GREETING_HELLO_WORLD_MESSAGE;
    }

    @Override
    public Stream<String> giveMeFruits() {
        final Optional<String> singleFruit = Optional.of("Apple");
        final Stream<String> manyFruits = Stream.of("Pear", "Banana");

        final List<String> moreFruits =
                List.of("Coconut", "Watermellon", "Strawberry");

        return Stream.concat(
                    Stream.concat(
                        singleFruit.stream(),
                        manyFruits
                    ), moreFruits.stream()
        );
    }

    public String delayedHelloWorld() throws InterruptedException {
        Thread.sleep(DELAY_IN_MILLIS);
        return sayHelloWorld();
    }

}
