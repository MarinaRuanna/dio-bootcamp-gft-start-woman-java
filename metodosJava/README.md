# BOOTCAMP DIGITAL INNOVATION ONE - GFT START WOMAN

## Entendendo Métodos Java:

## 1 - Métodos:

**SLIDES:** https://docs.google.com/presentation/d/1InCKAqx_Vocw9BxN95JTtcDpPnredEOa/edit#slide=id.p2

### Objetivos:

1 - Entender o que é um método;
2 - Saber como definir e utilizar métodos;
3 - Aplicar boas práticas em sua criação;

### Conceituação:

É uma porção de código (sub-rotina) que é disponibilizada por uma classe. Este é executado quando é feita uma requisição
a ele. São responsáveis por definir e realizar um determinado comportamento.

Padrão de definição:

***</?visibilidade?></?tipo?></?modificador?> retorno nome (</?parâmetro?>) </?exceções?> corpo***

OBS: Tudo que esta dentro do <??> são opcionais.

V: "public", "protected" ou "private"
T: concreto ou abstrato
M: "Static" ou "final"
R: tipo de dado ou "void"
N: nome que é fornecido ao método
P: parâmetro que pode receber
E: exceção que pode lançar
C: código que possui ou vazio

**Exemplos:**

public String getNome() {...}
public double calcularTotalNota() {...}
public int verificarDistancia(int cordenada1, int cordenada2) {...}
public abstract void executar();
public void alterarFabricante(Fabricante fabricante) {...}
public Relatorio gerarDadosAnaliticos(Cliente cliente, List<Compra> compras) {...}

public static R N (p) {...}

### Utilização:

Passa-se através de uma classe ou objeto.

nome_da_classe.nome_do_metodo();  ou  nome_da_classe.nome_do_metodo(...);
nome_do_objeto.nome_do_metodo();  ou  nome_do_objet.nome_do_metodo(...);

**Exemplos:**

Math.random();  ou  Math.sqrt(4);
usuario.getEmail();  ou  usuario.alterarEndereco(endereco)

### Particularidades:

- **Assinatura:** é a forma de identificar unicamente o método
  - Ass = nome + parâmetros

  Método:

        public double calcularTotalVenda(double precoItem1, double precoItem2, doubleprevoItem3) {...}

  Assinatura:

        calcularTotalVendas(double precoItem1, double precoItem2, double precoItem3)

- **Construtor e Destrutor:** são métodos especiais usa dados na Orientação a Objetos.

- **Mensagem:** é o ato de solicitar ao método que o mesmo execute. Esta pode ser direcionada a um objeto ou a uma classe.

- **Passagem de parâmetros:**

  - Por valor (cópia):
       
    Exemplo: 

                  int i = 10;
                  public void fazerAlgo(int i) {

                      i = 1 + 10;
                      System.out.printLn("Valor de i dentro: " + i);
                  }

                  System.out.printLn("Valor de i fora: " + i);

  - Por referência (endereço);

### Boas práticas:

- Nomes devem ser descritivos, mas curtos;
- Notação camelo -> verificarSaldo();    executarTransferencia(...);   existeDebito();
- Devem possuir entre 80 e 120 linhas;
- Evite lista de parâmetros longas;
- Visibilidade adequadas;

EXERCICIO:
Criar uma aplicação que resolva as seguintes situações:
Calcule as 4 operações básicas: soma, subtração, multiplicação e divisão. Sempre 2 valores devem ser passados.
A partir da dora do dia, informe a mensagem adequada: "Bom dia", "Boa Tarde" e "Boa noite". 
Calcule o valor final de um empréstimo, a partir so valor solicitado. Taxas e parcelas influenciam.
Defina arbitrariamente as faixas que influenciam nos valores.

OBSERVAÇÕES:
Tente ao máximo criar metodos que trabalhem sozinhos ou em conjunto.
Pode chamar um metodo dentro do outro
Pode passar como parâmetro, a chamada de outro método

## 2 - Sobrecargas:

### Conceituação:

É a capacidade de definir métodos para diferentes contextos, mas preservando seu nome.

### Criação:

- Alterar a assinatura do método:
        Ass = nome + parâmetros
        

  **Exemplos:**
    

    converterParaInteiro(float f);
    converterParaInteiro(double d);
    converterParaInteiro(String s);
    converterParaInteiro(float f, RoundType rd);
    converterParaInteiro(double d, RoundType rd);
    converterParaInteiro(String s, RoundType rd);

    converterParaInteiro(RoundType rd, String s);
    converterParaInteiro();

  **Mais Exemplos:**

            https://docs.oracle.com/javase/7/docs/api/java/io/PrintStream.html
            https://docs.oracle.com/javase/7/docs/api/java/lang/String.html

### Curiosdades:


**Sobrecarga x Sobrescrita**



**EXERCÍCIO:**

Criar uma aplicação que calcula a área dos 3 quadriláteros notáveis:
- quadrado;
- retângulo;
- trapézio;
OBS.: Use sobrecarga.

## 3 - Retorno:

### Relembrando:

- É uma instrução de interrupção;
- Simbologia: *return*

### Funcionamento:

O método executa seu retorno quando:

- Completa todas as suas instruções internas
- Chega a uma declaração explicita de retorno
- Lança uma exceção

### Considerações:

- O tipo de retorno do método é definido na sua criação e pode ser um tipo primitivo ou objeto;
- O tipo de dado do return deve ser compatível com o do método;
- Se o método for sem retorno (void), pode ou não ter um "return" para encerrar sua execução.

  
Exemplos:

            public String getMensagem() {
                return "Olá";
            }
            public double getJuros() {
                return 2.36;
            }
            public int getParcelas() {
                return 1.36f;
            }
            public void setIdade() {
                return 10;
            }
            public void executar() {
                ...
                return;
                ...
            }

**EXERCÍCIO:**

Recria a aplicação que calcula a área de quatro quadriláteros notáveis. Agora faça os métodos retornarem os valores.


