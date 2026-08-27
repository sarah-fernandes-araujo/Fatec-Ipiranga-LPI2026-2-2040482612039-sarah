//Escolhi usar o "for" porque o enunciado indica a quantidade exata de alunos,
//ou seja, sei a quantidade exata de repetições.

// Processamento de Notas de uma Turma

import java.util.Scanner;

public class LP_Atividade_N1_2_01_2040482612039 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantidade de alunos na turma: ");
        int quantidadeAlunos = sc.nextInt();

        double nota = 0;
        double maiorNota = 0;
        double soma = 0;

        for (int i = 0; i < quantidadeAlunos; i++ ){
            System.out.print("Nota do aluno: ");
            nota = sc.nextDouble();
            soma += nota;
             //ou soma = soma + nota;

            if (nota > maiorNota){
                maiorNota = nota;
            }
        }
        double media = soma / quantidadeAlunos;

        System.out.println("Soma total das notas: " + soma);
        System.out.println("Média da turma: " + media);
        System.out.println("Maior nota da turma: " + maiorNota);
        

     sc.close();

    }
    
}
