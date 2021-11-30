package Checkpoin2;

public class Empresa {
 //atributos da classe
 private String nome_empresa;
 private String cod_produto;
 private String descricaoProduto;
 private double qtdadeProduto;
 private int qtdadeCliente;
 private Consultor novosClientes;
 private TipoDeGas qtdadede_gas;
 private Cliente comprar_gas;


 // método construtor


 public Empresa(String nome_empresa, String cod_produto, String descricaoProduto, double qtdadeProduto, int qtdadeCliente, Consultor novosClientes, TipoDeGas qtdadede_gas, Cliente comprar_gas) {
  this.nome_empresa = nome_empresa;
  this.cod_produto = cod_produto;
  this.descricaoProduto = descricaoProduto;
  this.qtdadeProduto = qtdadeProduto;
  this.qtdadeCliente = qtdadeCliente;
  this.novosClientes = novosClientes;
  this.qtdadede_gas = qtdadede_gas;
  this.comprar_gas = comprar_gas;
 }

 //getters e setters

 public String getNome_empresa() {
  return nome_empresa;
 }

 public void setNome_empresa(String nome_empresa) {
  this.nome_empresa = nome_empresa;
 }

 public String getCod_produto() {
  return cod_produto;
 }

 public void setCod_produto(String cod_produto) {
  this.cod_produto = cod_produto;
 }

 public String getDescricaoProduto() {
  return descricaoProduto;
 }

 public void setDescricaoProduto(String descricaoProduto) {
  this.descricaoProduto = descricaoProduto;
 }

 public double getQtdadeProduto() {
  return qtdadeProduto;
 }

 public void setQtdadeProduto(double qtdadeProduto) {
  this.qtdadeProduto = qtdadeProduto;
 }

 public int getQtdadeCliente() {
  return qtdadeCliente;
 }

 public void setQtdadeCliente(int qtdadeCliente) {
  this.qtdadeCliente = qtdadeCliente;
 }

 public Consultor getNovosClientes() {
  return novosClientes;
 }

 public void setNovosClientes(Consultor novosClientes) {
  this.novosClientes = novosClientes;
 }

 public TipoDeGas getQtdadede_gas() {
  return qtdadede_gas;
 }

 public void setQtdadede_gas(TipoDeGas qtdadede_gas) {
  this.qtdadede_gas = qtdadede_gas;
 }

 public Cliente getComprar_gas() {
  return comprar_gas;
 }

 public void setComprar_gas(Cliente comprar_gas) {
  this.comprar_gas = comprar_gas;
 }


// métodos

 public void totalCliente ( ) {
  System.out.println("Total de clientes: " + this.qtdadeCliente + this.novosClientes);

 }

 public double armazenar_gas (){
  return this.qtdadeProduto;
 }

 public void vender_gas (){
  System.out.println("Total de venda: " + this.comprar_gas);
 }

}
