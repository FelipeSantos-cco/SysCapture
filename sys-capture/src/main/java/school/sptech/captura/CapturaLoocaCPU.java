package school.sptech.captura;

import com.github.britooo.looca.api.group.processador.Processador;
import school.sptech.util.Conversor;

public class CapturaLoocaCPU extends CapturaLooca {

    private final Processador processador;
    public CapturaLoocaCPU() {
        super();
        processador = super.looca.getProcessador();
    }

    @Override
    public Double capturar() {
        return this.processador.getUso();
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
