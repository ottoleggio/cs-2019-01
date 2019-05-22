const funcao = require("../exercicios.js");

test("mod satisfaz (caso classico)", () => {
    expect(funcao.f6(5)).toBe(120);
});

test("valor não é um número", () => {
    expect(() => { funcao.f6("a"); }).toThrow(TypeError);
});

test("valor não é um número", () => {
    expect(() => { funcao.f6(0); }).toThrow(RangeError);
});