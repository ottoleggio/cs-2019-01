const funcao = require("../exercicios.js");

test("somaNaturais satisfaz (caso classico)", () => {
    expect(funcao.f5(2)).toBe(3);
});

test("somaNaturais satisfaz (caso classico)", () => {
    expect(funcao.f5(1)).toBe(1);
});

test("valor não é um número", () => {
    expect(() => { funcao.f5("a"); }).toThrow(TypeError);
});

test("valor fora da faixa", () => {
    expect(() => { funcao.f5(0); }).toThrow(RangeError);
});