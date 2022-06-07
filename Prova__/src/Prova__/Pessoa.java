package Prova__;

public class Pessoa {

	
	protected String Nome;
    protected String CPF; 
    protected String Data_Nascimento;
	
    //Retonar_nome 
    public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		this.Nome = nome;
	}
	//Retonar_CPF
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	//Retonar_datadeNascimento
	public String getData_Nascimento() {
		return Data_Nascimento;
	}
	public void setData_Nascimento(String data_Nascimento) {
		Data_Nascimento = data_Nascimento;
	}

}
