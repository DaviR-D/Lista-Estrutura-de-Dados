package atividade;
import java.util.Scanner;

public class Main{
  public static void main(String[] args) {
    Lista lista = new Lista();
    Scanner scan = new Scanner(System.in);
    int escolha;
    while(true){
      System.out.println("Escolha a operação a ser realizada: ");
      System.out.println("1) Inserir aluno");
      System.out.println("2) Imprimir lista");

      escolha = scan.nextInt();
      if (escolha == 1) {
        scan.nextLine();
        String nome, curso;
        System.out.println("Digite o nome: ");
        nome = scan.nextLine();
        System.out.println("Digite o curso: ");
        curso = scan.nextLine();
        Aluno aluno = new Aluno(nome, 3150871, 10, curso);
        lista.insere(new No(aluno));
      }
      else if (escolha == 2) {
        lista.imprime();
      }
    }
  }
}
