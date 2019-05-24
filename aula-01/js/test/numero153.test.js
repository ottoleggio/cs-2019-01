const funcao = require("../exercicios.js");

test("153 satisfaz (caso classico)", () => {
    expect(funcao.verificaNumero153(153)).toBe(true);
});

test("153 nao satisfaz", () => {
    expect(funcao.verificaNumero153(154)).toBe(false);
});

test("valor não é um número", () => {
    expect(() => { funcao.verificaNumero153("a"); }).toThrow(TypeError);
});

test("valor fora da faixa", () => {
    expect(() => funcao.verificaNumero153(10000)).toThrow(RangeError);
});


