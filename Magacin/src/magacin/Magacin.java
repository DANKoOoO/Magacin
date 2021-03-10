package magacin;

import java.util.LinkedList;

import interfejs.IMagacin;

public class Magacin implements IMagacin {
	
	private LinkedList<Artikal> artikli = new LinkedList<Artikal>();
	//metoda dodaje novi artikal ili ako vec postoji povecava kolicinu za onoliko koliko treba
	@Override
	public void dodajArtikal(Artikal artikal) {

		if(artikli.contains(artikal))
			for(Artikal a:artikli)
			if(a==artikal)
				a.setKolicina(a.getKolicina()+1);
		else
			artikli.add(artikal);

	}
	//izbacuje onu kolicinu artikala koja je data iz vec postojece
	@Override
	public void izbaciArtikal(Artikal artikal) {

		if(artikli.contains(artikal))
			for(Artikal a:artikli)
			if(a==artikal)
				a.setKolicina(a.getKolicina()-artikal.getKolicina());


	}
	//vraca odabrani artikal
	@Override
	public Artikal vratiArtikal(int sifra) {

		Artikal artikal = null;
		for(Artikal a: artikli)
			if(a.getSifra() == sifra)
				artikal = a;
		return artikal;

	}

}
