package org.ajeet.learnings.spring.springboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public final class RSVPEventConsumer {
    private final Logger LOG = LoggerFactory.getLogger(RSVPEventConsumer.class);

    @KafkaListener(topics = "spatial", groupId = "spatial_group")
    public void consume(String rsvpEvent) throws IOException {
        LOG.info(rsvpEvent);
    }
}