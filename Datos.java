package Calculadora;

public class Datos {
    private float dato1;
    private float dato2;

    public float getDato1() {
        return dato1;
    }

    public void setDato1(float dato1) {
        this.dato1 = dato1;
    }

    public float getDato2() {
        return dato2;
    }

    public void setDato2(float dato2) {
        this.dato2 = dato2;
    }
    
    public float suma(){
        return dato1 + dato2;
    }
    
    public float resta(){
        return dato1 - dato2;
    }
    
    public float multiplicacion(){
        return dato1 * dato2;
    }
    
    public float division(){
        return dato1 / dato2;
    }
}