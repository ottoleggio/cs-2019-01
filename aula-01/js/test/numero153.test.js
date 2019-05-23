const funcao = require("../exercicios.js");

test("153 satisfaz (caso classico)", () => {
  expect(funcao.numero153(153)).toBe(true);
});

test("153 nao satisfaz", () => {
  expect(funcao.numero153(154)).toBe(false);
});

test("valor não é um número", () => {
  expect(() => { funcao.numero153("a"); }).toThrow(TypeError);
});

test("valor fora da faixa", () => {
  expect(() => funcao.numero153(10000)).toThrow(RangeError);
});


