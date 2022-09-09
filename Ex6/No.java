package atividade;

public class No{
  Aluno aluno;
  No proximo;
  No anterior;
  public No(Aluno alun){
    this.aluno = alun;
  }
  public String toString(){
    return aluno.nome + " | " + aluno.curso;
  }
}
