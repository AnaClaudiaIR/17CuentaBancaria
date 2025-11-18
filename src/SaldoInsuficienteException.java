public class SaldoInsuficienteException extends Exception { //Error personalizado --> Nace de la excepción de java
    public SaldoInsuficienteException(String message) {
        super(message); //Invoca el mensaje de la clase padre --> EXCEPTION
    }
}
