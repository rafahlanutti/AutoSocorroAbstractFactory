package br.com.auto_socorro.produto_abstrato;

import br.com.auto_socorro.produto_concreto_veiculo.Porte;

// AbstractProduct   
public abstract class Guincho {

    public Porte porte;

    protected Guincho(Porte porte) {
        this.porte = porte;
    }

    public abstract void socorrer(Veiculo veiculo);

}