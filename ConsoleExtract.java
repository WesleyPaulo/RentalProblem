import java.util.*;

public class ConsoleExtract implements Extract {
    
    @Override
    public String extrato(Client cliente){
        final String fimDeLinha = System.getProperty("line.separator");
        double valorTotal = 0.0;
        int pontosDeAlugadorFrequente = 0;
        
        Iterator<Rent> alugueis = cliente.getTapesAlugadas().iterator();
        String resultado = "Registro de Alugueis de " + cliente.getNome() + fimDeLinha;
        
        while(alugueis.hasNext()) {
            double valorCorrente = 0.0;
            Rent cada = alugueis.next();
            Tape fita = cada.getTape();
            int diasAlugada = cada.getDiasAlugada();
            
            // determina valores para cada linha
            valorCorrente = fita.getClassification().calcularNovoValorCorrente(diasAlugada, valorCorrente);

            // adiciona bonus de acordo com as regras da fita
            pontosDeAlugadorFrequente += fita.getClassification().calcularBonusDeAlugadorFrequente(diasAlugada);

            // mostra valores para este Rent
            resultado += "\t" + fita.getTitulo() + "\t" + valorCorrente + fimDeLinha;
            valorTotal += valorCorrente;
        } // while
        
        // adiciona rodap�
        resultado += "Valor total devido: " + valorTotal + fimDeLinha;
        resultado += "Voce acumulou " + pontosDeAlugadorFrequente +
                " pontos de alugador frequente";
        return resultado;
    }
}