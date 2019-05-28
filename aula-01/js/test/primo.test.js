const funcao = require("../algoritmos.js");

test("primo satisfaz (caso classico)", () => {
    expect(funcao.verificaPrimo(3)).toBe(true);
});

test("primo satisfaz (caso classico)", () => {
    expect(funcao.verificaPrimo(19)).toBe(true);
});

test("primo satisfaz (caso classico)", () => {
    expect(funcao.verificaPrimo(229)).toBe(true);
});

test("primo satisfaz (caso classico)", () => {
    expect(funcao.verificaPrimo(4)).toBe(false);
});

test("primo satisfaz (caso classico)", () => {
    expect(funcao.verificaPrimo(192)).toBe(false);
});

test("valor não é um número", () => {
    expect(() => { funcao.verificaPrimo("a"); }).toThrow(TypeError);
});

test("valor fora da faixa", () => {
    expect(() => { funcao.verificaPrimo(1); }).toThrow(RangeError);
});