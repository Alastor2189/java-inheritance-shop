package java.lessons.org.prodotto2;

import java.util.Random;

public class Prodotto {
	private int codice;
	private String nome;
	private String marca	;
	private double prezzo;
	private float iva = 22;
	
	public Prodotto(String nome, String marca, double prezzo) {
		this.nome = nome;
		this.marca = marca;
		this.prezzo = prezzo;
		
		Random rand = new Random();
		this.codice = rand.nextInt(100000000);
	}
	public String getCodiceIdentificativo() {
		return String.format("%08d", this.codice);
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getMarca() {
		return this.marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public void setNome(String nome) {
		 this.nome = nome;
	}
	
	public double getPrezzo() {
		return this.prezzo;
	}
	
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	
	public float getIva() {
		return this.iva;
	}
	
	public void setIva(float iva) {
		this.iva = iva;
	}
	
	public double prezzoFinale() {
		return this.prezzo * ( this.iva/100 + this.prezzo );
	}
