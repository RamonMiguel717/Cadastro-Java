package Cadastro_Clientes.Sistema;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    String Nome;
    String Senha;
    String Email;
    Long Idade;
    String CPF;
    static String Data_Nascimento;

    final List<String> errors = new ArrayList<>();


    public Cliente(String nome, String senha, String email, Long idade, String CPF, String data_nascimento) {
        this.Nome = nome;
        this.Senha = senha;
        this.Email = email;
        this.Idade = idade;
        this.CPF = CPF;
        this.Data_Nascimento = data_nascimento;
    }

    public static String getData_Nascimento() {
        return Data_Nascimento;
    }

    public void setData_Nascimento(String data_nascimento) {

        if (errors == null) {
            Data_Nascimento = data_nascimento;
        }
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        this.Nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String cpf) {
        CPF = cpf;
    }

    public Long getIdade() {
        return Idade;
    }

    public void setIdade(Long idade) {
        Idade = idade;
    }

    public String getSenha() {
        return Senha;
    }

    //Descobrir alguma maneira de retornar os erros da verificação

    public void setSenha(String senha) {
        Senha = senha;
    }


    public String getEmail() {

        return Email;
    }

    public void setEmail(String email) {
        Email = email;

/*
Tenho que adicionar uma validação para comparar se já existe um email no modelo
Tenho que adicionar uma validação para comparar se já existe um Usuario cadastrado
 */
    }
}