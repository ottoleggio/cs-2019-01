const funcao = require("../exercicios.js");

test("mod satisfaz (caso classico)", () => {
    expect(funcao.f4(11,10)).toBe(1);
});

test("valor não é um número", () => {
    expect(() => { funcao.f4("a", 2); }).toThrow(TypeError);
});

test("valor não é um número", () => {
    expect(() => { funcao.f4(1, "b"); }).toThrow(TypeError);
});

test("valor fora da faixa", () => {
    expect(() => { funcao.f4(1, -1); }).toThrow(RangeError);
});

test("valor fora da faixa", () => {
    expect(() => { funcao.f4(-1, 1); }).toThrow(RangeError);
});