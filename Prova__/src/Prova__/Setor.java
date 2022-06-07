package Prova__;

public class Setor extends Departamento{

	private String descricao_setor;
    private int Codiogo_Setor ;
	

    //
	public int getCodiogo_Setor() {
		return Codiogo_Setor;
	}

	public void setCodiogo_Setor(int codiogo_Setor) {
		Codiogo_Setor = codiogo_Setor;
	}
    // 
	public String getDescricao_setor() {
		return descricao_setor;
	}

	public void setDescricao_setor(String descricao_setor) {
		this.descricao_setor = descricao_setor;
	}

	@Override
	public String toString() {
		return "Nome da Estrutura:" + this.Nome_EST + ", Código da Estrututra: " + this.Codigo +
			   ", Descrição do Depatamento:  " + this.descricao_dep + ", Códiogo do Depatamento: " + this.Codigo_dep + ", Descrição do Setor: " + this.descricao_setor 
			   + ", Código do Setor:" + this.Codiogo_Setor;}
}
