package school.sptech.bd;

import org.springframework.jdbc.core.JdbcTemplate;

public class ConexaoH2 extends Conexao{

    private JdbcTemplate conexaoDoBanco;
    public ConexaoH2() {
        super("org.h2.Driver",
                "jdbc:h2:file:./scriptgct",
                "sa",
                "urubu100");
        this.conexaoDoBanco = getConexaoBD();
    }

    @Override
    public void inserirDadosComponenete(String componente, Double uso) {
        String sql = "INSERT INTO componentes (componente, uso) VALUES (?, ?)";
        conexaoDoBanco.update(sql, componente, uso);
    }

}
