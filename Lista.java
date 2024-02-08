public class Lista {
    private Nodo primero;
    private int numero;
    public Lista(){
        primero = null;
        numero = 0;
    }

    public void agregar(){
        Nodo nuevo = new Nodo(numero,null);
        if(primero==null){
            primero = nuevo;
        }else{
            Nodo aux = primero;
            while (aux.getSiguiente()!=null){
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
            numElem++;
        }
    }
    
    public void eliminar(){

    }

    public void buscar(){

    }
}
