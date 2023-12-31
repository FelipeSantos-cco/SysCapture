package school.sptech.bd;

import org.springframework.jdbc.core.JdbcTemplate;

public class ConexaoSqlServer extends Conexao{
    private JdbcTemplate conexaoDoBanco;
    public ConexaoSqlServer() {
        super("com.microsoft.sqlserver.jdbc.SQLServerDriver",
                "jdbc:sqlserver://44.218.55.108:1433;" +
                        "databaseName=scriptgct;encrypt=false;user=sa;password=urubu100",
                "sa",
                "urubu100");

        this.conexaoDoBanco = getConexaoBD();
    }

    @Override
    public void inserirDadosComponenete(String componente, Double uso) {
        String sql = "INSERT INTO componentes (componente, uso) VALUES (?, ?)";
        conexaoDoBanco.update(sql, componente, uso);
    }

    public JdbcTemplate getConexaoDoBanco() {
        return conexaoDoBanco;
    }

}
