package atividade;

public class No{
  Atleta atleta;
  No proximo;
  public No(Atleta atle){
    this.atleta = atle;
  }
  public String toString(){
    return atleta.nome + " | " + atleta.esporte;
  }
}
