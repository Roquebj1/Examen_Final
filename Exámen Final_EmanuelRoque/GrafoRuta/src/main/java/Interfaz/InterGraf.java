/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import GrafosPkg.Grafo;
import javax.swing.JComboBox;

/**
 *
 * @author linda
 */
public class InterGraf extends javax.swing.JFrame {
private final Grafo graf;
    
    
    /**
     * Creates new form InterGraf
     */
    public InterGraf() {
        graf= new Grafo("Jutiapa-AsuncionMita-Jalpatagua-ElProgreso-Moyuta-Quesada-Zapotitlan-Atescatempa-AguaBlanca-ElAdelanto-Comapa-SantaCatarinaMita-Conguaco-Yupiltepeque-Jerez-Pasaco-SanJoseAcatempa");
        initComponents();
        LlenarComboBox(INICIO);
        LlenarComboBox(FIN);
        CrearRutas();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jColorChooser1 = new javax.swing.JColorChooser();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        INICIO = new javax.swing.JComboBox<>();
        FIN = new javax.swing.JComboBox<>();
        LblResul = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(0, 102, 102));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(java.awt.Color.black);

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 0));
        jLabel3.setText("¿Deseas viajar?");
        jLabel3.setVerifyInputWhenFocusTarget(false);

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 0));
        jLabel4.setText("Te facilitamos la vida con este increíble programa que te muestra la ruta más corta entre municipios que debes tomar en tu punto de partida. ");

        jLabel1.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 0));
        jLabel1.setText("Punto de partida");

        jLabel2.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 153, 0));
        jLabel2.setText("Punto de llegada");

        INICIO.setBackground(new java.awt.Color(255, 102, 102));
        INICIO.setForeground(new java.awt.Color(0, 0, 102));
        INICIO.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        INICIO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                INICIOActionPerformed(evt);
            }
        });

        FIN.setBackground(new java.awt.Color(255, 102, 102));
        FIN.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        LblResul.setBackground(new java.awt.Color(153, 255, 51));
        LblResul.setFont(new java.awt.Font("Yu Gothic Light", 1, 14)); // NOI18N
        LblResul.setForeground(new java.awt.Color(255, 51, 51));
        LblResul.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblResul.setText("Acá se mostrará su ruta a seguir");

        jButton1.setBackground(new java.awt.Color(255, 102, 102));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("CALCULAR");
        jButton1.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addComponent(INICIO, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(300, 300, 300)
                        .addComponent(FIN, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(217, 217, 217)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(368, 368, 368)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(410, 410, 410)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(277, 277, 277)
                        .addComponent(LblResul, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(432, 432, 432)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(INICIO, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(FIN))
                .addGap(22, 22, 22)
                .addComponent(LblResul, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(72, 72, 72))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    String inicio = INICIO.getSelectedItem().toString().trim();
        String fin    = FIN.getSelectedItem().toString().trim();
        String respuesta = graf.encontrarRutaMinimaDijkstra(inicio, fin);
        LblResul.setText(respuesta);   
    }//GEN-LAST:event_jButton1ActionPerformed

    private void INICIOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_INICIOActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_INICIOActionPerformed

    private void LlenarComboBox(JComboBox combo){
        combo.removeAllItems();
         combo.addItem("Yupiltepeque");
        combo.addItem("Jerez");
        combo.addItem("Pasaco");
        combo.addItem("ElAdelanto");
        combo.addItem("SanJoseAcatempa");
        combo.addItem("Jutiapa");
        combo.addItem("AsuncionMita");
        combo.addItem("Comapa");
        combo.addItem("SantaCatarinaMita");
        combo.addItem("Conguaco");
        combo.addItem("Quesada");
        combo.addItem("Zapotitlan");
        combo.addItem("Atescatempa");
        combo.addItem("AguaBlanca");
        combo.addItem("Jalpatagua");
        combo.addItem("ElProgreso");
        combo.addItem("Moyuta");
    }
    
    private void CrearRutas(){
         graf.agregarRuta("Yupiltepeque","Jerez", 16);
        graf.agregarRuta("AsuncionMita","AguaBlanca", 28);
        graf.agregarRuta("AsuncionMita","SantaCatarinaMita", 17);
        graf.agregarRuta("AsuncionMita","Jutiapa",32);
        graf.agregarRuta("AsuncionMita","Yupiltepeque", 20);
        graf.agregarRuta("Jalpatagua","Comapa", 17);
        graf.agregarRuta("Jalpatagua","Conguaco", 21);
        graf.agregarRuta("Jalpatagua","Moyuta", 22);
        graf.agregarRuta("Yupiltepeque","ElAdelanto", 8);
        graf.agregarRuta("Yupiltepeque","Atescatempa", 15);
        graf.agregarRuta("Yupiltepeque","Zapotitlan", 10); 
        graf.agregarRuta("Jutiapa","ElAdelanto", 31);
        graf.agregarRuta("Jutiapa","Comapa", 43);
        graf.agregarRuta("Jutiapa","Jalpatagua", 41);
        graf.agregarRuta("Jutiapa","Quesada", 21);
        graf.agregarRuta("Quesada","SanJoseAcatempa", 21);
        graf.agregarRuta("SanJoseAcatempa","Jalpatagua", 35);
        graf.agregarRuta("Jalpatagua","Quesada", 25);
        graf.agregarRuta("AsuncionMita","Atescatempa", 30);
        graf.agregarRuta("AguaBlanca","SantaCatarinaMita", 17);
        graf.agregarRuta("SantaCatarinaMita","ElProgreso", 20);
        graf.agregarRuta("SantaCatarinaMita","Jutiapa", 45);
        graf.agregarRuta("Jutiapa","Yupiltepeque", 23);
        graf.agregarRuta("Jutiapa","ElProgreso", 15);
        graf.agregarRuta("Atescatempa","Jerez", 12); 
        graf.agregarRuta("Jerez","Zapotitlan", 18); 
        graf.agregarRuta("Zapotitlan","ElAdelanto", 5);
        graf.agregarRuta("Zapotitlan","Comapa", 74); 
        graf.agregarRuta("ElAdelanto","Comapa", 68); 
        graf.agregarRuta("Conguaco","Moyuta", 7); 
        graf.agregarRuta("Moyuta","Pasaco", 42);
                

        
        
    }
    /**Set
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*  the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(InterGraf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterGraf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterGraf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterGraf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterGraf().setVisible(true);
               
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> FIN;
    private javax.swing.JComboBox<String> INICIO;
    private javax.swing.JLabel LblResul;
    private javax.swing.JButton jButton1;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

}
