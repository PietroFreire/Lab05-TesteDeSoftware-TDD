package test;

import main.NotaBimestral;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NotaBimestralTest {

    NotaBimestral nota = new NotaBimestral();

    @Test
    public void testeParticaoEquivalencia() {
        System.out.println("Teste de Partição de Equivalência");
        assertEquals("Nota Válida", nota.setNota(7));
        assertEquals("Nota Inválida", nota.setNota(-1));
        assertEquals("Nota Inválida", nota.setNota(12));
    }

    @Test
    public void testeAnaliseValorLimite() {
        System.out.println("Teste de Análise de Valor Limite");
        assertEquals("Nota Inválida", nota.setNota(-1));
        assertEquals("Nota Válida", nota.setNota(0));
        assertEquals("Nota Válida", nota.setNota(10));
        assertEquals("Nota Inválida", nota.setNota(11));
    }
}