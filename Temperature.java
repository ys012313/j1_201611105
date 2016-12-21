public class Temperature {
	private double f = 0;
	private double c = 0;
	public void convertCel(double temp) {
		System.out.printf("Input your Fahrenheit is %.2f F\n",temp);
		c = (temp-32)/1.8;
		System.out.printf("Converted Celsius is %.2f C\n",c);
	}
	public void convertFah(double temp) {
		System.out.printf("Input your Celsius is %.2f C\n",temp);
		f = (temp*1.8)+32;
		System.out.printf("Converted Fahrenheit is %.2f F\n",f);
	}
	public static void main(String[] args) {
		Temperature t = new Temperature();
		double temp = 36.5;
		t.convertFah(temp);
		temp = 97.7;
		t.convertCel(temp);
	}
}