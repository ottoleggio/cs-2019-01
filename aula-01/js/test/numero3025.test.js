const funcao = require("../exercicios.js");

test("3025 satisfaz (caso classico)", () => {
  expect(funcao.f3(3025)).toBe(true);
});

test("3024 nao satisfaz", () => {
  expect(funcao.f3(3024)).toBe(false);
});

test("argumento null/undefined", () => {
  expect(() => { funcao.f3(); }).toThrow();
});

test("argumento nao numerico", () => {
  expect(() => { funcao.f3("abcd"); }).toThrow();
});


test("valor negativo fora da faixa", () => {
  expect(() => { funcao.f3(-1); }).toThrow(RangeError);
});

test("valor com mais de 4 digitos fora da faixa", () => {
  expect(() => funcao.f3(10000)).toThrow(RangeError);
});

test("valor deve ser inteiro", () => {
  expect(() => funcao.f3(10.3)).toThrow(RangeError);
});
