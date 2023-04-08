import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        calculadora();
    
    }
    public static void calculadora (){
        Scanner myObj = new Scanner(System.in);
        int inputData;
        int num1, num2;
        double num3, num4;
        int choice;
        
        System.out.println("Este é o primeiro modelo de calculadora desenvolvida por Joao Pedro, me diga, o que você deseja fazer?");
        System.out.println("1. Soma");
        System.out.println("2. Subtração");
        System.out.println("3. Multiplicação");
        System.out.println("4. Divisao");
        System.out.println("5. Sair");
        
        inputData = myObj.nextInt();

        switch(inputData){
            case 1:
                System.out.println("Escolha o primeiro número!");
                num1 = myObj.nextInt();
                System.out.println("Escolha o segundo número!");
                num2 = myObj.nextInt();
                System.out.println("A soma é: ");
                System.out.println(soma(num1, num2));
                System.out.println("Você deseja continuar usando a calculadora?");
                System.out.println("1. Sim");
                System.out.println("2. Não");
                choice = myObj.nextInt();
                if(choice == 1){
                    calculadora();
                }else{
                    System.out.println("Foi um prazer!");
                    return;
                }
            case 2:
                System.out.println("Escolha o primeiro número!");
                num1 = myObj.nextInt();
                System.out.println("Escolha o segundo número!");
                num2 = myObj.nextInt();
                System.out.println(sub(num1, num2));
                System.out.println("Você deseja continuar usando a calculadora?");
                System.out.println("1. Sim");
                System.out.println("2. Não");
                choice = myObj.nextInt();
                if(choice == 1){
                    calculadora();
                }else{
                    System.out.println("Foi um prazer!");
                    return;
                }
            case 3:
                System.out.println("Escolha o primeiro número!");
                num1 = myObj.nextInt();
                System.out.println("Escolha o segundo número!");
                num2 = myObj.nextInt();
                System.out.println(mult(num1, num2));
                System.out.println("Você deseja continuar usando a calculadora?");
                System.out.println("1. Sim");
                System.out.println("2. Não");
                choice = myObj.nextInt();
                if(choice == 1){
                    calculadora();
                }else{
                    System.out.println("Foi um prazer!");
                    return;
                }
                reload(choice);
            case 4:
                System.out.println("Escolha o primeiro número!");
                num3 = myObj.nextDouble();
                System.out.println("Escolha o segundo número!");
                num4 = myObj.nextDouble();
                System.out.println(div(num3, num4));
                System.out.println("Você deseja continuar usando a calculadora?");
                System.out.println("1. Sim");
                System.out.println("2. Não");
                choice = myObj.nextInt();
                if(choice == 1){
                    calculadora();
                }else{
                    System.out.println("Foi um prazer!");
                    return;
                }
            case 5:
                System.out.println("Foi um prazer!");
                return;

        }   
    }
    static int soma(int num1, int num2){
        return num1 + num2;
    }
    static int sub(int num1, int num2){
        return num1 - num2;
    }
    static int mult(int num1, int num2){
        return num1 * num2;
    }
    static double div(double num1, double num2){
        return num1 / num2;
    }
    static void reload(int choice){
        if(choice == 1){
            calculadora();
        }else if(choice == 2){
            return;
        }
    }
        
    
}

