package br.com.klab.consomecalc.endpoint;

import br.com.klab.consomecalc.model.Calculo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class Controller {

    @Autowired
    public CalcClient calcClient;

    @GetMapping("{operacao}/{valor1}/{valor2}")
    public ResponseEntity consultaCalc(@RequestHeader Map<String,String> headers,
                                  @PathVariable("operacao") String operacao,
                                  @PathVariable("valor1") Float valor1,
                                  @PathVariable("valor2") Float valor2) {
        headers.put("password","calc-pass");
        headers.put("operacao",operacao);
        return new ResponseEntity(calcClient.geraCalculo(headers, valor1, valor2), HttpStatus.OK);
    }
}
