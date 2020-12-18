package br.com.klab.consomecalc.endpoint;

import br.com.klab.consomecalc.model.Calculo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;

import java.util.Map;

@Service
@FeignClient(url = "http://localhost:8080/calculadora/", name = "calculadora")
public interface CalcClient {

    @GetMapping("/{valor1}/{valor2}")
    Calculo geraCalculo(@RequestHeader Map<String, String> headers,
                        @PathVariable("valor1") Float valor1,
                        @PathVariable("valor2") Float valor2);
}
