//Escolhi o "while" porque não se sabe quantas vendas ocorrerão no turno

//Registro de Vendas no Caixa até o Fechamento

import java.util.Scanner;

public class LP_Atividade_N1_2_02_2040482612039 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("__ Execução 1 (com vendas) __ \n ");
        
        int qntVendas = 0;
        double valorVenda = sc.nextDouble();
        double totalVendas = 0;
        
        while (valorVenda != 0){
             System.out.print("Valor da venda (ou 0 para encerrar): ");
             valorVenda = sc.nextDouble();
             totalVendas += valorVenda;
             qntVendas++;
             
        }


     sc.close();
    }
    
}
