package test;

import main.Ano;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnoTest {
    Ano ano = new Ano();

    @Test
    public void testeParticaoEquivalencia() {
        System.out.println("Teste de Partição de Equivalência");
        Assertions.assertEquals("Data Inválida", ano.setAno(1800));
        Assertions.assertEquals("Data Válida", ano.setAno(1922));
        Assertions.assertEquals("Data Inválida", ano.setAno(2021));
    }

    @Test
    public void testeAnaliseValorLimite() {
        System.out.println("Teste de Análise de Valor Limite");
        Assertions.assertEquals("Data Inválida", ano.setAno(1899));
        Assertions.assertEquals("Data Válida", ano.setAno(1900));
        Assertions.assertEquals("Data Válida", ano.setAno(2020));
        Assertions.assertEquals("Data Inválida", ano.setAno(2021));
    }

}