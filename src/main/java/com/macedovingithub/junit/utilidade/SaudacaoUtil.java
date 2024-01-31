package com.macedovingithub.junit.utilidade;

public class SaudacaoUtil {

    private SaudacaoUtil() {
        
    }

    public static String saudar(int hora) {
        if (hora >= 0 && hora <= 11) {
            return "Bom dia";
            // Faz o teste do método falhar
            // return "Bom dia 123";
        } else if(hora >= 12 && hora <= 17) {
            return "Boa tarde";
        } else if(hora >= 18 && hora <= 23) {
            return "Boa noite";
        }

        // Faz o teste de EXCEÇÂO falhar por não ter exceção
        // return null;

        // Faz o teste de EXCEÇÂO falhar por não ter a mensagem esperada
        // throw new IllegalArgumentException("");
        throw new IllegalArgumentException("Hora inválida");
    }

}
