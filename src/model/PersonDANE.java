package model;

public class PersonDANE implements Comparable<PersonDANE> {

	private String nome;
	private String lastname;
	private double ingreso;
	private int ege;
	private int estrato;
	
	
	public PersonDANE(String nome, String lastname, double ingreso, int ege, int estrato) {
		super();
		this.nome = nome;
		this.lastname = lastname;
		this.ingreso = ingreso;
		this.ege = ege;
		this.estrato = estrato;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getLastname() {
		return lastname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	public double getIngreso() {
		return ingreso;
	}


	public void setIngreso(double ingreso) {
		this.ingreso = ingreso;
	}


	public int getEge() {
		return ege;
	}


	public void setEge(int ege) {
		this.ege = ege;
	}


	public int getEstrato() {
		return estrato;
	}


	public void setEstrato(int estrato) {
		this.estrato = estrato;
	}


	@Override
	public String toString() {
		return "PersonDANE [nome=" + nome + ", lastname=" + lastname + ", ingreso=" + ingreso + ", ege=" + ege
				+ ", estrato=" + estrato + "]";
	}


	@Override
	public int compareTo(PersonDANE o) {
		// TODO Auto-generated method stub
		//return this.ege - o.ege;//compara por edad
		//return this.nome.compareTo(o.nome);//compara por nombre
		//return this.estrato-o.estrato;//compara por estrato
		int criterioA = this.estrato-o.estrato;//compara por estrato y apellido 
		if (criterioA==0) {
			int criterioB=this.lastname.compareTo(o.lastname);
			return criterioB;
		}else {
			return criterioA;
		}
	}
	//belongs to MargeSorf
	
	
	
}
