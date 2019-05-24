const funcao = require("../exercicios.js");

test("somaNaturais satisfaz (caso classico)", () => {
    expect(funcao.verificaSomaNaturais(2)).toBe(3);
});

test("somaNaturais satisfaz (caso classico)", () => {
    expect(funcao.verificaSomaNaturais(1)).toBe(1);
});

test("valor não é um número", () => {
    expect(() => { funcao.verificaSomaNaturais("a"); }).toThrow(TypeError);
});

test("valor fora da faixa", () => {
    expect(() => { funcao.verificaSomaNaturais(0); }).toThrow(RangeError);
});