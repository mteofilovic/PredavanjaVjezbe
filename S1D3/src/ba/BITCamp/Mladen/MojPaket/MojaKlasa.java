package ba.BITCamp.Mladen.MojPaket;

public class MojaKlasa {

	public static void main(String[] args) {
/*
		int voltage=220;
		int resistance=1200;
		
		
		double str=(double)voltage/resistance;
		boolean a = str<0.1;
		
		System.out.printf("I:%.3f\n",str);
		System.out.println("Moze se prezivjeti? "+a);
	
		*/
		
		int meters = 33000;
		int celsius = 20;
		double kelvin = celsius+273.15;
		double fahrenheit = celsius*9/5+32;
		double radijan = 120;
		double stepen= (180/Math.PI)*radijan;
		
		System.out.println(meters+ "[m]");
		System.out.println(meters/1000+ "[km]");
		System.out.println(meters*1000+ "[mm]");
		System.out.println(meters*3.28+ "[feet]");
		System.out.println(meters*39.370+ "[inch]");
		System.out.println(kelvin+ "[K]");
		System.out.println(fahrenheit+ "[F]");
		System.out.println(stepen+ "[Degrees]");
		
	}

}
