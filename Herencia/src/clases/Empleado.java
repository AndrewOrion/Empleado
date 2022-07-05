package clases;

public class Empleado {
	protected String nombre;
	protected String apellido;
	protected int edad;
	protected double salario;
	protected int antigüedad;
	
	public Empleado() {
		this.salario=0;
		this.antigüedad=0;
	}

	public Empleado(String nombre, String apellido, int edad, double salario, int antigüedad) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.salario = salario;
		this.antigüedad = antigüedad;
	}
	
	public Empleado(Empleado emp) {
		super();
		this.nombre = emp.nombre;
		this.apellido = emp.apellido;
		this.edad = emp.edad;
		this.salario = emp.salario;
		this.antigüedad = emp.antigüedad;
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

	public int getAntigüedad() {
		return antigüedad;
	}

	public void setAntigüedad(int antigüedad) {
		this.antigüedad = antigüedad;
	}

	@Override
	public String toString() {
		return "Empleado:\nNombre:" + nombre + ", Apellido:" + apellido + ", Edad:" + edad + ", Salario:" + salario
				+ ", Antigüedad:" + antigüedad;
	}
	
	public double calculaTrienios() {
		int trienios=antigüedad/3;
		double dinero = 0;
		
		for (int i=1;i<=trienios;i++) {
			if (i<=5) {
				dinero=dinero+(salario+dinero)*0.5; //dinero del trienio
			}
			else {
				dinero=dinero+(salario+dinero)*0.8;	
			}				
		}
		return dinero;
	}
	
	public double calculaSalario() {
		salario=salario+calculaTrienios();;
		return salario;	
	}
	
}
