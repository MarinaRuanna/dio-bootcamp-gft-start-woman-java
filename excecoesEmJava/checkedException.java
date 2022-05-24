package br.com.dio.excecoesEmJava;
import javax.swing.*;
import java.io.*;



// Imprimir um arquivo no console.
public class checkedException {
    public static void main(String[] args) {
        String nomeDoArquivo = "romances-blake-crouch.txt";
        try {
            imprimiArquivoNoConsole(nomeDoArquivo);
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Revise o nome do arquivo que você deseja imprimir! " + e.getCause());
            // e.printStackTrace();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro inexperado, entre em contato com o suporte! " + e.getCause());
            // e.printStackTrace();
        } finally {
            System.out.println("Chegou no finally...");
        }

        System.out.println("Apesar da exception ou não,  programa continua...");
    }
    public static void imprimiArquivoNoConsole(String nomeDoArquivo) throws IOException {
        File file = new File(nomeDoArquivo);

        BufferedReader br = new BufferedReader(new FileReader(file.getName()));
        String line = br.readLine();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        do{
            bw.write(line);
            bw.newLine();
            line=br.readLine();
        } while (line != null);
        bw.flush();
        br.close();
    }
}
