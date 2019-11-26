package com.gft.livrosConsumidor.models;

import com.gft.livrosConsumidor.models.enums.Tipo;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

public class Livro implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;
    private String titulo;
    private String idioma;
    private int paginas;
    private LocalDate anoPublicacao;
    private Tipo tipo;

    private List<Genero> generos;

    private Editora editora;

    private List<Autor> autores;

    public Livro(Integer id, String titulo, String idioma, int paginas, LocalDate anoPublicacao, Tipo tipo, List<Genero> generos, Editora editora, List<Autor> autores) {
        this.id = id;
        this.titulo = titulo;
        this.idioma = idioma;
        this.paginas = paginas;
        this.anoPublicacao = anoPublicacao;
        this.tipo = tipo;
        this.generos = generos;
        this.editora = editora;
        this.autores = autores;
    }

    public Livro() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public LocalDate getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(LocalDate anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public List<Genero> getGeneros() {
        return generos;
    }

    public void setGeneros(List<Genero> generos) {
        this.generos = generos;
    }

    public Editora getEditora() {
        return editora;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }

    public List<Autor> getAutores() {
        return autores;
    }

    public void setAutores(List<Autor> autores) {
        this.autores = autores;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return paginas == livro.paginas &&
                Objects.equals(id, livro.id) &&
                Objects.equals(titulo, livro.titulo) &&
                Objects.equals(idioma, livro.idioma) &&
                Objects.equals(anoPublicacao, livro.anoPublicacao) &&
                tipo == livro.tipo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, titulo, idioma, paginas, anoPublicacao, tipo);
    }
}
