//Operadores Aritméticos Relacionais e de Atribuição Composta

import java.util.Scanner;
public class LP_Atividade_N1_1_05_2040482612039{
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);

        System.out.print("Estoque inicial: " );
        int estoque = sc.nextInt();

        System.out.print("Quantidade de entrada: " );
        int qtdEntrada = sc.nextInt();

        System.out.print("Quantidade de saída 1: ");
        int qtdSaida1 = sc.nextInt();

        System.out.print("Quantidade de saída 2: ");
        int qtdSaida2 = sc.nextInt();

        System.out.print ("Estoque mínimo: ");
        int estoqueMinimo = sc.nextInt();

        System.out.print ("Tamanho do lote (caixa): ");
        int tamanhoLote = sc.nextInt();

//(+=): soma e guarda
//(-=): subtrai e guarda

     System.out.println("Estoque inicial: " + estoque + "unidades.");

//Entrada
    estoque += qtdEntrada;
    System.out.println ("Após entrada (+ " + qtdEntrada +"): " + estoque + " unidades.");

//Saídas 
    estoque -= qtdSaida1;
    System.out.println("Após saída (- "+ qtdSaida1 +"): " + estoque + " unidades." ); 
     estoque -= qtdSaida2;
    System.out.println("Após outra saída (- "+ qtdSaida2 +"): " + estoque + " unidades." );

// Verificação 
    boolean abaixoDoMinimo = estoque < estoqueMinimo;
    System.out.println("O nível de estoque atual (" + estoque + ") está abaixo do mínimo (" + estoqueMinimo + ")? " + abaixoDoMinimo);

    int sobraCaixa = estoque % tamanhoLote;
    boolean caixaCompleta = (sobraCaixa == 0);

    System.out.println("Unidades fora de caixas fechadas de " + tamanhoLote + ": " + sobraCaixa);
    System.out.println("O estoque está perfeitamente fracionado em caixas completas? " + caixaCompleta);
        

    sc.close();
    
    }
}