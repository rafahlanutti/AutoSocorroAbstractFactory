package br.com.auto_socorro.client;

import br.com.auto_socorro.factories.AutoSocorroFactory;
import br.com.auto_socorro.factories.SocorroVeiculoGrandeFactory;
import br.com.auto_socorro.factories.SocorroVeiculoMedioFactory;
import br.com.auto_socorro.factories.SocorroVeiculoPequenoFactory;
import br.com.auto_socorro.produto_abstrato.Guincho;
import br.com.auto_socorro.produto_abstrato.Veiculo;

// Client Class
public class AutoSocorro {
    private Veiculo veiculo;
    private Guincho guincho;

    public AutoSocorro(AutoSocorroFactory factory, Veiculo veiculo) {
        this.veiculo = factory.criarVeiculo(veiculo.modelo, veiculo.porte);
        this.guincho = factory.criarGuincho();
    }

    public void realizarAtendimento() {
        guincho.socorrer(this.veiculo);
    }

    public static AutoSocorro criarAutoSocorro(Veiculo veiculo) {
        switch (veiculo.porte) {
        case Pequeno:
            return new AutoSocorro(new SocorroVeiculoPequenoFactory(), veiculo);
        case Medio:
            return new AutoSocorro(new SocorroVeiculoMedioFactory(), veiculo);
        case Grande:
            return new AutoSocorro(new SocorroVeiculoGrandeFactory(), veiculo);
        default:
            throw new IllegalArgumentException("Não foi possível identificar o veículo");
        }
    }
}