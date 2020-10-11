package br.com.rabbitmq.springboot.producer.rest;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.newrelic.api.agent.Trace;

import br.com.rabbitmq.springboot.producer.bean.Aluno;



@RestController
@RequestMapping("/escola")
public class UsuarioController {
	
	@Autowired
	private RabbitTemplate rabbitTemplate;
	
	@Trace(dispatcher = true)
	@GetMapping("health")
	public String getHealth() {
		return "OK";
	}
	
	@PostMapping("health2")
	public String getHealth(@RequestParam("nome") String nome) {
		return "OK"+nome;
	}

	@PostMapping("aluno")
	public Aluno getAluno(@RequestBody Aluno aluno) {
		return aluno;
	}
	
	@GetMapping("/vai")
	public void feedQueue() {
		try {
			//rabbitTemplate.setRoutingKey("red");
			rabbitTemplate.convertAndSend("test-exchange","red", "kkkkkkkkkkkk");			
		} catch (Exception e) {
			System.out.println("Error: "+e.getMessage());
		}
	}
	
	
}