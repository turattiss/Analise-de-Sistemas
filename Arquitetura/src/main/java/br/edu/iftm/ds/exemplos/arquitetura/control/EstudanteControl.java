package br.edu.iftm.ds.exemplos.arquitetura.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import br.edu.iftm.ds.exemplos.arquitetura.dao.EstudanteDao;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class EstudanteControl {

    @Autowired
    private EstudanteDao dao
    
    @GetMapping("/estudante")
    public List<Estudante> getEstudante(){
        return dao.getEstudante();
    }
}