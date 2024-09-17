public class Rental {
  public static void main(String[] args) {
    Client c1 = new Client("Juliana");

    c1.adicionaRent(new Rent(new Tape("O Exorcista                   ", new NormalTapeType()), 3));
    c1.adicionaRent(new Rent(new Tape("Men in Black                  ", new NormalTapeType()), 2));
    c1.adicionaRent(new Rent(new Tape("Jurassic Park III             ", new NewLaunchTapeType()), 3));
    c1.adicionaRent(new Rent(new Tape("Planeta dos Macacos           ", new NewLaunchTapeType()), 4));
    c1.adicionaRent(new Rent(new Tape("Pateta no Planeta dos Macacos ", new KidsTapeType()), 10));
    c1.adicionaRent(new Rent(new Tape("O Rei Leao                    ", new KidsTapeType()), 30));

    // PERGUNTA 1: Se o extrato deve ser retornado em HTML, devemos apenas criar uma classe HTMLExtract que também implementa Extract (assim como ConsoleExtract).
    // Para tornar isso possível, criamos a interface Extract e movemos a implementação do extrato para a classe ConsoleExtract (também para seguir o SRP)
    Extract exibidorExtrato = new ConsoleExtract();
    System.out.println(exibidorExtrato.extrato(c1));
  }
}
