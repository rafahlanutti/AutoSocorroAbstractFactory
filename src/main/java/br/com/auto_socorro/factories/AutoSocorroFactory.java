package br.com.auto_socorro.factories;

import br.com.auto_socorro.produto_abstrato.Guincho;
import br.com.auto_socorro.produto_abstrato.Veiculo;
import br.com.auto_socorro.produto_concreto_veiculo.Porte;

// Abstract Factory
public abstract class AutoSocorroFactory {

    public abstract Guincho criarGuincho();

    public abstract Veiculo criarVeiculo(String modelo, Porte porte);
}
