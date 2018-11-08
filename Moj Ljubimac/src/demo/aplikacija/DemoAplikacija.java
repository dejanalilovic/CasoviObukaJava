package demo.aplikacija;

import greska.GreskaAplikacije;
import osoba.Vlasnik;
import zivotinje.Kuce;
import zivotinje.KucniLjubimac;
import zivotinje.Ribice;

public class DemoAplikacija {

	public static void main(String[] args) {
		
		Vlasnik vlasnik = new Vlasnik();
		Kuce ker;
		try {
			ker = new Kuce("Zuca", true, "DODZ", "ima papire");
			KucniLjubimac ribica = new Ribice("Milunka", false, true);
			
			vlasnik.setaj(ker);
		//	vlasnik.setaj(ribica);
			
			
			vlasnik.brigaOLjubimcu(ker);
			vlasnik.brigaOLjubimcu(ribica);
			
			vlasnik.staviOgrlicu(ribica);
			Kuce zuca = new Kuce(null, true, "Haski", "nema papire");
			
		} catch (GreskaAplikacije e) {
			System.err.println(e.getMessage());
	
		}
		
	}

}
