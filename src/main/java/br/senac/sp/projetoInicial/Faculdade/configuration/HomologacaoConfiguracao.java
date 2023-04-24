package br.senac.sp.projetoInicial.Faculdade.configuration;

import br.senac.sp.projetoInicial.Faculdade.services.DBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.text.ParseException;

@Configuration
@Profile("homologacao")
public class HomologacaoConfiguracao {
    @Autowired
    DBService dbService;

    private boolean instanciar() throws ParseException {
        this.dbService.instanciarDB();
        return true;
    }
}