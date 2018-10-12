
public class Artigo extends ItemAcervo {
	private String titulo;
	private String autor;
	private String ano;
	private String periodico;
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	public String getPeriodico() {
		return periodico;
	}
	public void setPeriodico(String periodico) {
		this.periodico = periodico;
	}
	@Override
	public String toString() {
		return "Artigo [titulo=" + titulo + ", autor=" + autor + ", ano=" + ano + ", periodico=" + periodico + "]";
	}

	

}
