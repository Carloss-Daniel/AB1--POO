
public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Daniel");
        Cliente cliente2 = new Cliente("Carlos");
        Conta c1 = new ContaCorrente(cliente1,0);
        ContaEspecial c2 = new ContaEspecial(cliente2,0,0);

        c1.depositarDinheiro(1000);
        System.out.println();
        c1.sacarDinheiro(2000);
        System.out.println();
        c1.sacarDinheiro(1000);
        System.out.println();
        c2.depositarDinheiro(1000);
        System.out.println();
        c2.sacarDinheiro(1500);
        c2.setLimite(500);
        System.out.println();
        c2.sacarDinheiro(1500);
        c2.sacarDinheiro(500);

    }
}
