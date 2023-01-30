package java.lessons.org.prodotto2;

public class Cuffie extends Prodotto {
	
	private String coloreCuffie;
	private Boolean cuffieWireless;
	public Cuffie(String nome, String marca, double prezzo, String coloreCuffie, Boolean cuffieWireless) {
		super(nome, marca, prezzo);
		this.coloreCuffie = coloreCuffie;
		this.cuffieWireless = cuffieWireless;
	}
	
	public String getColore() {
		return coloreCuffie;
	}
	
	public void setColore(String coloreCuffie) {
		this.coloreCuffie = coloreCuffie;
	}
	
	public boolean getCuffieWireless() {
		return cuffieWireless;
	}
	
	public void setCuffieWireless(Boolean cuffiewireless) {
		this.cuffieWireless = cuffieWireless;
	}
	
	
	
}

