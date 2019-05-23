const funcao = require("../exercicios.js");

test("quadradoPerfeito satisfaz (caso classico)", () => {
    expect(funcao.f12(25)).toBe(true);
});

test("quadradoPerfeito não satisfaz (caso classico)", () => {
    expect(funcao.f12(24)).toBe(false);
});

test("valor não é um número", () => {
    expect(() => { funcao.f12("a"); }).toThrow(TypeError);
});

test("valor fora da faixa", () => {
    expect(() => { funcao.f12(0); }).toThrow(RangeError);
});