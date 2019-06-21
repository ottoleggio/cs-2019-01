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

        String[] entrada = new String[4];
        entrada[0] = "20160312";
        entrada[1] = "2016";
        entrada[2] = "20160228";
        entrada[3] = "5";
        /*     
        System.out.println(ProcessaDataUtils.executaPrograma(entrada[0], entrada[1], entrada[2], entrada[3]));
*/
        System.exit(ProcessaDataUtils.executaPrograma(entrada[0], entrada[1], entrada[2], entrada[3]));
    }
}
