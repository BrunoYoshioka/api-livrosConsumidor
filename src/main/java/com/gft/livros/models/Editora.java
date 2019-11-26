package com.gft.livros.models;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class Editora implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;

    private String nome;

    private List<Livro> livros;

    public Editora(Integer id, String nome, List<Livro> livros) {
        this.id = id;
        this.nome = nome;
        this.livros = livros;
    }

    public Editora() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Editora editora = (Editora) o;
        return Objects.equals(id, editora.id) &&
                Objects.equals(nome, editora.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome);
    }
}
