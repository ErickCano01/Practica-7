package pract7;

public class LosBlues extends Pajaro{
	private String Nombre;
	public LosBlues(int Daño, String Poder, String Tamaño,String Nombre) {
		super(Daño,Poder,Tamaño);
		this.Nombre = Nombre;
	}
	
	
	public void Mostrar() {
		System.out.println("El pajaro"+Nombre+
				" ha hecho "+getDaño()+
				" de daño y ha usado su poder"+getPoder()+
				" Dividiendose como Jay, Jake y Jim y su tamaño es"+getTamaño());
	}
	
}
