import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Cripto{
    public static void main(String[] args){
        //Aqui é configurado o leitor do input do usuário e também a lista de array que será armazenado a mensagem.

        try (Scanner Scanner = new Scanner(System.in)) {
            ArrayList<Character> encrypMessage = new ArrayList<Character>();

            //Aqui é lido o input e  convertido em um array simples.
            String uncodeText = Scanner.nextLine();
            
            char[] splitedText = uncodeText.toCharArray();

            //Aqui é onde ficará armazenado cada caractere que será adicionada na lista.
            char splitedChar;
            
            //Nesse snippet, cada caractere que não é um número é transferido 3 unidades para a direita na tabela ASCII.
            for(char i : splitedText){

                //Aqui, é verificado se o caractere é uma letra ou um número, já que não pode ser alterado nessa parte.
                if(Character.isLetter(i)){
                    i +=3;
                    splitedChar = (char) i;

                    //A variável splitedChar é colocada como parametro na função .add() da lista.
                    encrypMessage.add(splitedChar);

                }else{
                    // O que for um número, simplesmente é adicionado na lista normalmente.
                    splitedChar = (char) i;
                    encrypMessage.add(splitedChar);
               continue;
                }
            }

            //Nesse método, toda a lista é invertida.
            Collections.reverse(encrypMessage);

            //Nesse último snippet, todo e qualquer caractere apartir da metade é transferido 1 unidade para a esquerda na tabela ASCII.
            for (int i = 0; i < encrypMessage.size(); i++){
                if ( i < encrypMessage.size()/2){
                    continue;
                }else{
                    int lastCheck = encrypMessage.get(i);
                    lastCheck--;
                    encrypMessage.set(i, (char) lastCheck);
                }
            }
            //E por fim, a lista é convertida novamente em uma String.
            String cryptoMessage = "";
            for (char message : encrypMessage){
                cryptoMessage+= message+"";
            }
            System.out.println(cryptoMessage);
        }
    }
}
