package br.senac.sp.projetoInicial.Faculdade.resources;


import br.senac.sp.projetoInicial.Faculdade.Entities.Aluno;
import br.senac.sp.projetoInicial.Faculdade.services.FaculdadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/faculdade")
public class FaculdadeResource {

    @Autowired
    private FaculdadeService faculdadeService;

    @GetMapping(value = "/{ra}")
    public ResponseEntity<Aluno> findById(@PathVariable Integer ra) {
        Aluno aluno = faculdadeService.findById(ra);
        return ResponseEntity.ok().body(aluno);
    }

    @GetMapping(value = "/abertos")
    public ResponseEntity<List<Aluno>> listarAbertos() {
        List<Aluno> alunos =
                faculdadeService.listarTodosAbertos();
        return ResponseEntity.ok().body(alunos);
    }

    @GetMapping(value = "/fechados")
    public ResponseEntity<List<Aluno>> listarFechados() {
        List<Aluno> alunos =
                faculdadeService.ListarTodosFechados();
        return ResponseEntity.ok().body(alunos);
    }

    @GetMapping
    public List<Aluno> findAll() {
        List<Aluno> aluno = faculdadeService.findAll();
        return aluno;
    }

    @GetMapping(value = "/nome/{nome}")
    public ResponseEntity<Aluno> findByNome(@PathVariable String nome) {
        Aluno aluno = faculdadeService.findByNome(nome);
        return ResponseEntity.ok().body(aluno);
    }

}

