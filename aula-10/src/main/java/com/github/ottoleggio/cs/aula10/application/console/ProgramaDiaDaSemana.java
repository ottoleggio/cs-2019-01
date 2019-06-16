package com.github.ottoleggio.cs.aula10.application.console;

import java.io.IOException;
//import java.util.logging.Logger;

import com.github.ottoleggio.cs.aula10.domain.ValidaEntradaUtils;
//import java.util.logging.Logger;

//import com.github.ottoleggio.cs.aula10.domain.ProcessaDataUtils;

/**
* Executa ProgramaInteiro.
*
* @author Octavio Lo Leggio
*/
public final class ProgramaDiaDaSemana {
    /**
    * Mensagem de retorno do programa.
    */
    //private static Logger log = Logger.getLogger(ProgramaDiaDaSemana.class.getName());
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
        entrada[0] = "20181231";
        entrada[1] = "2000";
        entrada[2] = "20181231";
        entrada[3] = "2";
        System.out.println(ValidaEntradaUtils.validadorEntrada(entrada));
        //System.exit(ValidaEntradaUtils.validadorEntrada(args));
        

    }
}
