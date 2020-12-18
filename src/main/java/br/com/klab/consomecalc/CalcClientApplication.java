package br.com.klab.consomecalc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class CalcClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(CalcClientApplication.class, args);
	}

}
