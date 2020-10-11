package br.com.rabbitmq.springboot.producer;

import org.springframework.amqp.core.Queue;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;



@SpringBootApplication
@PropertySource("classpath:config/application.yml")
@ConfigurationProperties
public class RabbitApplicationProducer {
	
	  static final String directExchangeName = "test-exchange";

	  static final String queueName = "test-queue";

	public static void main(String[] args) {
		SpringApplication.run(RabbitApplicationProducer.class, args);
	}

//    @Bean
//    public Exchange declareExchange() {
//        return ExchangeBuilder.directExchange("test-exchange")
//                .durable(true)
//                .build();
//    }
    
	@Bean
	public Queue myQueue() {
		return new Queue("test-queue");
	}

//	@Bean
//	DirectExchange exchange() {
//		return new DirectExchange(directExchangeName);
//	}
//
//	@Bean
//	Binding binding(Queue queue, DirectExchange exchange) {
//		return BindingBuilder.bind(queue).to(exchange).with("red");
//	}
	
    

}
