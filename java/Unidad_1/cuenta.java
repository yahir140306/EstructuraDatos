public class cuenta {
    private float saldo = 0;
    String cliente="";

    float setSaldo (float nvoSaldo) {
        saldo = nvoSaldo;
        return saldo;
    }

    float Retiro(float can) {
        saldo = saldo - can;
        return saldo;
    }

    void setCliente(String nvoCliente){
        cliente = nvoCliente ;
    }

    String getCliente(){
        return cliente;
    }
}
