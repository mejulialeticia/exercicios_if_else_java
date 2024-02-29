import java.util.Random;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        String[] palavras = {"pedra", "papel", "tesoura"};

        System.out.println(" escolha: >> pedra || papel || tesoura");
        String jogoUsuario = input.nextLine();

        int indiceAray = random.nextInt(palavras.length);
        String palavraArray = palavras[indiceAray];
        System.out.println("");
        System.out.println(jogoUsuario + " X " + palavraArray);
        System.out.println("");

        if(jogoUsuario.equals("pedra") && (palavraArray.equals("papel"))){
            System.out.println("ganhei de você HAHA !!");
        }else if(jogoUsuario.equals("pedra") && (palavraArray.equals("pedra"))){
            System.out.println("empatou");
        }else if(jogoUsuario.equals("pedra") && (palavraArray.equals("tesoura"))){
            System.out.println("VOCÊ VENCEU");
        }else if(jogoUsuario.equals("papel") && (palavraArray.equals("papel"))){
            System.out.println("empatou");
        }else if(jogoUsuario.equals("papel") && (palavraArray.equals("pedra"))){
            System.out.println("VOCÊ VENCEU");
        }else if(jogoUsuario.equals("papel") && (palavraArray.equals("papel"))){
            System.out.println("empatou");
        }else if(jogoUsuario.equals("papel") && (palavraArray.equals("tesoura"))){
            System.out.println("ganhei de você HAHA !!");
        }else if(jogoUsuario.equals("tesoura") && (palavraArray.equals("pedra"))){
            System.out.println("ganhei de você HAHA !!");
        }else if(jogoUsuario.equals("tesoura") && (palavraArray.equals("papel"))){
            System.out.println("VOCÊ VENCEU");
        }else if(jogoUsuario.equals("tesoura") && (palavraArray.equals("tesoura"))){
            System.out.println("empatou");
        }else{
            System.out.println("você escreveu errado");
        }
        input.close();
    }
}