import java.util.Scanner;

class Labex4{
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		int inputno[]=new int[10];

		for(int i=0;i<10;i++){
			System.out.print("enter number"+(i+1)+":");
			inputno[i]= input.nextInt();
		}

		int temp;
		for(int i=0;i<10;i++){
			for(int j=i+1;j<10;j++){
			 if (inputno[i]>inputno[j]){
			 	temp=inputno[i];
			 	inputno[i]=inputno[j];
			 	inputno[j]=temp;
			 }
			}
		}
		System.out.println("");
		System.out.println("Array in Descending order: ");
		for(int i=0;i<10;i++){
			System.out.print(inputno[i]+"");

		}		
	}
}