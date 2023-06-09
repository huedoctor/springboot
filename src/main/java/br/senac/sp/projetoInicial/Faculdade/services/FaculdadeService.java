package br.senac.sp.projetoInicial.Faculdade.services;


import java.util.List;
import java.util.Optional;

import br.senac.sp.projetoInicial.Faculdade.Entities.Aluno;
import br.senac.sp.projetoInicial.Faculdade.Repositories.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

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

    @PostMapping
    public Aluno gravarAluno(Aluno aluno) {
        return alunoRepository.save(aluno);
    }

    public void deletar(Integer ra) {
        alunoRepository.deleteById(ra);
    }

    public Aluno update(Integer ra, Aluno aluno) {
        Aluno alterado = findById(ra);
        if (alterado != null) {
            alterado.setNome(aluno.getNome());
            alterado.setDataCadastro(aluno.getDataCadastro());
            alterado.setAtivo(aluno.isAtivo());
        }
        return null;
    }
}
