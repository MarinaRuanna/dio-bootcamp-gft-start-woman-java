package br.com.dio.javaStream;
/*
Dadas as seguintes informações de id e contato, crie um dicionário e
ordene este dicionário exibindo
(Nome id - Nome contato);

id = 1 = Contato = nome: Simba, numero: 2222;
id = 4 = Contato = nome: Cami, numero: 5555;
id = 3 = Contato = nome: Jon, numero: 1111;
 */

import java.util.*;

public class refatoracaoOrdenacaoMap {
    public static void main(String[] args) {
        System.out.println("--\tOrdem Aleatória\t--");
        Map<Integer, Contato> agenda = new HashMap<>(){{
            put(1, new Contato("Simba", 2222));
            put(4, new Contato("Cami", 5555));
            put(3, new Contato("Jon", 1111));
        }};
        System.out.println(agenda);
        for (Map.Entry<Integer, Contato> entry: agenda.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }

        System.out.println("--\tOrdem Inserção\t--");
        Map<Integer, Contato> agenda1 = new LinkedHashMap<>(){{
            put(1, new Contato("Simba", 2222));
            put(4, new Contato("Cami", 5555));
            put(3, new Contato("Jon", 1111));
        }};
        System.out.println(agenda1);
        for (Map.Entry<Integer, Contato> entry: agenda1.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }
        System.out.println("--\tOrdem Id\t--");
        Map<Integer, Contato> agenda2 = new TreeMap<>(agenda);
        System.out.println(agenda2);

        for(Map.Entry<Integer, Contato > entry: agenda2.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }

        System.out.println("--\tOrdem Número Telefône\t--");
       /*
            Classe sem nome

            Set<Map.Entry<Integer, Contato>> agenda3 = new TreeSet<>(new Comparator<Map.Entry<Integer, Contato>>() {
            @Override
            public int compare(Map.Entry<Integer, Contato> c1, Map.Entry<Integer, Contato> c2) {
                return Integer.compare(c1.getValue().getNumero(), c2.getValue().getNumero());
            }
        });

            Versão 2:

            Set<Map.Entry<Integer, Contato>> agenda3 = new TreeSet<>(Comparator.comparing(new Function<Map.Entry<Integer, Contato>, Integer>() {
            @Override
            public Integer apply(Map.Entry<Integer, Contato> cont) {
                return cont.getValue().getNumero();
            }
        }));

        */

        // Lambda:

        Set<Map.Entry<Integer, Contato>> agenda3 = new TreeSet<>(Comparator.comparing(
                cont -> cont.getValue().getNumero()));

        agenda3.addAll(agenda.entrySet());

        for (Map.Entry<Integer, Contato> entry: agenda3) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNumero() + " : " + entry.getValue().getNome());
        }

        Set<Map.Entry<Integer, Contato>> agenda4 = new TreeSet<>(Comparator.comparing(
                cont -> cont.getValue().getNome()));

        agenda4.addAll(agenda.entrySet());

        for (Map.Entry<Integer, Contato> entry: agenda4) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome() + " : " + entry.getValue().getNumero());
        }
    }
}

class Contato {
    private String nome;
    private Integer numero;

    public Contato(String nome, Integer numero) {
        this.nome = nome;
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public Integer getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", numero=" + numero +
                '}';
    }

}
