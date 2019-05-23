const funcao = require("../exercicios.js");

test("fibonacci satisfaz (caso classico)", () => {
    expect(funcao.fibonacci(7)).toBe(13);
});

test("valor não é um número", () => {
    expect(() => { funcao.fibonacci("a"); }).toThrow(TypeError);
});

test("valor fora da faixa", () => {
    expect(() => { funcao.fibonacci(-1); }).toThrow(RangeError);
});