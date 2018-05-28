package br.ufg.inf.sempreufg.entity.model;

import jdk.nashorn.internal.ir.annotations.Reference;
import org.jetbrains.annotations.NotNull;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Calendar;

public class Egresso extends User {

    @NotNull
    private String nome;

    @NotNull
    private String sobreNome;

    @NotNull
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Calendar dataAniversario;

    @NotNull
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Calendar dataEgresso;

    @NotNull
    private Curso curso;

    public Egresso() {
        super();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public Calendar getDataAniversario() {
        return dataAniversario;
    }

    public void setDataAniversario(Calendar dataAniversario) {
        this.dataAniversario = dataAniversario;
    }

    public Calendar getDataEgresso() {
        return dataEgresso;
    }

    public void setDataEgresso(Calendar dataEgresso) {
        this.dataEgresso = dataEgresso;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
}
