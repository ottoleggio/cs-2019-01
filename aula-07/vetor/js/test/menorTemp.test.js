const funcao = require("../exercicios7.js");

var test1 = [3, 2, 5, 3, 8, 6, 4, 9, 8, 8, 0];

test("MenorTemp satisfaz (caso classico)", () => {
    expect(funcao.verificaMenorTemp(test1)).toBe(0);
});

var test2 = [3, 2, 5, 3, 8, -1, 4, 9, 8, 8, 0];

test("MenorTemp satisfaz (caso classico)", () => {
    expect(funcao.verificaMenorTemp(test2)).toBe(-1);
});

var test3 = ["a","b","c",3,8,6,4,9,8,7,1];

test("conteudo do vetor nao satisfaz", () => {
    expect(() => { funcao.verificaMenorTemp(test3); }).toThrow(RangeError);
});