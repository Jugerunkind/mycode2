import java.util.Scanner;

class LabEx10{
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

		System.out.print("masukan nama: ");
		String nama = sc.nextLine();
		System.out.print("masukan tahun lahir: ");
		int tahunLahir = sc.nextInt();
		System.out.print("masukan tinnngi anda (CM): ");
		double tinggi = sc.nextDouble();

		int umur = 2022-tahunLahir;

		System.out.println("\nNama : "+nama);
		System.out.println("\nUmur : "+umur);
		System.out.println("\nTinggi : "+tinggi+"(cm)");

	}
}