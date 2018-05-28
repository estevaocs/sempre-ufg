package br.ufg.inf.sempreufg.entity.model;

import br.ufg.inf.sempreufg.entity.enums.GrauEnum;
import br.ufg.inf.sempreufg.entity.enums.RegionalEnum;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    private String nome;

    private GrauEnum grauEnum;

    private RegionalEnum regional;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public GrauEnum getGrauEnum() {
        return grauEnum;
    }

    public void setGrauEnum(GrauEnum grauEnum) {
        this.grauEnum = grauEnum;
    }

    public RegionalEnum getRegional() {
        return regional;
    }

    public void setRegional(RegionalEnum regional) {
        this.regional = regional;
    }
}
