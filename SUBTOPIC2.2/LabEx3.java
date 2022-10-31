import java.util.Scanner;

class LabEx3{
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

		System.out.print("masukan nombor: ");
		int num = sc.nextInt();


	if (num % 2 == 0){
		System.out.println(num+" boleh dibahgi dengan 5");
	}
	else{
		System.out.println(num+" tidak boleh dibahgi dengan 5");
	}

	}
}