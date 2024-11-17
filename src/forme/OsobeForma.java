/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package forme;
import controller.Controller;
import model.*;
import java.util.List;

/**
 *
 * @author Korisnik
 */
public class OsobeForma extends javax.swing.JFrame {

    /**
     * Creates new form OsobeForma
     */
    public OsobeForma() {
        initComponents();
        popuniComboBox();
        popuniTabelu();
        jCheckBoxSvira.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBoxOsoba = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jComboBoxInstrument = new javax.swing.JComboBox<>();
        jCheckBoxSvira = new javax.swing.JCheckBox();
        jButtonObrisi = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jComboBoxOsoba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxOsobaActionPerformed(evt);
            }
        });

        jLabel1.setText("Osoba");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel2.setText("Instrument");

        jComboBoxInstrument.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxInstrumentActionPerformed(evt);
            }
        });

        jCheckBoxSvira.setText("Svira");
        jCheckBoxSvira.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxSviraActionPerformed(evt);
            }
        });

        jButtonObrisi.setText("Obrisi");
        jButtonObrisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonObrisiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jComboBoxOsoba, 0, 137, Short.MAX_VALUE)
                    .addComponent(jComboBoxInstrument, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBoxSvira, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButtonObrisi)
                        .addGap(134, 134, 134))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxOsoba, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBoxInstrument, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBoxSvira))
                .addGap(18, 18, 18)
                .addComponent(jButtonObrisi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxOsobaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxOsobaActionPerformed
      
        Osoba o=(Osoba) jComboBoxOsoba.getSelectedItem();
        ModelTabeleSvira mts=new ModelTabeleSvira(Controller.getInstance().vratiSviraPremaOsobi(o));
        jTable1.setModel(mts);
        
    }//GEN-LAST:event_jComboBoxOsobaActionPerformed

    private void jCheckBoxSviraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxSviraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxSviraActionPerformed

    private void jComboBoxInstrumentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxInstrumentActionPerformed
       
        Instrument i=(Instrument) jComboBoxInstrument.getSelectedItem();
        Osoba o=(Osoba) jComboBoxOsoba.getSelectedItem();
        
        boolean svira=Controller.getInstance().daLiSvira(o,i);
        if(svira){
            jCheckBoxSvira.setSelected(true);
        }else{
            jCheckBoxSvira.setSelected(false);
        }
    }//GEN-LAST:event_jComboBoxInstrumentActionPerformed

    private void jButtonObrisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonObrisiActionPerformed
        Instrument i=(Instrument) jComboBoxInstrument.getSelectedItem();
        BrisanjeForma bf=new BrisanjeForma(i);
        bf.setVisible(true);
        
        
        
    }//GEN-LAST:event_jButtonObrisiActionPerformed

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
            java.util.logging.Logger.getLogger(OsobeForma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OsobeForma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OsobeForma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OsobeForma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OsobeForma().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonObrisi;
    private javax.swing.JCheckBox jCheckBoxSvira;
    private javax.swing.JComboBox<Instrument> jComboBoxInstrument;
    private javax.swing.JComboBox<Osoba> jComboBoxOsoba;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    private void popuniComboBox() {
        List<Osoba> lista=Controller.getInstance().vratiOsobe();
        for(Osoba o:lista){
            jComboBoxOsoba.addItem(o);
        }
        jComboBoxOsoba.setSelectedItem(lista.get(0));
        
        List<Instrument> inst=Controller.getInstance().vratiInstrumente();
        for(Instrument i:inst){
            jComboBoxInstrument.addItem(i);
        }
        jComboBoxInstrument.setSelectedItem(inst.get(0));
        
    }

    private void popuniTabelu() {
        
        Osoba o=(Osoba) jComboBoxOsoba.getSelectedItem();
        List<Svira> lista=Controller.getInstance().vratiSviraPremaOsobi(o);
        
        ModelTabeleSvira mts=new ModelTabeleSvira(lista);
        jTable1.setModel(mts);
    }
}
