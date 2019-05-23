const funcao = require("../exercicios.js");

const test1 = [0,1,2];

test("horner satisfaz (caso classico)", () => {
    expect(funcao.horner(1, test1)).toBe(12);
});

test("valor não é um número", () => {
    expect(() => { funcao.horner(1, null); }).toThrow(TypeError);
});

test("valor não é um número", () => {
    expect(() => { funcao.horner(1, "a"); }).toThrow(TypeError);
});

const test2 = [0,1,"2"];

test("valor fora da faixa", () => {
    expect(() => { funcao.horner(1, test2); }).toThrow(RangeError);
});

const test3 = [];

test("valor fora da faixa", () => {
    expect(() => { funcao.horner(1, test3); }).toThrow(RangeError);
});