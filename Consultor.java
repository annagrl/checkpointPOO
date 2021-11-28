package Checkpoin2;

public class Consultor {
    private int cod_consultor;
    private String nome_consultor;
    private double salario;
    private int novosClientes;
    private double comissao;

    public Consultor(int cod_consultor, String nome_consultor, double salario, int novosClientes, double comissao) {
        this.cod_consultor = cod_consultor;
        this.nome_consultor = nome_consultor;
        this.salario = salario;
        this.novosClientes = novosClientes;
        this.comissao = comissao;
    }

    public int getCod_consultor() {
        return cod_consultor;
    }

    public void setCod_consultor(int cod_consultor) {
        this.cod_consultor = cod_consultor;
    }

    public String getNoms_consultor() {
        return nome_consultor;
    }

    public void setNoms_consultor(String noms_consultor) {
        this.nome_consultor = noms_consultor;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getNovosClientes() {
        return novosClientes;
    }

    public void setNovosClientes(int novosClientes) {
        this.novosClientes = novosClientes;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public void novosClientes (){
        System.out.println(this.nome_consultor + " fechou "+ this.novosClientes+ " novos clientes.");
    }

    public void comissao (){
        System.out.println(this.nome_consultor + " recebeu R$" + (this.novosClientes*this.comissao)+"de comissão.\n" + "Assim, valor total foi de R$ " + (this.salario+(this.novosClientes*this.comissao)));
    }

}
