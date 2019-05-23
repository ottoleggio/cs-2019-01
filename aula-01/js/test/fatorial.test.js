const funcao = require("../exercicios.js");

test("mod satisfaz (caso classico)", () => {
    expect(funcao.fatorial(5)).toBe(120);
});

test("valor não é um número", () => {
    expect(() => { funcao.fatorial("a"); }).toThrow(TypeError);
});

test("valor não é um número", () => {
    expect(() => { funcao.fatorial(0); }).toThrow(RangeError);
});