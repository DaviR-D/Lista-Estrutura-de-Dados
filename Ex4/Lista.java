package atividade;

public class Lista{
  No inicio;
  No fim;

  public void insere(No no){
    if (inicio != null) {
      fim.proximo = no;
      fim = no;
    }
    else{
      inicio = no;
      fim = no;
    }
  }

  public No remover(String conteudo){
    No aux = inicio;
    No remover = null;
    No anterior = null;
    while(aux!=null){
      if (aux.toString().contains(conteudo)){
        remover = aux;
        break;
      }
      anterior = aux;
      aux = aux.proximo;
    }
    if (remover == inicio){
      inicio = remover.proximo;
      remover.proximo = null;
      if (remover == fim)
        fim = null;
      return remover;
    }
    else if (remover!=null && anterior!=null){
      anterior.proximo = remover.proximo;
      remover.proximo = null;
      if (remover == fim){
        fim = anterior;
      }
      return remover;
    }
    else{
      return null;
    }

  }

  public No buscar(String conteudo){
    No aux = inicio;
    while(aux!=null){
      if (aux.toString().contains(conteudo)){
        return aux;
    }
  }
  return null;
}

  public void imprime(){
    No aux = inicio;
    while(aux != null){
      System.out.println(aux.toString());
      aux = aux.proximo;
    }
}
}
