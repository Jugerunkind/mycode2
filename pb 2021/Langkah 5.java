import java.util.Scanner;
import java.text.DecimalFormat;

class Salary{
	//main method
	public static void main(String args[]){
		//create a scanner
		Scanner input = new Scanner(System.in);
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

}