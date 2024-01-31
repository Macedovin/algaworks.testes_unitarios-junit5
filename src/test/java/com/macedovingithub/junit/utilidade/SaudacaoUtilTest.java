package com.macedovingithub.junit.utilidade;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SaudacaoUtilTest {

    @Test
    public void saudar() {
        String saudacao = SaudacaoUtil.saudar(9);

        assertEquals("Bom dia", saudacao, "Comparação de saudação:");
    }

    @Test
    public void deveLancarException() {
        // Assegura que a EXCEÇÃO é lançada
        IllegalArgumentException illegalArgumentException = assertThrows(IllegalArgumentException.class,
                () -> SaudacaoUtil.saudar(-10));
        // Verifica e assegura o conteúdo da mensagem de ERRO!
        assertEquals("Hora inválida", illegalArgumentException.getMessage());
    }

    @Test
    public void naoDeveLancarException() {

        assertDoesNotThrow(() -> SaudacaoUtil.saudar(0));
    }
}