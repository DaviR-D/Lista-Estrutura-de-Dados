package atividade;

public class Atleta{
  String nome;
  float altura, peso;
  String esporte;
  String patrocinadores;

  public Atleta(String nom, String esp, float alt, float pes,  String patro){
    this.nome = nom;
    this.altura = alt;
    this.peso = pes;
    this.esporte = esp;
    this.patrocinadores = patro;
  }
}
