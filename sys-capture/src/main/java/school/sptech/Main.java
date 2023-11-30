package school.sptech;

import school.sptech.exibicao.ExibirValores;
import school.sptech.exibicao.Menu;

import java.util.Timer;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        while (!Menu.isMenuFinalizado){
            Menu.exibirMenuComponentes();
        }

        // Trecho de Código Temporário :)
        while (true){
            ExibirValores.startSimples();
            Thread.sleep(2000);
        }


    }
}
