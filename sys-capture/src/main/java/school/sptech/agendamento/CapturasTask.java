package school.sptech.agendamento;

import school.sptech.exibicao.ExibirValores;

import java.util.TimerTask;

public class CapturasTask extends TimerTask {
    private int delay;
    private int periodo;

    public CapturasTask(int delay, int periodo) {
        this.delay = delay;
        this.periodo = periodo;
    }

    @Override
    public void run() {

    }
}
