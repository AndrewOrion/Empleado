package clases;

public class Repartidor extends Empleado{
	private String zona;
	private String matricula;
	private double KMInicioMes;
	private double KMFinales;
	private double dietas;

	public Repartidor() {
		super();
		this.zona="";
		this.matricula="";
	}

	public Repartidor(String nombre, String apellido, int edad, double salario, int antigüedad, 
			String zona, String matricula, double KMInicioMes, double KMFinales, double dietas) {
		super(nombre, apellido, edad, salario, antigüedad);
		this.zona = zona;
		this.matricula = matricula;
		this.KMInicioMes = KMInicioMes;
		this.KMFinales = KMFinales;
		this.dietas= dietas;
	}
	
	

	public Repartidor(String nombre, String apellido, int edad, double salario, int antiguedad, String zona,
			String matricula) {
		super(nombre, apellido, edad, salario, antiguedad);
		this.zona = zona;
		this.matricula = matricula;
	}

	public Repartidor (Repartidor rep) {
		super();
		this.zona=rep.zona;
		this.matricula=rep.matricula;
		this.KMInicioMes=rep.KMInicioMes;
		this.KMFinales=rep.KMFinales;
		this.dietas=rep.dietas;
	}

	@Override
	public String toString() {
		return "Repartidor: \n"+nombre + " " + apellido + "\n" + edad + " años\nSalario: " + salario 
				+ "\nMatricula: " + matricula + "\nKM iniciales: " + KMInicioMes + " / KM finales: "
				+ KMFinales + "\nDietas=" + dietas + "\nZona: " + zona + "\nAntigüedad: " + antiguedad;
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
	
	public double getKMInicioMes() {
		return KMInicioMes;
	}

	public double getKMFinales() {
		return KMFinales;
	}

	public double getDietas() {
		return dietas;
	}
	
	public void añadirDieta(double dietaDia) {
		if (dietaDia>25)
			this.dietas=this.dietas+25;
		else {
			this.dietas=this.dietas+dietaDia;
		}
	}
	
	public void actualizaKms(double km) {
		if (km>this.KMFinales) {
			this.KMFinales=km;
		}
	}
	
	public void reiniciarDietas() {
		this.dietas=0;
	}
	
	public void reiniciarKm() {
		this.KMInicioMes=this.KMFinales;
	}

	@Override
	public double calculaSalario() {
		return this.salario+this.dietas+0.45*(KMFinales-KMInicioMes);
	}
}
	
	
