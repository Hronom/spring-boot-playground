package com.github.hronom.spring_boot_playground.service;

import com.github.hronom.spring_boot_playground.service.event.TestEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.concurrent.ThreadLocalRandom;

@Slf4j
@Service
public class ExampleBService {
    @EventListener
    public void onTestEvent(TestEvent testEvent) throws IOException {
        log.info("Consumed event {}", testEvent);
        if (ThreadLocalRandom.current().nextBoolean()) {
            throw new RuntimeException("Test exception");
        }
    }
}
