package com.macedovingithub.junit.utilidade;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class SimuladorEsperaTest {

    @Test
    public void deveEsperarENaoDarTimeout() {

        // Vai FALHAR somente quando o método terminar sua execução, em tempo maior que o da asserção
        //Assertions.assertTimeout(Duration.ofSeconds(1), () -> SimuladorEspera.esperar(Duration.ofSeconds(10)));

        // Vai FALHAR logo após o témino do tempo da asserção, caso a execução do método seja em tempo maior
        //Assertions.assertTimeoutPreemptively(Duration.ofSeconds(1), () -> SimuladorEspera.esperar(Duration.ofSeconds(10)));

        // O teste vai PASSAR -> Tempo menor de execução do método
        Assertions.assertTimeoutPreemptively(Duration.ofSeconds(1), () -> SimuladorEspera.esperar(Duration.ofMillis(10)));
    }
}