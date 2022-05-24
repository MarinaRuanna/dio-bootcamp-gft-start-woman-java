package br.com.dio.metodosJava;

/*

BOOTCAMP DIGITAL INNOVATION ONE - GFT START WOMAN

Entendendo Métodos Java:

1 - Métodos:

Objetivos:

1 - Entender o que é um método;
2 - Saber como definir e utilizar métodos;
3 - Aplicar boas práticas em sua criação;

Conceituação:

É uma porção de código (sub-rotina) que é disponibilizada por uma classe. Este é executado quando é feita uma requisição
a ele. São responsáveis por definir e realizar um determinado comportamento.

Padrão de definição:

<?visibilidade?><?tipo?><?modificador?> retorno nome (<?parâmetro?>) <?exceções?> corpo

OBS: Tudo que esta dentro do <??> são opcionais.

V: "public", "protected" ou "private"
T: concreto ou abstrato
M: "Static" ou "final"
R: tipo de dado ou "void"
N: nome que é fornecido ao método
P: parâmetro que pode receber
E: exceção que pode lançar
C: código que possui ou vazio

Exemplos:

public String getNome() {...}
public double calcularTotalNota() {...}
public int verificarDistancia(int cordenada1, int cordenada2) {...}
public abstract void executar();
public void alterarFabricante(Fabricante fabricante) {...}
public Relatorio gerarDadosAnaliticos(Cliente cliente, List<Compra> compras) {...}

public static R N (p) {...}

Utilização:

Passa-se através de uma classe ou objeto.

nome_da_classe.nome_do_metodo();  ou  nome_da_classe.nome_do_metodo(...);
nome_do_objeto.nome_do_metodo();  ou  nome_do_objet.nome_do_metodo(...);

Exemplos:

Math.random();  ou  Math.sqrt(4);
usuario.getEmail();  ou  usuario.alterarEndereco(endereco)

Particularidades:

- Assinatura: é a forma de identificar unicamente o método
        - Ass = nome + parâmetros

        Método:

        public double calcularTotalVenda(double precoItem1, double precoItem2, doubleprevoItem3) {...}

        Assinatura:

        calcularTotalVendas(double precoItem1, double precoItem2, double precoItem3)

- Construtor e Destrutor: são métodos especiais usa dados na Orientação a Objetos.

- Mensagem: é o ato de solicitar ao método que o mesmo execute. Esta pode ser direcionada a um objeto ou a uma classe.

- Passagem de parâmetros:

        - Por valor (cópia):
          Exemplo:
                int i = 10;
                public void fazerAlgo(int i) {

                    i = 1 + 10;
                    System.out.printLn("Valor de i dentro: " + i);
                }

                System.out.printLn("Valor de i fora: " + i);

        - Por referência (endereço);

Boas práticas:

- Nomes devem ser descritivos, mas curtos;
- Notação camelo -> verificarSaldo();    executarTransferencia(...);   existeDebito();
- Devem possuir entre 80 e 120 linhas;
- Evite lista de parâmetros longas;
- Visibilidade adequadas;

 */

/**
 * EXERCICIO:
 * Criar uma aplicação que resolva as seguintes situações:
 *  - Calcule as 4 operações básicas: soma, subtração, multiplicação e divisão. Sempre 2 valores devem ser passados.
 *  - A partir da dora do dia, informe a mensagem adequada: "Bom dia", "Boa Tarde" e "Boa noite".
 *  - Calcule o valor final de um empréstimo, a partir so valor solicitado. Taxas e parcelas influenciam.
 *    Defina arbitrariamente as faixas que influenciam nos valores.
 *
 *    OBSERVAÇÕES:
 *    - Tente ao máximo criar metodos que trabalhem sozinhos ou em conjunto.
 *    - Pode chamar um metodo dentro do outro
 *    - Pode passar como parâmetro, a chamada de outro método
 */

public class metodos {

    public static void main(String[] args) {
        // Calculadora
        System.out.println("Exercicio calculadora:");
        Calculadora.soma(3, 6);
        Calculadora.subtracao(9, 1.8);
        Calculadora.multiplicacao(7, 8);
        Calculadora.divisao(5, 2.5);


        // Mensagem
        System.out.println("Exercicio mensagem:");
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(14);
        Mensagem.obterMensagem(1);


        // Empréstimos
        System.out.println("Exercicio empréstimo:");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);
    }
}