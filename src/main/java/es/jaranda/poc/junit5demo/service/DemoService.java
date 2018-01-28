
package es.jaranda.poc.junit5demo.service;

public interface DemoService {
    String sayHelloWorld();
    String delayedHelloWorld() throws InterruptedException;
}
