
package com.ListaDobleE;


public class NodoLD <Type>{
    private Type data;
    private NodoLD nodePrevious;
    private NodoLD nodeNext;
    
    public NodoLD(){
        this.data = data;
        this.nodeNext = null;
        this.nodePrevious = null;
    
    }
    public void NodoLD(Type data){
        this.data = data;
        this.nodeNext = null;
        this.nodePrevious = null;
    
    }

    public Type getData() {
        return data;
    }

    public void setData(Type data) {
        this.data = data;
    }

    public NodoLD getNodePrevious() {
        return nodePrevious;
    }

    public void setNodePrevious(NodoLD nodePrevious) {
        this.nodePrevious = nodePrevious;
    }

    public NodoLD getNodeNext() {
        return nodeNext;
    }

    public void setNodeNext(NodoLD nodeNext) {
        this.nodeNext = nodeNext;
    }
    
}
