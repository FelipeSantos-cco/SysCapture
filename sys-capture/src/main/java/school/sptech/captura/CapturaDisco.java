package school.sptech.captura;

import com.github.britooo.looca.api.group.discos.Disco;
import com.github.britooo.looca.api.group.discos.DiscoGrupo;
import school.sptech.util.Conversor;

import java.sql.SQLOutput;
import java.util.List;

public class CapturaDisco extends Captura{
    private final DiscoGrupo discoGrupo;

    public CapturaDisco() {
        super();
        discoGrupo = super.looca.getGrupoDeDiscos();
    }

    public List<Disco> getTodosOsDiscos(){
        return this.discoGrupo.getDiscos();
    }

    public void exibeDadosDeTodosOsDisco(){
        for (Disco disco : this.discoGrupo.getDiscos()) {
            System.out.println("Nome do Disco: %s".formatted(disco.getNome()));
            System.out.println("Modelo: %s".formatted(disco.getModelo()));
            System.out.println("Espaço Total: %.2f".formatted((double) disco.getTamanho() / 1000000000));
        }
    }

    public Disco getDiscoPrincipal(){
        return this.discoGrupo.getDiscos().get(0);
    }

    public Double getArmazenamentoTotal(){
        return Conversor.converterBytesParaGB(this.discoGrupo.getTamanhoTotal());
    }
}

