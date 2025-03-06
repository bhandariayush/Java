package part2;

public class Ques3 {

	public static void main(String[] args) {
		int row=3, col =3;
		int[][] matrix = {
				{1, 2, 3},
		        {4, 5, 6},
		        {7, 8, 9}
		        };		        
		System.out.println("The Matrix is:");
		for (int i = 0; i < row; i++) {
		    for (int j = 0; j < col; j++) {
		        System.out.print(matrix[i][j] + " ");
		        }
		    System.out.println();
		    }	
		System.out.println("The transpose is");
        int[][] trans = new int[row][col];
        for (int i = 0; i < row; i++) {
		    for (int j = 0; j < col; j++) {
		    	trans[i][j] = matrix[j][i];
		        System.out.print(trans[i][j] + " ");
		    }
		    System.out.println();
	    }
	}
}