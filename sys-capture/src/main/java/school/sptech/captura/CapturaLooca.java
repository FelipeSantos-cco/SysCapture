package school.sptech.captura;

import com.github.britooo.looca.api.core.Looca;

public abstract class CapturaLooca implements Capturavel{
    Looca looca;
    public CapturaLooca() {
        looca = new Looca();
    }
}
