const funcao = require("../exercicios.js");

test("CPF satisfaz (caso classico)", () => {
  expect(funcao.f2(var frutas = [3,2,5,3,8,6,4,9,8,7,0])).toBe(true);
});

test("primeiro digito verificador nao satisfaz", () => {
  expect(funcao.f2(var frutas = [3,2,5,3,8,6,4,9,8,8,0])).toBe(false);
});

test("segundo digito verificador nao satisfaz", () => {
  expect(funcao.f2(var frutas = [3,2,5,3,8,6,4,9,8,7,1])).toBe(false);
});

test("segundo digito verificador nao satisfaz", () => {
  expect(funcao.f2(var frutas = ["a","b","c",3,8,6,4,9,8,7,1])).toBe(false);
});

test("tamanho do vetor nao satisfaz", () => {
  expect(funcao.f2(var frutas = [3,2,5,3,8,6,4,9,8,7,1,2,3])).toBe(false);
});

test("tamanho do vetor nao satisfaz", () => {
  expect(funcao.f2(var frutas = [3,2,5,3,8,6,4])).toBe(false);
});

test("argumento null/undefined", () => {
  expect(() => { funcao.f2(); }).toThrow(TypeError);
});

test("argumento nao é um vetor", () => {
  expect(() => { funcao.f2(1); }).toThrow(TypeError);
});
