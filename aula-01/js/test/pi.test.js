const funcao = require("../algoritmos.js");

test("pi satisfaz (caso classico)", () => {
    expect(funcao.verificaPi(1000)).toBe(3.140592653839794);
});

test("valor não é um número", () => {
    expect(() => { funcao.verificaPi("a"); }).toThrow(TypeError);
});

test("valor fora da faixa", () => {
    expect(() => { funcao.verificaPi(0); }).toThrow(RangeError);
});