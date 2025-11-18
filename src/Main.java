public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria();
        cuenta.setSaldo(12000.78);
        System.out.println("Saldo: " + cuenta.getSaldo());

        System.out.println("-----------------");
        cuenta.Depositar(900.0);

        System.out.println("-----------------");

        try{
            cuenta.Retirar(8.12);
            cuenta.Retirar(1500000000000.10);
        } catch(SaldoInsuficienteException e){ //Se ejecuta el "get message" del exeption --> catch
            System.out.println(e.getMessage());
            System.out.println("Saldo insuficiente. No se puede realizar la operación.(Mensaje de la consola adicional.)");
        }
    }
}