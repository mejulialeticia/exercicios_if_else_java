import java.util.Scanner;

public class Exercicio4{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("FESTINHA");
        System.out.println("qual sua idade");
        int idade = input.nextInt();

        if(idade > 17){
            System.out.println("você pode entrar");
        }else{
            System.out.println("você é menor de idade !! não tem permissão para entrar");
        }

        input.close();
    }
}