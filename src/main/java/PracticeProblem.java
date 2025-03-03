public class PracticeProblem {
	static int sum2D(int[][] arr2D){
		int sum = 0;
		for(int[] row : arr2D){
			for(int col : row){
				sum += col;
			}
		}
		return sum;
	}

	static int sumRow(int[][] arr2D, int row){
		int sum = 0;
		for(int col : arr2D[row]){
			sum += col;
		}
		return sum;
	}

	static int sumColumn(int[][] arr2D, int col){
		int sum = 0;
		for(int row[] : arr2D){
			sum += row[col];
		}
		return sum;
	}

	public static void main(String args[]){}
}
