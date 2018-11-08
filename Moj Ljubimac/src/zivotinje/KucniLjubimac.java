package zivotinje;

import greska.GreskaAplikacije;
import zivotinje.briga.BrigaOLjubimcu;

public abstract class KucniLjubimac implements BrigaOLjubimcu{

	private String naziv;
	private Boolean dlaka;
	
	public KucniLjubimac(String naziv, Boolean dlaka) throws GreskaAplikacije {
		super();
		//dodajemo Excaption
		if (naziv == null || naziv.isEmpty()) {
			throw new GreskaAplikacije("Naziv mora biti popunjen");
		}
		this.naziv = naziv;
		this.dlaka = dlaka;
	}

//	primer apstraktne metode
//	public abstract void nahrani();
//	public abstract void ocisti();
//	

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public Boolean getDlaka() {
		return dlaka;
	}

	public void setDlaka(Boolean dlaka) {
		this.dlaka = dlaka;
	}

}
