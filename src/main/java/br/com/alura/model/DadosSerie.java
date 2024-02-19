package br.com.alura.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

 
@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosSerie(
		@JsonAlias("Title") String titulo,
		@JsonAlias("Plot") String sinopse, 
		@JsonAlias("Year") String ano, 
		@JsonAlias("Genre") String genero,
		@JsonAlias("totalSeasons") Integer temporadas,
		@JsonAlias("imdbRating") String avaliacao){

}
