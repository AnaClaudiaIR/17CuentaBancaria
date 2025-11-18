public class CuentaBancaria {
    private double saldo;
    private double depositar;
    private double retirar;

    public CuentaBancaria() { //Inicializar constructor vacío
    }

    //getters y setters para establecer el saldo
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    //Método para depositar dinero
    public void Depositar(double cantidad) {
        System.out.println("Depositando: "+cantidad);
        this.saldo += cantidad;
        System.out.println("Saldo actual: " + this.saldo);
    }

    //Método con Exception para retirar dinero
    public void Retirar(double cantidad) throws SaldoInsuficienteException{ //Lanza el error personalizado si es necesario
        if(cantidad > this.saldo) {
          throw new SaldoInsuficienteException("Saldo insuficiente. (Mensaje de 'get message')"); //Si la cantidad es mayor que el saldo --> lanza el error
        } else {
            this.saldo -= cantidad;
            System.out.println("Saldo actual: " + this.saldo);
        }
    }
}
