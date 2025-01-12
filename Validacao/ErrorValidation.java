package Cadastro_Clientes.Validacao;

public class ErrorValidation extends Exception {
    public ErrorValidation(String message) {
        super(message);
    }
}

class CPFValidationException extends ErrorValidation {
    public CPFValidationException(String message) {
        super(message);
    }
}

class EmailValidationException extends ErrorValidation {
    public EmailValidationException(String message) {
        super(message);
    }
}

class PasswordValidationException extends ErrorValidation {
    public PasswordValidationException(String message) {
        super(message);
    }
}
class IdadeValidationException extends ErrorValidation{
    public IdadeValidationException(String message){super(message);}
}
class DataValidationException extends  ErrorValidation{
    public DataValidationException(String message){super(message);}
}
