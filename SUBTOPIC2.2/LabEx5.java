import java.util.Scanner;

class LabEx5{
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

		System.out.print("masukan nombor: ");
		int nombor1 = sc.nextInt();
		System.out.print("masukan nombor: ");
		int nombor2 = sc.nextInt();


	if (nombor1<nombor2)
		System.out.println(nombor1+" is less than "+nombor2);
	else
		System.out.println(nombor1+" is greater than "+nombor2);

	}
}