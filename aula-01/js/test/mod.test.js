const funcao = require("../exercicios.js");

test("mod satisfaz (caso classico)", () => {
    expect(funcao.verificaMod(11,10)).toBe(1);
});

test("valor não é um número", () => {
    expect(() => { funcao.verificaMod("a", 2); }).toThrow(TypeError);
});

test("valor não é um número", () => {
    expect(() => { funcao.verificaMod(1, "b"); }).toThrow(TypeError);
});

test("valor fora da faixa", () => {
    expect(() => { funcao.verificaMod(1, -1); }).toThrow(RangeError);
});

test("valor fora da faixa", () => {
    expect(() => { funcao.verificaMod(-1, 1); }).toThrow(RangeError);
});