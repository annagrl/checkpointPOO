package Checkpoin2;

public class Empresa {
 private String nome_empresa;
 private String cod_produto;
 private String descricaoProduto;
 private double qtdadeProduto;
 private int qtdadeCliente;

 public Empresa(String nome_empresa, String cod_produto, String descricaoProduto, double qtdadeProduto, int qtdadeCliente) {
  this.nome_empresa = nome_empresa;
  this.cod_produto = cod_produto;
  this.descricaoProduto = descricaoProduto;
  this.qtdadeProduto = qtdadeProduto;
  this.qtdadeCliente = qtdadeCliente;
 }

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


}
