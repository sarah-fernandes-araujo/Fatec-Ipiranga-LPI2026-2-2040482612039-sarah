//Vetores Unidimensionais em Java: Declaração, Acesso, Percurso e Busca Linear.
// Monitoramento de Temperatura de um Servidor de Data Center

import java.util.Scanner;
public class pgm_N13{

    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);

        System.out.print("Quantidade de leituras: ");
        int quantidadeLeituras = sc.nextInt();
        double [] temperaturas = new double [quantidadeLeituras];

        for ( int i = 0 ; i < quantidadeLeituras; i++){
            System.out.print("Temperatura (°C): ");
            temperaturas[i] = sc.nextDouble(); 
        }
        
        System.out.println("-- Leituras Registradas --");
       
        for (int i = 0; i < quantidadeLeituras; i++) {
        System.out.println("Leitura [" + i + "]:  " + temperaturas[i] + "°C");
      }
        System.out.println("-- Acesso Direto --");
        System.out.println("Primeira leitura (indice 0):  " + temperaturas[0] + "°C");
        System.out.println("Ultima leitura (indice " + (quantidadeLeituras - 1) + "):  " + temperaturas[quantidadeLeituras - 1] + "°C");
      
        double maiorTemp = temperaturas[0];
        int indiceMaior = 0;
        double menorTemp = temperaturas[0];
        int indiceMenor = 0;

         for (int i = 1; i < quantidadeLeituras; i++) {
            if (temperaturas[i] > maiorTemp) {
                maiorTemp = temperaturas[i];
                indiceMaior = i;
    }

    if (temperaturas[i] < menorTemp) {
        menorTemp = temperaturas[i];
        indiceMenor = i;
    }
}

System.out.println("-- Busca Linear: Extremos --");
System.out.println("Maior temperatura:  " + maiorTemp + "°C (indice " + indiceMaior + ")");
System.out.println("Menor temperatura:  " + menorTemp + "°C (indice " + indiceMenor + ")");

System.out.print("Temperatura crítica de alerta (°C): ");
double temperaturaCritica = sc.nextDouble();

System.out.println("-- Busca Linear: Alerta --");

int indiceAlerta = -1;
for (int i = 0; i < quantidadeLeituras; i++) {
    if (temperaturas[i] >= temperaturaCritica) {
        indiceAlerta = i;
        break;
    }
}

if (indiceAlerta != -1) {
    System.out.println("Alerta:  temperatura critica atingida na leitura de indice " + indiceAlerta + " (" + temperaturas[indiceAlerta] + "°C).");
} else {
    System.out.println("Nenhuma leitura atingiu ou ultrapassou a temperatura critica informada.");
}
      
        sc.close();
    }
}

