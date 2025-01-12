package Cadastro_Clientes.organizadores;
import Cadastro_Clientes.Sistema.Cliente;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class metodos extends Cliente {

    public metodos(String nome, String senha, String email, Long idade, String CPF, String data_nascimento) {
        super(nome, senha, email, idade, CPF, data_nascimento);
    }
    public static int OrganizadorIdade(String data_nascimento) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataNasc = LocalDate.parse(getData_Nascimento(),formatter);
        LocalDate hoje = LocalDate.now();

        long idade = ChronoUnit.YEARS.between(dataNasc,hoje);
        return (int) idade;
    }
    public static String OrganizadorData(String data_nascimento){
        String dia = data_nascimento.substring(0,2);
        String mes = data_nascimento.substring(2,4);
        String ano = data_nascimento.substring(4,8);
        // Formatando a data para o modelo DD/MM/YYYY
        // Não acho que este seja o melhor jeito de fazer esta formatação já que ele retorna uma string que talvez o
        // LocalDate não saiba tratar.

        return STR."\{dia}/\{mes}/\{ano}";
    }
}
