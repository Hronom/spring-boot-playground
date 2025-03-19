package com.github.hronom.spring_boot_playground.service;

import com.github.hronom.spring_boot_playground.service.event.TestEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ExampleAService {
    private final ApplicationEventPublisher applicationEventPublisher;

    public ExampleAService(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }

    public void test() {
        applicationEventPublisher.publishEvent(new TestEvent("ggg"));
    }
}
