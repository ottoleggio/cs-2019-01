const funcao = require("../exercicios.js");

test("primo satisfaz (caso classico)", () => {
    expect(funcao.primo(3)).toBe(true);
});

test("primo satisfaz (caso classico)", () => {
    expect(funcao.primo(19)).toBe(true);
});

test("primo satisfaz (caso classico)", () => {
    expect(funcao.primo(229)).toBe(true);
});

test("primo satisfaz (caso classico)", () => {
    expect(funcao.primo(4)).toBe(false);
});

test("primo satisfaz (caso classico)", () => {
    expect(funcao.primo(192)).toBe(false);
});

test("valor não é um número", () => {
    expect(() => { funcao.primo("a"); }).toThrow(TypeError);
});

