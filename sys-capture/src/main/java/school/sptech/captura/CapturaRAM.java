package school.sptech.captura;

import com.github.britooo.looca.api.group.memoria.Memoria;
import school.sptech.util.Conversor;

public class CapturaRAM extends Captura {
    private final Memoria memoria;

    public CapturaRAM() {
        super();
        this.memoria = super.looca.getMemoria();
    }

    public Double getUsoAtualGB(){
        return Conversor.converterBytesParaGB(this.memoria.getEmUso());
    }

    public Double getUsoAtualPorcentagem(){
        return (getUsoAtualGB() / getTotalGB())* 100;
    }

    public Double getTotalGB(){
        return Conversor.converterBytesParaGB(this.memoria.getTotal());
    }

    public Double getDisponivelGB(){
        return Conversor.converterBytesParaGB(this.memoria.getDisponivel());
    }


}
