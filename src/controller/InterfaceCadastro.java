<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ff9703f5374e59d9f8af0fd825c5ab94f3f9635e
package controller;

import model.Cliente;
import validation.FormatValidator;

import java.util.Scanner;

public class InterfaceCadastro {
    Scanner entrada = new Scanner(System.in);

    public void apresentacao() {
        System.out.println("Já tem cadastro? (Sim(S)/Não(N)");
        String resposta = entrada.nextLine();

        switch (resposta.toLowerCase()) {
            case "s": AcessoConta();
            case "n":
        }
    }
    public void AcessoConta(){

        try {
            System.out.println("Olá! Seja bem-vindo.");
            System.out.print("Digite seu CPF: ");
            String cpf = entrada.nextLine();
            FormatValidator.validarCPF(cpf);

            System.out.print("Digite seu email: ");
            String email = entrada.nextLine();
            FormatValidator.validarEmail(email);

            System.out.print("Digite sua senha: ");
            String senha = entrada.nextLine();
            FormatValidator.validarSenha(senha, "", email);

            System.out.println("Seja bem vindo!");
        } catch (Exception e) {
            System.out.println("Erro ao entrar:: " + e.getMessage());
        }
    }
    public void CadastrarNovaConta(){

        System.out.println("Insira as informações requisitadas:");

        try {
            System.out.println("Insira seu nome completo: ");
            String nome = entrada.nextLine();
            FormatValidator.validarNome(nome);

            System.out.println("Insira seu email:");
            String email = entrada.nextLine();
            FormatValidator.validarEmail(email);

            System.out.println("Insira sua data de nascimento");
            String data = entrada.nextLine();
            FormatValidator.validarIdade(data);

            System.out.println("Insira seu CPF: ");
            String cpf = entrada.nextLine();
            FormatValidator.validarCPF(cpf);

            System.out.println("Insira sua senha:");
            String senha = entrada.nextLine();
            FormatValidator.validarSenha(senha,nome,email);

            System.out.println("Confirme sua senha: ");
            String confirmacao = entrada.nextLine();
            while (!confirmacao.matches(senha)){
                System.out.println("Senha incorreta, tente novamente");
                confirmacao = entrada.nextLine();
            }



        }catch (Exception e){
            System.out.println("Erro ao cadastrar: " + e.getMessage());
        }
        Cliente List<Link>  = new Cliente[];
    }
}
<<<<<<< HEAD
=======
=======
package controller;

import validation.Validator;

import java.util.Scanner;

public class InterfaceCadastro {
    Scanner entrada = new Scanner(System.in);

    public void apresentacao() {
        System.out.println("Já tem cadastro? (Sim(S)/Não(N)");
        String resposta = entrada.nextLine();

        switch (resposta.toLowerCase()) {
            case "s": AcessoConta();
            case "n":
        }
    }
    public void AcessoConta(){

        try {
            System.out.println("Olá! Seja bem-vindo.");
            System.out.print("Digite seu CPF: ");
            String cpf = entrada.nextLine();
            Validator.validarCPF(cpf);

            System.out.print("Digite seu email: ");
            String email = entrada.nextLine();
            Validator.validarEmail(email);

            System.out.print("Digite sua senha: ");
            String senha = entrada.nextLine();
            Validator.validarSenha(senha, "", email);

            System.out.println("Cadastro realizado com sucesso!");
        } catch (Exception e) {
            System.out.println("Erro no cadastro: " + e.getMessage());
        }
    }
    public void CadastrarNovaConta(){

    }
}
>>>>>>> fb25f108370a0c033685ffaef9522df9d830ec05
>>>>>>> ff9703f5374e59d9f8af0fd825c5ab94f3f9635e
