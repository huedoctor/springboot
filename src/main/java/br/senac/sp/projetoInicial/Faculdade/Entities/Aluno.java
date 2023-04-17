package br.senac.sp.projetoInicial.Faculdade.Entities;

import jakarta.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity (name = "Alunos")
public class Aluno implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "RA")
    int ra;

    @Column (name = "Nome")
    String nome;

    @Column
    LocalDateTime dataCadastro;

    public Aluno() {
    }

    public Aluno(String nome, LocalDateTime dataCadastro) {
        this.nome = nome;
        this.dataCadastro = dataCadastro;
    }

    @Override
    public String toString() {
        return "Alunos{" +
                "ra=" + ra +
                ", nome='" + nome + '\'' +
                ", dataCadastro=" + dataCadastro +
                '}';
    }
}
