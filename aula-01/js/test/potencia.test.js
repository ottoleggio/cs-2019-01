const funcao = require("../exercicios.js");

test("potencia satisfaz (caso classico)", () => {
    expect(funcao.potencia(5,2)).toBe(25);
});

test("valor não é um número", () => {
    expect(() => { funcao.potencia("a",2); }).toThrow(TypeError);
});

test("valor não é um número", () => {
    expect(() => { funcao.potencia(2,"a"); }).toThrow(TypeError);
});

test("valor fora da faixa", () => {
    expect(() => { funcao.potencia(-1, 2); }).toThrow(RangeError);
});

test("valor fora da faixa", () => {
    expect(() => { funcao.potencia(1, -2); }).toThrow(RangeError);
});