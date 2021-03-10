package magacin;

import java.util.Date;

public class Kucna_hemija extends Artikal {
	private Date rok_trajanja;

	public Date getRok_trajanja() {
		return rok_trajanja;
	}

	public void setRok_trajanja(Date rok_trajanja) {
		if(rok_trajanja.before(new Date()))
			throw new RuntimeException("Rok trajanja mora biti posle danasnjeg dana");
		this.rok_trajanja = rok_trajanja;
	}

	@Override
	public String toString() {
		return "Kucna_hemija [rok_trajanja=" + rok_trajanja + "]"+ super.toString();
	}
	
	
	
}
