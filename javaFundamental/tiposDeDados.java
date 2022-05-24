package br.com.dio.javaFundamental;

/*

Tipos de dados:

Conceituação:

São os valores e consequentemente operações que as variáveis podem assumir e sofrer, respectivamente.

Tipificação:

- Estática(forte) vs Dinâmica(fraca);
  - Estática(forte) *linguagem compilada*: quando uma linguagem obriga a definir o tipo da variável ja no momento da sua criação. Já no momento da
    compilação vai ser detectado qual o tipo daquela variável, e ela será sempre aquele tipo.

  - Dinâmica(fraca) *linguagem interpretada*: não se faz necessário a definição do tipo da variável no momento de sua criação, durante a execução da
    aplicação a linguagem irá detectar qual o valor foi atribuido a variável e ela assumira o tipo daquele valor.

- Primitivo vs Composto;

Opções de tipos:

- Textual;
- Numeral;
- Lógico;
- Objetos;

Exemplos Numeral:
 - byte:   -128 até 127                                              -> byte b = 12;
 - short:  -32.768 até 32.767                                        -> short s = -15785;
 - int:    -2.147.483.648 até 2.147.483.647                          -> int i = 8515785;
 - long:   -9.223.372.036.854.775.808 até -9.223.372.036.854.775.808 -> long l = 5938515785L;
 - float:  +-3.40282347E+38F                                         -> float f = 3.14...(f);
 - double: +-1.79769313486231570E+308                                -> double d = 3.14...(d);

Exemplo Textual:
 - char: caracteres de 16-bit unicode  -> char c = '\u0084' (código da leta 'T' maiúscula); ou char c = 'T';
 - String: um tipo "especial"          -> String s = "T"

Boas práticas:

Usar de forma adequada cada tipo de dado para cada informação.

 */
public class tiposDeDados {
    public static void main(String[] args) {
        byte b1 = 12;
        byte b2 = 20;

        short s1 = 20000;
        // short s2 = 400000; -> ultrapassa os valores suportados para esse tipo de dado.

        // int i1 = -10000000000; -> ultrapassa os valores negativos suportados para esse tipo de dado.
        int i2 = 28500;

        long l1 = 1000000000000000000L;
        long l2 = 1000000000000000000L;

        // float f1 = 4.5; -> não foi definifo como float, falta a identificação 'f' após o valor.
        float f2 = 10.68f;

        double d1 = 85.69;
        double d2 = 99.84d;

        char c1 = 'w';
        // char c2 = 'Tw'; -> o tipo char suporta apenas 1 caracter.
        char c3 = '\u0057'; // -> Unicode do caracter 'W'

        String st1 = "Fulano";
        String st2 = "Cicrano";
        String st3 = "ad dgb se et t FDGFHDFH %&%*&&%* 4585768787";

        boolean bo1 = true;
        boolean bo2 = false;

        System.out.println(b1);
        System.out.println(b2);

        System.out.println(i2);

        System.out.println(l1);
        System.out.println(l2);

        System.out.println(f2);

        System.out.println(d1);
        System.out.println(d2);

        System.out.println(c1);
        System.out.println(c3);

        System.out.println(st1);
        System.out.println(st2);

        System.out.println(bo1);
        System.out.println(bo2);

    }
}
