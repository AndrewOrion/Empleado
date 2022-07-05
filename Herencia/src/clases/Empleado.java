package clases;

public class Empleado {
	protected String nombre;
	protected String apellido;
	protected int edad;
	protected double salario;
	protected int antig�edad;
	
	public Empleado() {
		this.salario=0;
		this.antig�edad=0;
	}

	public Empleado(String nombre, String apellido, int edad, double salario, int antig�edad) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.salario = salario;
		this.antig�edad = antig�edad;
	}
	
	public Empleado(Empleado emp) {
		super();
		this.nombre = emp.nombre;
		this.apellido = emp.apellido;
		this.edad = emp.edad;
		this.salario = emp.salario;
		this.antig�edad = emp.antig�edad;
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

	public int getAntig�edad() {
		return antig�edad;
	}

	public void setAntig�edad(int antig�edad) {
		this.antig�edad = antig�edad;
	}

	@Override
	public String toString() {
		return "Empleado:\nNombre:" + nombre + ", Apellido:" + apellido + ", Edad:" + edad + ", Salario:" + salario
				+ ", Antig�edad:" + antig�edad;
	}
	
	public double calculaTrienios() {
		int trienios=antig�edad/3;
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
