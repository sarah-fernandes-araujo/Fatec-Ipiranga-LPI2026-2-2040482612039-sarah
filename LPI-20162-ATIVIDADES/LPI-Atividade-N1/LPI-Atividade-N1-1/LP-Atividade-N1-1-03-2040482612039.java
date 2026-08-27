//Tratamento de NullPointerException por Auto-Unboxing

import java.util.Scanner;
public class LP_Atividade_N1_1_03_2040482612039{

    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);

        Integer idade = null;
        System.out.print("Tentando realizar operação aritmética com Integer nullo... ");

//_____Operação aritmética (Unboxing) + bloco try/catch
       try{
          int proximoAno = idade + 1;
       }catch (NullPointerException e){
          System.out.println ("\nErro Capiturado com sucesso: Não foi possível calcular porque a idade não foi informada (Null).");
          System.out.println ("Detalhe da Execução: " + e);
}

//_____Novo valor de idade
    System.out.print("\n Informe uma idade válida: ");
    int novaIdade = sc.nextInt();
    idade = novaIdade;
    System.out.println("Retribuindo valor válido para a variável... ");

    System.out.println("Operação bem-sucedida! Idade atual: " + idade + " | Idade no próximo ano: " + (idade + 1));

sc.close();
    }
}