package java.lessons.org.prodotto2;

public class Smarthphone extends Prodotto {
	
		private float codeImei;
		private int memory;
		public Smarthphone(String nome, String marca, double prezzo, float codeImei, int memory) {
			super(nome, marca, prezzo);
			this.codeImei = codeImei;
			this.memory = memory;
		}
		
		public float getMobile() {
			return this.codeImei;
		
		}
		
		public void setMobile(float codeImei) {
			this.codeImei = codeImei;
		}
		
		public int getMemory() {
			return this.memory;
		}
		
		public void setMemory(int memory) {
			this.memory = memory;
		}
		
		@Override
		public String toString() {
		  return super.toString() + 
		         ", IMEI = " + this.getMobile() +
		         ", Memoria in MB = " + this.getMemory();
		}
}
