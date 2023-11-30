package school.sptech.testes;

import school.sptech.captura.*;

import java.sql.SQLOutput;
import java.util.Scanner;

public class TesteCapturas {
    public static void main(String[] args) {
        Scanner leitorStrign = new Scanner(System.in);
        Scanner leitorInt = new Scanner(System.in);
        Integer escolha = 0;


        while (escolha != 9){
            System.out.println("Escolha: \n> [1] CPU\n> [2] RAM\n> [3] Disco\n> [4] Temperatura\n> [5] Rede\n> [9] SAIR");
            escolha = leitorInt.nextInt();
            switch (escolha){
                case 1:
                    CapturaCPU cpu = new CapturaCPU();
                    System.out.println("Nome: %s".formatted(cpu.getNomeCPU()));
                    System.out.println("Porcentagem de USO atual: %.2f %%".formatted(cpu.getUsoAtualPorcentagem()));
                    System.out.println("Frequência: %.2f GHz".formatted(cpu.getUsoAtualFrequencia()));
                    break;
                case 2:
                    CapturaRAM ram = new CapturaRAM();
                    System.out.println("Total: %.2f GB".formatted(ram.getTotalGB()));
                    System.out.println("Em uso %.2f GB".formatted(ram.getUsoAtualGB()));
                    System.out.println("Em uso %.1f%%".formatted(ram.getUsoAtualPorcentagem()));
                    break;
                case 3:
                    CapturaDisco disco = new CapturaDisco();
                    disco.exibeDadosDeTodosOsDisco();
                    break;
                case 4:
                    CapturaTemperatura temp = new CapturaTemperatura();
                    System.out.println("Temperatura Aproximada: %.2f °C".formatted(temp.getZonaTermicaCelcius()));
                    break;
                case 5:
                    CapturaRede rede = new CapturaRede();
                    System.out.println("Velociade Donwload: %.2f MB".formatted(rede.getVelocidadeDonload()));
                    System.out.println("Velociade de Upload: %.2f MB".formatted(rede.getVelocidadeUpload()));
                    break;
                case 9:
                    System.out.println("Adeus!");
                    break;
            }
        }

        /* O System.exit(0); está aqui para encerrar a aplicaçao de vez.
         * Por conta da captura da CPU, o sistema não encerra!
         */
        System.exit(0);


    }
}