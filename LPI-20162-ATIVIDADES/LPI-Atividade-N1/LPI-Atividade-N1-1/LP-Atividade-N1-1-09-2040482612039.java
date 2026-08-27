//Operador Ternário: Simplificação de Estruturas Condicionais

import java.util.Scanner;
public class LP_Atividade_N1_1_09_2040482612039{

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a nota final do aluno: ");
        double notaFinal = sc.nextDouble();

        //___if/else____
        System.out.println ("--- Abordagem 1: Estrutura Condicional (if-else) ---");

        if (notaFinal >= 6){
            System.out.println("Situação (if-else): Aprovado");

        }else{
            System.out.println("Situação (if-else): Reprovado");
        }

        //____ternário_______
        System.out.println("\n--- Abordagem 2: Operador Ternário Simples ---");

        String situacaoTernario = (notaFinal >= 6) ? "Aprovado" : "Reprovado";
        System.out.println("Situação (Ternário): " + situacaoTernario);
        
sc.close();
    }
}

//____TERNÁRIO ENCADEADO (NESTED TERNARY)____
 
 // Ex. caso incluisse "exame":
 // String situacaoTerEncadeado = (notaFinal >= 6.0) ? "Aprovado" : (notaFinal >= 4.0) ? "Exame" : "Reprovado";
 
 // POR QUE EVITAR?
 //Colocar um ternário dentro do outro deixa a leitura do código confusa, já o if/else o deixa mais legível.
 