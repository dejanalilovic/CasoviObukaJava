package zivotinje;

import greska.GreskaAplikacije;

public class Ribice extends KucniLjubimac {
	
	private Boolean zlatna;

	public Ribice(String naziv, Boolean dlaka, Boolean zlatna) throws GreskaAplikacije {
		super(naziv, dlaka);
		this.zlatna = zlatna;
	}

	public Boolean getZlatna() {
		return zlatna;
	}

	public void setZlatna(Boolean zlatna) {
		this.zlatna = zlatna;
	}

	@Override
	public String tipZabave() {
		// TODO Auto-generated method stub
		return "Plivanje u akvarijumu";
	}

	@Override
	public Integer preporucenoVremeZabave() {
		// TODO Auto-generated method stub
		return 1440;
	}

}
