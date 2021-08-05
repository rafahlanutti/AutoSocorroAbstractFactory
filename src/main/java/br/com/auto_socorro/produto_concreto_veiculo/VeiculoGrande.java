package br.com.auto_socorro.produto_concreto_veiculo;

import br.com.auto_socorro.produto_abstrato.Veiculo;

// Produto Concreto
public class VeiculoGrande extends Veiculo {
    public VeiculoGrande(String modelo, Porte porte) {
        super(modelo, porte);
    }
}