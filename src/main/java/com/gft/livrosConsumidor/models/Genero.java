package com.gft.livrosConsumidor.models;

import java.io.Serializable;
import java.util.Objects;

public class Genero implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;
    private String nome;

    public Genero(Integer id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Genero() {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Genero genero = (Genero) o;
        return Objects.equals(id, genero.id) &&
                Objects.equals(nome, genero.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome);
    }
}
