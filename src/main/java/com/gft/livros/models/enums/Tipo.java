package com.gft.livros.models.enums;

public enum Tipo {
    EBOOK(1, "E-book"),
    CAPA_DURA(2, "Capa dura"),
    CAPA_NORMAL(3, "Capa normal");

    private Integer id;
    private String descricao;

    Tipo(Integer id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
