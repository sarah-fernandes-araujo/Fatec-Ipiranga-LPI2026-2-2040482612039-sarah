/*-------------------------------------------------------------------*
* Disciplina: Linguagem de Programacao I                             *
*             Prof. Verissimo                                        *
*--------------------------------------------------------------------*
* Objetivo do Programa: Simular a jogada  Xeque Pastor               *
* Data - 03/09/2026                                                  *
* Autor: Sarah Fernandes de Araujo
*--------------------------------------------------------------------*/

public class LP_Atividade_N1_4_01_2040482612039{

// Uso de constantes para o tamanho do tabuleiro.
    private static final int LINHAS = 8;
    private static final int COLUNAS = 8;
    private static final String CASA_VAZIA = "   ";
    private static final String CASA_ORIGEM = "...";

    // Matriz multidimensional que armazena a representação visual de cada peça.
    private static String[][] tabuleiro = new String[LINHAS][COLUNAS];

    public static void main(String[] args) {

        // Inicialização da estrutura de dados do tabuleiro
        inicializarTabuleiro();

        System.out.println("==================================================");
        System.out.println("            Posicao Inicial do tabuleiro          ");
        System.out.println("==================================================");
        exibirTabuleiroInicial();

        // Execução modularizada das rodadas conforme sequência especificada
        
        // Jogada #1: Movimentação dos Peões do Rei (e2 -> e4 / e7 -> e5)
        System.out.println("==================================================");
        System.out.println("                    Jogada #1                     ");
        System.out.println("==================================================");
        executarJogada("-------------Brancas jogam e4-------------", 6, 4, 4, 4);
        executarJogada("-------------Pretas jogam e5--------------", 1, 4, 3, 4);

        // Jogada #2: Bispo do Rei Branco e Cavalo da Dama Preto (f1 -> c4 / b8 -> c6)
        System.out.println("==================================================");
        System.out.println("                    Jogada #2                     ");
        System.out.println("==================================================");
        executarJogada("-------------Brancas jogam Bc4------------", 7, 5, 4, 2);
        executarJogada("-------------Pretas jogam Cc6-------------", 0, 1, 2, 2);

        // Jogada #3: Dama Branca e Cavalo do Rei Preto (d1 -> h5 / g8 -> f6)
        System.out.println("==================================================");
        System.out.println("                    Jogada #3                     ");
        System.out.println("==================================================");
        executarJogada("-------------Brancas jogam Dh5------------", 7, 3, 3, 7, "DB6");
        executarJogada("-------------Pretas jogam Cf6-------------", 0, 6, 2, 5);

        // Jogada #4: Captura e Mate pela Dama Branca em f7
        System.out.println("==================================================");
        System.out.println("             Jogada #4 (Xeque Mate)               ");
        System.out.println("==================================================");
        
        // Decisão de Implementação: Marcação explícita das alterações da captura no tabuleiro antes da renderização final
        tabuleiro[3][4] = CASA_ORIGEM; 
        executarJogada("-------------Brancas capturam Peao PP6 em f7 e Xeque MATE (Dxf7#)-------------", 3, 7, 1, 5, "DB6");
    }

    /**
     * Preenche a matriz bidimensional do tabuleiro com a disposição inicial das peças.
     * Separação clara entre peças pretas, espaço vazio central e peças brancas.
     */
    private static void inicializarTabuleiro() {
        // Linha 8: Peças pretas principais
        tabuleiro[0] = new String[]{"tP1", "cP2", "bP3", "dP4", "rP5", "bP6", "cP7", "tP8"};
        // Linha 7: Peões pretos
        tabuleiro[1] = new String[]{"PP1", "PP2", "PP3", "PP4", "PP5", "PP6", "PP7", "PP8"};

        // Linhas 6, 5, 4 e 3: Inicialmente vazias
        for (int i = 2; i <= 5; i++) {
            for (int j = 0; j < COLUNAS; j++) {
                tabuleiro[i][j] = CASA_VAZIA;
            }
        }

        // Linha 2: Peões brancos
        tabuleiro[6] = new String[]{"PB1", "PB2", "PB3", "PB4", "PB5", "PB6", "PB7", "PB8"};
        // Linha 1: Peças brancas principais
        tabuleiro[7] = new String[]{"TB1", "CB2", "BB3", "DB4", "RB5", "BB6", "CB7", "TB8"};
    }

    /**
     * Decisão de Implementação: Separação dos métodos de exibição para respeitar estritamente a especificação visual.
     * Exibe o cabeçalho com as colunas (-a- -b- ...) exclusivamente na posição inicial.
     */
    private static void exibirTabuleiroInicial() {
        System.out.println("  -a- -b- -c- -d- -e- -f- -g- -h-");
        imprimirCorpoTabuleiro();
    }

    /**
     * Exibe o estado atual da matriz sem o cabeçalho superior de colunas.
     */
    private static void exibirTabuleiroJogada() {
        imprimirCorpoTabuleiro();
    }

    /**
     * Realiza a varredura da matriz e imprime as linhas com numeração de 8 a 1.
     */
    private static void imprimirCorpoTabuleiro() {
        for (int i = 0; i < LINHAS; i++) {
            System.out.print((8 - i) + " ");
            for (int j = 0; j < COLUNAS; j++) {
                System.out.print(tabuleiro[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    /**
     * Sobrecarga do método de movimentação para jogadas padrão.
     */
    private static void executarJogada(String cabecalho, int linOrigem, int colOrigem, int linDestino, int colDestino) {
        executarJogada(cabecalho, linOrigem, colOrigem, linDestino, colDestino, null);
    }

    /**
     * Decisão de Implementação: Método centralizado de movimentação modular.
     * Realiza a atualização dos índices na matriz, marca a origem com "..." e dispara a impressão atualizada.
     */
    private static void executarJogada(String cabecalho, int linOrigem, int colOrigem, int linDestino, int colDestino, String nomeEspecialPeca) {
        System.out.println(cabecalho);
        
        String peca = (nomeEspecialPeca != null) ? nomeEspecialPeca : tabuleiro[linOrigem][colOrigem];
        tabuleiro[linOrigem][colOrigem] = CASA_ORIGEM;
        tabuleiro[linDestino][colDestino] = peca;

        exibirTabuleiroJogada();
    }
}