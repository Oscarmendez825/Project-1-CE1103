
package com.ListaCircularDoblementeEnlazada;

public class NodeC <Type>{
    private Type data;
    private NodeC Nodenext;
    private NodeC Nodeprevious;
    
    public NodeC(){
        Nodenext = null;
        Nodeprevious = null;
        
    }
    public NodeC(Type data) {
        this.data = data;
        this.Nodenext = null;
        this.Nodeprevious = null;
    }
    public Type getData() {
        return data;
    }


    
    public void setData(Type data) {
        this.data = data;
    }

    public NodeC getNodenext() {
        return Nodenext;
    }

    public void setNodenext(NodeC Nodenext) {
        this.Nodenext = Nodenext;
    }

    public NodeC getNodeprevious() {
        return Nodeprevious;
    }

    public void setNodeprevious(NodeC Nodeprevious) {
        this.Nodeprevious = Nodeprevious;
    }
    

}
