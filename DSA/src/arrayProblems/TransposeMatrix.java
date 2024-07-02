package arrayProblems;

public class TransposeMatrix {

	public int[][] transpose(int[][] matrix) {
		System.out.println(matrix.length);
		System.out.println(matrix[0].length);
		int[][] output = new int[matrix[0].length][matrix.length];
		for(int i=0;i<matrix[0].length;i++) {
			for(int j=0;j<matrix.length;j++) {
				output[i][j]=matrix[j][i];
			}
		}
		return output;
	}

	public static void main(String[] args) {
		int[][] inputMatrix = {{1,2,3},{4,5,6}};
		TransposeMatrix transposeMatrix = new TransposeMatrix();
		transposeMatrix.transpose(inputMatrix);
	}
}
