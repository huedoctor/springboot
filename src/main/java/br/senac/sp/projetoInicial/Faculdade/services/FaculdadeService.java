package br.senac.sp.projetoInicial.Faculdade.services;


import java.util.List;
import java.util.Optional;

import br.senac.sp.projetoInicial.Faculdade.Entities.Aluno;
import br.senac.sp.projetoInicial.Faculdade.Repositories.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
public class FaculdadeService {
    @Autowired
    AlunoRepository alunoRepository;

    public FaculdadeService(AlunoRepository alunoRepository) {
        this.alunoRepository = alunoRepository;
    }

    public Aluno findById(Integer ra) {
        Optional<Aluno> aluno = alunoRepository.findById(ra);
        return aluno.orElse(null);
    }

    public List<Aluno> listarTodosAbertos() {
        List<Aluno> alunos = alunoRepository.listarTodosAbertos();
        return alunos;
    }

    public List<Aluno> ListarTodosFechados() {
        List<Aluno> alunos = alunoRepository.listarTodosFechados();
        return alunos;
    }

    public List<Aluno> findAll() {
        List<Aluno> alunos = alunoRepository.findAll();
        return alunos;
    }

    public Aluno findByNome(String nome) {
        Optional<Aluno> aluno = alunoRepository.findByNome(nome);
        return aluno.orElse(null);
    }
}