const funcao = require("../exercicios.js");

test("diaDaSemana satisfaz (caso classico)", () => {
    expect(funcao.diaDaSemana(9,5,2017)).toBe(1);
});

test("valor negativo fora da faixa", () => {
    expect(() => { funcao.diaDaSemana(-9,5,2017); }).toThrow(RangeError);
});

test("valor negativo fora da faixa", () => {
    expect(() => { funcao.diaDaSemana(9,-5,2017); }).toThrow(RangeError);
});

test("dia fora da faixa", () => {
    expect(() => { funcao.diaDaSemana(32,5,2017); }).toThrow(RangeError);
});

test("mês fora da faixa", () => {
    expect(() => { funcao.diaDaSemana(9,13,2017); }).toThrow(RangeError);
});

test("ano fora da faixa", () => {
    expect(() => { funcao.diaDaSemana(9,5,1752); }).toThrow(RangeError);
});