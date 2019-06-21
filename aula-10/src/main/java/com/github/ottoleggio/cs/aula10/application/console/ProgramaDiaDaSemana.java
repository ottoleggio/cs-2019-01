package com.github.ottoleggio.cs.aula10.application.console;

import com.github.ottoleggio.cs.aula10.domain.ProcessaDataUtils;
import com.github.ottoleggio.cs.aula10.domain.ValidaEntradaUtils;

//import com.github.ottoleggio.cs.aula10.domain.ProcessaDataUtils;

/**
* Executa ProgramaInteiro.
*
* @author Octavio Lo Leggio
*/
public final class ProgramaDiaDaSemana {
    /**
    * Método construtor da classe main.
    */
    private ProgramaDiaDaSemana() {

    }
    /**
    * Método main.
    * @param args String de endereço de um arquivo
    *
    * @throws IOException se ocorrer exception de IO
    */
    public static void main(final String[] args) {
/*
        String[] entrada = new String[4];
        entrada[0] = "20181232";
        entrada[1] = "2000";
        entrada[2] = "20181231";
        entrada[3] = "2";
        System.out.println(ValidaEntradaUtils.validadorEntrada(entrada));
        System.exit(ValidaEntradaUtils.validadorEntrada(entrada));

        System.out.println(ProcessaDataUtils.recuaData("20191231", "20170101", 2018));
        System.out.println(ProcessaDataUtils.iteraData("20170101", "20191231", 2018));
        */
        System.out.println(ProcessaDataUtils.recuaDiaDaSemana(8, 0));
    }
}
