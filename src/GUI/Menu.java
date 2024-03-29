/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import datos.Gato;
import datos.Personaje;
import java.awt.BorderLayout;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author TOSHIBA
 */
public class Menu extends javax.swing.JPanel {

    /**
     * Creates new form NewJPanel
     */
    public Menu() {
        initComponents();
        ImageIcon atras = Pantalla.escalar(new ImageIcon("./src/img/atras.png").
                getImage(), 40, 40);
        ImageIcon casa = Pantalla.escalar(new ImageIcon("./src/img/casa.png").
                getImage(), 140, 140);
        ImageIcon informacion = Pantalla.escalar(new ImageIcon("./src/img/"
                + "informacion.png").getImage(), 140, 140);
        ImageIcon mapa = Pantalla.escalar(new ImageIcon("./src/img/mapa.png").
                getImage(), 140, 140);
        ImageIcon borrar = Pantalla.escalar(new ImageIcon("./src/img/borrar.png").
                getImage(), 140, 140);
        btnMapa.setIcon(mapa);
        btnCasa.setIcon(casa);
        btnInfo.setIcon(informacion);
        btnAtras.setIcon(atras);
        btnLimpiar.setIcon(borrar);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnMapa = new javax.swing.JButton();
        btnCasa = new javax.swing.JButton();
        btnInfo = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();

        setBackground(new java.awt.Color(238, 255, 204));

        btnMapa.setBackground(new java.awt.Color(255, 255, 255));
        btnMapa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btnMapa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMapaActionPerformed(evt);
            }
        });

        btnCasa.setBackground(new java.awt.Color(255, 255, 255));
        btnCasa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btnCasa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCasaActionPerformed(evt);
            }
        });

        btnInfo.setBackground(new java.awt.Color(255, 255, 255));
        btnInfo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btnInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoActionPerformed(evt);
            }
        });

        btnAtras.setBackground(new java.awt.Color(255, 186, 68));
        btnAtras.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        btnLimpiar.setBackground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(btnInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(btnMapa, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCasa, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(17, 17, 17))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnMapa, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCasa, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnInfo, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                .addContainerGap(127, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
       retroceder();
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnMapaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMapaActionPerformed
        PantallaMapa mapa = new PantallaMapa();
        mapa.setSize(370,620);
        mapa.setLocation(0,0);
        this.removeAll();
        add(mapa,BorderLayout.CENTER);    
        Fondo imagen = new Fondo(mapa,"mapaUN");
        mapa.add(imagen).repaint();
        revalidate();
        repaint();
    }//GEN-LAST:event_btnMapaActionPerformed

    private void btnCasaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCasaActionPerformed
        PantallaTutorialReciclaje tutorialReciclaje  = new PantallaTutorialReciclaje();
        tutorialReciclaje.setSize(370,620);
        tutorialReciclaje.setLocation(0,0);
        this.removeAll();
        add(tutorialReciclaje,BorderLayout.CENTER);    
        revalidate();
        repaint();
    }//GEN-LAST:event_btnCasaActionPerformed

    private void btnInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoActionPerformed
        PantallaInformacion informacion = new PantallaInformacion();
        informacion.setSize(370,620);
        informacion.setLocation(0,0);
        this.removeAll();
        add(informacion,BorderLayout.CENTER);    
        revalidate();
        repaint();
    }//GEN-LAST:event_btnInfoActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        int respuesta = JOptionPane.showConfirmDialog(this, "Estas seguro de que"
                + " quieres borrar todo tu progreso? No prodras recuperarlo "
                + "despues", "Borrar progreso", JOptionPane.YES_NO_OPTION);
        if(respuesta==JOptionPane.YES_OPTION){
            ArrayList<Boolean> colores = new ArrayList<>();
        for(int i=0;i<7;i++){
            colores.add(i,true);
        }
        colores.add(7,false);
        PantallaAccesorios.guardarBool(colores);
        Personaje.guardarDinero(0);
        Personaje.guardarHoja("HojaSpritesAzulT");
        Personaje.guardarSalud(50);
        retroceder();
        }else{
            
        }
        
    }//GEN-LAST:event_btnLimpiarActionPerformed
    
    public void retroceder(){
        Gato gato = new Gato();
        PantallaInicio pantallaInicio = new PantallaInicio(true,gato);
        pantallaInicio.getjPanel1().setSize(370,620);
        pantallaInicio.getjPanel1().setLocation(0, 0);
        removeAll();
        add(pantallaInicio.getjPanel1(),BorderLayout.CENTER);
        gato.getT().start();
        revalidate();
        repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnCasa;
    private javax.swing.JButton btnInfo;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnMapa;
    // End of variables declaration//GEN-END:variables

    public JButton getjButton1() {
        return btnMapa;
    }

    public void setjButton1(JButton jButton1) {
        this.btnMapa = jButton1;
    }

    public JButton getjButton2() {
        return btnCasa;
    }

    public void setjButton2(JButton jButton2) {
        this.btnCasa = jButton2;
    }

    public JButton getjButton3() {
        return btnInfo;
    }

    public void setjButton3(JButton jButton3) {
        this.btnInfo = jButton3;
    }
    

}
