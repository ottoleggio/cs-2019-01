const funcao = require("../exercicios.js");

test("mdc2 satisfaz (caso classico)", () => {
    expect(funcao.f17(95, 50)).toBe(5.0);
});

test("valor não é um número", () => {
    expect(() => { funcao.f17("a", 50); }).toThrow(TypeError);
});

test("valor não é um número", () => {
    expect(() => { funcao.f17(95, "a"); }).toThrow(TypeError);
});

test("valor fora da faixa", () => {
    expect(() => { funcao.f17(95, 100); }).toThrow(RangeError);
});

test("valor fora da faixa", () => {
    expect(() => { funcao.f17(95, 0); }).toThrow(RangeError);
});