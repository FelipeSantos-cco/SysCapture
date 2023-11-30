package school.sptech.captura;

public enum CapturasEnum {
    CPU(1),
    RAM(2),
    DISCO(3),
    REDE(4);

    private int codigo;
    CapturasEnum(int codigo){
        this.codigo = codigo;
    }

    public static CapturasEnum of(int codigo){
        switch (codigo){
            case 1:
                return CPU;
            case 2:
                return RAM;
            case 3:
                return DISCO;
            case 4:
                return REDE;
        }
        return null;
    }

    public int getCodigo(){
        return codigo;
    }

}
