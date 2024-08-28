/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servidorudp;

import java.util.ArrayList;

/**
 *
 * @author matheus
 */
public class BasedeDados {
    private ArrayList lista = null;

    public BasedeDados() {
        lista = new ArrayList();
    }
    
    public void insere(String msg){
        lista.add(msg.trim());
    }
    
    public String le(){
        String s = "\n";
        int fim = lista.size();
        for(int pos = 0; pos<fim;pos++){
        s = s + "[" + (pos +1) + "] "+ (String) lista.get(pos) + "\n";
    }
        return s;
    }
    
    
}
