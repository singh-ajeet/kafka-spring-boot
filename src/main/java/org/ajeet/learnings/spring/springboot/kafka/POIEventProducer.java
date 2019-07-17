package org.ajeet.learnings.spring.springboot.kafka;

import org.ajeet.learnings.spring.springboot.model.POI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class POIEventProducer {
    private static final Logger LOG = LoggerFactory.getLogger(POIEventProducer.class);
   // private static final String TOPIC = "spatial";

    @Value("${spring.kafka.topics}")
    private String topic;

    @Autowired
    private KafkaTemplate<String, POI> kafkaTemplate;

    public void sendMessage(POI pointOfInterest) {
        LOG.info(String.format("#### -> Producing rsvpEvent -> %s", pointOfInterest));
        this.kafkaTemplate.send(topic, pointOfInterest);
    }
}