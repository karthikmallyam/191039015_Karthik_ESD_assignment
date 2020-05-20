package assignments.string;
//12.  Develop a quiz application. Display the marks scored by user. 
import java.util.Scanner;

public class quizapp {
	static String[] ifwrong=new String[5];
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String question1 = "water represent which state";
		String question2 = "first missing letter_iver?";
		String question3 = "What is the largest ant in the world?";
		String question4 = "Which is the most shocking city in the world?";
		String question5 = "Who will become the president if the vice president dies?";
		String question[]= {question1,question2,question3,question4,question5};
		String answer1 = "liquid";
		String answer2 = "r";
		String answer3 = "elephant";
		String answer4 = "electricity";
		String answer5 = "president";
		String ans1[]= {answer1,answer2,answer3,answer4,answer5};
		String ans2[]= {"Liquid","R","Elephant","Electricity","President"};
		String ans3[]= {"LIQUID","r","ELEPHANT","ELECTRICITY","PRESIDENT"};
		int marks=0;
		boolean check=false;
		System.out.println("Answer the below 5 question");
		for(int i=0;i<5;i++)
		{
			System.out.println(question[i]);
			System.out.println("Enter the Answer ::");
			String ans =in.nextLine();
			boolean val1 = ans.equals( ans1[i] );
			boolean val2 = ans.equals( ans2[i] );
			boolean val3 = ans.equals( ans3[i] );
			if(val1 || val2 || val3)
			{
				marks++;
				ifwrong[i]=" ";
			}
			else
			{
				ifwrong[i]=ans1[i];
				check=true;
			}
		}
		System.out.println("You got "+marks+"/5");
		if(check)
		{
			System.out.println("Answer for wrong questions are ::");
			int num=0;
			for(int j=0;j<ifwrong.length;j++)
			{
				num++;
				if(ifwrong[j]!=" ")
				{
				System.out.println("Question-"+num+" = "+ifwrong[j]);
				}
			}
		}
		System.out.println(">>>>>>>>>>Thank you<<<<<<<<<<");
		in.close();
	}
}