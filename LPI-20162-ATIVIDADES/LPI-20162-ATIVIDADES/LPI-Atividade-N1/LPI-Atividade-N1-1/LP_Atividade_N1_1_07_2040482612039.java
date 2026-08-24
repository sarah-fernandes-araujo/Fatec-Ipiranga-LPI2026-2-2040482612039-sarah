//Precisão Decimal com BigDecimal

import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode; // Vamos usar no final para o arredondamento!
public class LP_Atividade_N1_1_07_2040482612039{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

     //_______________________

        System.out.print("Informe o valor A (ex.: 1.00): ");
        String valorA = sc.nextLine();

        System.out.print("Informe o valor B (ex.: 0.90): ");
        String valorB = sc.nextLine();

        System.out.print("Informe o valor total da compra: ");
        String valorCompra = sc.nextLine();

        System.out.print("Informe o número de parcelas: ");
        int numeroParcelas = sc.nextInt();

    //_______________________
        double a = Double.parseDouble(valorA);
        double b = Double.parseDouble(valorB);
        double resultadoDouble = a - b;

        System.out.println("--- Demonstração da Imprecisão do padrão IEEE 754 (double) ---");
        System.out.println("Resultado esperado de " + valorA + " - " + valorB + " seria 0.10");
        System.out.println("Resultado real obtido com double: " + resultadoDouble);

    //_______BigDecimal______

        BigDecimal bigA = new BigDecimal(valorA);
        BigDecimal bigB = new BigDecimal(valorB);
        BigDecimal resultadoBigDecimal = bigA.subtract(bigB);

        System.out.println("\n--- Correção exata utilizando java.math.BigDecimal ---");
        System.out.println("Resultado com BigDecimal (String Constructor): " + resultadoBigDecimal);

    //_______Div Parcelas ______

        BigDecimal totalCompra = new BigDecimal(valorCompra);

        BigDecimal parcelas = new BigDecimal(numeroParcelas);

    // divide(divisor, casasDecimais, modoArredondamento)
        BigDecimal valorParcela = totalCompra.divide(parcelas, 2, RoundingMode.HALF_UP);

System.out.println("\n--- Divisão de parcelas com Escala e RoundingMode.HALF_UP ---");
System.out.println("Compra de R$ " + totalCompra + " dividida em " + numeroParcelas + "x: R$ " + valorParcela + " por parcela.");


        sc.close();
    }
}