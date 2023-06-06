package ExameCarro;

import java.util.ArrayList;
import java.util.List;

public class Locadora {
    private List<Veiculo> veiculos;

    public Locadora() {
        this.veiculos = new ArrayList<>();
    }

    public void adicionarVeiculo(Veiculo veiculo) {
        veiculos.add(veiculo);
        System.out.println("Veículo adicionado à locadora.");
    }

    public void removerVeiculo(Veiculo veiculo) {
        veiculos.remove(veiculo);
        System.out.println("Veículo removido da locadora.");
    }

    public void gerenciarAlugueis(int periodo) {
        System.out.println("---- Gerenciando aluguéis na locadora ----");
        for (Veiculo veiculo : veiculos) {
            System.out.println("Aluguel de veículo do tipo: " + veiculo.getClass().getSimpleName());
            veiculo.alugarVeiculo(periodo);
            veiculo.devolverVeiculo();
            System.out.println("--------------------------");
        }
    }
}
