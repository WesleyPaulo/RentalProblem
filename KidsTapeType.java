class KidsTapeType implements TapeType{
    @Override
    public Double calcularNovoValorCorrente(int diasAlugada, double valorCorrente){
        valorCorrente += 1.5;
        if(diasAlugada > 3) {
          valorCorrente +=(diasAlugada - 3) * 1.5;
        }
        return valorCorrente;
    }

    @Override
    public int calcularBonusDeAlugadorFrequente(int diasAlugada){
        return 1;
    }
}
