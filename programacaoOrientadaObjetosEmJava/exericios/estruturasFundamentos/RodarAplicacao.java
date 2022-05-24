package br.com.dio.programacaoOrientadaObjetosEmJava.exericios.estruturasFundamentos;

class RodarAplicacao {

    public static void main(String[] args) {

        // Instânciar o Objeto usando método ".set" com o "construtor Defaut":
        Carro carro1 = new Carro();

        carro1.setModelo("BMW Série 3");
        carro1.setCor("Azul");
        carro1.setCapacidadeTanqueEmLitros(59);

        System.out.println(carro1);
        System.out.println(carro1.getModelo());
        System.out.println(carro1.getCor());
        System.out.println(carro1.getCapacidadeTanqueEmLitros());
        System.out.println(carro1.ValorTotal(6.99));

        // Instânciar o Objeto simplificado:
        Carro carro2 = new Carro("Mercedes-Benz Classe C", "Cinza", 66);

        System.out.println(carro2);
        System.out.println(carro2.getModelo());
        System.out.println(carro2.getCor());
        System.out.println(carro2.getCapacidadeTanqueEmLitros());
        System.out.println(carro2.ValorTotal(6.99));

    }
}
