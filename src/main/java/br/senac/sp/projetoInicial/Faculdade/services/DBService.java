package br.senac.sp.projetoInicial.Faculdade.services;

import br.senac.sp.projetoInicial.Faculdade.Entities.Aluno;
import br.senac.sp.projetoInicial.Faculdade.Repositories.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

@Service
public class DBService {

    @Autowired
    private AlunoRepository alunoRepository;
    @Bean
    public void instanciarDB(){
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        Aluno aluno1 = new Aluno("Marcos Monteiro",
                LocalDateTime.parse("01/08/2022 08:30", formato));
        Aluno aluno2 = new Aluno("Rodrigo Garcia",
                LocalDateTime.parse("10/05/2022 08:30", formato));
        alunoRepository.saveAll(Arrays.asList(aluno1, aluno2));
    }
}
