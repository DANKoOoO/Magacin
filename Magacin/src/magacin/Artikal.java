package magacin;

public class Artikal {
	private int sifra;
	private String naziv;
	private String opis;
	private int kolicina;
	public int getSifra() {
		return sifra;
	}
	public void setSifra(int sifra) {
		if(sifra<0)
			throw new RuntimeException("Sifra ne moze biti manja od 0");
		
		this.sifra = sifra;
	}
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		if(naziv==null)
			throw new NullPointerException("Naziv ne moze biti null");
		this.naziv = naziv;
	}
	public String getOpis() {
		return opis;
	}
	public void setOpis(String opis) {
		if(opis==null)
			throw new NullPointerException("Opis ne moze biti null");
		this.opis = opis;
	}
	public int getKolicina() {
		return kolicina;
	}
	public void setKolicina(int kolicina) {
		if(kolicina<=0)
			throw new RuntimeException("Kolicina ne moze biti manja ili jednaka od 0");
		this.kolicina = kolicina;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + sifra;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Artikal other = (Artikal) obj;
		if (sifra != other.sifra)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Artikal [sifra=" + sifra + ", naziv=" + naziv + ", opis=" + opis + ", kolicina=" + kolicina + "]";
	}
	
	
	
}
