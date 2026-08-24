//Precedência de Operadores e Expressão Lógica Combinada

import java.util.Scanner;
public class LP_Atividade_N1_1_10_2040482612039{

    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);

        System.out.print("Informe o valor A: ");
        double a = sc.nextDouble();

        System.out.print("Informe o valor B: ");
        double b = sc.nextDouble();

        System.out.print("Informe o valor C: ");
        double c = sc.nextDouble();

        System.out.print("Informe o valor D: ");
        double d = sc.nextDouble();

        System.out.print("Informe a média do aluno: ");
        double media = sc.nextDouble();

        System.out.print("Informe o percentual de presença: ");
        double presenca = sc.nextDouble();

    //____Precedência Aritmética ______
    System.out.println("--- Demonstração de Precedência Aritmética ---");

    //Sem Patenteses
    double resultadoSemParenteses = a + b * c / (d * 4);
    System.out.println("Resultado Sem parênteses: " + resultadoSemParenteses);

    //Com Parênteses 
    double resultadoComParenteses = a + ((b*c) / (d*4));
    System.out.println("Resultado Com parênteses explícitos: " + resultadoComParenteses);

    System.out.println("Nota: Ambos dão o mesmo resultado pela precedência natural (*, / depois +), mas a segunda forma é mais legível.\n");

    //___variavel booleana____
    System.out.println("--- Validação do Critériode Avaliação ---");

    boolean aprovadoDireto = (media >= 6.0) && (presenca >= 75.0);
    System.out.println("Entrada -> Média: " + media + " | Presença: " + (int)presenca + "%");
    System.out.println("Resultado da avaliação (aprovadoDireto): " + aprovadoDireto);

        sc.close();

    }
}