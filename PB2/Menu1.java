import java.util.Scanner;

class Menu1{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);

		int pilihan;
		char teruskan;


		do{
			menu();
			System.out.print("Your choice : ");
			pilihan = input.nextInt();

			switch(pilihan){
				case 1 : burger();
					     break;
				case 2 : fries();
					     break;
				case 3 : soda();
						 break; 
				case 4 : runningTotal();
						 break;
				default: System.out.println("Kesilapan");

			}
			
		}while(pilihan!=4);

}

	
	private static void menu(){
		System.out.println("Welcome to Aqil's Burger");
		System.out.println("1. Burger (RM5.00)");
		System.out.println("2. Fries (RM3.00)");
		System.out.println("3. Soda (RM2.50)");
		System.out.println("4. Done");
		System.out.println("");
	}
	static double priceburger;
	static double pricefries;
	static double pricesoda;

	public static void burger(){
		Scanner quantitybgr=new Scanner(System.in);
		System.out.println("You've ordered a burger");
		System.out.print("Enter quantity : ");
		int quantity=quantitybgr.nextInt();
		double priceburger=quantity*5;
		System.out.println("Subtotal : RM"+priceburger);
		System.out.println(" ");
	}
	public static void fries(){
		Scanner quantityfrs=new Scanner(System.in);
		System.out.println("You've ordered a fries");
		System.out.print("Enter quantity : ");
		int quantity=quantityfrs.nextInt();
		double pricefries=quantity*3;
		System.out.println("Subtotal : RM"+pricefries);
		System.out.println(" ");
	}
	public static void soda(){
		Scanner quantitysod=new Scanner(System.in);
		System.out.println("You've ordered a soda");
		System.out.print("Enter quantity : ");
		int quantity=quantitysod.nextInt();
		double pricesoda=quantity*2.5;
		System.out.println("Subtotal : RM"+pricesoda);
		System.out.println(" "); 		

	}

	public static void runningTotal(){
		double total=priceburger+pricefries+pricesoda;
		System.out.println("Total price : RM"+total);
		System.out.println("Enjoy your meal");
	}
}