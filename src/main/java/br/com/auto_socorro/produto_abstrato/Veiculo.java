package br.com.auto_socorro.produto_abstrato;

import br.com.auto_socorro.produto_concreto_veiculo.Porte;

// AbstractProduct  
public abstract class Veiculo {

    public String modelo;
    public Porte porte;

    protected Veiculo(String modelo, Porte porte) {
        this.modelo = modelo;
        this.porte = porte;
    }

}