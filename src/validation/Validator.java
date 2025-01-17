package validation;

import validation.Exceptions.CPFValidationException;
import validation.Exceptions.EmailValidationException;
import validation.Exceptions.PasswordValidationException;

import java.util.regex.Pattern;

public class Validator {

    public static void validarCPF(String cpf) throws CPFValidationException {
        if (cpf == null || cpf.isBlank()) {
            throw new CPFValidationException("O CPF não pode ser vazio.");
        }
        if (!cpf.matches("\\d{11}")) {
            throw new CPFValidationException("O CPF deve conter exatamente 11 números.");
        }
    }

    public static void validarEmail(String email) throws EmailValidationException {
        if (email == null || email.isBlank()) {
            throw new EmailValidationException("O email não pode ser vazio.");
        }
        if (!Pattern.compile("^[\\w._%+-]+@[\\w.-]+\\.[a-zA-Z]{2,}$").matcher(email).matches()) {
            throw new EmailValidationException("Formato de email inválido.");
        }
    }

    public static void validarSenha(String senha, String nome, String email) throws PasswordValidationException {
        if (senha == null || senha.isBlank()) {
            throw new PasswordValidationException("A senha não pode ser vazia.");
        }
        if (senha.length() < 8) {
            throw new PasswordValidationException("A senha deve conter pelo menos 8 caracteres.");
        }
        if (senha.contains(nome) || senha.contains(email)) {
            throw new PasswordValidationException("A senha não pode conter o nome ou email.");
        }
        if (!senha.matches(".*\\d.*") || !senha.matches(".*[a-zA-Z].*") || !senha.matches(".*[!@#$%^&*()].*")) {
            throw new PasswordValidationException("A senha deve conter letras, números e caracteres especiais.");
        }
    }
}
