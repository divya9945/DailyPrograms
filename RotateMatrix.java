package com.mypackage;



public class RotateMatrix {

    public static void rotateMatrix(int[][] matrix, int n) {
        // Step 1: Transpose the matrix (swap matrix[i][j] with matrix[j][i])
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                // Swap elements
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Step 2: Reverse each row
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                // Swap elements in the row
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n - j - 1];
                matrix[i][n - j - 1] = temp;
            }
        }
    }

    public static void printMatrix(int[][] matrix, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

   


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = {
	            {1, 2, 3},
	            {4, 5, 6},
	            {7, 8, 9}
	        };
	        
	        int n = matrix.length; // Matrix size (assuming square matrix)
	        
	        System.out.println(n);
	        System.out.println("Original Matrix:");
	        printMatrix(matrix, n);
	        
	        rotateMatrix(matrix, n);
	        
	        System.out.println("\nRotated Matrix (90 degrees clockwise):");
	        printMatrix(matrix, n);


	}

}
