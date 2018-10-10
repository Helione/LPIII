
public class Dvd extends ItemAcervo {
	
	private String titulo;
	private String sinopse;
	private String atores;
	private String diretor;
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getSinopse() {
		return sinopse;
	}
	public void setSinopse(String sinopse) {
		this.sinopse = sinopse;
	}
	public String getAtores() {
		return atores;
	}
	public void setAtores(String atores) {
		this.atores = atores;
	}
	public String getDiretor() {
		return diretor;
	}
	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}
	@Override
	public String toString() {
		return "Dvd [titulo=" + titulo + ", sinopse=" + sinopse + ", atores=" + atores + ", diretor=" + diretor + "]";
	}

}
