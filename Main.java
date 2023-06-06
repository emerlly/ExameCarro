package ExameCarro;

public class Main {
    public static void main(String[] args) {
        Locadora locadora = new Locadora();

        Carro carro1 = new Carro("Ferrari");
        Carro carro2 = new Carro("BMW");
        Moto moto1 = new Moto("Honda");
        Moto moto2 = new Moto("Yamaha");

        locadora.adicionarVeiculo(carro1);
        locadora.adicionarVeiculo(carro2);
        locadora.adicionarVeiculo(moto1);
        locadora.adicionarVeiculo(moto2);

        locadora.gerenciarAlugueis(5);
        
        locadora.removerVeiculo(moto2);
    }
}
