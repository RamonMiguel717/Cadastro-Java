package Cadastro_Clientes.Validacao;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Predicate;

import static Cadastro_Clientes.organizadores.metodos.OrganizadorIdade;

public class Validator  {
    public Validator(String nome, String senha, String email, Long idade, String CPF, String data_nascimento) {

    }

/*
Campos que eu tenho que validar:

CPF
Nome
Idade
Email
Senha
 */

    public static void ValidarCPF(String CPF) throws CPFValidationException{
        Map<Predicate<String>,String> regras = new LinkedHashMap<>();

        regras.put(c-> c == null || c.isBlank(), "O campo CPF não pode ser vazio.");
        regras.put(c-> c.length()!= 11,"O campo CPF deve conter 11 caracteres.");
        regras.put(c-> c.matches("\\d+"),"O campo CPF só pode conter caracteres.");
    }
    public static void ValidarIdade(String data_nascimento) throws IdadeValidationException{
        Map<Predicate<String>,String> regras = new LinkedHashMap<>();

        regras.put(c -> c == null || c.isBlank(), "O campo Idade não poe ser vazio.");
        regras.put(c -> OrganizadorIdade(c)< 18, "O usuário não pode ser menor de 18 anos.");
    }

    public static void ValidarData(String data_nascimento) throws DataValidationException{
        Map<Predicate<String>,String> regras = new LinkedHashMap<>();

        regras.put(c -> c == null || c.isBlank(),"O campo data não pode ser vazio.");
        regras.put(c -> c.length() != 8, "O campo data deve conter ao menos 8 caractéres válidos. ");
    }

    public  static void ValidarPassword(String senha,String nome,String data_nascimento, String email,String cpf){
        Map<Predicate<String>,String> regras  = new LinkedHashMap<>();

        regras.put(c -> c == null || c.isBlank(),"O campo Senha não pode ser vazio.");
        regras.put(c -> c.contains(nome),"A sua senha não pode conter o seu nome.");
        regras.put(c -> c.length()<8,"A sua senha não pode ser menor que 8 caracteres.");
        regras.put(c -> c.contains(email),"A sua senha não pode ser o seu email.");
        regras.put(c -> c.contains(data_nascimento),"A sua senha não pode conter sua data de nascimento.");
        regras.put(c -> c.contains(cpf),"A sua senha não pode conter o seu CPF");
        regras.put(c -> c.matches("\\d+"),"A sua senha deve conter ao menos um numero");
        regras.put(c -> c.matches(".*[!@#$%^&*(),.?\":{}|<>].*"),"A sua senha deve conter ao menos um caractere especial.");
        regras.put(c -> c.matches(".*[a-zA-Z].*"),"A sua senha deve conter ao menos uma letra.");
    }
    public static void ValidarEmail(String email){
        Map<Predicate<String>,String> regras = new LinkedHashMap<>();

        regras.put(c -> c == null||c.isBlank(), "O campo email não pode ser vazio.");
        regras.put(c -> c.matches("^[\\w._%+-]+@[\\w.-]+\\.[a-zA-Z]{2,}$"),"O email deve seguir o padrão email@gmail.com");


    }

}
