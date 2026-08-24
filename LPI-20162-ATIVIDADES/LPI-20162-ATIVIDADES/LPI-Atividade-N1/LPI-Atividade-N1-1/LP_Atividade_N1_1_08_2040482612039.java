//Abordagem Escalar com Inteiros (Centavos)
import java.util.Scanner;
public class LP_Atividade_N1_1_08_2040482612039{

    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);

        System.out.print("Informe o valor total da compra em reais: ");
        double valorTotalReais = sc.nextDouble();

        System.out.print("Informe o número de parcelas: ");
        int numeroParcelas = sc.nextInt();

    //______________
    System.out.println("--- Calculadora Financeira Escalar (Mapeamento em Centavos) ---");

    long totalCentavos = Math.round(valorTotalReais * 100);

    System.out.println("Valor total convertido: " + totalCentavos + " centavos.");
    long parcelasCentavos = totalCentavos / numeroParcelas;
    double parcelasReais = parcelasCentavos / 100.0;

    System.out.println("Divisão de R$ " + valorTotalReais + " por " + numeroParcelas + " em centavos: " + parcelasCentavos + " centavos por parcela.");
    System.out.println("Valor convertido para exibição: R$ " + parcelasReais);
 
     sc.close();
    }
}

//_____COMPARAÇÃO_________
 
//VANTAGENS:
// 1. Usa tipos primitivos (long/int), sendo mais rápido e consumindo menos memória.
// 2. Permite usar operadores aritméticos tradicionais (+, -, *, /) em vez de métodos.
  
// DESVANTAGENS (em relação ao BigDecimal):
//1. Se o valor for muito grande, o tipo primitivo pode estourar seu limite de bits.
//2. Se uma divisão não for exata,a gente precisa tratar as sobras dos centavos na mão.
//  O BigDecimal já faz esses arredondamentos sozinho de forma automática.
 
