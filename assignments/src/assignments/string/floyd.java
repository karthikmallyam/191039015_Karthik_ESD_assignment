package assignments.string;
//9.   Shown below is a Floyd's triangle.
public class floyd {
	static void printFloydTriangleModified(int n)
	{
		int i, j, val = 0; 
		System.out.println(); 
		System.out.println("The Modified Floyd Triangle is :: ");
		for (i = 1; i <= n; i++) 
		{ 
			for (j = 1; j <= i; j++) 
			{ 
				val++;
				if(val%2 == 0)
				{
					System.out.print(0 + " ");
				}
				else
				{
					System.out.print(1 + " ");
				}
				 
				
			} 
			System.out.println(); 	
		} 
	}
	static void printFloydTriangle(int n) 
	{ 
		int i, j, val = 1; 
		System.out.println("The Floyd Triangle is :: ");
		for (i = 1; i <= n; i++) 
		{ 
			for (j = 1; j <= i; j++) 
			{ 
				System.out.print(val + " "); 
				val++; 
			} 
			System.out.println(); 	
		} 
	} 
	public static void main(String[] args) 
	{ 
		printFloydTriangle(13);
		printFloydTriangleModified(13);
	} 
} 
