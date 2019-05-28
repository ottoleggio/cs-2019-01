const funcao = require("../algoritmos.js");

test("mod satisfaz (caso classico)", () => {
    expect(funcao.verificaFatorial(5)).toBe(120);
});

test("valor não é um número", () => {
    expect(() => { funcao.verificaFatorial("a"); }).toThrow(TypeError);
});

test("valor não é um número", () => {
    expect(() => { funcao.verificaFatorial(0); }).toThrow(RangeError);
});