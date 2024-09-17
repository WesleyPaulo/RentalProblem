import java.util.*;

public class Client {
  
  private String nome;
  private Collection<Rent> TapesAlugadas = new Vector<Rent>();

  public Client(String nome) {
    this.nome = nome;
  }

  public String getNome() {
    return nome;
  }

  public void adicionaRent(Rent Rent) {
    TapesAlugadas.add(Rent);
  }

  public Collection<Rent> getTapesAlugadas() {
    return TapesAlugadas;
  }
}

