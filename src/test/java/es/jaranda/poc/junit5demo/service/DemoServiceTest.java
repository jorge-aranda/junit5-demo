
package es.jaranda.poc.junit5demo.service;

import es.jaranda.poc.junit5demo.service.impl.DemoServiceImpl;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.ThrowingSupplier;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

public class DemoServiceTest {

    private static final long CONFIGURED_DELAY_IN_MILLIS = 5000L;
    private static final long MARGIN_DELAY_IN_MILLIS = 500L;
    private static final long EXPECTED_DELAY_IN_MILLIS =
            CONFIGURED_DELAY_IN_MILLIS + MARGIN_DELAY_IN_MILLIS;

    private static final String EXPECTED_MESSAGE = "Hello JUnit 5!";

    @DisplayName("should not exceeded delay timeout!'")
    @Test
    public void shouldNotExceededDelayTimeout() {
        // GIVEN:
        final DemoService demoService = new DemoServiceImpl();
        // WHEN
        final ThrowingSupplier<String> response =
                demoService::delayedHelloWorld;
        // THEN:
        assertTimeout(
                Duration.ofMillis(EXPECTED_DELAY_IN_MILLIS), response
        );
    }

    @DisplayName("should say 'Hello JUnit 5!' when delay timeout is expired")
    @Test
    public void shouldSayHelloJUnit5WhenDelayTimeoutIsExpired()
           throws Throwable {
        // GIVEN:
        final DemoService demoService = new DemoServiceImpl();
        // WHEN:
        final ThrowingSupplier<String> response =
                demoService::delayedHelloWorld;
        // THEN:
        assertEquals(EXPECTED_MESSAGE, response.get());
    }

}
