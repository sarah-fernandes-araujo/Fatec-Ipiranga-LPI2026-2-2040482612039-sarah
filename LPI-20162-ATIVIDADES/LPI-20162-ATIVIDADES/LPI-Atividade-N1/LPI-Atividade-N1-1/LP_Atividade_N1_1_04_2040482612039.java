//Variáveis final e Constantes de Classe

import java.util.Scanner;
public class LP_Atividade_N1_1_04_2040482612039{
public static final String INSTITUICAO = "FATEC Ipiranga";
public static final int PRAZO_MAXIMO_DIAS = 14;

//___Validar prazo limite___
public static int calcularDiasDevolucao(final int diasEmprestimo) {
        if (diasEmprestimo > PRAZO_MAXIMO_DIAS) {
            return PRAZO_MAXIMO_DIAS;
        }
        return diasEmprestimo;
    }
 public static void main (String[] args){
     Scanner sc = new Scanner (System.in);

     System.out.print("Informe o número de dias do empréstimo: ");
     final int diasEmprestimo = sc.nextInt();

// diasEmprestimo = 15; 
// Erro: Não é possível retribuir valor a uma variável final. 

     System.out.println("Instituição: " + INSTITUICAO);
     System.out.println("Prazo Máximo Padrão: " + PRAZO_MAXIMO_DIAS + " dias.");
     System.out.println("Dias calculados para devolução: " + calcularDiasDevolucao(diasEmprestimo));

    sc.close();
    
 }
    }
