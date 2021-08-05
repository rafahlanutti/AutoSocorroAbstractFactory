package br.com.auto_socorro.creators;

import br.com.auto_socorro.produto_abstrato.Guincho;
import br.com.auto_socorro.produto_concreto_guincho.GuinchoGrande;
import br.com.auto_socorro.produto_concreto_guincho.GuinchoMedio;
import br.com.auto_socorro.produto_concreto_guincho.GuinchoPequeno;
import br.com.auto_socorro.produto_concreto_veiculo.Porte;

public class GuinchoCreator {
    public static Guincho criar(Porte porte) {
        switch (porte) {
        case Pequeno:
            return new GuinchoPequeno(porte);
        case Medio:
            return new GuinchoMedio(porte);
        case Grande:
            return new GuinchoGrande(porte);
        default:
            throw new IllegalArgumentException("Porte de Guincho desconhecido.");
        }
    }
}
