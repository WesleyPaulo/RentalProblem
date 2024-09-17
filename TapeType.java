// PERGUNTA 2: Cada TapeType tem suas regras de calculo. Caso elas mudem, deve-se apenas alterar as regras na TapeType desejada.
// Para fazer isso, foi criada essa interface para TapeType, que é implementada por todas as classificações
// Além disso, toda Tape tem como atributo a sua classificação (TapeType)


public interface TapeType {
  public abstract Double calcularNovoValorCorrente(int diasAlugada, double valorCorrente);

  //PERGUNTA 4:  Para mudar o esquema de ponto de alugador seria necessário mudar as regras dele no método calcularBonusDeAlugadorFrequente,
  //nas classes que implementam a interface TapeType.
  public abstract int calcularBonusDeAlugadorFrequente(int diasAlugada);
}