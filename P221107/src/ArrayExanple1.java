
public class ArrayExanple1 {

	public static void main(String[] args) {
		int[][] mathScores = new int[2][3];          // 배열 선언 2차원

		for (int i = 0; i < mathScores.length; i++) {       // 행 
			for (int j = 0; j < mathScores[i].length; j++) {   // 열
				System.out.println("mathScores[" + i + "][" + j + "] = " + mathScores[i][j]);
				
			}
		}
	
	
         System.out.println("---------------------------------------------------------------");
	mathScores[1][0]=80;
	mathScores[1][2]=99;


			for(int i = 0; i<mathScores.length; i++) {
				for (int j = 0; j < mathScores[i].length; j++) {
					System.out.println("mathScores[" + i + "][" + j + "] = " + mathScores[i][j]);
				}
			}
		}
	}