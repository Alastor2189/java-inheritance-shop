package java.lessons.org.prodotto2;

public class Televisori extends Prodotto {
	
	private String tvSize;
	private Boolean smartTv;
	
	
	public Televisori(String nome, String marca, double prezzo, String tvSize, Boolean smartTv) {
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
	
	@Override
	public String toString() {
	  return super.toString() + 
	         ", Size = " + this.getTvSize() +
	         ", is Smart = " + (this.isSmartTv() ? "yes":"no");
	}
}

