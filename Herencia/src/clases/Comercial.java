package clases;

public class  Comercial extends Empleado{
	
	private int numVentas;
	static double impVenta=45.90;

	public Comercial(Empleado emp) {
		super(emp);
		numVentas=0;
	}

	public Comercial(String nombre, String apellido, int edad, double salario, 
			int antigüedad, int numVentas) {
		super(nombre, apellido, edad, salario, antigüedad);
		this.numVentas=numVentas;
	}

	@Override
	public String toString() {
		return "Comercial [numVentas=" + numVentas + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad
				+ ", salario=" + salario + ", antigüedad=" + antigüedad + "]";
	}
	
	public int contabilizaVentas(int numVentas) {
		int ventaTotal=0;
		
		if (numVentas>7) 
			numVentas=7;
		if (ventaTotal<25) 
			ventaTotal=ventaTotal+numVentas;
		else 
			ventaTotal=25;
		
		return ventaTotal;
			
	}
	
	public void reseteaContadorVentas() {
		contabilizaVentas(0);
	}

	@Override
	public double calculaSalario() {
		
		double ventas=contabilizaVentas(numVentas)*45.90;
		return ventas+super.calculaSalario();
	}

	
}
