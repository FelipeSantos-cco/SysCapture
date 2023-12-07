package school.sptech.dao;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import school.sptech.bd.ConexaoSqlServer;

import java.util.List;

public class Login {

    private String email;
    private String senha;
    private String fkEmpresa;

    public Login(String email, String senha) {
        this.email = email;
        this.senha = senha;
    }

    public List<FuncionarioDAO> fazerLogin(){
        ConexaoSqlServer conexaoSqlServer = new ConexaoSqlServer();
        JdbcTemplate con = conexaoSqlServer.getConexaoDoBanco();

        List<FuncionarioDAO> funcionarioBD = con.query(
                "SELECT email, senha, fk_empresa AS fkEmpresa FROM funcionario",
                new BeanPropertyRowMapper<>(FuncionarioDAO.class));

        return funcionarioBD;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
