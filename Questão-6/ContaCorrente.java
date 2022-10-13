
public class ContaCorrente implements Conta{

    protected Cliente cliente;
    protected float saldo;
    
    public ContaCorrente() {
    }

    public ContaCorrente(Cliente cliente,float saldo){
        this.cliente = cliente;
        this.saldo = saldo;
    }

    @Override
    public void depositarDinheiro(float valor) {
        if( valor <= 0 ){
            System.out.println("Não é possível depositar valores negativos");
        } 
        else{
            this.saldo = this.saldo + valor;
            System.out.println("Deposito realizado com sucesso");
            System.out.println("Saldo atual" + " " + this.saldo);
        }
        
    }

    @Override
    public void sacarDinheiro(float valor) {
        if( valor <= 0 ){
            System.out.println("Não é possível sacar valores negativos");
        } 
        else{
            if( this.saldo >= valor){
                this.saldo -= valor;
                System.out.println("Saque realizado com sucesso");
                System.out.println("Saldo atual" + " " +this.saldo);
            }
                else{
                    System.out.println("Saldo insuficiente");
                }

        }

    }

    

    public boolean transferir(ContaCorrente conta){
        return true;
    }

    @Override
    public String toString() {
        return "saldo:" + saldo +"";
    }

 
}
