package br.com.dio.metodosJava;

/*
2 - Sobrecargas:

Conceituação:

É a capacidade de definir métodos para diferentes contextos, mas preservando seu nome.

Criação:

- Alterar a assinatura do método:
    Ass = nome + parâmetros
    Exemplos:
            converterParaInteiro(float f);
            converterParaInteiro(double d);
            converterParaInteiro(String s);
            converterParaInteiro(float f, RoundType rd);
            converterParaInteiro(double d, RoundType rd);
            converterParaInteiro(String s, RoundType rd);

            converterParaInteiro(RoundType rd, String s);
            converterParaInteiro();

    Mais Exemplos:

            https://docs.oracle.com/javase/7/docs/api/java/io/PrintStream.html
            https://docs.oracle.com/javase/7/docs/api/java/lang/String.html

Curiosdades:
    Sobrecarga x Sobrescrita

 */

/**
 * EXERCÍCIO:
 * Criar uma aplicação que calcula a área dos 3 quadriláteros notáveis:
 * - quadrado;
 * - retângulo;
 * - trapézio;
 *
 * OBS.: Use sobrecarga.
 */

public class sobrecarga {
    public static void main(String[] args) {

        // Quadrilátero
        System.out.println("Exercício Quadrilátero:");
        Quadrilatero.area(2);
        Quadrilatero.area(5d, 5d);
        Quadrilatero.area(7, 8, 9);
        Quadrilatero.area(5f, 5f);
    }
}
