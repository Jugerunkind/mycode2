import java.util.Scanner;
import java.text.DecimalFormat;

class MarkahPelajar{
	//main method
	public static void main(String args[]){
		//create a scanner
		Scanner input = new Scanner(System.in);
	}

	//isytiharkan array bagi nama pelajar dan setiap ujian
	static String namaPelajar[]=new String[3];
	static int markahUjian1[]=new int[3];
	static int markahUjianPT[]=new int[3];
	static int markahUjianAT[]=new int[3];
	static DecimalFormat deci = new DecimalFormat("#.##");

	//method menu
	private static void menu(){
		System.out.println("1. Masukkan Nama Pelajar dan Markah");
		System.out.println("2. Kira Jumlah Markah dan Purata Markah");
		System.out.println("3. Paparan Markah Mengikut Pentaksiran");
		System.out.println("4. Keluar Program");
		System.out.println("");
	}

		
}