const funcao = require("../exercicios.js");

test("quadradoPerfeito satisfaz (caso classico)", () => {
    expect(funcao.quadradoPerfeito(25)).toBe(true);
});

test("quadradoPerfeito não satisfaz (caso classico)", () => {
    expect(funcao.quadradoPerfeito(24)).toBe(false);
});

test("valor não é um número", () => {
    expect(() => { funcao.quadradoPerfeito("a"); }).toThrow(TypeError);
});

test("valor fora da faixa", () => {
    expect(() => { funcao.quadradoPerfeito(0); }).toThrow(RangeError);
});