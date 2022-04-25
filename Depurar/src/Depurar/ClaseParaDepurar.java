package Depurar;

import java.util.ArrayList;
public class ClaseParaDepurar {
    private double suma;
    private ArrayList<Double> lista;
    public ClaseParaDepurar() {
        System.out.println("construyendo clase");
    }
    public double echaCuentas() {
        lista = new ArrayList<Double>();
        for (int i = 0; i<100;i++){
            lista.add((double)i);
        }
        suma = 0.0; // linea 19
        for (Double valor : lista){
            suma +=valor;
        }
        return suma;
    }
public static void main(String[] args){
ClaseParaDepurar cpd=new ClaseParaDepurar();
double total=cpd.echaCuentas();
System.out.println("Total cuentas: "+ total);

}
}

