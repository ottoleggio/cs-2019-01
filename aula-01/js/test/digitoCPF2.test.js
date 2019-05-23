const funcao = require("../exercicios.js");

const test1 = [3,2,5,3,8,6,4,9,8,7,0];

test("CPF satisfaz (caso classico)", () => {
  expect(funcao.digitoCPF2(test1)).toBe(true);
});

const test2 = [3,2,5,3,8,6,4,9,8,8,0];

test("primeiro digito verificador nao satisfaz", () => {
  expect(funcao.digitoCPF2(test2)).toBe(false);
});

const test3 = [3,2,5,3,8,6,4,9,8,7,1];

test("segundo digito verificador nao satisfaz", () => {
  expect(funcao.digitoCPF2(test3)).toBe(false);
});

const test4 = ["a","b","c",3,8,6,4,9,8,7,1];

test("conteudo do vetor nao satisfaz", () => {
  expect(() => { funcao.digitoCPF2(test4); }).toThrow(RangeError);
});

const test5 = [3,2,5,3,8,6,4,9,8,7,1,2,3];

test("tamanho do vetor nao satisfaz", () => {
  expect(() => { funcao.digitoCPF2(test5); }).toThrow(RangeError);
});

const test6 = [3,2,5,3,8,6,4];

test("tamanho do vetor nao satisfaz", () => {
  expect(() => { funcao.digitoCPF2(test6); }).toThrow(RangeError);
});

test("argumento null/undefined", () => {
  expect(() => { funcao.digitoCPF2(); }).toThrow(TypeError);
});

test("argumento nao é um vetor", () => {
  expect(() => { funcao.digitoCPF2(1); }).toThrow(TypeError);
});