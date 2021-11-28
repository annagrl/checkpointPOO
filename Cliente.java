package Checkpoin2;

public class Cliente {
    //atributos da classe
    private int cod_cliente;
    private String nome_cliente;
    private String tipo_cliente;
    private String endereco;
    private double preco_cliente;
    private double qtdade_compra;

    // método construtor
    public Cliente(int cod_cliente, String nome_cliente, String tipo_cliente, String endereco, double preco_cliente, double qtdade_compra) {
        this.cod_cliente = cod_cliente;
        this.nome_cliente = nome_cliente;
        this.tipo_cliente = tipo_cliente;
        this.endereco = endereco;
        this.preco_cliente = preco_cliente;
        this.qtdade_compra = qtdade_compra;
    }

    //getters e setters
    public int getCod_cliente() {
        return cod_cliente;
    }

    public void setCod_cliente(int cod_cliente) {
        this.cod_cliente = cod_cliente;
    }

    public String getNome_cliente() {
        return nome_cliente;
    }

    public void setNome_cliente(String nome_cliente) {
        this.nome_cliente = nome_cliente;
    }

    public String getTipo_cliente() {
        return tipo_cliente;
    }

    public void setTipo_cliente(String tipo_cliente) {
        this.tipo_cliente = tipo_cliente;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getPreco_cliente() {
        return preco_cliente;
    }

    public void setPreco_cliente(double preco_cliente) {
        this.preco_cliente = preco_cliente;
    }

    public double getQtdade_compra() {
        return qtdade_compra;
    }

    public void setQtdade_compra(double qtdade_compra) {
        this.qtdade_compra = qtdade_compra;
    }

    //método
    public void comprar_gas () {
        System.out.println(this.nome_cliente+" comprou "+ this.qtdade_compra+". Valor total de: "+(this.preco_cliente*this.qtdade_compra));
    }
}
