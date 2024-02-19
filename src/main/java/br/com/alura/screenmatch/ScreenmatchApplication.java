package br.com.alura.screenmatch;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.alura.model.DadosSerie;
import br.com.alura.services.ConsumoApi;
import br.com.alura.services.ConverteDados;

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreenmatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		var consumoApi = new ConsumoApi();
		var json = consumoApi.obterDados("http://www.omdbapi.com/?t=chuck&apikey=242deea2");
		System.out.println(json);
		
		ConverteDados conversor = new ConverteDados();
		DadosSerie infoSerie = conversor.obterDados(json, DadosSerie.class);
		System.out.println(infoSerie);
	}

}
