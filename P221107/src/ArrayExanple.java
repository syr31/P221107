
public class ArrayExanple {

	public static void main(String[] args) {
		int[] scores = { 83, 90, 87, 90, 80, 70, 60, 97, 78, 70, 
						 83, 90, 87, 90, 80, 70, 60, 97, 78, 70,
						 83, 90, 87, 90, 80, 70, 60, 97, 78, 70};
		for (int i = 0; i <= scores.length; i++) {
			System.out.println("scores[" + i + "] : " + scores[i]);
		}

		int sum = 0;

		for (int i = 0; i <= scores.length; i++) {
			sum += scores[i];

			System.out.println("sum : " + sum);
			double avg = (double) sum / scores.length;
			System.out.println("avg : " + avg);

		}
	}

}
