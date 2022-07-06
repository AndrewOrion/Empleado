package clases;

/**
 * @author Andrew
 *
 */
public class Empleado {
	protected String nombre;
	protected String apellido;
	protected int edad;
	protected double salario;
	protected int antiguedad;
	
	public static final double factorTrienio1=0.05; //para q no varie
	public static final double factorTrienio2=0.08;
	
	public Empleado() { //constructor vacio
		this.nombre="";
		this.apellido="";
		this.edad=0;
		this.salario=0;
		this.antiguedad=0;
	}

	//constructor de la clase que crea un objeto con estos parametros
	public Empleado(String nombre, String apellido, int edad, double salario, int antiguedad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.salario = salario;
		this.antiguedad = antiguedad;
	}
	
	public Empleado(Empleado emp) {
		super();
		this.nombre = emp.nombre;
		this.apellido = emp.apellido;
		this.edad = emp.edad;
		this.salario = emp.salario;
		this.antiguedad = emp.antiguedad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public int getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}

	@Override
	public String toString() {
		return "Empleado:\nNombre:" + nombre + ", Apellido:" + apellido + ", Edad:" + edad + ", Salario:" + salario
				+ ", Antigüedad:" + antiguedad;
	}
	
	
	/* Calcula los trienios y suma 5% u 8% 
	 * dependiendo del número de trienios 
	 */
	public double calculaTrienios() {
		int numTrienios=this.antiguedad/3;
		double dinero = 0;
		double salarioNuevo=this.salario;
		
		for (int i=1;i<=numTrienios;i++) {
			
			if (i<=5) {
				dinero=dinero+salarioNuevo*factorTrienio1; //dinero del trienio
			}
			else {
				dinero=dinero+salarioNuevo*factorTrienio2;	
			}
			salarioNuevo=this.salario+dinero;
		}
		return dinero;
	}
	
	/*Método que calcula el salario de un empleado
	 * sumando la cantidad que le corresponde segun los
	 * trienios
	 */
	public double calculaSalario() {
		return this.salario+calculaTrienios();
	}
	
}
