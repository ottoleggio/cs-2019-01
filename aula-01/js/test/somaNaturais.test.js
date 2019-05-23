const funcao = require("../exercicios.js");

test("somaNaturais satisfaz (caso classico)", () => {
    expect(funcao.somaNaturais(2)).toBe(3);
});

test("somaNaturais satisfaz (caso classico)", () => {
    expect(funcao.somaNaturais(1)).toBe(1);
});

test("valor não é um número", () => {
    expect(() => { funcao.somaNaturais("a"); }).toThrow(TypeError);
});

test("valor fora da faixa", () => {
    expect(() => { funcao.somaNaturais(0); }).toThrow(RangeError);
});