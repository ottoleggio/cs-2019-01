const funcao = require("../exercicios7.js");

test("ContaLetras satisfaz (caso classico)", () => {
    expect(funcao.verificaContaLetras("octavio aug   s")).toBe(11);
});

test("ContaLetras satisfaz (caso classico)", () => {
    expect(funcao.verificaContaLetras("octavioaugs")).toBe(11);
});

test("argumento null/undefined", () => {
    expect(() => { funcao.verificaContaLetras(); }).toThrow(TypeError);
});