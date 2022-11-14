package com.sacavix.mq.dummy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sacavix.mq.publisher.Publisher;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class DummyService {

	@Autowired
	private Publisher publisher;
	
	public void sendToRabbit(String message) {	
		Data d = new Data(12, message);
		log.info("Message '{}' will be send ... ", d);
		this.publisher.send(d);
	}
	
}
