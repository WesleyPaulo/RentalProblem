public class NewLaunchTapeType implements TapeType{
    @Override
    public Double calcularNovoValorCorrente(int diasAlugada, double valorCorrente) {
        valorCorrente += diasAlugada * 3;
        
        return valorCorrente;
    }

    @Override
    public int calcularBonusDeAlugadorFrequente(int diasAlugada) {
      if (diasAlugada > 1) {
        return 2;
      }
      return 1;
    }
}
