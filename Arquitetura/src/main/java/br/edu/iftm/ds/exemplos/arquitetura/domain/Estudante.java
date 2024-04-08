package br.edu.iftm.ds.exemplos.arquitetura.domain;

public class Estudante {
    private Integer cod;
    private String nome;
    private String curso;
    private String dataNasc;

    public Estudante(Integer cod, String nome, String curso, String dataNasc) {
        this.cod = cod;
        this.nome = nome;
        this.curso = curso;
        this.dataNasc = dataNasc;
    }

    public Integer getCod() {
        return cod;
    }

    public void setCod(Integer cod) {
        this.cod = cod;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }
  
}