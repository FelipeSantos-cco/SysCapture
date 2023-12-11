package school.sptech.controle;

import school.sptech.captura.*;

import java.util.ArrayList;
import java.util.List;

public class ControleCapturas {
    public List<Integer> capturasAtivas;
    public List<Double> valoresCapturas;

    public ControleCapturas(List<Integer> capturasAtivas) {
        this.capturasAtivas = new ArrayList<Integer>();
        this.capturasAtivas = capturasAtivas;
    }

    public List<Double> controleSimples(){
        valoresCapturas = new ArrayList<Double>();

        for (Integer codigo : this.capturasAtivas) {
            CapturasEnum capturaEnum = CapturasEnum.of(codigo);

            if(capturaEnum != null){
                switch (capturaEnum){
                    case CPU:
                        CapturaLoocaCPU cpu = new CapturaLoocaCPU();
                        valoresCapturas.add(cpu.getUsoAtualPorcentagem());
                        break;
                    case RAM:
                        CapturaLoocaRAM ram = new CapturaLoocaRAM();
                        valoresCapturas.add(ram.getUsoAtualGB());
                        break;
                    case DISCO:
                        CapturaLoocaDisco disco = new CapturaLoocaDisco();
                        valoresCapturas.add(disco.getArmazenamentoTotal());
                        break;
                    case REDE:
                        CapturaLoocaRede rede = new CapturaLoocaRede();
                        valoresCapturas.add(rede.getVelocidadeDownload());
                        break;
                }
            }
        }
        return valoresCapturas;
    }


}
