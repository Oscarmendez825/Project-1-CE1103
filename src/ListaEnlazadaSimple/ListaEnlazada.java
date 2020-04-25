
package ListaEnlazadaSimple;


public class ListaEnlazada<Type> {
    public Nodo first;
    public Nodo last;
    public int size = 0;
    
    public ListaEnlazada(){
        first = null;
        last = null; 
    }
    
    public boolean isEmpty() {
        if(first == null && last == null) {
            return true;
        } else 
            return false;
    }
    
    public void add(Type data) {
        Nodo nuevo = new Nodo();
        nuevo.data = data;
        if (isEmpty()){
            first = nuevo;
            first.next = null;
            last = first;
        }else{
            last.next = nuevo;
            nuevo.next = null;
            last = nuevo;
        
        }
        size++;
    }
    
    public boolean search(Type data){
        Nodo nodo;
        nodo = first;
        do{
            if (nodo.data.equals(data)){
                return true; 
            }
            nodo = nodo.next;
        }while(nodo != last);
        return false;
    }    

    public void cut(int pos){
        int cont = 0;
        Nodo aux = first;
        while (cont < pos-1){
            aux = aux.next;
            cont++;
        
        }
        aux.next = null;
        size = pos;
    
    }
    
    public void show(){
        Nodo c = first;
        for(int i = 0; i < size; i++){
            System.out.println(c.data);
            c = c.next;
        }
        
    }
    
    public void modify(int pos, Type data){
        if (isEmpty()){
            System.out.println("Error su lista está vacía");
            
        }else{
            if (pos == 0){
               first.data = data;
            
            }else{
                if(pos > 0 && pos < size){
                
                    Nodo aux = first;
                    int cont = 0;
                    while(true){
                        if (cont == pos){
                            aux.data = data;
                            break;
                        }else{
                        aux = aux.next;
                        cont++;
                        }
                    
                    }
                }else{
                    System.out.println("Error ingreso una posicion equivocada");
                }
                }
            }
    
    }
    
    public void remove(int pos) {
        Nodo temp = first;
        Nodo aux = null;
        if (pos == 0){
            first = first.next;
        
        }else{
            int cont = 0;
            while(true){
                if (cont == pos){
                    aux.next = temp.next;
                    break;
                    
                }else{
                    cont++;
                    aux = temp;
                    temp = temp.next;
                }
            
            }
        
        }
        size--;
    
    }
    
    public Type get(int pos) {
        int cont = 0;
        Nodo temp = first;
        while(cont < pos){
            temp = temp.next;
            cont++;
        }
            return (Type) temp.data;
        }
    


    public Type getCabeza() {
        return (Type) first.data;
    }
    
    public Type getCola() {
        return (Type) last.data;
    }

    public int getSize() {
        return size;
    }
    
}
