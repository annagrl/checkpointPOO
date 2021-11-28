package Checkpoin2;

// dúvida de como colocar Scanner
public class Principal {
    public static void main(String[] args) {
        Cliente c1 = new Cliente(1234,"Padaria da Maria","Padaria","Rua dos bobos, num 0",5.35,100);
        TipoDeGas tipo1 = new TipoDeGas("GLP",50000);
        TipoDeGas tipo2 = new TipoDeGas("Propano", 20000);
        Consultor cc1 = new Consultor(102030,"Paulo Vitor Pereira",5000,0,100);

        c1.comprar_gas();
        tipo1.qtdade_gas();
        tipo2.qtdade_gas();
        cc1.comissao();
        cc1.novosClientes();
    }
}

