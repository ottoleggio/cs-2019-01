/*
 * Copyright (c) 2016.
 * Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */

package com.github.ottoleggio.aula11.application.api;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.github.ottoleggio.aula11.domain.Calendario;
import com.github.ottoleggio.aula11.domain.DiaDaSemana;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@RestController
public class DiaDaSemanaController {

    @CrossOrigin
    @RequestMapping("ds") //variavel na url separa com  &
    public DiaDaSemana diaDaSemana(@RequestParam(value="data", defaultValue =
            "não fornecida") String arg, @RequestParam(value="data", defaultValue =
                    "não fornecida") String arg2) {

        LocalDate data = localDateFromString(arg);

        // Se data não é fornecida, ou é inválida, use o dia corrente.
        if (data == null) {
            data = LocalDate.now();
        }

        int dia = data.getDayOfMonth();
        int mes = data.getMonthValue();
        int ano = data.getYear();

        int ds = Calendario.diaDaSemana(dia, mes, ano);

        return new DiaDaSemana(data, Calendario.semana[ds]);
    }

    /**
     * Recupera a instância de {@link LocalDate} correspondente à sequência
     * de caracteres.
     * @param data Sequência de caracteres no formato dd-MM-yyyy.
     *
     * @return Instância de {@link LocalDate} ou {@code null}, se a sequência
     * não está no formato esperado (por exemplo, "01-01-2018")
     */
    public LocalDate localDateFromString(String data) {
        try {
            DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            return LocalDate.parse(data, fmt);
        } catch (Exception exp) {
            return null;
        }
    }
}
