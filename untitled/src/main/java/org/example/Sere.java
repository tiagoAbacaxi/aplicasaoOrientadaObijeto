package org.example;

public class Sere extends Titulos {
  private int  temporada;
  private int   episodiosPorTemporada;
  private int minutosPorTemporada;
  private boolean ativa;



  public boolean isAtiva() {
    return ativa;
  }

  public void setAtiva(boolean ativa) {
    this.ativa = ativa;
  }

  public int getEpisodiosPorTemporada() {
    return episodiosPorTemporada;
  }

  public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
    this.episodiosPorTemporada = episodiosPorTemporada;
  }

  public int getMinutosPorTemporada() {
    return minutosPorTemporada;
  }

  public void setMinutosPorTemporada(int minutosPorTemporada) {
    this.minutosPorTemporada = minutosPorTemporada;
  }

  public int getTemporada() {
    return temporada;
  }

  public void setTemporada(int temporada) {
    this.temporada = temporada;
  }
   @Override
  public int getDuracaoEmminutos() {
    return temporada * episodiosPorTemporada * minutosPorTemporada;
  }
}
