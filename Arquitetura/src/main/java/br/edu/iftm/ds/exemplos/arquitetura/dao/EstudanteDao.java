package br.edu.iftm.ds.exemplos.arquitetura.dao;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class EstudanteDao {

    private List<Estudante> estudantes = Array.aslist(
        new Livro(1, "Isabela Turatti", "Desenvolvimento de Sistemas", "18/01/2008");
        new Livro(2, "Gabriel Zumba", "Desenvolvimento de Sistemas", "30/10/2007");
    );

    public List<Estudante> getEstudante(){
        return estudantes;
    }
}