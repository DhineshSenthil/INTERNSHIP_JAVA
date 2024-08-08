package quiz1;

import java.util.Scanner;

public class quiz {

	private static String usercore;

	public static void main(String[] args) {
		
		String[][]quizz= {
				{"Who is the father of our nation:","Gandhi"},{"Which is the biggest animal planet in the world","Bluewhale"
},{"what is the captial of india","Delhi"}
		};
		int score =0;
		for(int i=0;i<quizz.length;i++) {
			String question=quizz[i]
[0];
			String answer=quizz[i][1];
			System.out.println(question);
			Scanner Scanner=new Scanner(System.in);
			String useranswer=Scanner.nextLine();
		if(useranswer.equalsIgnoreCase(answer)) {
				System.out.println("correct...!");
				score++;
				
			}
			else {
				System.out.println("Incorrect Answer.."+answer+".");
			}
			}
		System.out.println("Your final score"+score+"out of"+quizz.length+".");
		}
}
