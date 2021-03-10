package interfejs;

import magacin.Artikal;

public interface IMagacin {
	public void dodajArtikal(Artikal artikal); //dodaavanje novog ili povecavanje kolicine

	public void izbaciArtikal(Artikal artikal); //smanjenje kolicine
	
	public Artikal vratiArtikal(int sifra);

}
