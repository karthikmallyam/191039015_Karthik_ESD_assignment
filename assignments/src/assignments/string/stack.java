package assignments.string;

//15.                Develop Stack with following operations
//i) createNew( )        ii) push( )      iii)   pop( )      iv) display( )    v) empty( ) 
import java.util.Scanner;

public class stack {
 private int maxSize;
 private static long[] stackArray;
 private static int top;
 static Scanner in = new Scanner(System.in);
 
 public stack(int s) {
    maxSize = s;
    stackArray = new long[maxSize];
    top = -1;
    System.out.println("Stack created ::");
 }
 public static void push(long j) {
    stackArray[++top] = j;
 }
 public static long pop() {
    return stackArray[top--];
 }
 
 public static boolean isEmpty() {
    return (top == -1);
 }
 public static void display()
 {
	   for(int i=0;i<top+1;i++)
	   {
		   System.out.print(stackArray[i]+"\t");
	   }
	   System.out.println();
 }
 public static void main(String[] args) {
	   System.out.println("Enter the Size of stack ::");
	   int size=in.nextInt(); 
	   stack theStack = new stack(size);
	   
	   int sel;
	do
	   {
		   System.out.println("Enter 1->push, 2->pop, 3->display, 4->isempty, 0->Exit() ::");
		 sel=in.nextInt();
		   switch(sel)
		   {
		   case 1:
			   System.out.println("Enter the data to push in to stack :: ");
			   int data=in.nextInt();
			   push(data);
			   break;
		   case 2:
			   long rev=pop();
			   System.out.println("The "+rev+" is poped from the stack");
			   break;
		   case 3:
			   display();
			   break;
		   case 4:
			   if(isEmpty())
			   {
				   System.out.println("Stack is empty");
			   }
			   else
			   {
				   System.out.println("Stack is Not empty");
			   }
			   break;
		   }
	      System.out.println("");
	   }
	   while(sel!=0);
	   System.out.println("Operation ended");
	   }
	   
 }