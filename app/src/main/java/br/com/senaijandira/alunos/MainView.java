package br.com.senaijandira.alunos;

import java.util.List;

import br.com.senaijandira.alunos.model.Aluno;

public interface MainView {

    void exibirBarraProgresso();


    void esconderBarraProgresso();

    void preencherLista(List<Aluno> lstAlunos);

}
