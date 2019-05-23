const funcao = require("../exercicios.js");

const test1 = [0];
for (let i = 1; i < 19; i++) {
    test1[i] = 0;
}

test("crivoEratostenes satisfaz (caso classico)", () => {
    expect(funcao.crivoEratostenes(test1)).toBe(true);
});


test("valor não é um número", () => {
    expect(() => { funcao.crivoEratostenes("a"); }).toThrow(TypeError);
});

const test2 = [0,0,0,0,0,0,0,0,0,"a"];


test("valor fora da faixa", () => {
    expect(() => { funcao.crivoEratostenes(test2); }).toThrow(RangeError);
});