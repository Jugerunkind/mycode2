import java.util.Scanner;

class One_Int_Array{
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		int marks[]=new int[5];

		for(int i=0;i<5;i++){
			System.out.print("Enter mark"+(i+1)+":");
			marks[i]= input.nextInt();
		}

		for(int i=0;i<5;i++){
			System.out.println("Mark"+(i+1)+":"+marks[i]);
		}
	}
}