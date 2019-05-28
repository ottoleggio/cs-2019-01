const funcao = require("../algoritmos.js");

var test1 = [0];
for (let i = 1; i < 19; i++) {
    test1[i] = 0;
}

test("crivoEratostenes satisfaz (caso classico)", () => {
    expect(funcao.verificaCrivoEratostenes(test1)).toBe(true);
});


test("valor não é um número", () => {
    expect(() => { funcao.verificaCrivoEratostenes("a"); }).toThrow(TypeError);
});

var test2 = [0,0,0,0,0,0,0,0,0,"a"];


test("valor fora da faixa", () => {
    expect(() => { funcao.verificaCrivoEratostenes(test2); }).toThrow(RangeError);
});