package assignments.string;

//16.                Develop Queue with following operations,
//i) createNew( )        ii) add( )      iii)   remove( )      iv) display( )    v) empty( ) 
import java.util.Scanner;

public class QUEUE {
 private int maxSize;
 private static long[] stackArray;
 private static int top;
 private static int bottem;
 static Scanner in = new Scanner(System.in);
 
 public QUEUE(int s) {
    maxSize = s;
    stackArray = new long[maxSize];
    top = 0;
    bottem = 0;
    System.out.println("queue created ::");
 }
 public static void add(long j) {
    stackArray[top++] = j;
 }
 public static long remove() {
    return stackArray[bottem++];
 }
 
 public static boolean isEmpty() {
    return (top == bottem);
 }
 public static void display()
 {
	   int bot=bottem;
	   for(int i=bot;i<top;i++)
	   {
		   System.out.print(stackArray[i]+"\t");
	   }
	   System.out.println();
 }
 public static void main(String[] args) {
	   System.out.println("Enter the Size of Queue ::");
	   int size=in.nextInt(); 
	   QUEUE theStack = new QUEUE(size);
	   
	   int sel;
	do
	   {
		   System.out.println("Enter 1->add, 2->remove, 3->display, 4->isempty, 0->Exit() ::");
		 sel=in.nextInt();
		   switch(sel)
		   {
		   case 1:
			   System.out.println("Enter the data to add in to queue :: ");
			   int data=in.nextInt();
			   add(data);
			   break;
		   case 2:
			   long rev=remove();
			   System.out.println("The "+rev+" is removed from the queue");
			   break;
		   case 3:
			   display();
			   break;
		   case 4:
			   if(isEmpty())
			   {
				   System.out.println("queue is empty");
			   }
			   else
			   {
				   System.out.println("queue is Not empty");
			   }
			   break;
		   }
	      System.out.println("");
	   }
	   while(sel!=0);
	   System.out.println("Operation ended");
	   }
	   
 }