package pract7;

public class Bomb extends Pajaro{
	private String Nombre;
	public Bomb(int Daño, String Poder, String Tamaño,String Nombre) {
		super(Daño,Poder,Tamaño);
		this.Nombre = Nombre;
	}
	
	
	public void Mostrar() {
		System.out.println("El pajaro"+Nombre+
				" ha hecho "+getDaño()+
				" de daño y ha usado su poder"+getPoder()+
				" Haciendo explotar toda la base de los cerdos y su tamaño es"+getTamaño());
	}
}
