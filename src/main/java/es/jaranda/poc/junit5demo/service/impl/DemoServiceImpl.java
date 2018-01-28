
package es.jaranda.poc.junit5demo.service.impl;

import es.jaranda.poc.junit5demo.service.DemoService;
import org.springframework.stereotype.Service;

@Service
public class DemoServiceImpl implements DemoService {

    // TODO convert into property with default value
    private static final String GREETING_HELLO_WORLD_MESSAGE = "Hello JUnit 5!";

    @Override
    public String sayHelloWorld() {
        return GREETING_HELLO_WORLD_MESSAGE;
    }

}
