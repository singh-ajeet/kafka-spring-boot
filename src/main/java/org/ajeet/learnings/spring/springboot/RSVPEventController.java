package org.ajeet.learnings.spring.springboot;

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
public final class RSVPEventController {
    private final Logger LOG = LoggerFactory.getLogger(RSVPEventController.class);

    private final RSVPEventProducer producer;

    @Autowired
    RSVPEventController(RSVPEventProducer producer) {
        this.producer = producer;
    }


    @RequestMapping(value = "/publish",
            method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public void sendMessageToKafkaTopic(@RequestBody String rsvpEvent) {
        this.producer.sendMessage(rsvpEvent);
    }
}