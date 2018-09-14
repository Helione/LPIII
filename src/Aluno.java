
public class Aluno {
	String matricula;
	String nome;


	
	public String getMatricula() {
		return matricula;
	}



	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	@Override
	public String toString() {
		return "Aluno * nome= " + nome + ", matrícula= " + matricula + "*";
	}
}
