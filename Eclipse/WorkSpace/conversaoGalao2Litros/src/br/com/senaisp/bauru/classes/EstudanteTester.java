package br.com.senaisp.bauru.classes;

public class EstudanteTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Estudante est = new Estudante();
		est.setNome("Aluno 01");
		est.setRa(1234);
		System.out.println(est.getNome());
        System.out.println(est); //Usa o metodo toString()
        Estudante est2 = new Estudante(4567, "Aluno 02");
        System.out.println(est2);
	}

}
