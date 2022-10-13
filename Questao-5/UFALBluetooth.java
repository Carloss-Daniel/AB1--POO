public abstract class UFALBluetooth {

    public UFALBluetooth(){
        AbrirConexao();
        FecharConexao();
        ProcessarDados();

    }

    public void  AbrirConexao(){
        System.out.println("Conectando ao Bluetooth ");
    }

    protected abstract void ProcessarDados();

    public void  FecharConexao(){
        System.out.println(" Fechando conexao ao Bluetooth ");
    }

    
}