//Curto-Circuito Lógico com Validação de Texto

import java.util.Scanner;
public class LP_Atividade_N1_1_06_2040482612039 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("--- Execução 1 ---");
    System.out.print("Informe o nome de usuário: ");
    String texto = sc.nextLine();

    
        if (texto != null && texto.length() > 0) {
           
            System.out.println("Usuário válido fornecido: " + texto);
        } else {
            System.out.println("--- Execução 2 ---");
            System.out.println("Entrada rejeitada: O texto está nulo ou vazio.");
        }

        sc.close();
    }
}