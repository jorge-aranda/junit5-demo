
package es.jaranda.poc.junit5demo.service.impl;

import es.jaranda.poc.junit5demo.service.DemoService;
import org.springframework.stereotype.Service;

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

    public String delayedHelloWorld() throws InterruptedException {
        Thread.sleep(DELAY_IN_MILLIS);
        return sayHelloWorld();
    }

}
