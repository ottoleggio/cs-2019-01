const funcao = require("../exercicios.js");

test("153 satisfaz (caso classico)", () => {
  expect(funcao.f2(153)).toBe(true);
});

test("153 nao satisfaz", () => {
  expect(funcao.f2(154)).toBe(false);
});

test("valor não é um número", () => {
  expect(() => { funcao.f2("a"); }).toThrow(TypeError);
});

test("valor fora da faixa", () => {
  expect(() => funcao.f2(10000)).toThrow(RangeError);
});


