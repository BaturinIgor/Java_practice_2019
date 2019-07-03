package boostbrain;

import java.util.Random;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        final int [][] result = CreationRandomAdjacencyMatrix();
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int [][] CreationRandomAdjacencyMatrix() {
        final Random random = new Random();
        int matrix_dimension = random.nextInt(10) + 5;
        int [][] adjacency_matrix = new int[matrix_dimension][matrix_dimension];
        for (int i = 0; i < matrix_dimension; i++) {
            for (int j = i; j < matrix_dimension; j++) {
                int edge_weight = random.nextInt(11);
                if (i != j && edge_weight % 5 != 0) {
                    adjacency_matrix[i][j] = edge_weight;
                    adjacency_matrix[j][i] = edge_weight;
                }
                else adjacency_matrix[i][j] = 0;
            }
        }
        return adjacency_matrix;
    }
}

