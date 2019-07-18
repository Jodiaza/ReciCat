/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import datos.Gato;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;

/**
 *
 * @author TOSHIBA
 */
public class PantallaAjustes extends javax.swing.JPanel {

    /**
     * Creates new form PantallaAjustes
     */
    public PantallaAjustes() {
        initComponents();
        ImageIcon atras = Pantalla.escalar(new ImageIcon("./src/img/atras.png").
                getImage(), 40, 40);
        ImageIcon musica = Pantalla.escalar(new ImageIcon("./src/img/musica.png").
                getImage(), 40, 40);
        ImageIcon sonido = Pantalla.escalar(new ImageIcon("./src/img/sonido.png").
                getImage(), 40, 40);
        
        btnAtras.setIcon(atras);
        lblMusica.setIcon(musica);
        lblSonido.setIcon(sonido);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAtras = new javax.swing.JButton();
        sldMusica = new javax.swing.JSlider();
        sldSonido = new javax.swing.JSlider();
        lblMusica = new javax.swing.JLabel();
        lblSonido = new javax.swing.JLabel();

        setBackground(new java.awt.Color(238, 255, 204));

        btnAtras.setBackground(new java.awt.Color(255, 186, 68));
        btnAtras.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        sldMusica.setBackground(new java.awt.Color(255, 211, 158));
        sldMusica.setForeground(new java.awt.Color(255, 162, 0));
        sldMusica.setOpaque(false);

        sldSonido.setForeground(new java.awt.Color(255, 211, 158));
        sldSonido.setOpaque(false);

        lblMusica.setBackground(new java.awt.Color(255, 203, 113));
        lblMusica.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMusica.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        lblMusica.setOpaque(true);

        lblSonido.setBackground(new java.awt.Color(255, 203, 113));
        lblSonido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSonido.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        lblSonido.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(lblMusica, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(sldMusica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(lblSonido, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(sldSonido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(139, 139, 139)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMusica, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(sldMusica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(90, 90, 90)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSonido, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(sldSonido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        retroceder();
    }//GEN-LAST:event_btnAtrasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JLabel lblMusica;
    private javax.swing.JLabel lblSonido;
    private javax.swing.JSlider sldMusica;
    private javax.swing.JSlider sldSonido;
    // End of variables declaration//GEN-END:variables

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
}