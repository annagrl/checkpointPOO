package Checkpoin2;

public class TipoDeGas implements Comparable<TipoDeGas>{
    //atributos da classe
    private String tipo_de_gas;
    private double kg_gas;

    // método construtor
    public TipoDeGas(String tipo_de_gas, double kg_gas) {
        this.tipo_de_gas = tipo_de_gas;
        this.kg_gas = kg_gas;
    }

    //getters e setters
    public String getTipo_de_gas() {
        return tipo_de_gas;
    }

    public void setTipo_de_gas(String tipo_de_gas) {
        this.tipo_de_gas = tipo_de_gas;
    }

    public double getKg_gas() {
        return kg_gas;
    }

    public void setKg_gas(double kg_gas) {
        this.kg_gas = kg_gas;
    }

    //Método
    public void qtdade_gas (){
        System.out.println(this.tipo_de_gas + " possui " + this.kg_gas + " quilos.");
    }

    //CompareTo

    @Override
    public int compareTo(TipoDeGas o) {
        if (this.kg_gas == o.kg_gas) return 0;
        else if (this.kg_gas > o.kg_gas) return 1;
        else return -1;
    }
}
