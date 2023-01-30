package java.lessons.org.prodotto2;

public class Televisore extends Prodotto {
	
	private String tvSize;
	private Boolean smartTv;
	
	
	public Televisore(String nome, String marca, double prezzo, String tvSize, Boolean smartTv) {
		super(nome, marca, prezzo);
		this.tvSize = tvSize;
		this.smartTv = smartTv;
	}

	public String getTvSize() {
		return tvSize;
	}
	
	public void setTvSize(String tvSize) {
		this.tvSize = tvSize;
	}
	
	public Boolean isSmartTv() {
		return smartTv;
	}
	
	public void setSmartTv(Boolean smartTv) {
		this.smartTv = smartTv;
	}
	
	
}
