import java.util.Scanner;
import java.text.DecimalFormat;

class MarkahPelajar{
	//main method
	public static void main(String args[]){
		//create a scanner
		Scanner input = new Scanner(System.in);

		int pilihan;

		//ulangan do-while
		do{
			menu();
			System.out.print("Pilihan Anda :");
			pilihan = input.nextInt();

			switch(pilihan){
				case 1 : insert();
					     break;
				case 2 : calculate();
					     break;
				case 3 : print();
						 break;
			}

		}while(pilihan!=4);

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

	//method insert
	public static void insert(){

		Scanner inputNama = new Scanner(System.in);
		Scanner inputMarkah = new Scanner(System.in);

		for(int x=0; x<3; x++){
			System.out.print("Nama Pelajar: ");
			namaPelajar[x] = inputNama.nextLine();
			System.out.print("Markah Ujian 1: ");
			markahUjian1[x] = inputMarkah.nextInt();
			System.out.print("Markah Pertengahan Tahun: ");
			markahUjianPT[x] = inputMarkah.nextInt();
			System.out.print("Markah Akhir Tahun: ");
			markahUjianAT[x] = inputMarkah.nextInt();

		if(x==(namaPelajar.length-1)){
			System.out.println("Terima Kasih!");
			System.out.println("");
		}
		}

	}

	//method calculate
	private static void calculate(){
		System.out.println("Jumlah Markah Ujian 1 : "+getSum(markahUjian1));
		System.out.println("Jumlah Markah Pertengahan Tahun : "+getSum(markahUjianPT));
		System.out.println("Jumlah Markah Akhir Tahun : "+getSum(markahUjianAT));
		System.out.println("Purata Markah Ujian 1 : "+deci.format(getAverage(markahUjian1)));
		System.out.println("Purata Markah Pertengahan Tahun : "+deci.format(getAverage(markahUjianPT)));
		System.out.println("Purata Markah Akhir Tahun : "+deci.format(getAverage(markahUjianAT)));
		System.out.println("");
	}

	//method getSum
	private static double getSum(int[] array){
		double sum = 0;
		for (int x=0; x<3; x++){
			sum=sum+array[x];
		}
		return sum;
	}

	//method getAverage
	private static double getAverage(int[] array){
		double sum = 0;
		for (int x=0; x<3; x++){
			sum=sum+array[x];
		}
		return sum/array.length;
	}

	//method print
	private static void print(){
		System.out.println("Nama\tUjian 1\tPertengahan Tahun\tAkhir Tahun");
		System.out.println("------------------------------------------------------");
		for(int x=0; x<3; x++){
			System.out.println(namaPelajar[x]+"\t"+markahUjian1[x]+"\t\t"+markahUjianPT[x]+"\t\t"+markahUjianAT[x]);
		}
		System.out.println("");
	}

}