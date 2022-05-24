package br.com.dio.javaFundamental;

/*

Variéveis:

Existem  4 tipos de variáveis:
Instancia: pertence ao objeto;
Classe: pertence a classe;
Local: está dentro de métodos;
Parâmetros: está na assinatura do método;


Padrão definição:

<?visibilidade?><?modificador?> tipo nome <?=valorinicial?>;

OBS: Tudo que está dentro de <??> não é obridatorio, como vemos no exemplo, apenas o tipo de dado será obrigatório.
Java é uma linguagem fortemente tipada.

V: "public", "protected" e "private"
M: "static" e "final"
T: tipo de dado
N: nome que é fornecido a variável
VI: valor inicial, caso se deseje

Convenções e regras:

- Não devem começar com números;
- Embora permitido, $ e "_" devem ser evitados;
- São case-sensitive;
- Sem espaços;
- Não podem ser usadas palavras reservadas do Java:

abstract, continue, for, new, switch, assert, defaut, goto, package, synchonizedboolean, do, if, private, this, break,
double, case, Implements, throw, protected, byte, else, import, public, throws, enum, instanceof, return, transient,
catch, extends, int, short, try, char, final, interface, static, void, class, finally, long, strictfp, volatile, const,
float, native, super, while.

Boas práticas:

- Sempre começar com letra minúscula;
- Nomes expressivos;
- Notação camelo;
- Quando constante(final) maiúscula e separada por "_";

*/

/**
 * Classe de exemplo para o exercício da Aula 1 de Variáveis, Tipos de Dados e Operadores aritméticos.
 */

public class variaveis {

    public static void main(String[] args) {
        // Variáveis locais:
        int i;
        // int i;    - Não se pode inicializar uma variável com um nome já utilizado
        int I;    // - Por ser case-sencitive o 'I' maiúculo é uma variável totalmete diferente do 'i' minúsculo
        // int 1a;   - Não se pode iniciar o nome de uma variável com um numero
        int _1a;  // - Mesmo que aceito não esta de acordo com as boas práticas
        int $aq;  // - Mesmo que aceito não esta de acordo com as boas práticas

        i = 5;
        I = 10;
        _1a = 20;
        $aq = 7;

        final int j = 10;
        // j = 15;                  - Não se pode mudar o valor de uma variável final
        int asrn12678md;
        // int asrn246 78md;        - Não se usa espaços no nome de uma variável
        int asnr2$4678_md = 10;  // - Mesmo que aceito não esta de acordo com as boas práticas
        // int asrn2$46%78_md = 10; - Não se usa simbolos no nome de uma variável

        asrn12678md = 100;

        int quantidadeProduto = 50;
        // int QuantidadeProduto;          - Apesar de aceita, não segue a boa prática de primeira letra em minúculo
        final int NUMERO_TENTATIVAS = 5;
        // final int numeroTentativas = 5; - Apesar de aceita, não segue a regra de boas práticas de variáveis final de todas as letras maiúsculas
        int QUANTIDADE_OPCOES = 25;     // - Por não ser uma variável final, não deveria ser escrita com letras maiúculas
        int qtdProd;                    // - Não possui expressividade, dificil definição

        System.out.println(i);
        System.out.println(I);
        System.out.println(_1a);
        System.out.println($aq);

        System.out.println(j);
        System.out.println(asrn12678md);
        System.out.println(asnr2$4678_md);

        System.out.println(quantidadeProduto);
        System.out.println(NUMERO_TENTATIVAS);
        System.out.println(QUANTIDADE_OPCOES);


    }


}
