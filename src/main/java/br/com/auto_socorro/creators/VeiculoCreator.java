package br.com.auto_socorro.creators;

import br.com.auto_socorro.produto_abstrato.Veiculo;
import br.com.auto_socorro.produto_concreto_veiculo.Porte;
import br.com.auto_socorro.produto_concreto_veiculo.VeiculoGrande;
import br.com.auto_socorro.produto_concreto_veiculo.VeiculoMedio;
import br.com.auto_socorro.produto_concreto_veiculo.VeiculoPequeno;

public class VeiculoCreator {
    public static Veiculo criar(String modelo, Porte porte) {
        switch (porte) {
        case Pequeno:
            return new VeiculoPequeno(modelo, porte);
        case Medio:
            return new VeiculoMedio(modelo, porte);
        case Grande:
            return new VeiculoGrande(modelo, porte);
        default:
            throw new IllegalArgumentException("Porte de veiculo desconhecido.");
        }
    }
}