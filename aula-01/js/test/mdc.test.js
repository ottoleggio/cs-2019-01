const funcao = require("../algoritmos.js");

test("mdc satisfaz (caso classico)", () => {
    expect(funcao.verificaMdc(95, 50)).toBe(5.0);
});

test("valor não é um número", () => {
    expect(() => { funcao.verificaMdc("a", 50); }).toThrow(TypeError);
});

test("valor não é um número", () => {
    expect(() => { funcao.verificaMdc(95, "a"); }).toThrow(TypeError);
});

test("valor fora da faixa", () => {
    expect(() => { funcao.verificaMdc(95, 100); }).toThrow(RangeError);
});

test("valor fora da faixa", () => {
    expect(() => { funcao.verificaMdc(95, 0); }).toThrow(RangeError);
});