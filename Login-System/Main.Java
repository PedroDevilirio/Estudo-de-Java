import java.util.Scanner;
class Main {

    public static void main(String[] args){

        login();
    }

    static void login(){
        Scanner readUser = new Scanner(System.in);
        Scanner readPass = new Scanner(System.in);
        Scanner readChoice = new Scanner(System.in);

        User Login = new User();

        int tryAgain;
        String user = Login.getUser();
        String pass = Login.getPass();

        System.out.println("Usuário: ");
        String username = readUser.nextLine();
        System.out.println("Senha: ");
        String password = readPass.nextLine();

        if(username.equals(user) && password.equals(pass)){
            System.out.println("Bem-vindo, " + Login.getUser());
        }else{
            System.out.println("Desculpe, usuário ou senha incorretas. Deseja tentar novamente?");
            System.out.println("1. Sim");
            System.out.println("2. Não");
            tryAgain = readChoice.nextInt();
            if(tryAgain != 1){
                return;
            }else{
                login();
            };
        };
    };
}
