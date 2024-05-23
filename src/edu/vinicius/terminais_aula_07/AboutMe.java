package edu.vinicius.terminais_aula_07;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    
    public static void main(String[] args){

        //Criando o objeto Scanner;
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        //variaveis: nome, sobrenome, idade.
        System.out.println("Digite o seu Primeiro Nome: ");
        String nome = scanner.next();

        System.out.println("Digite o seu Segundo Nome: ");
        String sobrenome = scanner.next();

        System.out.println("Digite a sua Idade: ");
        int idade = scanner.nextInt();

        System.out.println("Digite a sua Altura: ");
        double altura = scanner.nextDouble();

        System.out.println("Olá, me chamo " + nome + " e o meu sobrenome é " + sobrenome);
        System.out.println("Tenho " + idade + " anos!");
        System.out.println("A minha Altura é de " + altura + "m");

    }
}
