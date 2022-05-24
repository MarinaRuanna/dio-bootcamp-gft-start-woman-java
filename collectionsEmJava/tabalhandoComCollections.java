package br.com.dio.collectionsEmJava;

/*

Collection é um objeto que agrupa múltiplos elementos (variáveis primitivas ou objetos) dentro de uma única unidade.
Serve para armazenar e processar conjuntos de dados de forma eficiente.

Composição Collections:

- Interfaces: é um contrato que quando assumido por uma classe deve ser implementado.

- Implementações ou Classes: São materiallizações. a codificação das interfaces.

- Algoritimos: É uma sequencia lógica, finita e definida de instruções que devem ser seguidas para resolver um problema.


 */


import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


/**
 * Crie uma lista e adicione as sete notas.             - List<Double> nomeDaLista = new ArrayList<>();   // nomeDaLista.add();
 * Exiba a posição da nota 5.0.                         - .indexOf()
 * Adicione na lista a nota 8.0 na posição 4.           - .add()
 * Sustitua a nota 5.0 pela nota 7.0.                   - .set()
 * Confira se a nota 5.0 está na lista.                 - .contains()
 * Exiba a terceira nota adicionada.                    - .get()
 * Exiba a menor nota.                                  - Collections.min()
 * Exiba a maior nota.                                  - Collections.max()
 * Exiba a soma dos valores.                            - .iterator() //  .hasNext() // .next()
 * Exiba a média das notas.                             - .size()
 * Remova a nota 0.                                     - .remove()
 * Remova as notas menores que 7 e exiba a lista.       -
 * Apague toda a lista.                                 - .clear()
 * Confira se a lista está vazia.                       - .isEmpty()
 */

public class tabalhandoComCollections {
    public static void main(String[] args) {
        System.out.println("Crie uma lista e adicione as sete notas: ");

        List<Double> notas = new ArrayList<>();

        notas.add(7.0d);
        notas.add(8.5d);
        notas.add(9.3d);
        notas.add(5.0d);
        notas.add(7.0d);
        notas.add(0.0d);
        notas.add(3.6d);

        System.out.println(notas);

        System.out.println("Exiba a posição da nota 5.0: " + notas.indexOf(5d));

        System.out.println("Adicione na lista a nota 8.0 na posição 4: ");
        notas.add(4, 8.0d);

        System.out.println(notas);

        System.out.println("Sustitua a nota 5.0 pela nota 7.0: ");
        notas.set(notas.indexOf(5d), 6.0d);
        System.out.println(notas);

        System.out.println("Confira se a nota 5.0 está na lista: " + notas.contains(5d));

        for (Double nota : notas) System.out.println(nota);

        System.out.println("Exiba a terceira nota adicionada: " + notas.get(2));
        System.out.println(notas.toString());

        System.out.println("Exiba a menor nota: " + Collections.min(notas));

        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        System.out.println("Exiba a soma dos valores: ");
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while(iterator.hasNext()) {
           Double next = iterator.next();
           soma += next;
        }

        System.out.println("Exiba a média das notas: " + (soma / notas.size()));

        System.out.println("Remova a nota 0: ");
        notas.remove(0d);

        System.out.println("Remova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while(iterator1.hasNext()) {
            Double next = iterator1.next();
            if(next < 7) iterator1.remove();
        }
        System.out.println(notas);

        System.out.println("Apague toda a lista: ");
        notas.clear();

        System.out.println("Confira se a lista está vazia: " + notas.isEmpty());

    }
}
