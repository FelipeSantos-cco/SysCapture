package school.sptech.util;

public class Conversor {

    private static final double GIGABYTES = 1073741824.0;
    private static final double MEGABYTES = 1048576.0;
    private static final double GIGAHERTZ = Math.pow(10, 9);

    /**
     * Converte <b>Bytes</b> tipo Long em <b>GIGABYTES</b> tipo Double
     * @param valor Long em Byts
     * @return Valor em GB
     */
    public static Double converterBytesParaGB(Long valor){
        return valor / GIGABYTES;
    }

    /**
     * Converte <b>Bytes</b> tipo Long em <b>MEGABYTES</b> tipo Double
     * @param valor Long em Byts
     * @return Valor em GB
     */
    public static Double converterBytesParaMB(Long valor){
        return valor / MEGABYTES;
    }

    /**
     * Converte <b>Hertz</b> tipo Long em <b>GIGAHERTZ</b> tipo Double
     * @param valor Long em Hertz
     * @return Valor em GIGAHERTZ
     */
    public static Double converterHertzParaGHz(Long valor){
        return valor / GIGAHERTZ;
    }



}
