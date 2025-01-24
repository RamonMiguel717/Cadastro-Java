package repositorio;

import model.Cliente;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class ClienteRespoitorio {

    public void salvarCliente(Cliente cliente) throws SQLException {
        String sql = "INSERT INTO clientes (cpf,nome,email,data_nascimento) VALUES (?,?,?,?)";
        try (Connection connection = dataBaseConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setString(1, cliente.getCpf());
            statement.setString(2, cliente.getNome());
            statement.setString(3, cliente.getEmail());
            statement.setString(4, cliente.getDataNascimento());
            statement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Erro ao salvar cliente " + e.getMessage());
        }
    }
//TODO essa função vai fazer uso de outra função chamada "BuscarCliente"
    public void apagarCliente(String cpf) throws SQLException {
        String sql = "DELETE FROM clientes WHERE cpf = ?";
        try(Connection connection = dataBaseConnection.getConnection();
        PreparedStatement statement = connection.prepareStatement(sql)){
            statement.setString(1,cpf);
            int resultado = statement.executeUpdate();


            if(resultado >0){
               // System.out.println("Cliente "+Cliente.getNome()+"foi apagado.");
            }else System.out.println("Cliente não encontrado.");
        }
    }
//FIXME adaptar essa função para utilizar da função "BuscarCliente"
    public Cliente buscarClientePorCpf(String cpf) throws SQLException {
// A string SLQ serve para enviar ao MySQL o comando necessário para realizar a ação requerida.

        String sql = "SELECT * FROM clientes WHERE cpf = ?";
/*
O comando dentro do try em resumo realiza os seguintes passos:

- Realiza a conexão com o banco de dados e armazena na variavel "connection"
- PreparedStatement é uma maneira de tratar o tipo de comando que será enviado para o MySQL, ele faz a conexão do meu codigo
com o banco de dados.
 */
        try(Connection connection = dataBaseConnection.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1,cpf);
            ResultSet resultado = statement.executeQuery();

            if (resultado.next()) {
                return new Cliente(resultado.getString("cpf"),resultado.getString("nome"),
                        resultado.getString("email"),
                        resultado.getString("data_nascimento"));
            };
        }catch (SQLException e) {
            System.out.println("Erro ao buscar cliente " + e.getMessage());
        }
        return null;
    }
}

// TODO criar um método privado para buscar a senha do cliente ou modifica-la no banco de dados
