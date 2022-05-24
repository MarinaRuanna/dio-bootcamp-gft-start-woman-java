package br.com.dio.logicaCondicionalJava;

/*
Operadores Lógicos:

Conceituação:

São símbolos especiais quais são capazes de realizar comparações lógicas entre operandos lógicos ou expressões e,
em seguida, retornar um resultado

Tipos:
 - Conjunção
 - Disjunção
 - Disjunção exclusiva
 - Negação

Conjunção: operação lógica que só é verdadeira quando ambos os operandos ou expressões envolvidas são verdade

 - Símbologia: &&
 - Termologia: and(e)

 V && V = V
 V && F = F
 F && V = F
 F && F = F

Disjunção: operação lógica que só é falsa quando ambos os operandos ou expressões envolvidas são falsos

 - Símbologia: ||
 - Termologia: or(ou)

 V || V = V
 V || F = V
 F || V = V
 F || F = F

Disjunção Exclusiva: operação lógica que só é verdadeira quando ambos os operandos ou expressões envolvidas são opostos

 - Símbologia: ^
 - Termologia: xor

 V ^ V = F
 V ^ F = V
 F ^ V = V
 F ^ F = F

Conjunção: operação que inverte o valor lógico de um operando ou expressão

 - Símbologia: !
 - Termologia: inverção

 V ! f
 F ! V

Curiosidades:

Trabalham com bits
 - Operadores bitwise: & e | (não confundor com operadores lógicos)
 - Operadores shift: ~, >>, >>>, <<

Boas Práticas:

Crie variáveis auxiliares para guardar resultados intermediários

(calarioMensal < mediaSalario) && (quantidadeDependentes >=mediaDependentes)

pode ser

(salarioBaixo) && (muitosDependentes)

boolean recebeAuxilio = (salarioBaixo) && (muitosDependentes);
 */

/**
 * EXERCÍCIO
 * Criar um simples projeto no IntelliJ e codificar os exemplos dos slides para compreender as operações lógicas.
 * Utilize operandos e expressões.
 */

public class operadoresLogicos {
    public static void main(String[] args) {

        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = true;
        boolean b4 = false;

        System.out.println("b1 && b2 " + (b1 && b2));
        System.out.println("b1 && b3 " + (b1 && b3));

        System.out.println("b2 || b3 " + (b1 || b3));
        System.out.println("b2 || b4 " + (b2 || b4));

        System.out.println("b1 ^ b3 " + (b1 ^ b3));
        System.out.println("b4 ^ b1 " + (b4 ^ b1));

        System.out.println(!b1);
        System.out.println(!b2);

        int i1 = 19;
        int i2 = 5;

        float f1 = 20f;
        float f2 = 50f;

        System.out.println("((i1 + i2) < (f2 - f1)) && true " + (((i1 + i2) < (f2 - f1)) && true));
        System.out.println("((i1 > i2) || (f2 < f1)) " + (((i1 > i2) || (f2 < f1))));

        double salarioMensal = 11893.58d;
        double mediaSalario = 10500d;

        int quantidadeDependentes = 4;
        int mediaDependentes = 2;

        System.out.println((salarioMensal < mediaSalario) && (quantidadeDependentes >= mediaDependentes));

        boolean salarioBaixo = salarioMensal < mediaSalario;
        boolean muitosDependentes = quantidadeDependentes >= mediaDependentes;

        System.out.println((salarioBaixo) && (muitosDependentes));

        boolean recebeAuxilio = (salarioBaixo) && (muitosDependentes);
        System.out.println("recebeAuxilio " + recebeAuxilio);

    }
}
