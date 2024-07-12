package com.cards.Cards;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.cards.Cards.entity.Role;
import com.cards.Cards.entity.User;
import com.cards.Cards.respository.RoleRepository;
import com.cards.Cards.respository.UserRepository;


@SpringBootApplication
public class CardsApplication   {


	public static void main(String[] args) {
		SpringApplication.run(CardsApplication.class, args);
	}
	
	


}
