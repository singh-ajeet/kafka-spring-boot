package org.ajeet.learnings.spring.springboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class RSVPEventProducer {
    private static final Logger LOG = LoggerFactory.getLogger(RSVPEventProducer.class);
    private static final String TOPIC = "spatial";

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessage(String rsvpEvent) {
        LOG.info(String.format("#### -> Producing rsvpEvent -> %s",rsvpEvent));
        this.kafkaTemplate.send(TOPIC, rsvpEvent);
    }
}