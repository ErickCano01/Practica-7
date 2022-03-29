package pract7;

public class Pajaro {
	private int Daño;
	private String Poder;
	private String Tamaño;
	
	public Pajaro(int Daño, String Poder, String Tamaño ) {
		this.Daño = Daño;
		this.Poder = Poder;
		this.Tamaño = Tamaño;
		
	}
	
	public int getDaño() {
		return Daño;
	}
	public String getPoder() {
		return Poder;
	}
	public String getTamaño() {
		return Tamaño;
	}

}
