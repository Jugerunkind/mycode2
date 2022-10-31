import java.util.Scanner;

class Labex2{
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		int inputno[]=new int[5];

		for(int i=0;i<5;i++){
			System.out.print("enter number"+(i+1)+":");
			inputno[i]= input.nextInt();
		}

		int temp;
		for(int i=0;i<5;i++){
			for(int j=i+1;j<5;j++){
			 if (inputno[i]>inputno[j]){
			 	temp=inputno[i];
			 	inputno[i]=inputno[j];
			 	inputno[j]=temp;
			 }
			}
		}
		System.out.println("array is ascending order : ");
		for(int i=0;i<5;i++){
			System.out.print(inputno[1] + " ");
		}
		for(int i=0;i<5;i++){
			for(int j=i+1;j<5;j++){
			 if (inputno[i]>inputno[j]){
			 	temp=inputno[i];
			 	inputno[i]=inputno[j];
			 	inputno[j]=temp;
			 }
			}
		}
		System.out.println("\narray is ascending order : ");
		for(int i=0;i<5;i++){
			System.out.print(inputno[1] + " ");
		}	
	}
}