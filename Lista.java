public class Lista {
    private Nodo nodos;
    private int numero;
    public Lista(){
        nodos = null;
        numero = 0;
    }

    public void agregar(int n){
        Nodo nuevo = new Nodo(n);
        if(nodos==null){
            nodos = nuevo;
        }else{
            Nodo aux = nodos;
            while (aux.getSiguiente()!=null){
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
            
        }
    }
    
    public void eliminar(){
        if(nodos==null){
            System.out.println("No hay elementos");
        }else if(nodos.getSiguiente() == null){
            nodos = null;
        }
        else{
            Nodo aux = nodos;
            while (aux.getSiguiente().getSiguiente()!=null){
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(null);
            
        }

    }

    public void buscar(int n){
        int contador=0;
        boolean encontrado=false;
        if(nodos==null){
            System.out.println("No hay elementos");
        }else{
            Nodo aux = nodos;
            while (aux!=null){
                
                contador++;
                if(aux.getNumero()==n){
                    System.out.println("Se encontró el número "+ n + " en la posición "+contador);
                    encontrado=true;
                }
                aux = aux.getSiguiente();
            }
            if(!encontrado){
                System.out.println("No se encontró el número en la lista");
            }
        }
        
    }

    public void mostrar(){
        if(nodos==null){
            System.out.println("No hay elementos");
        }else{
            Nodo aux = nodos;
            while (aux!=null){
                System.out.print(aux.getNumero()+" ");
                aux = aux.getSiguiente();
            }
        }
        System.out.println();
    }
}