const funcao = require("../exercicios.js");

var test1 = [3,2,5,3,8,6,4,9,8,7,0];

test("CPF satisfaz (caso classico)", () => {
  expect(funcao.verificaDigitoCPF(test1)).toBe(true);
});

var test2 = [3,2,5,3,8,6,4,9,8,8,0];

test("primeiro digito verificador nao satisfaz", () => {
  expect(funcao.verificaDigitoCPF(test2)).toBe(false);
});

var test3 = [3,2,5,3,8,6,4,9,8,7,1];

test("segundo digito verificador nao satisfaz", () => {
  expect(funcao.verificaDigitoCPF(test3)).toBe(false);
});

var test4 = ["a","b","c",3,8,6,4,9,8,7,1];

test("conteudo do vetor nao satisfaz", () => {
  expect(() => { funcao.verificaDigitoCPF(test4); }).toThrow(RangeError);
});

var test5 = [3,2,5,3,8,6,4,9,8,7,1,2,3];

test("tamanho do vetor nao satisfaz", () => {
  expect(() => { funcao.verificaDigitoCPF(test5); }).toThrow(RangeError);
});

var test6 = [3,2,5,3,8,6,4];

test("tamanho do vetor nao satisfaz", () => {
  expect(() => { funcao.verificaDigitoCPF(test6); }).toThrow(RangeError);
});

test("argumento null/undefined", () => {
  expect(() => { funcao.verificaDigitoCPF(); }).toThrow(TypeError);
});

test("argumento nao é um vetor", () => {
  expect(() => { funcao.verificaDigitoCPF(1); }).toThrow(TypeError);
});

