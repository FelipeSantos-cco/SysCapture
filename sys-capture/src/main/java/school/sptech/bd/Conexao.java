package school.sptech.bd;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

public abstract class Conexao {
    private String drive;
    private String url;
    private String user;
    private String senha;
    private JdbcTemplate conexaoBD;

    public Conexao(String drive, String url, String user, String senha) {
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName(drive); // Driver do banco de dados
        dataSource.setUrl(url);
        dataSource.setUsername(user);
        dataSource.setPassword(senha);

        conexaoBD = new JdbcTemplate(dataSource);
    }

    public JdbcTemplate getConexaoBD() {
        return conexaoBD;
    }

    public String getDrive() {
        return drive;
    }

    public void setDrive(String drive) {
        this.drive = drive;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
