package br.com.dio.logicaCondicionalJava;

/*
Lógica Condicional e Controle de Fluxo:

Conceituação:

São estruturas que tem a capacidade de direcionar o fluxo de execução do código

Tipos:

Decisão:
 - if
 - else-if
 - if-else-if
 - switch
 - operador ternário

Repetição:
 - for
 - while
 - do while

Interrupção:
 - break
 - continue
 - return

Criação:

Tipos:

Decisão: estrutura que avalia uma condição booleana ou variável para direcionar o fluxo de excução

    Opções:
    - if (se)
    - switch (escolha)
    - operador ternário

if:
tipos: if, if-else, if-else-if

Exemplos:

if (condição){bloco}

if (condição){bloco} else {bloco}

if (condição){bloco} else if (condição) {bloco} else {bloco}

Switch:

Variável:
byte
short
cahar
int
Enum
String

Exemplo:

switch (variável) {
    case 1:
    ...
    break;
    case ...:
    ...
    break;
    defalt:
    ...
    break
    }

Operador Ternário:

Exemplo:

condição ? true : false;       ou       condição ? true : null;

ligado desligar : ligar;                emMovimento ? freia : null;

Boas Práticas:

 - Switch é para valores exatos e if para expressões booleanas
 - Evitar usar o defaolt do switch para "cases genéricos"
 - Evitar o efeito "flecha" dos if's
 - Evitar muitos if's aninhados
 - Usar a boa pratática da aula 2 para diminuir o tamanho do if
 */

/**
 * EXERCÍCIO
 *
 * Criar um simples projeto no IntelliJ e criar variáveis e express]oes para usar nas estuturas if e switch.
 *
 * Com if, exiba o nome do mês do ano de acordo com sei numero. Evite o efeito "flecha". Faça também outro if que
 * verifique se o mês é julho, dezembro ou janeiro, para exibir o texto "Férias".
 *
 * Com switch use String para a partir do dia da semana, exibir seu número. Ainda no switch, faça outro exemplo onde,
 * se uma variável inteira for entre 1 e 3 exibir o texto "Certo". Se for 4 exibir "Errado", se for 5 "Talvez".
 * Pra demais valores exibir "Valor indefinido".
 */


public class controleFluxoa {

    public static void main(String[] args) {

        ifFlecha();
        ifSemFlecha();
        ifFerias();
        ifMenor();

        switchSemana();
        switchNumero();
        switchFerias();

    }

    private static void ifFlecha() {

        int mes = 9;
        if (mes == 1) {
            System.out.println("Jneiro");
        } else {
            if (mes == 2) {
                System.out.println("Fevereiro");
            } else {
                if (mes == 3) {
                    System.out.println("Março");
                } else {
                    if (mes == 4) {
                        System.out.println("Abril");
                    } else {
                        if (mes == 5) {
                            System.out.println("Maio");
                        } else {
                            if (mes == 6) {
                                System.out.println("Junho");
                            } else {
                                if (mes == 7) {
                                    System.out.println("Julho");
                                } else {
                                    if (mes == 8) {
                                        System.out.println("Agosto");
                                    } else {
                                        if (mes == 9) {
                                            System.out.println("Setembro");
                                        } else {
                                            if (mes == 10) {
                                                System.out.println("Outubro");
                                            } else {
                                                if (mes == 11) {
                                                    System.out.println("Novembro");
                                                } else {
                                                    if (mes == 12) {
                                                        System.out.println("Dezembro");
                                                    } else {
                                                        System.out.println("Mês indefinido");
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }

        }
    }

}

    private static void ifSemFlecha() {
        int mes = 9;
        if (mes == 1) {
            System.out.println("Janeiro");
        } else if (mes == 2){
            System.out.println("Fevereiro");
        } else if (mes == 3) {
            System.out.println("Março");
        } else if (mes == 4) {
            System.out.println("Abril");
        } else if (mes == 5) {
            System.out.println("Maio");
        } else if (mes == 6) {
            System.out.println("Junho");
        } else if (mes == 7) {
            System.out.println("Julho");
        } else if (mes == 8) {
            System.out.println("Agosto");
        } else if (mes == 9) {
            System.out.println("Setembro");
        } else if (mes == 10) {
            System.out.println("Outubro");
        } else if (mes == 11) {
            System.out.println("Novembro");
        } else if (mes == 12) {
            System.out.println("Dezembro");
        } else {
            System.out.println("Mês indefinido");
        }
    }

    private static void ifFerias() {

        String mes = "julho";
        if (mes == "julho" || mes == "dezembro" || mes == "janeiro") {
            System.out.println("Férias");
        }
    }

    private static void ifMenor() {

        double salarioMensal = 11893.58d;
        double mediaSalario = 10500d;

        int quantidadeDependentes = 4;
        int mediaDependentes = 2;

        if ((salarioMensal < mediaSalario) && (quantidadeDependentes >= mediaDependentes)) {
            System.out.println("Funcionário deve receber auxilio");
        }

        boolean salarioBaixo = salarioMensal < mediaSalario;
        boolean muitosDependentes = quantidadeDependentes >= mediaDependentes;

        if ((salarioBaixo) && (muitosDependentes)) {
            System.out.println("Funcionário deve receber auxilio.");
        } else {
            System.out.println("Funcionário não deve receber auxilio.");
        }

    }

    private static void switchSemana() {

        String dia = "Terça";
        switch (dia) {
            case "Segunda":
                System.out.println(2);
                break;
            case "Terça":
                System.out.println(3);
                break;
            case "Quarta":
                System.out.println(4);
                break;
            case "quinta":
                System.out.println(5);
                break;
            case "Sexta":
                System.out.println(6);
                break;
            case "Sabado":
                System.out.println(7);
                break;
            case "Domingo":
                System.out.println(1);
                break;
            default:
                System.out.println("Dia inválido");
        }
    }

    private static void switchNumero() {

        int numero = 4;
        switch (numero) {
            case 1:
            case 2:
            case 3:
                System.out.println("Certo");
                break;
            case 4:
                System.out.println("Errado");
                break;
            case 5:
                System.out.println("Talvez");
                break;
            default:
                System.out.println("Valor indefinido");
                break;

        }
    }

    private static void switchFerias() {

        String mes = "dezembro";
        switch (mes) {
            case "dezembro":
            case "janeiro":
            case "julho":
                System.out.println("Férias");
                break;
            default:
                System.out.println("Mê indefinido");
                break;
        }

    }
}

