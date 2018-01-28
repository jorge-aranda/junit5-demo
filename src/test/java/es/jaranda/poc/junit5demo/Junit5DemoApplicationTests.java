
package es.jaranda.poc.junit5demo;

import es.jaranda.poc.junit5demo.service.DemoService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 *
 * based on: <a>https://howtoprogram.xyz/2017/09/12/junit-5-spring-boot-example/</a>
 */
@ExtendWith(SpringExtension.class)
@SpringBootTest
public class Junit5DemoApplicationTests {

    private static final String EXPECTED_MESSAGE = "Hello JUnit 5!";

    @Autowired
    private DemoService demoService;

    @Test
    public void contextLoads() {
        // test spring boot context load
    }

    @Test
    public void shouldSayHelloJUnit5() {
        // WHEN
        final String message = demoService.sayHelloWorld();

        // THEN
        assertEquals(EXPECTED_MESSAGE, message);
    }

}
