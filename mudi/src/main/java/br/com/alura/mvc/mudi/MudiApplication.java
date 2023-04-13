package br.com.alura.mvc.mudi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

/**
 * parando no 2.1 -> 24/02/2023
 * parando no 2.2 -> 27/02/2023
 * parando no 3.3 -> 02/03/2023
 * parando no 3.3 -> 06/03/2023
 * parando no 6.5 -> 23/03/2023
 * eu troquei dataDeEntrada por dataDaEntrada
 */
@EnableCaching
@SpringBootApplication
public class MudiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MudiApplication.class, args);
	}

}
