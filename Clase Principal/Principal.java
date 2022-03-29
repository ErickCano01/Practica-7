package pract7;

import java.util.Scanner;


public class Principal {
	
	public static void main(String [] args) {
		Scanner guardado=new Scanner(System.in);
		int op;

		LosBlues pj1 = new LosBlues(30," Dividirse en 3"," Pequeño"," Blues");
		Chuck pj2 = new Chuck(20," Aceleración"," Mediano"," Chuck");
		Bomb pj3 = new Bomb(60," Explosión"," Grande"," Bomb");
		
		System.out.println("Escoge con que Pajaro quiere atacar \n");
		System.out.println("1)Los Blues");
		System.out.println("2)Chuck");
		System.out.println("3)Bomb");
		op=guardado.nextInt();
		
		switch(op) {
		    case 1:pj1.Mostrar();break;
		    case 2:pj2.Mostrar();break;
		    case 3:pj3.Mostrar();break;
		}
	}
}
