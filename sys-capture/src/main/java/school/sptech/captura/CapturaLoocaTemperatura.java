package school.sptech.captura;

import com.github.britooo.looca.api.group.temperatura.Temperatura;

public class CapturaLoocaTemperatura extends CapturaLooca {
    private final Temperatura temperatura;

    public CapturaLoocaTemperatura() {
        super();
        this.temperatura = super.looca.getTemperatura();
    }

    public Double getZonaTermicaCelcius(){
        return this.temperatura.getTemperatura();
    }

    public Double getZonaTermicaFahrenheit(){
        return (getZonaTermicaCelcius() * 9/5) + 32;
    }

    @Override
    public Double capturar() {
        return this.temperatura.getTemperatura();
    }
}
