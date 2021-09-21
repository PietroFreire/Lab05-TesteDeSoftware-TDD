package test;

import main.Motorista;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MotoristaTest {

    Motorista motorista = new Motorista();

    @Test
    void testeParticaoEquivalencia() {
        System.out.println("Teste de Partição de Equivalência");
        assertEquals("Renovação a cada 10 anos!", motorista.renovacao(39));
        assertEquals("Renovação a cada 5 anos!", motorista.renovacao(59));
        assertEquals("Renovação a cada 3 anos!", motorista.renovacao(78));
    }


    @Test
    void testeAnaliseValorLimite() {
        System.out.println("Teste de Análise de Valor Limite");
        assertEquals("Renovação a cada 10 anos!", motorista.renovacao(49));
        assertEquals("Renovação a cada 5 anos!", motorista.renovacao(51));
        assertEquals("Renovação a cada 3 anos!", motorista.renovacao(71));
    }
}