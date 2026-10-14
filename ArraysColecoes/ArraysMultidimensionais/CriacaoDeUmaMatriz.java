    package ArraysColecoes.ArraysMultidimensionais;
    import java.util.Scanner;

    /*
        EXERCÍCIO 80
    Enunciado: Crie um programa que declare uma matriz 3x3 e permita que o usuário insira
    valores inteiros para preencher essa matriz. Em seguida, exiba os valores da matriz no
    console.

    */

    public class CriacaoDeUmaMatriz {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            
            int[][] matriz = new int[3][3];

            for(int i = 0; i < 3; i++){

                for(int j = 0; j < 3; j++){
                    System.out.print("Digite o valor para a posição [" + i + "][" + j + "]: ");

                    matriz[i][j] = scanner.nextInt();
                }
            }

            // Exibindo a matriz
            System.out.println("Matriz 3x3:");

            for(int i = 0; i < 3; i++){
                for(int j = 0; j < 3; j++){
                    System.out.print(matriz[i][j] + " ");
                }
                System.out.println();
            }

            scanner.close();
        }
    }


    /*
    Explicação: O programa permite que o usuário preencha uma matriz 3x3 com valores
    inteiros e depois exibe a matriz no console em formato de tabela.

    */