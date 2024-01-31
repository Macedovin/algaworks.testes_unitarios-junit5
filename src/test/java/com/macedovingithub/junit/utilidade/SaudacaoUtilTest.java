package com.macedovingithub.junit.utilidade;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SaudacaoUtilTest {

    @Test
    public void saudar() {
        String saudacao = SaudacaoUtil.saudar(9);
        // System.out.println(saudacao);
        Assertions.assertTrue(saudacao.equals("Bom dia"));
    }
}