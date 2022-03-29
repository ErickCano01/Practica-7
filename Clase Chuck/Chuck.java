package pract7;

public class Chuck extends Pajaro{
	
	private String Nombre;
	public Chuck(int Daño, String Poder, String Tamaño,String Nombre) {
		super(Daño,Poder,Tamaño);
		this.Nombre = Nombre;
	}
	
	
	public void Mostrar() {
		System.out.println("El pajaro"+Nombre+
				" ha hecho "+getDaño()+
				" de daño y ha usado su poder"+getPoder()+
				" Atacando rapidamente a las estructuras y a los cerdos y su tamaño es"+getTamaño());
	}
}
