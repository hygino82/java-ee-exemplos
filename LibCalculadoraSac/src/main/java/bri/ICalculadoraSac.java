package bri;

import br.model.Parcela;
import java.util.List;
import javax.ejb.Remote;

@Remote
public interface ICalculadoraSac {

    List<Parcela> gerarParcelas(double valor, double taxa, int prestacoes);
}
