package assignments.string;
//11.Display a question to user allow the user to answer the question.
//Allow 3 chances to user. If correct answer display "Good" else display correct answer after 3 attempts. 
import java.util.Scanner;
public class quetion3times {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String question = "no of days in a year";
		int answer = 365;
		int chance=3;
		System.out.println(question);
		System.out.println("Answer the above question(3 Chances are there for answer)");
		do
		{
			System.out.println("Enter the Answer ::");
			int ans =in.nextInt();
			if(ans==answer)
			{
				System.out.println(">>>>>>>>>>>>>>>>:: Good,Your Answer is Correct ::<<<<<<<<<<<<<<<<");
				break;
			}
			chance--;
			if(chance == 0)
			{
				System.out.println("#########__Sorry.......your answer is wrong__#########");
				System.out.println("The correct Answer is "+answer);
				break;
			}
			else
			{
				System.out.println("You left "+chance+" chance");
			}
		}
		while(chance!=0);
		in.close();
	}

}
