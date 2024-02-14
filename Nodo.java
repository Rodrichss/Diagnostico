public class Nodo {
    private int numero;
    private Nodo siguiente;

    public Nodo(int numero){
        this.numero = numero;
        this.siguiente = null;
    }

    public int getNumero(){
        return numero;
    }

    public void setNumero(int n){
        this.numero = n;
    }

    public Nodo getSiguiente(){
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente){
        this.siguiente = siguiente;
    }
}