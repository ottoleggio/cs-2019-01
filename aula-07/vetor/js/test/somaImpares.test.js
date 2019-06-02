const funcao = require("../exercicios7.js");

var test1 = [3, 2, 5, 3, 8, 6, 4, 9, 8, 8, 0];

test("SomaImpares satisfaz (caso classico)", () => {
    expect(funcao.verificaSomaImpares(test1)).toBe(20);
});

var test2 = ["a","b","c",3,8,6,4,9,8,7,1];

test("conteudo do vetor nao satisfaz", () => {
    expect(() => { funcao.verificaSomaImpares(test2); }).toThrow(RangeError);
});

test("argumento null/undefined", () => {
    expect(() => { funcao.verificaSomaImpares(); }).toThrow(TypeError);
});