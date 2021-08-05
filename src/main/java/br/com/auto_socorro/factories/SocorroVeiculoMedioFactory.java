package br.com.auto_socorro.factories;

import br.com.auto_socorro.creators.GuinchoCreator;
import br.com.auto_socorro.creators.VeiculoCreator;
import br.com.auto_socorro.produto_abstrato.Guincho;
import br.com.auto_socorro.produto_abstrato.Veiculo;
import br.com.auto_socorro.produto_concreto_veiculo.Porte;

// Concrete Factory
public class SocorroVeiculoMedioFactory extends AutoSocorroFactory {
    @Override
    public Guincho criarGuincho() {
        return GuinchoCreator.criar(Porte.Medio);
    }

    @Override
    public Veiculo criarVeiculo(String modelo, Porte porte) {
        return VeiculoCreator.criar(modelo, porte);
    }
}