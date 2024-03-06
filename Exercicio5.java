import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("digite o número 1");
        int numero1 = input.nextInt();
        System.out.println("digite o número 2");
        int numero2 = input.nextInt();

        if(numero1 == numero2){
            System.out.println("são iguais");
        }else{
            System.out.println("são diferentes");
        }
        input.close();   
    }
}