package com.cards.Cards;

import java.util.Optional;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.cards.Cards.entity.Role;
import com.cards.Cards.entity.User;
import com.cards.Cards.respository.RoleRepository;
import com.cards.Cards.respository.UserRepository;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@SpringBootApplication
@OpenAPIDefinition(
		info = @Info(
				title = "STIE CARDS",
				description = "STIE Cards Application",
				version = "v1",
				contact = @Contact(name = "MR.stie cards", email = "K@gmail.com",url = "https://stiecards.com")

		),
		externalDocs = @ExternalDocumentation(
				description = "STIE CARDS Api Documents",
				url = "https://stie_cards.com"
		)
)
public class CardsApplication   {


	public static void main(String[] args) {
		SpringApplication.run(CardsApplication.class, args);
	}
	
	


}
