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


}