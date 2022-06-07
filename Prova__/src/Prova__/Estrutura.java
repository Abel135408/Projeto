package Prova__;

public class Estrutura {
	protected int Codigo;
    protected String Nome_EST;
	
    
    //
    public int getCodigo() {
		return Codigo;
	}

	public void setCodigo(int codigo) {
		Codigo = codigo;
	}
   //
	public String getNome() {
		return Nome_EST;
	}

	public void setNome(String nome) {
		Nome_EST = nome;
	}
	@Override
	public String toString() {
		return "Nome da Estrutura: " + this.Nome_EST + ", Código da Empresa : " + this.Codigo  ;}
}

