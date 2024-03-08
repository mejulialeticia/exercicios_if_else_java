import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("as notas são A B C D e E");
        System.out.println("digite a sua nota");
        int nota = input.nextInt();

        if((nota == 1)||(nota == 2)){
            System.out.println("a sua nota é A");
        }else if((nota == 3)||(nota == 4)){
            System.out.println("a sua nota é B");
        }else if((nota == 5)||(nota == 6)){
            System.out.println("a sua nota é C");
        }else if((nota == 7)||(nota == 8)){
            System.out.println("a sua nota é D");
        }else if((nota == 9)||(nota == 10)){
            System.out.println("a sua nota é E");
        }else{
            System.out.println("você inseriu um valor numérico incorreto");
        }
        input.close();
    }
}