package héroes.y.villanos;

import java.util.ArrayList;


public abstract class Personaje implements ComicsHyV {
    
   protected String nombre;
   protected ArrayList<String> poder;
   protected ArrayList<String> implemento;
   protected String frase;
   
    public Personaje(String nombre, ArrayList<String> listaPoderes, ArrayList<String> listaImplementos, String frase){
        setNombre(nombre);
        setPoder(listaPoderes);
        setImplemento(listaImplementos);
        setFrase(frase);        
    }
   
    private void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public ArrayList<String> getPoder() {
        return poder;
    }
    
    private void setPoder(ArrayList<String> poder) {
        this.poder = poder;
    }
    
    public ArrayList<String> getImplemento() {
        return implemento;
    }
    
    private void setImplemento(ArrayList<String> implemento) {
        this.implemento = implemento;
    }
    
    public String getFrase() {
        return frase;
    }
    
    private void setFrase(String frase) {
        this.frase = frase;
    }
    
    public abstract String gritoCombate();
}
