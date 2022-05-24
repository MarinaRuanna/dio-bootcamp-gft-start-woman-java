# BOOTCAMP DIGITAL INNOVATION ONE - GFT START WOMAN

## Java Fundamental:

## 1 - Variáveis:

### Conceituação e Criação:

*Existem  4 tipos de variáveis:*
 - Instancia: pertence ao objeto;
 - Classe: pertence a classe;
 - Local: está dentro de métodos;
 - Parâmetros: está na assinatura do método

### Padrão definição:

***</?visibilidade?></?modificador?> tipo nome </?=valorinicial?>;***

OBS: Tudo que está dentro de </??> não é obridatorio, como vemos no exemplo, apenas o tipo de dado será obrigatório.
Java é uma linguagem fortemente tipada.

### Convenções e regras:

- Não devem começar com números;
- Embora permitido, $ e "_" devem ser evitados;
- São case-sensitive;
- Sem espaços;
- Não podem ser usadas palavras reservadas do Java:
  
*abstract, continue, for, new, switch, assert, defaut, goto, package, synchonizedboolean, do, if, private, this, break, double,
case, Implements, throw, protected, byte, else, import, public, throws, enum, instanceof, return, transient, catch, extends,
int, short, try, char, final, interface, static, void, class, finally, long, strictfp, volatile, const, float, native, super, while.*

### Boas práticas:

- Sempre começar com letra minúscula;
- Nomes expressivos;
- Notação camelo;
- Quando constante(final) maiúscula e separada por "_";


## 2 - Tipos de Dados:

### Conceituação:

São os valores e consequentemente operações que as variáveis podem assumir e sofrer, respectivamente.

### Tipificação:

- **Estática**(forte - *linguagem compilada*) vs **Dinâmica**(fraca - *linguagem interpretada*);
   
           - Estática: quando uma linguagem obriga a definir o tipo da variável já no momento da sua criação. Logo no momento da
      compilação vai ser detectado qual o tipo daquela variável, e ela será sempre aquele tipo.

          - Dinâmica: não se faz necessário a definição do tipo da variável no momento de sua criação, durante a execução da
      aplicação a linguagem irá detectar qual o valor foi atribuido a variável e ela assumira o tipo daquele valor.
  
- **Primitivo** vs **Composto**;

### Opções de tipos:

- Textual;
- Numeral;
- Lógico;
- Objetos;

**Exemplos Numeral:**

               - byte:   -128 até 127                                              -> byte b = 12;
               - short:  -32.768 até 32.767                                        -> short s = -15785;
               - int:    -2.147.483.648 até 2.147.483.647                          -> int i = 8515785;
               - long:   -9.223.372.036.854.775.808 até -9.223.372.036.854.775.808 -> long l = 5938515785L;
               - float:  +-3.40282347E+38F                                         -> float f = 3.14...(f);
               - double: +-1.79769313486231570E+308     `                          -> double d = 3.14...(d);

**Exemplo Textual:**

              - char: caracteres de 16-bit unicode  -> char c = '\u0084' (código da leta 'T' maiúscula); ou char c = 'T';
              - String: um tipo "especial"          -> String s = "T"

### Boas práticas:

Usar de forma adequada cada tipo de dado para cada informação.

## 3 - Operadores Aritméticos:

### Conceituação:

São símbolos especiais quais são capazes de realizar ações específicas em um, dois ou mais operandos e, em seguida, retornar um resultado

### Tipos de operadores:
- pós-fixado: exp++ ou exp--
- prefixado: ++exp ou --exp
- aritmético: +, -, *, / e %
- atribuição: =, +=, -=, /= e %=

### Exemplos:

    int i = ++k; -> i = k + 1
    int j = K--; -> j = k; k = k -1
    float f = 1.5f + 4.5f;
    long l = 10398L * 5L;
    double d = 45d / 4d;
    int k = 15% 4;
    double d = f;
    i += 5; -> i = i + 5;
    j -= 3; -> j = j +3;
    d  /= 2.7d; -> d = d / 2.7d;
    l *= 3; -> l = l * 3;
    k %= 2; -> k = k % 2;

### Precedências:
- pós-fixado: exp++ ou exp--
- prefixado: ++exp ou --exp
- multiplicativo: *, / e %
- aditivo:  +, -,
- atribuição: =, +=, -=, /= e %=


## Casting:

### Objetivo:

1 - entender o que é;
2 - tipo;
3 - quando usar;

### Conceituação:

É a transformação de uma determinada variável de tipo menos específico para um tipo mais específico ou vice-versa.

### Tipos:

- **Upcast** *(implícito)* -> Promoção de um tipo de dado de menor capacidade armazenamento para um de maior.


- **Downcast** *(explícito)* -> Rebaixamento de um tipo de dado de maior capacidade de armazenamento para um de menor.
  É necessário explicitar o tipo de dado. Pde haver perda de informação.

## Exemplos:

    long l; int i = 10; l = i;
    int i; long l = 100; i = (int) l;
    double d; float f = 10.5f; d =f;
    float f; double d = 10.5d; f = (float)d;
    int i; float f = 10.5f; i = (int)f;




