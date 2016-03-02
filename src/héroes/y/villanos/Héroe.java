package héroes.y.villanos;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Héroe extends Personaje{
   
    public Héroe(String nombre, ArrayList<String> poder, ArrayList<String> implemento, String frase){
        super(nombre, poder, implemento, frase);
    }

    
  @Override  
   public void usarPoder(String nombre, String poder){
       JOptionPane.showMessageDialog(null, nombre + " ha usado " + poder);
   }
  
   @Override
   public void equiparImplemento(String nombre, String implemento){
       JOptionPane.showMessageDialog(null, nombre+ " se ha equipado con "+ implemento + " y ahora está listo para la batalla y luchar por la justicia.");
   }
   
   @Override
   public void emplearFrase(String nombre, String frase){
       JOptionPane.showMessageDialog(null, nombre+ ": "+ frase);
   }

    @Override
    public String gritoCombate() {
        return "¡Todos van a estar a salvo!";
    }

    
}
