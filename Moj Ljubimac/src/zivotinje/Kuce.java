package zivotinje;

import greska.GreskaAplikacije;
import zivotinje.briga.Setnja;

public class Kuce extends KucniLjubimac implements Setnja {
	
	private String rasa;
	private String pedigre;
	
	public Kuce(String naziv, Boolean dlaka, String rasa, String pedigre) throws GreskaAplikacije {
		super(naziv, dlaka);
		this.rasa = rasa;
		this.pedigre = pedigre;
	}

	public String getRasa() {
		return rasa;
	}

	public void setRasa(String rasa) {
		this.rasa = rasa;
	}

	public String getPedigre() {
		return pedigre;
	}

	public void setPedigre(String pedigre) {
		this.pedigre = pedigre;
	}

	@Override
	public String tipZabave() {
		// TODO Auto-generated method stub
		return "Kuce zahteva setnju i igranje na otvorenom";
	}

	@Override
	public Integer preporucenoVremeZabave() {
		// TODO Auto-generated method stub
		return 60;
	}	

}
