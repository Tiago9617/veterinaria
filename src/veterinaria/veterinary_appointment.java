/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veterinaria;

/**
 *
 * @author SantiagoRojasColunge
 */
public class veterinary_appointment extends javax.swing.JFrame {

    /**
     * Creates new form veterinary_appointment
     */
    public veterinary_appointment() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelUserName = new javax.swing.JLabel();
        jLabelPetName = new javax.swing.JLabel();
        jComboBoxtreatments = new javax.swing.JComboBox<>();
        jLabeltreatmentsinfo = new javax.swing.JLabel();
        BTNGenerateInvoice = new javax.swing.JButton();
        BTNSeeAppointment = new javax.swing.JButton();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(480, 480));
        getContentPane().setLayout(null);

        jLabelUserName.setText("Nombre de usuario: ");
        getContentPane().add(jLabelUserName);
        jLabelUserName.setBounds(40, 10, 273, 16);

        jLabelPetName.setText("Nombre de la Mascota:");
        getContentPane().add(jLabelPetName);
        jLabelPetName.setBounds(40, 40, 273, 16);

        jComboBoxtreatments.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jComboBoxtreatments);
        jComboBoxtreatments.setBounds(40, 70, 285, 26);

        jLabeltreatmentsinfo.setText("jLabeltreatmentsinfo");
        getContentPane().add(jLabeltreatmentsinfo);
        jLabeltreatmentsinfo.setBounds(40, 120, 201, 154);

        BTNGenerateInvoice.setText("Programar y Generar factura");
        getContentPane().add(BTNGenerateInvoice);
        BTNGenerateInvoice.setBounds(40, 340, 194, 32);

        BTNSeeAppointment.setText("Ver citas programadas");
        getContentPane().add(BTNSeeAppointment);
        BTNSeeAppointment.setBounds(250, 340, 161, 32);
        getContentPane().add(jDateChooser2);
        jDateChooser2.setBounds(40, 290, 285, 29);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Login_wall.jpg"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(480, 480));
        jLabel1.setMinimumSize(new java.awt.Dimension(480, 480));
        jLabel1.setPreferredSize(new java.awt.Dimension(480, 480));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 480, 480);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(veterinary_appointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(veterinary_appointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(veterinary_appointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(veterinary_appointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new veterinary_appointment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNGenerateInvoice;
    private javax.swing.JButton BTNSeeAppointment;
    private javax.swing.JComboBox<String> jComboBoxtreatments;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelPetName;
    private javax.swing.JLabel jLabelUserName;
    private javax.swing.JLabel jLabeltreatmentsinfo;
    // End of variables declaration//GEN-END:variables
}
