const funcao = require("../exercicios.js");

test("fibonacci satisfaz (caso classico)", () => {
    expect(funcao.f19(7)).toBe(13);
});

test("valor não é um número", () => {
    expect(() => { funcao.f19("a"); }).toThrow(TypeError);
});

test("valor fora da faixa", () => {
    expect(() => { funcao.f19(-1); }).toThrow(RangeError);
});