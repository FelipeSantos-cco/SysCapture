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
                        CapturaCPU cpu = new CapturaCPU();
                        valoresCapturas.add(cpu.getUsoAtualPorcentagem());
                        break;
                    case RAM:
                        CapturaRAM ram = new CapturaRAM();
                        valoresCapturas.add(ram.getUsoAtualGB());
                        break;
                    case DISCO:
                        CapturaDisco disco = new CapturaDisco();
                        valoresCapturas.add(disco.getArmazenamentoTotal());
                        break;
                    case REDE:
                        CapturaRede rede = new CapturaRede();
                        valoresCapturas.add(rede.getVelocidadeDonload());
                        break;
                }
            }
        }
        return valoresCapturas;
    }


}
