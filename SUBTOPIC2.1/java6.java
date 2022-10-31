class ImplicitCoversionSample{
	public static void main(String args[]) {

		double x; //size is 8 bytes
		int y=2;  //size is 4 bytes
		float z=2.2f;
		x=y+z;  //implicit conversion
		System.out.println("Result"+x);
		
	}
}

