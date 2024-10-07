package kenjigay;

public class Livro {

private String titulo;

private String autor;

private String ano;

private String genero;



public Livro(String titulo, String autor, String ano, String genero) {

this.titulo = titulo;

this.autor = autor;

this.ano = ano;

this.genero = genero;

}



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



public String getGenero() {

return genero;

}



public void setGenero(String genero) {

this.genero = genero;

}



public String toString() {

return "Livro [titulo=" + titulo + ", autor=" + autor + ", ano=" + ano + ", genero=" + genero + "]";

}

}
