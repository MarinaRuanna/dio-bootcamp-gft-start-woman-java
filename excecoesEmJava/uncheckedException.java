package br.com.dio.excecoesEmJava;

import javax.swing.*;

// Fazer a divisão de dois números inteiros.
public class uncheckedException {
    public static void main(String[] args) {

        boolean continueLooping = true;
        do {
            String a = JOptionPane.showInputDialog("Numerador: ");
            String b = JOptionPane.showInputDialog("Numerador: ");

            try{
                int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
                System.out.println("Resultado: " + resultado);
                continueLooping = false;
            } catch (NumberFormatException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Entrada inválda, informe um número inteiro! " + e.getMessage() );
            } catch (ArithmeticException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Impossivel dividir um número por zero! " + e.getMessage() );
            }finally {
                System.out.println("hegou no finally...");
            }

        }while (continueLooping);


        System.out.println("O código continua..");
    }

    public static int dividir(int a, int b) { return a / b; }
}
