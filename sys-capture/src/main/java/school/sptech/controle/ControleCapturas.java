package school.sptech.controle;

import school.sptech.bd.ConexaoH2;
import school.sptech.bd.ConexaoSqlServer;
import school.sptech.captura.*;

import java.util.ArrayList;
import java.util.List;

public class ControleCapturas {
    public List<Integer> capturasAtivas;
    public List<Double> valoresCapturas;
    ConexaoSqlServer conexaoSqlServer = new ConexaoSqlServer();
    ConexaoH2 conexaoH2 = new ConexaoH2();

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
                        conexaoSqlServer.inserirDadosComponenete("cpu", cpu.getUsoAtualPorcentagem());
                        conexaoH2.inserirDadosComponenete("cpu", cpu.getUsoAtualPorcentagem());
                        break;
                    case RAM:
                        CapturaLoocaRAM ram = new CapturaLoocaRAM();
                        valoresCapturas.add(ram.getUsoAtualGB());
                        conexaoSqlServer.inserirDadosComponenete("ram", ram.getUsoAtualGB());
                        conexaoH2.inserirDadosComponenete("ram", ram.getUsoAtualGB());
                        break;
                    case DISCO:
                        CapturaLoocaDisco disco = new CapturaLoocaDisco();
                        valoresCapturas.add(disco.getArmazenamentoTotal());
                        conexaoSqlServer.inserirDadosComponenete("disco", disco.getArmazenamentoTotal());
                        conexaoH2.inserirDadosComponenete("disco", disco.getArmazenamentoTotal());
                        break;
                    case REDE:
                        CapturaLoocaRede rede = new CapturaLoocaRede();
                        valoresCapturas.add(rede.getVelocidadeDownload());
                        conexaoSqlServer.inserirDadosComponenete("rede", rede.getVelocidadeDownload());
                        conexaoH2.inserirDadosComponenete("rede", rede.getVelocidadeDownload());
                        break;
                }
            }
        }
        return valoresCapturas;
    }


}
