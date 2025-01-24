<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ff9703f5374e59d9f8af0fd825c5ab94f3f9635e
package services;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class MetodosCadastro {

    public static int calcularIdade(String dataNascimento) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataNasc = LocalDate.parse(dataNascimento, formatter);
        LocalDate hoje = LocalDate.now();
        return (int) ChronoUnit.YEARS.between(dataNasc, hoje);
    }

}
<<<<<<< HEAD
=======
=======
package services;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class MetodosCadastro {

    public static int calcularIdade(String dataNascimento) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataNasc = LocalDate.parse(dataNascimento, formatter);
        LocalDate hoje = LocalDate.now();
        return (int) ChronoUnit.YEARS.between(dataNasc, hoje);
    }

    public static String formatarData(String dataNascimento) {
        DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("yyyyMMdd");
        DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return LocalDate.parse(dataNascimento, inputFormatter).format(outputFormatter);
    }
}
>>>>>>> fb25f108370a0c033685ffaef9522df9d830ec05
>>>>>>> ff9703f5374e59d9f8af0fd825c5ab94f3f9635e
