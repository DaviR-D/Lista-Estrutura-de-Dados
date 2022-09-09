package atividade;
import java.util.Scanner;

public class Main{
  public static void main(String[] args) {
    Lista lista = new Lista();
    Scanner scan = new Scanner(System.in);
    int escolha;
    while(true){
      System.out.println("Escolha a operação a ser realizada: ");
      System.out.println("1) Inserir atleta");
      System.out.println("2) Remover atleta");
      System.out.println("3) Buscar atleta");
      System.out.println("4) Imprimir lista");

      escolha = scan.nextInt();
      if (escolha == 1) {
        scan.nextLine();
        String nome, esporte;
        System.out.println("Digite o nome: ");
        nome = scan.nextLine();
        System.out.println("Digite o esporte: ");
        esporte = scan.nextLine();
        Atleta atleta = new Atleta(nome, esporte, 175, 80, "nike");
        lista.insere(new No(atleta));
      }
      else if (escolha == 2) {
      String nome;
      scan.nextLine();
      System.out.println("Digite o nome a ser removido: ");
      nome = scan.nextLine();
        lista.remover(nome);
      }
      else if (escolha == 3) {
      String nome;
      scan.nextLine();
      System.out.println("Digite o nome a ser buscado: ");
      nome = scan.nextLine();
      System.out.println(lista.buscar(nome).toString());
      }
      else if (escolha == 4) {
        lista.imprime();
      }
    }
  }
}
