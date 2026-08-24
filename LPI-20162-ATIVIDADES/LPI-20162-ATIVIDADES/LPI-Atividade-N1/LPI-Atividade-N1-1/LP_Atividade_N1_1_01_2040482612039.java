//Tipos Primitivos: Declaração e operações Básicas

import java.util.Scanner;
public class LP_Atividade_N1_1_01_2040482612039 {

    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);


        System.out.print("Idade do Aluno: ");
        byte idade = sc.nextByte();

        System.out.print("Número de Faltas: ");
        short faltas = sc.nextShort();

        System.out.print("Matrícula ID: ");
        int matriculaId = sc.nextInt();

        System.out.print("Código Nacional do Estudante: ");
        long codigoNacional = sc.nextLong();

        System.out.print("Nota do Trabalho: ");
        float notaTrabalho = sc.nextFloat();

        System.out.print("Nota da Prova Final: ");
        double notaProvaFinal = sc.nextDouble();

        System.out.print("Conceito Final do Aluno: ");
        char conceitoFinal = sc.next() .charAt(0);

        System.out.print("Aluno está Aprovado (true/false): ");
        boolean aprovado = sc.nextBoolean();

        System.out.println("--- Dados do Aluno Fictício ---");

        System.out.println("Idade do Aluno: " + idade + " anos"); // byte (8 bits, -128 a 127)
        System.out.println("Número de Faltas: " + faltas); // short (16 bits, -32.768 a 32.767)
        System.out.println("Matrícula ID: " + matriculaId); // int (32 bits)
        System.out.println("Código Nacional do Estudante: " + codigoNacional); // long (64 bits)
        System.out.println("Nota do Trabalho: " + notaTrabalho); // float (32 bits)
        System.out.println("Nota da Prova Final: " + notaProvaFinal); // double (64 bits)
        System.out.println("Conceito Final do Aluno: " + conceitoFinal); // char (16 bits)
        System.out.println("Aluno está Aprovado? " + aprovado); // boolean (1 bit)

        sc.close();
    }
}
