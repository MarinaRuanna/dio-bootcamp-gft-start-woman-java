package br.com.dio.logicaCondicionalJava;

/*
Operadores Relacionais:

Conceituação:

São símbolos especiais quais são capazes de realizar comparações entre determinados operandos e, em seguida,
retornar um resultado.

Tipos:
 - Similaridade: igual, diferente
 - Tamanho: maor, maior igual, menor, menor igual

Utilização:

Similaridade:

 - Igualdade: determina se um operando é igual ao outro
 - Diferença: determuna se um operando não é igual ao outro
 - símbologia:
        - igualdade: ==
        - diferença: !=

Tamanho:
 - Menor: determina se um operando é menor do que o outro
 - Menor igual: determina se um operando é menor ou igual a outro
 - Símbologia:
        - menor: <
        - menor igual: <=
 - Maior: determina se um operando é maior do que o outro
 - Maior igual: determina se um operando é maior ou igual a outro
 - Símbologia:
        - maior: <
        - maior igual: <=
 */

/**
 * EXERCÍCIO:
 * Criar um simples projeto no IntelliJ para realizar as comparações do slide anterior, além de utilizar os demais
 * tipos de dados não apresentados
 */

public class operadoresRelacionais {
    public static void main(String[] args) {

        int i1 = 10;
        int i2 = 20;

        float f1 = 4.5f;
        float f2 = 3.5f;

        double d1 = 59.6d;

        char c1 = 'x';
        char c2 = 'y';

        String s1 = "Fulano";
        String s2 = "Fulano";
        String s3 = "cicrano";

        boolean b1 = true;
        boolean b2 = false;

        long l1 = 1597L;
        long l2 = 8997L;

        byte y1 =1;

        short h1 =25;

        System.out.println("i1 == i2 " + (i1 == i2));
        System.out.println("i1 != i2 " + (i1 != i2));
        System.out.println("i1 > i2 " +   (i1 > i2));
        System.out.println("i1 <= i2 " + (i1 <= i2));

        System.out.println("f1 == f2 " + (f1 == f2));
        System.out.println("f1 != f2 " + (f1 != f2));
        System.out.println("f1 >= f2 " + (f1 >= f2));
        System.out.println("f1 < f2 " + (f1 < f2));

        System.out.println("c1 == c2 " + (c1 == c2));
        System.out.println("c1 != c2 " + (c1 != c2));
        System.out.println("c1 > c2 " +  (c1 > c2));
        System.out.println("c1 <= c2 " + (c1 == c2));

        System.out.println("s1 == s2 " + (s1 == s2));
        System.out.println("s1 == s3 " + (s1 == s3));
        System.out.println("s1 != s3 " + (s1 != s3));
        // System.out.println(s1 >= s3);
        // System.out.println(s1 < s3);

        System.out.println("b1 == b2 " + (b1 == b2));
        System.out.println("b1 != b2 " + (b1 != b2));
        // System.out.println(b1 > b2);
        // System.out.println(b1 <= b2);

        System.out.println("i2 > f1 " + (i2 > f1));
        System.out.println("d1 == h1 f1 " + (d1 == h1));
        // System.out.println(i2 != c1);
        // System.out.println(s3 != i1);

        System.out.println("l1 == i2 " + (l1 == i2));
        System.out.println("l1 >= i1 " + (l2 >= i1));
        System.out.println("y1 != h1 " + (y1 != h1));




    }
}
