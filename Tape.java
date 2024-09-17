public class Tape {
  private String titulo;
  private TapeType classification;

  public Tape(String titulo, TapeType classification) {
    this.titulo = titulo;
    this.classification = classification;
  }

  public String getTitulo() {
    return titulo;
  }

  public TapeType getClassification() {
    return classification;
  }  

  // PERGUNTA 3: Se a classificação das fitas mudar toda semana, basta mudar o atributo classification da fita para a TapeType desejada.
  public void setClassification(TapeType newTapeType) {
    classification = newTapeType;
  }   
}

