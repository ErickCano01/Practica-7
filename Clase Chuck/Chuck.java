package pract7;

public class Chuck extends Pajaro{
	
	private String Nombre;
	public Chuck(int Da�o, String Poder, String Tama�o,String Nombre) {
		super(Da�o,Poder,Tama�o);
		this.Nombre = Nombre;
	}
	
	
	public void Mostrar() {
		System.out.println("El pajaro"+Nombre+
				" ha hecho "+getDa�o()+
				" de da�o y ha usado su poder"+getPoder()+
				" Atacando rapidamente a las estructuras y a los cerdos y su tama�o es"+getTama�o());
	}
}
