package com.example.kafkaonconfluent.kafka;

import com.example.kafkaonconfluent.entity.SampleModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class SampleProducer {

    private String TOPIC = "sample_topic";

    @Autowired
    KafkaTemplate<String,Object> kafkaTemplate;

    public boolean doSales(SampleModel sampleModel)
    {

        try{
            this.kafkaTemplate.send(TOPIC,String.valueOf(sampleModel.getA()),sampleModel);
            return  true;
        }catch (Exception e)
        {
            System.out.println(e.getMessage());
            return false;
        }
    }
}
