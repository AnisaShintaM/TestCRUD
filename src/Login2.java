
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Login2 extends javax.swing.JFrame {

    /**
     * Creates new form Login2
     */
    public Login2() {
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

        jLabel2 = new javax.swing.JLabel();
        txtnama = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtpass = new javax.swing.JTextField();
        up = new javax.swing.JButton();
        ex = new javax.swing.JButton();
        in = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel2.setText("Username");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(180, 40, 70, 30);

        txtnama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnamaActionPerformed(evt);
            }
        });
        getContentPane().add(txtnama);
        txtnama.setBounds(110, 70, 200, 30);

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel1.setText("Password");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(180, 120, 61, 30);

        txtpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpassActionPerformed(evt);
            }
        });
        getContentPane().add(txtpass);
        txtpass.setBounds(110, 150, 200, 30);

        up.setBackground(new java.awt.Color(102, 255, 153));
        up.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        up.setText("Sign Up");
        up.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upActionPerformed(evt);
            }
        });
        getContentPane().add(up);
        up.setBounds(60, 200, 80, 30);

        ex.setBackground(new java.awt.Color(255, 102, 102));
        ex.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        ex.setText("Exit");
        ex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exActionPerformed(evt);
            }
        });
        getContentPane().add(ex);
        ex.setBounds(160, 200, 80, 30);

        in.setBackground(new java.awt.Color(153, 153, 255));
        in.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        in.setText("Sign In");
        in.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inActionPerformed(evt);
            }
        });
        getContentPane().add(in);
        in.setBounds(260, 200, 90, 30);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/aaa.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 250, 400, 100);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ok.JPG"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 40, 90, 80);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ok.JPG"))); // NOI18N
        jLabel5.setText("jLabel3");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 10, 90, 80);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ok.JPG"))); // NOI18N
        jLabel6.setText("jLabel3");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(140, 100, 90, 80);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ok.JPG"))); // NOI18N
        jLabel7.setText("jLabel3");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(310, 0, 90, 80);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ok.JPG"))); // NOI18N
        jLabel8.setText("jLabel3");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(20, 70, 90, 80);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ok.JPG"))); // NOI18N
        jLabel9.setText("jLabel3");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(310, 190, 90, 80);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ok.JPG"))); // NOI18N
        jLabel10.setText("jLabel3");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(240, 190, 90, 80);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ok.JPG"))); // NOI18N
        jLabel11.setText("jLabel3");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(310, 110, 90, 80);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ok.JPG"))); // NOI18N
        jLabel12.setText("jLabel3");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(310, 60, 90, 80);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ok.JPG"))); // NOI18N
        jLabel13.setText("jLabel3");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(220, 70, 90, 80);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ok.JPG"))); // NOI18N
        jLabel14.setText("jLabel3");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(110, 70, 90, 80);

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ok.JPG"))); // NOI18N
        jLabel15.setText("jLabel3");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(20, 70, 90, 80);

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ok.JPG"))); // NOI18N
        jLabel16.setText("jLabel3");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(0, 100, 90, 80);

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ok.JPG"))); // NOI18N
        jLabel17.setText("jLabel3");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(250, 180, 90, 80);

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ok.JPG"))); // NOI18N
        jLabel18.setText("jLabel3");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(80, 160, 90, 80);

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ok.JPG"))); // NOI18N
        jLabel19.setText("jLabel3");
        getContentPane().add(jLabel19);
        jLabel19.setBounds(170, 150, 90, 80);

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ok.JPG"))); // NOI18N
        jLabel20.setText("jLabel3");
        getContentPane().add(jLabel20);
        jLabel20.setBounds(230, 150, 90, 80);

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ok.JPG"))); // NOI18N
        jLabel21.setText("jLabel3");
        getContentPane().add(jLabel21);
        jLabel21.setBounds(70, 90, 90, 80);

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ok.JPG"))); // NOI18N
        jLabel22.setText("jLabel3");
        getContentPane().add(jLabel22);
        jLabel22.setBounds(140, 100, 90, 80);

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ok.JPG"))); // NOI18N
        jLabel23.setText("jLabel3");
        getContentPane().add(jLabel23);
        jLabel23.setBounds(0, 160, 90, 80);

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ok.JPG"))); // NOI18N
        jLabel24.setText("jLabel3");
        getContentPane().add(jLabel24);
        jLabel24.setBounds(0, 180, 90, 80);

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ok.JPG"))); // NOI18N
        jLabel25.setText("jLabel3");
        getContentPane().add(jLabel25);
        jLabel25.setBounds(70, 180, 90, 80);

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ok.JPG"))); // NOI18N
        jLabel26.setText("jLabel3");
        getContentPane().add(jLabel26);
        jLabel26.setBounds(130, 180, 90, 80);

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ok.JPG"))); // NOI18N
        jLabel27.setText("jLabel3");
        getContentPane().add(jLabel27);
        jLabel27.setBounds(200, 180, 90, 80);

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ok.JPG"))); // NOI18N
        jLabel28.setText("jLabel3");
        getContentPane().add(jLabel28);
        jLabel28.setBounds(250, 180, 90, 80);

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ok.JPG"))); // NOI18N
        jLabel29.setText("jLabel3");
        getContentPane().add(jLabel29);
        jLabel29.setBounds(250, 180, 90, 80);

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ok.JPG"))); // NOI18N
        jLabel30.setText("jLabel3");
        getContentPane().add(jLabel30);
        jLabel30.setBounds(150, 0, 90, 80);

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ok.JPG"))); // NOI18N
        jLabel31.setText("jLabel3");
        getContentPane().add(jLabel31);
        jLabel31.setBounds(90, 0, 90, 80);

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ok.JPG"))); // NOI18N
        jLabel32.setText("jLabel3");
        getContentPane().add(jLabel32);
        jLabel32.setBounds(30, 0, 90, 80);

        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ok.JPG"))); // NOI18N
        jLabel33.setText("jLabel3");
        getContentPane().add(jLabel33);
        jLabel33.setBounds(0, 0, 90, 80);

        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ok.JPG"))); // NOI18N
        jLabel34.setText("jLabel3");
        getContentPane().add(jLabel34);
        jLabel34.setBounds(200, 0, 90, 80);

        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ok.JPG"))); // NOI18N
        jLabel35.setText("jLabel3");
        getContentPane().add(jLabel35);
        jLabel35.setBounds(250, 0, 90, 80);

        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ok.JPG"))); // NOI18N
        jLabel36.setText("jLabel3");
        getContentPane().add(jLabel36);
        jLabel36.setBounds(250, 0, 90, 80);

        setBounds(0, 0, 415, 391);
    }// </editor-fold>//GEN-END:initComponents

    private void txtnamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnamaActionPerformed

    private void txtpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpassActionPerformed

    private void upActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upActionPerformed
        String username = txtnama.getText();
        String password = txtpass.getText();

        try {
            try(Statement statement = (Statement) file_koneksi.GetConnection().createStatement()) {
                statement.executeUpdate("insert into tb_akun(username,password) VALUES ('"+username+"','"+password+"');");
            }
            JOptionPane.showMessageDialog(null,"Selamat! Anda berhasil Sign Up!");
        }
        catch (Exception t) {
            JOptionPane.showMessageDialog(null,"Mohon Maaf, Ulangi lagi prosedurnya!");
        }
    }//GEN-LAST:event_upActionPerformed

    private void exActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exActionPerformed
        dispose();
    }//GEN-LAST:event_exActionPerformed

    private void inActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inActionPerformed
        Connection connection;
        PreparedStatement ps;
        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_testkoneksi?zeroDateTimeBehavior=convertToNull", "root", "");
            ps = connection.prepareStatement("SELECT `username`, `password` FROM `tb_akun` WHERE `username` = ? AND `password` = ?");
            ps.setString(1, txtnama.getText());
            ps.setString(2, txtpass.getText());
            ResultSet result = ps.executeQuery();
            if(result.next()){
                new frmMain().show(); 
                this.dispose();
            }
            else {
                JOptionPane.showMessageDialog(rootPane, "Salah!");
                txtpass.setText("");
                txtnama.requestFocus();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "gagal");
        }
    }//GEN-LAST:event_inActionPerformed

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
            java.util.logging.Logger.getLogger(Login2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ex;
    private javax.swing.JButton in;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtnama;
    private javax.swing.JTextField txtpass;
    private javax.swing.JButton up;
    // End of variables declaration//GEN-END:variables
}
