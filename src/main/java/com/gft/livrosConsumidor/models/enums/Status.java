package com.gft.livrosConsumidor.models.enums;

public enum Status {
    NOPRAZO(1, "No Prazo"),
    DEVOLVIDO(2, "Devolvido"),
    ATRASADO(3, "Atrasado");

    private Integer id;
    private String descricao;

    Status(Integer id, String descricao) {
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
