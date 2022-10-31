import java.util.Scanner;
import java.text.DecimalFormat;

class Salary{
	//main method
	public static void main(String args[]){
		//create a scanner
		Scanner input = new Scanner(System.in);

		int pilihan;
		char teruskan;

		//ulangan do-while
		do{
			menu();
			System.out.print("Pilihan Anda :");
			pilihan = input.nextInt();

			switch(pilihan){
				case 1 : insert();
					     break;
				case 2 : displayData();
					     break;
				case 3 : print();
						 break;
			}

			System.out.print("Adakah anda ingin meneruskan program ini? (Y/N) :");
			teruskan = input.next().charAt(0);

		}while((teruskan =='Y')||(teruskan =='y'));

		System.out.print("Terima kasih kerana telah menggunakan aplikasi ini!");
	}

	//isytiharkan array bagi nama pekerja dan setiap bulan gaji
	static String namaPekerja[]=new String[3];
	static double gajiJanuari[]=new double[3];
	static double gajiFebruari[]=new double[3];
	static double gajiMac[]=new double[3];
	static DecimalFormat deci = new DecimalFormat("#.00");

	//method menu
	private static void menu(){
		System.out.println("1. Masukkan Nama dan Gaji Pekerja");
		System.out.println("2. Paparan Jumlah Gaji Bulanan");
		System.out.println("3. Paparan Gaji Mengikut Pekerja");
		System.out.println("");
	}

	//method insert
	private static void insert(){

		Scanner inputNama = new Scanner(System.in);
		Scanner inputGaji = new Scanner(System.in);

		for(int x=0; x<3; x++){
			System.out.print("Masukkan Nama Pekerja: ");
			namaPekerja[x] = inputNama.nextLine();
			System.out.print("Gaji Bulan Januari (RM): ");
			gajiJanuari[x] = inputGaji.nextDouble();
			System.out.print("Gaji Bulan Februari (RM): ");
			gajiFebruari[x] = inputGaji.nextDouble();
			System.out.print("Gaji Bulan Mac (RM): ");
			gajiMac[x] = inputGaji.nextDouble();

			if(x==(namaPekerja.length-1)){
				System.out.println("");
			}
		}

	}

	//method displayData
	private static void displayData(){
		System.out.println("Jumlah Gaji Bulan Januari : RM"+deci.format(getSum(gajiJanuari)));
		System.out.println("Jumlah Gaji Bulan Februari : RM"+deci.format(getSum(gajiFebruari)));
		System.out.println("Jumlah Gaji Bulan Mac : RM"+deci.format(getSum(gajiMac)));
		System.out.println("");
	}

	//method getSum
	private static double getSum(double[] array){
		double sum = 0;
		for (int x=0; x<3; x++){
			sum=sum+array[x];
		}
		return sum;
	}

	//method print
	private static void print(){
		System.out.println("Nama\tJanuari (RM)\tFebruari (RM)\tMac (RM)");
		System.out.println("------------------------------------------------------");
		for(int x=0; x<3; x++){
			System.out.println(namaPekerja[x]+"\t"+deci.format(gajiJanuari[x])+"\t\t"+deci.format(gajiFebruari[x])+"\t\t"+deci.format(gajiMac[x]));
		}
		System.out.println("");
	}

}