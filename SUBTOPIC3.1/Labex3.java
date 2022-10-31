import java.util.Scanner;

class Labex3{
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		int array1[]=new int[5];
		int array2[]=new int[5];
		int array3[]=new int[10];

		System.out.println("First array value are : ");
		for(int i=0;i<5;i++){
			System.out.print("enter number"+(i+1)+":");
			array1[i]= input.nextInt();
		}
		System.out.println("");

		System.out.println("Second array value are : ");
		for(int i=0;i<5;i++){
			System.out.print("enter number"+(i+1)+":");
			array2[i]= input.nextInt();
		}

		int temp;
		for(int i=0;i<5;i++){
		    array3[i]=array1[i];
		    array3[i+5]=array2[i];
			 }
	    System.out.println("");

		System.out.println("third array value are : ");
		for(int i=0;i<10;i++){
			System.out.print(array3[i]+"");

		}	
	}
		
}