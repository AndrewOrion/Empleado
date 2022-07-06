package clases;

public class mainEmpleado {

	public static void main(String[] args) {
		Comercial emp1 = new Comercial("Andres","Pino Gallardo", 35, 1000, 0);
		
		System.out.println(emp1+"\n");
		
		System.out.println("Trienios: "+emp1.calculaTrienios());
		
		System.out.println("Sueldo total: "+emp1.calculaSalario());
		
		
		
		Repartidor emp2 = new Repartidor("Ana","Pérez Gómez", 46,2200,4,"Centro","8123JGT",0,250);
		
		System.out.println("-------------------------------");
		System.out.println("-------------------------------");

		emp2.añadirDieta(20);
		
		emp2.actualizaKms(1500);
		
		System.out.println(emp2+"\n");
		
		emp2.añadirDieta(20);
				
		System.out.println("Sueldo total: "+emp2.calculaSalario());	
	
	}

}