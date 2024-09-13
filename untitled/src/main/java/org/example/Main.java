package org.example;

public class Main {

  public static void main(String[] args) {

    Filme meuFilme = new Filme();
    meuFilme.setNome( "O poderoso chefão");
    meuFilme.setAnoDeLancamento(1970);
    meuFilme.setDuracaoEmMinutos(180);

    meuFilme.exibeFichaTecnica();
    meuFilme.avalia(10);
    meuFilme.avalia(100);
    meuFilme.avalia(10);
    System.out.println(meuFilme.getSomaDasAvaliacoes());
    System.out.println(meuFilme.getTotalDeAvaliacoes());
    System.out.println(meuFilme.pegaMedia());

    Sere minhaSerie = new Sere();

    minhaSerie.setNome("Breaking Bad");
    minhaSerie.setTemporada(5);
    minhaSerie.setEpisodiosPorTemporada(10);
    minhaSerie.setMinutosPorTemporada(50);
    minhaSerie.setAtiva(true);
    
  }
}
