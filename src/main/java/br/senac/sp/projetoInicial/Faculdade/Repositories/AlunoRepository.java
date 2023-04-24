package br.senac.sp.projetoInicial.Faculdade.Repositories;
import br.senac.sp.projetoInicial.Faculdade.Entities.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Integer> {

    @Query("SELECT alunos FROM Alunos alunos "
            + "WHERE alunos.ativo=true ORDER BY alunos.nome")
    List<Aluno> listarTodosAbertos();

    @Query("SELECT alunos FROM Alunos alunos "
            + "WHERE alunos.ativo=false ORDER BY alunos.nome")
    List<Aluno> listarTodosFechados();

    Optional<Aluno> findByNome(String nome);
}
