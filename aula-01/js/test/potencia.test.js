const funcao = require("../algoritmos.js");

test("potencia satisfaz (caso classico)", () => {
    expect(funcao.verificaPotencia(5,2)).toBe(25);
});

test("valor não é um número", () => {
    expect(() => { funcao.verificaPotencia("a",2); }).toThrow(TypeError);
});

test("valor não é um número", () => {
    expect(() => { funcao.verificaPotencia(2,"a"); }).toThrow(TypeError);
});

test("valor fora da faixa", () => {
    expect(() => { funcao.verificaPotencia(-1, 2); }).toThrow(RangeError);
});

test("valor fora da faixa", () => {
    expect(() => { funcao.verificaPotencia(1, -2); }).toThrow(RangeError);
});