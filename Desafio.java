import java.util.Scanner;

public class Desafio{
    static int num1, num2, num3;

    public static void main(String[] args){
        try(Scanner Scanner = new Scanner(System.in)){
        num1 = Scanner.nextInt();
        num2 = Scanner.nextInt();
        num3 = Scanner.nextInt();
        
    }
}
    static int maiorNum(int num1, int num2, int num3){

        int primeiroMaior = (num1 + num2 + Math.abs(num1 - num2))/2;
        int maiorNumero = (primeiroMaior + num3 + Math.abs(primeiroMaior - num3))/2;

        return maiorNumero;

    }
}