package com.java.api.service;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.java.api.bean.Pokemon;

@Component
public class PokemonService implements CommandLineRunner
{
	private static void pokemonRestService()
	{
		RestTemplate retemplate = new RestTemplate();
		Pokemon pokemon = retemplate.getForObject("https://pokeapi.co/api/v2/pokemon-species", Pokemon.class);
		System.out.print("Pokemon " + pokemon.getName());
	}

	@Override
	public void run(String... args) throws Exception {
		pokemonRestService();
		
	}
}
