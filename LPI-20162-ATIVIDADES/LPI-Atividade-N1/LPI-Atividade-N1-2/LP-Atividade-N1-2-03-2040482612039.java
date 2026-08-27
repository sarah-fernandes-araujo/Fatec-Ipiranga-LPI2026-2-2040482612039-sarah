//Escolhi o do while porque o sistema sempre solicita o PIN pelo manos uma vez
// e não há possibilidade de pular a solicitação.

//Validação de PIN de Acesso ao Sistema

import java.util.Scanner;

public class LP_Atividade_N1_2_03_2040482612039 {
    public static final int PIN_CORRETO = 1234;
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        int tentativas = 0;
        int pinDigitado;

        do{
            System.out.print("Informe o pin de acesso: ");
             pinDigitado = sc.nextInt();
               tentativas++;

               if (pinDigitado != PIN_CORRETO){
                System.out.print("PIN incorreto. Tente novamente. \n");
               }

        }while (pinDigitado != PIN_CORRETO);
            System.out.println("Acasso concedido! Você utilizou " + tentativas + " tentativa(s).");
        
     sc.close();
    }

}
