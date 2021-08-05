package br.com.auto_socorro.produto_concreto_guincho;

import br.com.auto_socorro.produto_abstrato.Guincho;
import br.com.auto_socorro.produto_abstrato.Veiculo;
import br.com.auto_socorro.produto_concreto_veiculo.Porte;

// Produto Concreto
public class GuinchoPequeno extends Guincho {

    public GuinchoPequeno(Porte porte) {
        super(porte);
    }

    @Override
    public void socorrer(Veiculo veiculo) {

        System.out.println("Socorrendo Carro Pequeno - Modelo " + veiculo.modelo);

    }

}