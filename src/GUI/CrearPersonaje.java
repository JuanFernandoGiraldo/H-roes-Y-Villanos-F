package GUI;

import java.util.ArrayList;
import héroes.y.villanos.*;
import javax.swing.JOptionPane;

public class CrearPersonaje extends javax.swing.JFrame {
    private ArrayList<Personaje> listaPersonajes;
    private ListaDePersonajes pList;
    
    
    public CrearPersonaje() {
        initComponents();
        listaPersonajes = new ArrayList<Personaje>();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tipo = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        poder = new javax.swing.JTextField();
        implemento = new javax.swing.JTextField();
        frase = new javax.swing.JTextField();
        agregar = new javax.swing.JButton();
        listaDePersonajes = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 153, 255));
        jLabel1.setText("Héroes Y Villanos");

        jLabel2.setForeground(new java.awt.Color(51, 153, 255));
        jLabel2.setText("Nombre");

        tipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecciona", "Héroe", "Villano" }));

        jLabel3.setForeground(new java.awt.Color(51, 153, 255));
        jLabel3.setText("Poderes");

        jLabel4.setForeground(new java.awt.Color(51, 153, 255));
        jLabel4.setText("Implementos");

        jLabel5.setForeground(new java.awt.Color(51, 153, 255));
        jLabel5.setText("Frase");

        nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreActionPerformed(evt);
            }
        });

        agregar.setText("Agregar");
        agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActionPerformed(evt);
            }
        });

        listaDePersonajes.setText("Lista de personajes");
        listaDePersonajes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaDePersonajesActionPerformed(evt);
            }
        });

        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel6.setText("(Para agregar más de un poder o un implemento, hacerlo seguido de un punto.");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel7.setText("Ej: Visión de Rayos X.Invisibilidad.Leer Mentes)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nombre)
                            .addComponent(poder)
                            .addComponent(implemento)
                            .addComponent(frase, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(agregar)
                        .addGap(18, 18, 18)
                        .addComponent(listaDePersonajes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(salir))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(95, 95, 95)))
                .addGap(40, 40, 40))
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(77, 77, 77))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(poder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(implemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(frase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(agregar)
                    .addComponent(listaDePersonajes)
                    .addComponent(salir))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreActionPerformed

    private void listaDePersonajesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaDePersonajesActionPerformed
        ListaDePersonajes abrir= new ListaDePersonajes(listaPersonajes, this);
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_listaDePersonajesActionPerformed

    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed
        ArrayList<String> listaPoderes = new ArrayList<String>();
        ArrayList<String> listaImplementos = new ArrayList<String>();
        String nombrePersonaje = nombre.getText();
        String poderPersonaje = poder.getText();
        String implementoPersonaje = implemento.getText();
        String frasePersonaje = frase.getText();
        int seleccion = tipo.getSelectedIndex();        
        int j = 0;
        //crea la lista de poderes
        for(int i = 0; i < poderPersonaje.length(); i++){
            String nombrePoder;
            String caracter = poderPersonaje.substring(i, i+1);
            if(caracter.equals(".")){
                nombrePoder = poderPersonaje.substring(j,i);
                j = i + 1;
                listaPoderes.add(nombrePoder);
            }   
            if(i == poderPersonaje.length() - 1){
                nombrePoder = poderPersonaje.substring(j, i + 1);
                listaPoderes.add(nombrePoder);
            }            
        }
        j = 0;
        
        //crea la lista de implementos
        for(int i = 0; i < implementoPersonaje.length(); i++){
            String caracter = implementoPersonaje.substring(i, i+1);
            String nombreImplemento;
            if(caracter.equals(".")){
                nombreImplemento = implementoPersonaje.substring(j,i);
                j = i + 1;
                listaImplementos.add(nombreImplemento);
            }   
            if(i == poderPersonaje.length() - 1){
                nombreImplemento = implementoPersonaje.substring(j, i + 1);
                listaImplementos.add(nombreImplemento);
            }            
        }
        
        Personaje personaje;
        if(seleccion == 0){
            JOptionPane.showMessageDialog(null, "Por favor seleccionar el tipo de personaje", "Validación", JOptionPane.INFORMATION_MESSAGE);
        }
        if(seleccion == 1){
            personaje = new Héroe(nombrePersonaje, listaPoderes, listaImplementos, frasePersonaje);            
            listaPersonajes.add(personaje);            
            JOptionPane.showMessageDialog(null, "El personaje ha sido agregado con éxito.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        }
        if(seleccion == 2){
            personaje = new Villano(nombrePersonaje, listaPoderes, listaImplementos, frasePersonaje);            
            listaPersonajes.add(personaje);
            JOptionPane.showMessageDialog(null, "El personaje ha sido agregado con éxito.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        }  

        nombre.setText("");
        poder.setText("");
        implemento.setText("");
        frase.setText("");
        
    }//GEN-LAST:event_agregarActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        System.exit(1);
    }//GEN-LAST:event_salirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CrearPersonaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrearPersonaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrearPersonaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearPersonaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrearPersonaje().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregar;
    private javax.swing.JTextField frase;
    private javax.swing.JTextField implemento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton listaDePersonajes;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField poder;
    private javax.swing.JButton salir;
    private javax.swing.JComboBox tipo;
    // End of variables declaration//GEN-END:variables
}
