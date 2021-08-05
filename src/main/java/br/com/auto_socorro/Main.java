package br.com.auto_socorro;

import java.util.ArrayList;
import java.util.Arrays;

import br.com.auto_socorro.client.AutoSocorro;
import br.com.auto_socorro.creators.VeiculoCreator;
import br.com.auto_socorro.produto_abstrato.Veiculo;
import br.com.auto_socorro.produto_concreto_veiculo.Porte;

public class Main {

    public static void main(String[] args) {
        var veiculosSocorro = new ArrayList<Veiculo>();

        veiculosSocorro.addAll(Arrays.asList(VeiculoCreator.criar("Celta", Porte.Pequeno),
                VeiculoCreator.criar("Jetta", Porte.Medio), VeiculoCreator.criar("BMW X6", Porte.Grande)));

        veiculosSocorro.forEach(v -> AutoSocorro.criarAutoSocorro(v)
                                                .realizarAtendimento());
    }

}
