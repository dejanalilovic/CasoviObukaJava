package osoba;

import zivotinje.Kuce;
import zivotinje.KucniLjubimac;
import zivotinje.briga.BrigaOLjubimcu;
import zivotinje.briga.Setnja;

public class Vlasnik {
	
	public void staviOgrlicu(KucniLjubimac kucniLjubimac) {
		try {
			Kuce pas = (Kuce) kucniLjubimac;
			System.out.println("Stavljena je oglica na " + pas.getNaziv());
		} catch (ClassCastException e) {
			System.err.println("Na ribicu ne mozes da metnes ogrlicu bre");
		}
		
	}	

	// pozivamo interfejs "Setnja"
	public void setaj(Setnja setnja) {
		
		//kastovanje
		Kuce kuce = (Kuce) setnja;
		
		System.out.println("Setam " + kuce.getNaziv() + " " + setnja.preporucenoVremeZabave() + " minuta dnevno");
	}
	
	// pozivamo interfejs "BrigaOLubimcu"
	public void brigaOLjubimcu(BrigaOLjubimcu oljubimcu) {
		
		//kastovanje
		KucniLjubimac k1 = (KucniLjubimac) oljubimcu;
		
		System.out.println("O svom " + k1.getNaziv() + " se brinem na sledeci nacin");
		System.out.println(oljubimcu.tipZabave());
		System.out.println("Najmanje " + oljubimcu.preporucenoVremeZabave() + " minuta dbevno");

		
	}
}
