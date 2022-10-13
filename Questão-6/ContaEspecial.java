
public class ContaEspecial extends ContaCorrente {

    private float limite;
    

    public ContaEspecial(Cliente cliente, float saldo, float limite){
        super(cliente, saldo);
        this.limite = limite;

    }

    @Override
    public void sacarDinheiro(float valor) {
        if( valor <= 0 ){
            System.out.println("Não é possível sacar valores negativos");
        } 
        else{
            if( this.saldo >= valor || this.saldo <= valor && this.saldo + this.limite >= valor){
                this.saldo -= valor;
                System.out.println("Saque realizado com sucesso");
                System.out.println("Saldo atual" + " " + this.saldo);
            }
                else{
                    System.out.println("Saldo insuficiente");
                }
        }

        }

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }
    
    @Override
    public String toString() {
        return "ContaEspecial limite:" +" "+"R$"+ limite +"";
    }

}
