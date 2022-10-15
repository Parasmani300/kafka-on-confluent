package com.example.kafkaonconfluent.scheduler;

import com.example.kafkaonconfluent.entity.SampleModel;
import com.example.kafkaonconfluent.kafka.SampleProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@EnableScheduling
public class SampleScheduler {

    @Autowired
    SampleProducer sampleProducer;

    @Scheduled(fixedDelay = 3000)
    public void produceMessage()
    {
        List<SampleModel> sampleModels = new ArrayList<>();

        sampleModels.add(new SampleModel(1,"2",3));
        sampleModels.add(new SampleModel(1,"2",3));
        sampleModels.add(new SampleModel(1,"2",3));
        sampleModels.add(new SampleModel(1,"2",3));

        sampleModels.forEach((myModel)->{
            if(sampleProducer.doSales(myModel)){
                System.out.println("Successfully Published");
            }else{
                System.out.println("Issue in prodcuing message");
            }
        });

    }
}
