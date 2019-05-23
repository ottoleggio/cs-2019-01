const funcao = require("../exercicios.js");

test("primo satisfaz (caso classico)", () => {
    expect(funcao.f14(3)).toBe(true);
});

test("primo satisfaz (caso classico)", () => {
    expect(funcao.f14(19)).toBe(true);
});

test("primo satisfaz (caso classico)", () => {
    expect(funcao.f14(229)).toBe(true);
});

test("primo satisfaz (caso classico)", () => {
    expect(funcao.f14(4)).toBe(false);
});

test("primo satisfaz (caso classico)", () => {
    expect(funcao.f14(192)).toBe(false);
});

test("valor não é um número", () => {
    expect(() => { funcao.f14("a"); }).toThrow(TypeError);
});

test("valor fora da faixa", () => {
    expect(() => { funcao.f14(1); }).toThrow(RangeError);
});