const funcao = require("../exercicios.js");

test("logaritmoNatural satisfaz (caso classico)", () => {
    expect(funcao.f10(2,2)).toBe(5.0);
});

test("valor não é um número", () => {
    expect(() => { funcao.f10("a",2); }).toThrow(TypeError);
});

test("valor não é um número", () => {
    expect(() => { funcao.f10(2,"a"); }).toThrow(TypeError);
});

test("valor fora da faixa", () => {
    expect(() => { funcao.f10(0,2); }).toThrow(RangeError);
});

test("valor fora da faixa", () => {
    expect(() => { funcao.f10(2,3); }).toThrow(RangeError);
});