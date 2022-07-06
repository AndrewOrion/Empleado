package clases;

public class  Comercial extends Empleado{
	
	private int numVentas;
	public static final double impVenta=45.90;//para q no varie
	int ventaTotal=0;

	/*constructor vacio con numVentas a 0
	 * 
	 */
	public Comercial() {
		super();
		numVentas=0;
	}

	//constructor con parametros
	public Comercial(String nombre, String apellido, int edad, double salario, 
			int antiguedad) {
		super(nombre, apellido, edad, salario, antiguedad);
		this.numVentas=0;
	}
	
	
	/*Constructor de copia
	 * le paso lo que empleado no tiene, que es numVentas
	 */
	public Comercial(Comercial emp) {
		super(emp);
		this.numVentas=emp.numVentas;
	}

	@Override
	public String toString() {
		return "Comercial: \n"+nombre + " "+ apellido + "\n"+ edad + " años" + "\n" + "Salario= "
				+ salario + "\nVentas= " + numVentas + "\nAntigüedad= " + antiguedad;
	}
	
	public int getNumVentas() {//numVentas esta protected asi puedo devolverlo
		return numVentas;
	}
	
	public void contabilizaVentas(int ventasDia) {	
		if (ventasDia>7) { 
			ventasDia=7;
		}
		this.numVentas=this.numVentas+ventasDia;
		
		if (this.numVentas>25) { 
			this.numVentas=25;
		}
		
	}
	
	public void reseteaContadorVentas() {
		this.numVentas=0;
	}

	@Override
	public double calculaSalario() {
		double ventas=getNumVentas()*45.90;
		return ventas+super.calculaSalario();
	}

	

	public static double getImpVenta() {
		return impVenta;
	}

	public int getVentaTotal() {
		return ventaTotal;
	}

	
	
}
