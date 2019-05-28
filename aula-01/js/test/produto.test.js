const funcao = require("../algoritmos.js");

test("mod satisfaz (caso classico)", () => {
    expect(funcao.verificaProduto(5,2)).toBe(10);
});

test("valor não é um número", () => {
    expect(() => { funcao.verificaProduto("a",2); }).toThrow(TypeError);
});

test("valor não é um número", () => {
    expect(() => { funcao.verificaProduto(2,"a"); }).toThrow(TypeError);
});

test("valor fora da faixa", () => {
    expect(() => { funcao.verificaProduto(-1, 2); }).toThrow(RangeError);
});

test("valor fora da faixa", () => {
    expect(() => { funcao.verificaProduto(1, -2); }).toThrow(RangeError);
});