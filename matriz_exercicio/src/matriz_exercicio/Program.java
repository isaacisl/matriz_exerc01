package matriz_exercicio;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int row, column, occurrence;
        
        /// Entrar com o tamanho das Linhas e Colunas
        System.out.println("Enter quantity of row:");
        row = sc.nextInt();
        
        System.out.println("Enter quantity of columns:");
        column = sc.nextInt();
        
        int[][] array = new int[row][column];
        
        // Percorrer a matriz e ir adicionando os valores dentro das colunas
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%nPay attention! Enter %d values to set on the row #%d:%n", column, i);
            for (int value = 0; value < array[i].length; value++) {
                array[i][value] = sc.nextInt();
            }
        }
        
        // Imprime a representação da matriz na tela do User
        System.out.println("\nSee your matrix representation, below:");
      
        for(int[] arrayRow : array){
            for(int value : arrayRow){
                System.out.printf("%7d", value);
            }
            System.out.println();
        }
        
        
        // Pede para entrar com o valor para procurar na matriz
        System.out.println("\nEnter value on matrix that you want to see the position:");
        occurrence = sc.nextInt();
        
        
        
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                if (array[i][j] == occurrence){
                    System.out.printf("%nPosition (%d, %d):%n", i, j);
                    // Verifica se existe algum elemento a esquerda do J
                    if (j > 0){
                        System.out.printf("Left: %d%n", array[i][j-1]);
                    }
                    // Verifica se existe algum elemento a direita do J
                    if (j < column - 1){
                        System.out.printf("Right: %d%n", array[i][j+1]);
                    }
                    
                    if (i > 0){
                        System.out.printf("Up: %d%n", array[i-1][j]);
                    }
                    if (i < row - 1){
                        System.out.printf("Down: %d%n", array[i+1][j]);
                    }
                }    
            }
        }
        sc.close();
	}

}
