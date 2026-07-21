package com.alibu.videocall;

import com.alibu.videocall.user.User;
import com.alibu.videocall.user.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class VideocallApplication {

	public static void main(String[] args) {
		SpringApplication.run(VideocallApplication.class, args);
	}

// time stamp 14 : 11s
	@Bean
	public CommandLineRunner commandLineRunner(UserService service)
	{
		return  args ->{
			service.register(User.builder()
					.username("henry")
					.email("henry@gmail.com")
					.password("1234")
					.build());
			service.register(User.builder()
					.username("john")
					.email("john@gmail.com")
					.password("1234")
					.build());

			service.register(User.builder()
					.username("ana")
					.email("ana@gmail.com")
					.password("1234")
					.build());

		};

	}
}
