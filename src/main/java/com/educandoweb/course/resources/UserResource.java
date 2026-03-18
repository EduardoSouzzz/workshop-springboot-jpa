package com.educandoweb.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.course.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findAll() {
		User u = new User(1, "Zé", "zezao10@gmail.com", "1195679273", "ze1910abc");
		
		// retorna a resposta com sucesso
		// body = retornar o corpo da resposta
		return ResponseEntity.ok().body(u);
	}

}
