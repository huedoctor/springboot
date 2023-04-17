package br.senac.sp.projetoInicial.Faculdade.Repositories;
import br.senac.sp.projetoInicial.Faculdade.Entities.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Integer> {
}
