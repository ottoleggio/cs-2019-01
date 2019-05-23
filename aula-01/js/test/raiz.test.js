const funcao = require("../exercicios.js");

test("raiz satisfaz (caso classico)", () => {
    expect(funcao.f13(4, 100)).toBe(2.0);
});

test("valor não é um número", () => {
    expect(() => { funcao.f13("a",100); }).toThrow(TypeError);
});

test("valor não é um número", () => {
    expect(() => { funcao.f13(100,"a"); }).toThrow(TypeError);
});

test("valor fora da faixa", () => {
    expect(() => { funcao.f13(0, 100); }).toThrow(RangeError);
});