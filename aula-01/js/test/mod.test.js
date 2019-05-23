const funcao = require("../exercicios.js");

test("mod satisfaz (caso classico)", () => {
    expect(funcao.mod(11,10)).toBe(1);
});

test("valor não é um número", () => {
    expect(() => { funcao.mod("a", 2); }).toThrow(TypeError);
});

test("valor não é um número", () => {
    expect(() => { funcao.mod(1, "b"); }).toThrow(TypeError);
});

test("valor fora da faixa", () => {
    expect(() => { funcao.mod(1, -1); }).toThrow(RangeError);
});

test("valor fora da faixa", () => {
    expect(() => { funcao.mod(-1, 1); }).toThrow(RangeError);
});