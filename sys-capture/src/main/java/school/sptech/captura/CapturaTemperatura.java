package school.sptech.captura;

import com.github.britooo.looca.api.group.temperatura.Temperatura;

public class CapturaTemperatura extends Captura{
    private final Temperatura temperatura;

    public CapturaTemperatura() {
        super();
        this.temperatura = super.looca.getTemperatura();
    }

    public Double getZonaTermicaCelcius(){
        return this.temperatura.getTemperatura();
    }

    public Double getZonaTermicaFahrenheit(){
        return (getZonaTermicaCelcius() * 9/5) + 32;
    }
}
