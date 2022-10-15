package com.example.kafkaonconfluent;

import com.example.kafkaonconfluent.config.RootConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Import({RootConfig.class})
@SpringBootApplication
public class KafkaOnConfluentApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaOnConfluentApplication.class, args);
	}

}
