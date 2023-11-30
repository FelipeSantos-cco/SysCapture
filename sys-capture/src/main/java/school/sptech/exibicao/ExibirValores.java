package school.sptech.exibicao;

import school.sptech.captura.*;
import school.sptech.controle.ControleCapturas;

import java.util.ArrayList;
import java.util.List;

public class ExibirValores {

    public static void startSimples(){
        ControleCapturas controle = new ControleCapturas(Menu.getEscolhaComponenetes());
        List<Double> valores = new ArrayList<>();
        valores = controle.controleSimples();

        int i = 0;

        System.out.println("\n".repeat(30));
        for (Integer codigo : Menu.getEscolhaComponenetes()) {
            CapturasEnum capturaEnum = CapturasEnum.of(codigo);

            switch (capturaEnum){
                case CPU:
                    System.out.println("Uso atual da CPU: %.2f%%".formatted(valores.get(i)));
                    break;
                case RAM:
                    System.out.println("Uso atual da RAM: %.2f GB".formatted(valores.get(i)));
                    break;
                case DISCO:
                    System.out.println("Espaço Total - Todos os Discos: %.2f GB".formatted(valores.get(i)));
                    break;
                case REDE:
                    System.out.println("Velocidade de Download: %.2f MB".formatted(valores.get(i)));
                    break;
            }


            i++;
        }


    }




}
