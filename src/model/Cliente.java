<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ff9703f5374e59d9f8af0fd825c5ab94f3f9635e
package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Cliente {
    private String nome;
    private String senha;
    private String email;
    private int idade;
    private String cpf;
    private String dataNascimento;

    private final List<String> errors = new ArrayList<>();

    public Cliente(String nome, String senha, String email, int idade, String cpf, String dataNascimento) {
        this.nome = nome;
        this.senha = senha;
        this.email = email;
        this.idade = idade;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;

    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
<<<<<<< HEAD
=======
=======
package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Cliente {
    private String nome;
    private String senha;
    private String email;
    private int idade;
    private String cpf;
    private String dataNascimento;

    private final List<String> errors = new ArrayList<>();

    public  List<HashMap>  Cliente(String nome, String senha, String email, int idade, String cpf, String dataNascimento) {
        this.nome = nome;
        this.senha = senha;
        this.email = email;
        this.idade = idade;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
>>>>>>> fb25f108370a0c033685ffaef9522df9d830ec05
>>>>>>> ff9703f5374e59d9f8af0fd825c5ab94f3f9635e
