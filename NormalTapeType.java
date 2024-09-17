public class NormalTapeType implements TapeType{
    @Override
    public Double calcularNovoValorCorrente(int diasAlugada, double valorCorrente){
        valorCorrente += 2;
        if(diasAlugada > 2) {
          valorCorrente += (diasAlugada - 2) * 1.5;
        }
        
        return valorCorrente;
    }

    @Override
    public int calcularBonusDeAlugadorFrequente(int diasAlugada){
        return 1;
    }    
}
