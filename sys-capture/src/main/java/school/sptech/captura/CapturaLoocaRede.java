package school.sptech.captura;

import com.github.britooo.looca.api.group.rede.Rede;
import com.github.britooo.looca.api.group.rede.RedeInterface;
import school.sptech.util.Conversor;

public class CapturaLoocaRede extends CapturaLooca {

    private Rede rede;

    public CapturaLoocaRede() {
        super();
        this.rede = looca.getRede();
    }

    public Double getVelocidadeDownload(){
        return Conversor.converterBytesParaMB(getInterfaceAtiva().getBytesRecebidos());
    }

    public Double getVelocidadeUpload(){
        return Conversor.converterBytesParaMB(getInterfaceAtiva().getBytesEnviados());
    }

    public RedeInterface getInterfacePorNome(String nome){
        for (RedeInterface redeInterface : this.rede.getGrupoDeInterfaces().getInterfaces()) {
            if(redeInterface.getNome().equalsIgnoreCase(nome)){
                return redeInterface;
            }
        }
        return null;
    }

    public RedeInterface getInterfaceAtiva(){
        for (RedeInterface redeInterface : this.rede.getGrupoDeInterfaces().getInterfaces()) {
            if(!redeInterface.getEnderecoIpv4().isEmpty()){
                return redeInterface;
            }
        }
        return null;
    }

    @Override
    public Double capturar() {
        return Conversor.converterBytesParaMB(getInterfaceAtiva().getBytesRecebidos());
    }
}
