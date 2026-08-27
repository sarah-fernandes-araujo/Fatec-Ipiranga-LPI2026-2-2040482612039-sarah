//Escolhi o "while" porque não se sabe quantas vendas ocorrerão no turno,
//ou seja, não sei a quantidade exata de repetições.

//Registro de Vendas no Caixa até o Fechamento

import java.util.Scanner;

public class LP_Atividade_N1_2_02_2040482612039 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int qntVendas = 0 ;
        double totalVendas = 0;

        System.out.print("Valor da venda (ou 0 para encerrar): ");
        double valorVenda = sc.nextDouble();

        while (valorVenda != 0){
            totalVendas += valorVenda;
            qntVendas++;
            System.out.print("Valor da venda (ou 0 para encerrar): ");
            valorVenda = sc.nextDouble();
        }

        if (qntVendas > 0){
            double media = totalVendas / qntVendas;
            System.out.printf("Total vendido no turno: R$ %.2f\n", totalVendas);
            System.out.println("Quantidade de vendas: " + qntVendas);
            System.out.printf("Valor médio por venda: R$ %.2f\n", media);

        }else{
            System.out.print("Nenhuma venda registrada nesta sessão de caixa.");
        }

       sc.close();
    
    } 
}
    