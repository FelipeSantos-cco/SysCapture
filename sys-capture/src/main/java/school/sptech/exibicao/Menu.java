package school.sptech.exibicao;

import school.sptech.captura.CapturasEnum;
import school.sptech.controle.ControleCapturas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {

    public static Boolean isMenuFinalizado = false;
    public static List<Integer> escolhaComponenetes = new ArrayList<Integer>();

    public static void exibirMenuComponentes(){


        exibirComponentesEscolhidos();
        System.out.println("> [0] START CAPTURAS");

        for (CapturasEnum enumerador : CapturasEnum.values()) {

            System.out.print("> [%d] ".formatted(enumerador.getCodigo()));
            System.out.println(enumerador.name());
        }

        inputEscolhaComponenetes();
    }

    public static void exibirComponentesEscolhidos(){
        if(!escolhaComponenetes.isEmpty()){
            System.out.println("Suas escolhas: ");
            for (Integer indice : escolhaComponenetes) {
                System.out.println(">> %s".formatted(CapturasEnum.of((indice))));
            }
            System.out.println("=-".repeat(20));
        }
    }

    public static void inputEscolhaComponenetes(){
        Scanner leitorInt = new Scanner(System.in);
        int escolha = leitorInt.nextInt();

        if (escolha > CapturasEnum.values().length || escolha < 0){
            return;
        }
        else if (escolha == 0) {
            finalizarMenu();
        }
        else {
            for (CapturasEnum enumerador : CapturasEnum.values()) {
                if (enumerador.getCodigo() == escolha){
                    addEscolhaComponenetes(escolha);
                }
            }
        }
    }

    public static void addEscolhaComponenetes(Integer codigo){
        escolhaComponenetes.add(codigo);
    }

    public static void finalizarMenu(){
        isMenuFinalizado = true;
        System.out.println("\n".repeat(50));
    }

    public static List<Integer> getEscolhaComponenetes(){
        return escolhaComponenetes;
    }



}
