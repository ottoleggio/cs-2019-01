const funcao = require("../algoritmos.js");

test("3025 satisfaz (caso classico)", () => {
    expect(funcao.verificaNumero3025(3025)).toBe(true);
});

test("3024 nao satisfaz", () => {
    expect(funcao.verificaNumero3025(3024)).toBe(false);
});

test("argumento null/undefined", () => {
    expect(() => { funcao.verificaNumero3025(); }).toThrow();
});

test("argumento nao numerico", () => {
    expect(() => { funcao.verificaNumero3025("abcd"); }).toThrow();
});


test("valor negativo fora da faixa", () => {
    expect(() => { funcao.verificaNumero3025(-1); }).toThrow(RangeError);
});

test("valor com mais de 4 digitos fora da faixa", () => {
    expect(() => funcao.verificaNumero3025(10000)).toThrow(RangeError);
});

test("valor deve ser inteiro", () => {
    expect(() => funcao.verificaNumero3025(10.3)).toThrow(RangeError);
});
