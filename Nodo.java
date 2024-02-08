public class Nodo {
    private int numero;
    private Nodo siguiente;

    public Nodo(int numero, Nodo siguiente){
        this.numero = numero;
        this.siguiente = null;
    }

    public int getNumero(){
        return numero;
    }

    public void setNumero(int n){
        this.numero = n;
    }

    public int getSiguiente(){
        return numero;
    }

    public void setSiguiente(Nodo siguiente){
        this.siguiente = siguiente;
    }
}
