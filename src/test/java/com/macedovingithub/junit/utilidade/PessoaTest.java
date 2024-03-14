package com.macedovingithub.junit.utilidade;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PessoaTest {

    @Test
    void assercaoAgrupada() {

        Pessoa pessoa = new Pessoa("Vinicius", "Macedo");

//      -> Compara o resultado do teste com o assertAll()
//        assertEquals("Vinicius", pessoa.getNome());
//        assertEquals("Macedo", pessoa.getSobrenome());

        assertAll("Asserções de pessoa",
                () -> assertEquals("Vinicius", pessoa.getNome()),
                () -> assertEquals("Macedo", pessoa.getSobrenome())
        );
    }
}