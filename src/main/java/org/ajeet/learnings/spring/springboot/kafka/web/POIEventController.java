package org.ajeet.learnings.spring.springboot.kafka.web;

import org.ajeet.learnings.spring.springboot.kafka.POIEventProducer;
import org.ajeet.learnings.spring.springboot.model.POI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/kafka")
public final class POIEventController {
    private final Logger LOG = LoggerFactory.getLogger(POIEventController.class);

    @Autowired
    private POIEventProducer rsvpEventProducer;


    @RequestMapping(value = "/publish",
            method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public void sendMessageToKafkaTopic(@RequestBody POI pointOfInterest) {
        this.rsvpEventProducer.sendMessage(pointOfInterest);
    }
}