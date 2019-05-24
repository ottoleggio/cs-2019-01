const funcao = require("../exercicios.js");

var test1 = [0,1,2];

test("horner satisfaz (caso classico)", () => {
    expect(funcao.verificaHorner(1, test1)).toBe(12);
});

test("valor não é um número", () => {
    expect(() => { funcao.verificaHorner(1, null); }).toThrow(TypeError);
});

test("valor não é um número", () => {
    expect(() => { funcao.verificaHorner(1, "a"); }).toThrow(TypeError);
});

var test2 = [0,1,"2"];

test("valor fora da faixa", () => {
    expect(() => { funcao.verificaHorner(1, test2); }).toThrow(RangeError);
});

var test3 = [];

test("valor fora da faixa", () => {
    expect(() => { funcao.verificaHorner(1, test3); }).toThrow(RangeError);
});