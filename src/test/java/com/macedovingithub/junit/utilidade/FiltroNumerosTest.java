package com.macedovingithub.junit.utilidade;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FiltroNumerosTest {

    @Test
    public void deveRetornarNumerosPares() {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4);

        // -> O código abaixo vai fazer o teste falhar!
        // List<Integer> numerosParaesEsperados = Arrays.asList(4, 2);
        List<Integer> numerosParaesEsperados = Arrays.asList(2, 4);

        List<Integer> resultadoFiltro = FiltroNumeros.numerosPares(numeros);

        // -> ASSERÇÃO que verifica tanto o CONTEÚDO quanto a ORDEM DOS ELEMENTOS
        Assertions.assertIterableEquals(numerosParaesEsperados,resultadoFiltro);

        // -> ASSERÇÃO específica para ARRAYS, precisando refatorar os ARGUMENTOS, neste exemplo
        // Assertions.assertArrayEquals(numerosParaesEsperados.toArray(new Object[]{}), resultadoFiltro.toArray(new Object[]{}));
    }
}