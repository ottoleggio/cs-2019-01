const funcao = require("../exercicios.js");

test("pi satisfaz (caso classico)", () => {
    expect(funcao.pi(1000)).toBe(3.140592653839794);
});

test("valor não é um número", () => {
    expect(() => { funcao.pi("a"); }).toThrow(TypeError);
});

test("valor fora da faixa", () => {
    expect(() => { funcao.pi(0); }).toThrow(RangeError);
});