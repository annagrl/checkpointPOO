package Checkpoin2;

import java.util.Scanner;


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

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite nome da empresa: ");
        String nome_empresa = entrada.nextLine();
        System.out.println("Escolha um dos produtos: GLP ou Propano. ");
        String descricaoProduto = entrada.nextLine();

        System.out.println ("A empresa "+ nome_empresa + " vende  o produto "+ descricaoProduto);

        // Qual tipo de gás precisa ser reabastecido de acordo com seu nível de gás
        if (tipo1 .compareTo(tipo2) == 0){
            System.out.println("Os tanques estão igualmente abastecidos ");
        } else if (tipo1.compareTo(tipo2) == -1) {
            System.out.println("Precisa reabastecer com GLP");
        } else if (tipo1.compareTo(tipo2) == 1) {
            System.out.println("Precisa reabastecer com Propano");
        }


    }
}

