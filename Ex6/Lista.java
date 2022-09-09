package atividade;

public class Lista{
  No inicio;
  No fim;

  public void insere(No no){
    if (inicio != null) {
      No aux = inicio;
      while(aux != null){
      if(no.aluno.nome.compareTo(aux.aluno.nome) < 0){
      if(inicio == aux)
        inicio = no;
      else
        aux.anterior.proximo = no;

      if(fim == aux)
        fim = no;
      no.anterior = aux.anterior;
      no.proximo = aux;
      aux.anterior = no;
      return;
      }
      aux = aux.proximo;
    }
      no.anterior = fim;
      fim.proximo = no;
      fim = no;
    }
    else{
      inicio = no;
      fim = no;
    }
  }

  public void imprime(){
    No aux = inicio;
    while(aux != null){
      System.out.println(aux.toString());
      aux = aux.proximo;
    }
}
}
