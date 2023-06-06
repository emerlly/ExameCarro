package ExameCarro;

public class Moto implements Veiculo {
    private String marca;

    public Moto(String marca) {
        this.marca = marca;
    }

    @Override
    public void alugarVeiculo(int periodo) {
        System.out.println("A moto marca " + marca + " foi alugada por " + periodo + " dias.");
    }

    @Override
    public void devolverVeiculo() {
        System.out.println("A moto marca " + marca + " foi devolvida.");
    }
}
