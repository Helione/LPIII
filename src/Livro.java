
public class Livro {
	String autor;
	String titulo;
	String ISBN;
	String editora;
	
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) { //altera
		this.titulo = titulo;
	}
	public String getAutor() {				//retorna
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	
	@Override
	public String toString() {
		return "Livro\n Titulo: " + titulo 
				+ ",\n Autor: " + autor
				+ ",\n ISBN: " + ISBN
				+ ",\n Editora: " + editora + "\n";
	}
}
