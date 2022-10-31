import java.util.Scanner;

class Labex1{
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
		System.out.println("least Value in an array is : "+inputno[0]);
		System.out.println("Greatest Value in an array is : "+inputno[4]);
	}
}