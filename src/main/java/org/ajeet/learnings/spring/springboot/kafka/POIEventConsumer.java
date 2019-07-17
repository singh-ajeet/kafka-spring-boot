package org.ajeet.learnings.spring.springboot.kafka;

import org.ajeet.learnings.spring.springboot.model.POI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public final class POIEventConsumer {
    private final Logger LOG = LoggerFactory.getLogger(POIEventConsumer.class);

    /**
     * Read topic names from application.yaml
     *
     * @param pointOfInterest
     * @throws IOException
     */
    @KafkaListener(topics = "#{'${spring.kafka.topics}'.split(',')}")
    public void consume(POI pointOfInterest) throws IOException {
        LOG.info(pointOfInterest.toString());
    }
}