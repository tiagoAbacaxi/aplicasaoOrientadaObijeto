package org.example;

public class Titulos {
  String nome;
  private int anoDeLancamento;
  private boolean incluidoNoPlano;
  private double somaDasAvaliacoes;
  private int totalDeAvaliacoes;
  private int duracaoEmMinutos;

  public int getTotalDeAvaliacoes() {
    return totalDeAvaliacoes;
  }

  public double getSomaDasAvaliacoes() {
    return somaDasAvaliacoes;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setDuracaoEmMinutos(int duracaoEmMinutos) {
    this.duracaoEmMinutos = duracaoEmMinutos;
  }

  public void setAnoDeLancamento(int anoDeLancamento) {
    this.anoDeLancamento = anoDeLancamento;
  }

  public int getAnoDeLancamento() {
    return anoDeLancamento;
  }

  public String getNome() {
    return nome;
  }


  void exibeFichaTecnica() {
    System.out.println("Nome do filme: " + nome);
    System.out.println("Ano de lançamento: " + anoDeLancamento);
  }

  void avalia(double nota) {
    somaDasAvaliacoes += nota;
    totalDeAvaliacoes++;
  }

  double pegaMedia() {
    return somaDasAvaliacoes / totalDeAvaliacoes;
  }
}
