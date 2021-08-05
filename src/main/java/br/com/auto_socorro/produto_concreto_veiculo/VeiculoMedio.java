package br.com.auto_socorro.produto_concreto_veiculo;

import br.com.auto_socorro.produto_abstrato.Veiculo;

// Produto Concreto
public class VeiculoMedio extends Veiculo {
    public VeiculoMedio(String modelo, Porte porte) {
        super(modelo, porte);
    }
}