import java.util.Scanner;

public class Desafio{
    static int num1, num2, num3;

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o primeiro número: ");
        num1 = scanner.nextInt();
        System.out.println("Insira o segundo número: ");
        num2 = scanner.nextInt();
        System.out.println("Insira o terceiro número: ");
        num3 = scanner.nextInt();
        
        int maior1 = (num1 + num2 + Math.abs(num1 - num2))/2;
        int maior2 = (maior1 + num3 + Math.abs(maior1 - num3))/2;

        System.out.println(maior2 + " eh o maior");

    }
}