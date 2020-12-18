package br.com.klab.consomecalc.model;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class Calculo {
    public Map<String, String> headers;
    public String operacao;
    public Float valor1;
    public Float valor2;
//    public List<Float> lista;
    public Float resultado;

    public Calculo retornoCalc(Map<String, String> headers, Float valor1, Float valor2) {
        this.headers = new HashMap<>();
        this.headers.put("password", headers.get("password"));
        this.headers.put("operacao", headers.get("operacao"));

        this.operacao = headers.get("operacao");
        this.valor1 = valor1;
        this.valor2 = valor2;
        return this;
    }
}
