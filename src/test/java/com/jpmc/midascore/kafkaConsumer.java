package com.jpmc.midascore;

import com.jpmc.midascore.foundation.Transaction;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class kafkaConsumer {

    @KafkaListener(topics = "${general.kafka-topic}", groupId = "midas-core-group" )
    public void listen(Transaction transaction){
    }
}
