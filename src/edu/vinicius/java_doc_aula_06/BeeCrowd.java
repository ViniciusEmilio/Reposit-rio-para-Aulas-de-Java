package edu.vinicius.java_doc_aula_06;
import java.util.Scanner;

public class BeeCrowd {
    
    public static void main(String[] args) {
        //Criando objeto Scanner
        Scanner scanner = new Scanner(System.in);

        //Recebendo os valores do usuário;
        System.out.println("Digite o Valor de A:");
        int A = scanner.nextInt();
        
        System.out.println("Digite o Valor de B:");
        int B = scanner.nextInt();        
        
        int X = A + B;

        System.out.println("X = " + X);
        
    }
}
