package br.com.dio.metodosJava;

/*
Retorno:

Relembrando:

- É uma instrução de interrupção;
- Simbologia: return

Funcionamento:

O método executa seu retorno quando:

- Completa todas as suas instruções internas
- Chega a uma declaração explicita de retorno
- Lança uma exceção

Considerações:

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
 */

/**
 * EXERCÍCIO:
 * Recria a aplicação que calcula a área de quatro quadriláteros notáveis. Agora faça os métodos retornarem os valores.
 */

public class retorno {
    public static void main(String[] args) {

        // Retornos
        System.out.println("Exercício retornos: ");

        double areaQuadrado = Quadrilatero.area(3);
        System.out.println("Área do quadrado: " + areaQuadrado);

        double areaRetangulo = Quadrilatero.area(5,5);
        System.out.println("Área do retaângulo: " + areaRetangulo);

        double areaTrapezio = Quadrilatero.area(7, 8, 9);
        System.out.println("Área do trapézio: " + areaTrapezio);

        double areaLosango = Quadrilatero.area(5f, 5f);
        System.out.println("Área do losango: " + areaLosango);
    }
}
