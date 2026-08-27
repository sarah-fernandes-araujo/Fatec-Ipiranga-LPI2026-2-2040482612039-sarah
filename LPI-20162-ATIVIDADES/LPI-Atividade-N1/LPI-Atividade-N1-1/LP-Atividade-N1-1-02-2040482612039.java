//Identidade vs. Valor: Wrappers e o Operador ==

import java.util.Scanner;
 public class LP_Atividade_N1_1_02_2040482612039 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Valor para comparação de primitivos: ");
   
        int valorPrimitivo = sc.nextInt();

        System.out.print("Valor para comparação de objetos (new Integer): ");
        int valorObjeto = sc.nextInt();

        System.out.print("Valor dentro do Integer Cache(-128 a 127): ");
        int valorCache = sc.nextInt();

        System.out.print("Valor fora do Integer Cache: ");
        int valorForaCache = sc.nextInt();

//__________Comparação de Primitivos (int)__________
    System.out.println("---Comparação de Primitivos (int) ---");

    int aPrimitivo = valorPrimitivo;
    int bPrimitivo = valorPrimitivo;
    System.out.println("aPrimitivo == bPrimitivo: " + (aPrimitivo == bPrimitivo));

//__________Comparação Objetos via "new Integer()"_________
    System.out.println("\n--- Comparação de Objetos via 'new Integer()' ---");

    Integer aObjeto = new Integer(valorObjeto);
    Integer bObjeto = new Integer(valorObjeto);
    System.out.println("aObjeto == bObjeto (Identidade): " + (aObjeto == bObjeto));
    System.out.println("aObjeto.equals(bObjeto) (Valor): " + aObjeto.equals(bObjeto));


//_________Comparação Autoboxing e Integer Cache___________
    System.out.println("\n--- Comparação com Autoboxing e Integer Cache ---");

    Integer xCache = valorCache;
    Integer yCache = valorCache;

    Integer xForaCache = valorForaCache;
    Integer yForaCache = valorForaCache;

    System.out.println("Dentro do Cache (" + valorCache + ") -> xCache == yCache: " + (xCache == yCache));
    System.out.println("Fora do Cache (" + valorForaCache + ") -> xForaCache == yForaCache: " + (xForaCache == yForaCache));
    System.out.println("Fora do Cache (" + valorForaCache + ") -> xForaCache.equals(yForaCache): " + xForaCache.equals(yForaCache));


    sc.close();

    }
    
}
