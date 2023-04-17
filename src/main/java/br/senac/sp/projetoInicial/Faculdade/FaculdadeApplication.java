package br.senac.sp.projetoInicial.Faculdade;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class FaculdadeApplication implements CommandLineRunner {


    public static void main(String[] args) {
        SpringApplication.run(FaculdadeApplication.class, args);
    }
    @Override
    public void run(String... args)throws Exception{}
}
