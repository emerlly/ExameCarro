package ExameCarro;

public class Carro implements Veiculo {
    private String modelo;

    public Carro(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public void alugarVeiculo(int periodo) {
        System.out.println("O carro modelo " + modelo + " foi alugado por " + periodo + " dias.");
    }

    @Override
    public void devolverVeiculo() {
        System.out.println("O carro modelo " + modelo + " foi devolvido.");
    }
}
