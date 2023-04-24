package br.senac.sp.projetoInicial.Faculdade.Entities;

import jakarta.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

@Entity (name = "Alunos")
public class Aluno implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "RA")
    Integer ra;

    @Column (name = "Ativo")
    private boolean ativo;
    //gere os getters e setters
    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }


    @Column (name = "Nome")
    String nome;

    @Column
    Date dataCadastro;

    public Aluno() {
    }

    public Aluno(String nome, Date dataCadastro , boolean ativo) {
        this.nome = nome;
        this.dataCadastro = dataCadastro;
        this.ativo = ativo;
    }

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    @Override
    public String toString() {
        String status = null;
        if(this.ativo==true)
            if(this.ativo==true)
                status = " aluno ativo ";
            else
            if(this.ativo==true)
                status =  " aluno inativo ";
        return "Aluno{" +
                "ra=" + ra +
                ", nome='" + nome + '\'' +
                ", dataCadastro=" + dataCadastro +
                status +
                '}';
    }
}
