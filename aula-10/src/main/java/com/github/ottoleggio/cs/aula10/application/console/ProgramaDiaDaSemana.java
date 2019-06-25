package com.github.ottoleggio.cs.aula10.application.console;

import com.github.ottoleggio.cs.aula10.domain.ProcessaDataUtils;

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
        System.exit(ProcessaDataUtils.executaPrograma(args));
    }
}
