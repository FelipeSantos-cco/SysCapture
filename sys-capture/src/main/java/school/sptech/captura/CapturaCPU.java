package school.sptech.captura;

import com.github.britooo.looca.api.group.processador.Processador;
import school.sptech.util.Conversor;

public class CapturaCPU extends Captura{

    private final Processador processador;
    public CapturaCPU() {
        super();
        processador = super.looca.getProcessador();
    }

    public Double getUsoAtualPorcentagem(){
        return this.processador.getUso();
    }

    public Double getUsoAtualFrequencia(){
        return Conversor.converterHertzParaGHz(this.processador.getFrequencia());
    }

    public String getNomeCPU(){
        return this.processador.getNome();
    }


}
