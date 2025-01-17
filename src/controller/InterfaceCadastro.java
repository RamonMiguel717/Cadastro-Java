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
