package clases;

public class Repartidor extends Empleado{
	private String zona;
	private String matricula;
	private double KMInicioMes;
	private double KMFinales;
	private double dietas;

	public Repartidor() {
		
	}

	public Repartidor(String nombre, String apellido, int edad, double salario, int antigüedad, 
			String zona, String matricula, double kMInicioMes, double kMFinales) {
		super(nombre, apellido, edad, salario, antigüedad);
		this.zona = zona;
		this.matricula = matricula;
		KMInicioMes = KMInicioMes;
		KMFinales = KMFinales;
	}

	public Repartidor (Repartidor rep) {
		super();
		this.zona=rep.zona;
		this.matricula=rep.matricula;
		this.KMInicioMes=rep.KMInicioMes;
		this.dietas=rep.dietas;
	}

	@Override
	public String toString() {
		return "Repartidor [zona=" + zona + ", matricula=" + matricula + ", KMInicioMes=" + KMInicioMes + ", KMFinales="
				+ KMFinales + ", dietas=" + dietas + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad
				+ ", salario=" + salario + ", antigüedad=" + antigüedad + "]";
	}

	public String getZona() {
		return zona;
	}

	public void setZona(String zona) {
		this.zona = zona;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public double añadirDieta(double d) {
		dietas=dietas+d;
		if (dietas<25)
			return dietas;
		else {
			dietas=25;
			return dietas;
		}
	}
	
	public void actualizaKms(double km) {
		if (km>KMFinales) {
			KMFinales=km;
		}
	}

	@Override
	public double calculaSalario() {
		
		double total=super.calculaSalario()+dietas+0.45*(KMFinales-KMInicioMes);
		
		return total;
	}
	
	

}
	
	
