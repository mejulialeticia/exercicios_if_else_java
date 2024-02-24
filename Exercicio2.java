import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("digite o seu nome de usuário: ");
        String nome = input.nextLine();
        if(nome.equals("admin")){
            System.out.println("olá administrador !!");
        }else{
            System.out.println("seja bem vindo usuário(a) " + nome);
        }
        input.close();
    }
}
