package clases;

public class mainEmpleado {

	public static void main(String[] args) {
		Comercial emp1 = new Comercial("Andres","Pino Gallardo", 35, 3000, 10,0);
		
		System.out.println(emp1);
		
		System.out.println(emp1.calculaSalario());
		
		Repartidor emp2 = new Repartidor("Ana","Pérez Gómez", 46,2200,4,"Centro","8123JGT",0,1800);
		
		System.out.println(emp2);
		
		System.out.println(emp2.calculaSalario());
		
		
	
	}


}
