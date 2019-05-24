const funcao = require("../exercicios.js");

test("quadradoPerfeito satisfaz (caso classico)", () => {
    expect(funcao.verificaQuadradoPerfeito(25)).toBe(true);
});

test("quadradoPerfeito não satisfaz (caso classico)", () => {
    expect(funcao.verificaQuadradoPerfeito(24)).toBe(false);
});

test("valor não é um número", () => {
    expect(() => { funcao.verificaQuadradoPerfeito("a"); }).toThrow(TypeError);
});

test("valor fora da faixa", () => {
    expect(() => { funcao.verificaQuadradoPerfeito(0); }).toThrow(RangeError);
});