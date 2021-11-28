package Checkpoin2;

public class TipoDeGas {
    private String tipo_de_gas;
    private double kg_gas;

    public TipoDeGas(String tipo_de_gas, double kg_gas) {
        this.tipo_de_gas = tipo_de_gas;
        this.kg_gas = kg_gas;
    }

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

    public void qtdade_gas (){
        System.out.println(this.tipo_de_gas + " possui " + this.kg_gas + " quilos.");
    }
}
