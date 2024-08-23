package array;

public class array2 {

	public static void main(String[] args) {

		
		String[] name= {"dkd","djkfld","djfkd","djklf","dkfj"};
		
		int[][] score = {{99,88,55},{55,77,66},{55,66,77},{88,77,99},{99,88,66}};
		
		
		
		for(int i=0; i<score.length; i++) {
			for(int j=0; j<score[i].length; j++) {
				System.out.println("score["+i+"]["+j+"]: "+score[i][j]);
			}
		}
	}
}
