package assignments.simpleprg;

public class sameornot {
//2. Define a two variables a and b, and using assertion check whether they are same or not. 

		public static void main(String[] args) {
			int a=1;
			int b=1;
			if(a==b)
			{
				System.out.println("A is Equal to B");
			}
			else
			{
				assert(a==b);
				System.out.println("A is Not Equal to B");
			}
		}

	}


