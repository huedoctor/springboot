package br.senac.sp.projetoInicial.Faculdade.services;

import br.senac.sp.projetoInicial.Faculdade.Entities.Aluno;
import br.senac.sp.projetoInicial.Faculdade.Repositories.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

@Service
public class DBService {

    @Autowired
    private AlunoRepository alunoRepository;
    @Bean
    public void instanciarDB() throws ParseException, ParseException {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Aluno aluno1 = new Aluno("Marcos Monteiro", formato.parse("01/08/2022"), true);
        Aluno aluno2 = new Aluno("Rodrigo Silva", formato.parse("09/01/2018"), false);
        Aluno aluno3 = new Aluno("Marcos Pontes", formato.parse("01/01/2012"), false);
        Aluno aluno4 = new Aluno("Juca Monteiro", formato.parse("01/01/2020"), true);
        alunoRepository.saveAll(Arrays.asList(aluno1, aluno2, aluno3, aluno4));
    }
}
