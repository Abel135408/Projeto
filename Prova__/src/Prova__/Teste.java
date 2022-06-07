package Prova__;



public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Empresa empresa_Unica = new Empresa ();
		empresa_Unica.setNome_empresa("Vamos Lá");
		empresa_Unica.setCNPJ("16149995");
		empresa_Unica.setEndereco("Rua da acolhida");
		empresa_Unica.Bem_vindo();
		empresa_Unica.Desejos1();
		System.out.println(empresa_Unica.toString());
		
		
		System.out.println("------------------------------------------------------------------------");
		

		Setor setor_01 = new Setor();
		setor_01.setNome("MXS");
		setor_01.setCodigo(1);
		setor_01.setDescricao_dep("Operador de Maquinas ");
		setor_01.setCodiogo_dep(2);
		setor_01.setDescricao_setor("Operador de Maquinas");
		setor_01.setCodiogo_Setor(3);
        
		System.out.println(setor_01.toString());
		System.out.println("------------------------------------------------------------------------");
		
		Profissonal Operador_de_Maquinas__Teste = new Operador_de_Maquinas ();
		Operador_de_Maquinas__Teste.setNome("Mano");
		Operador_de_Maquinas__Teste.setCPF("00.00.00-00");
		Operador_de_Maquinas__Teste.setData_Nascimento("28/05/2000");
		Operador_de_Maquinas__Teste.setMatricula("10");
		Operador_de_Maquinas__Teste.setCargo("Chefe dos Operadores de Maquinas");
		Operador_de_Maquinas__Teste.setCarga_horaria("08 Horas");
		Operador_de_Maquinas__Teste.setSalario(3.500);
		
		System.out.println( Operador_de_Maquinas__Teste.toString() );
		System.out.println("------------------------------------------------------------------------");
	
		Setor setor_02 = new Setor();
		setor_02.setNome("MXS");
		setor_02.setCodigo(1);
		setor_02.setDescricao_dep("TI");
		setor_02.setCodiogo_dep(5);
		setor_02.setDescricao_setor("Progamador");
		setor_02.setCodiogo_Setor(6);
        
		System.out.println(setor_02.toString());
		System.out.println("------------------------------------------------------------------------");
		
		Profissonal Programador_Teste = new Programador();
		Programador_Teste.setNome("lsd");
		Programador_Teste.setCPF("001.001.001");
		Programador_Teste.setData_Nascimento("25/07/199");
		Programador_Teste.setMatricula("54841");
		Programador_Teste.setCargo("Chefe dos Programadores");
		Programador_Teste.setCarga_horaria("08 Horas");
		Programador_Teste.setSalario(4000);
		
		System.out.println( Programador_Teste.toString()) ;
		System.out.println("------------------------------------------------------------------------");
		
	
	}

}
