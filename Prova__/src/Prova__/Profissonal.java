package Prova__;


public class Profissonal extends Pessoa {
	 protected String Matricula;
	 protected String Cargo;
	  private String carga_Horaria;
	     private  double Salario;
    
    //Retorno_matricula 
    public String getMatricula() {
		return Matricula;
	}
	public void setMatricula(String matricula) {
		Matricula = matricula;
	}
	//Retorno_Cargo
	public String getCargo() {
		return Cargo;
	}
	public void setCargo(String cargo) {
		Cargo = cargo;
	}

	
	 public String getCarga_horaria() {
			return carga_Horaria;
		}
		public void setCarga_horaria(String carga_horaria) {
			this.carga_Horaria = carga_horaria;
		}
		//Retornar_salario 
		public double getSalario() {
			return Salario;
		}
		public void setSalario(double salario) {
			this.Salario = salario;
		}
		
	
}