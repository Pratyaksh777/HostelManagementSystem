
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.Connection; 
import java.sql.DriverManager; 
import java.sql.SQLException; 
import java.util.Properties;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PRATYAKSH777
 */
public class login extends javax.swing.JFrame {














    Connection con=null;
    PreparedStatement pst =null;
        PreparedStatement pst1 =null;
    ResultSet rs=null;
     ResultSet rs1=null;

    /**
     * Creates new form login
     */
    public login() {
        initComponents();
        setSize(1000,730);
        setTitle("VIT HOSTEL MANAGEMENT SYSTEM");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        T1 = new javax.swing.JTextField();
        L2 = new javax.swing.JLabel();
        L1 = new javax.swing.JLabel();
        C1 = new javax.swing.JCheckBox();
        C2 = new javax.swing.JCheckBox();
        B1 = new javax.swing.JButton();
        B2 = new javax.swing.JButton();
        T2 = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        T1.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        T1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T1ActionPerformed(evt);
            }
        });
        getContentPane().add(T1);
        T1.setBounds(480, 330, 180, 36);

        L2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        L2.setForeground(new java.awt.Color(0, 0, 204));
        L2.setText("Enter Password");
        getContentPane().add(L2);
        L2.setBounds(280, 390, 220, 40);

        L1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        L1.setForeground(new java.awt.Color(0, 0, 204));
        L1.setText("Enter ID");
        getContentPane().add(L1);
        L1.setBounds(320, 330, 190, 40);

        C1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        C1.setForeground(new java.awt.Color(255, 0, 0));
        C1.setText("Warden");
        C1.setBorderPaintedFlat(true);
        C1.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        C1.setOpaque(false);
        C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C1ActionPerformed(evt);
            }
        });
        getContentPane().add(C1);
        C1.setBounds(320, 510, 130, 37);

        C2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        C2.setForeground(new java.awt.Color(255, 0, 51));
        C2.setText("Student");
        C2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        C2.setOpaque(false);
        C2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C2ActionPerformed(evt);
            }
        });
        getContentPane().add(C2);
        C2.setBounds(560, 510, 180, 33);

        B1.setBackground(new java.awt.Color(255, 255, 255));
        B1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        B1.setForeground(new java.awt.Color(54, 105, 52));
        B1.setText("LOGIN");
        B1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        B1.setContentAreaFilled(false);
        B1.setFocusPainted(false);
        B1.setFocusable(false);
        B1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B1ActionPerformed(evt);
            }
        });
        getContentPane().add(B1);
        B1.setBounds(170, 640, 180, 43);

        B2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        B2.setForeground(new java.awt.Color(255, 51, 0));
        B2.setText("CLOSE");
        B2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        B2.setContentAreaFilled(false);
        B2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        B2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B2ActionPerformed(evt);
            }
        });
        getContentPane().add(B2);
        B2.setBounds(650, 640, 180, 43);

        T2.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        T2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T2ActionPerformed(evt);
            }
        });
        getContentPane().add(T2);
        T2.setBounds(480, 390, 180, 35);

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 255, 255));
        jLabel4.setText("IN CASE OF PASSWORD ERROR CONTACT-7000015153");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(260, 450, 460, 55);

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 255, 255));
        jLabel1.setText("VIT HOSTEL MANAGEMENT SYSTEM");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(190, 210, 700, 55);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\PRATYAKSH777\\Downloads\\download11.png")); // NOI18N
        jLabel2.setOpaque(true);
        jLabel2.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(320, 30, 360, 167);

        jLabel3.setForeground(new java.awt.Color(0, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\PRATYAKSH777\\Downloads\\vit1-1.jpg")); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(-450, -10, 1620, 720);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void B1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B1ActionPerformed

        try
        {
                    String query="SELECT *FROM login WHERE adminid=? and adminpassword=?";
        String query1="SELECT *FROM admin WHERE sid=? and spassword=?";
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","mysql");
        pst = con.prepareStatement(query);
        pst.setString(1,T1.getText());
        pst.setString(2,T2.getText());
        rs=pst.executeQuery();
                pst1 = con.prepareStatement(query1);
        pst1.setString(1,T1.getText());
        pst1.setString(2,T2.getText());
        rs1=pst1.executeQuery();
        if(rs.next())
        {if(C1.isSelected()&& !C2.isSelected())
        {  wardern obj=new wardern();
           obj.setVisible(true);
           dispose();}
         else
         {JOptionPane.showMessageDialog(login.this, "Sorry, Username or Password Error RETRY!!!","Login Error!", JOptionPane.ERROR_MESSAGE);
				T1.setText("");
				T2.setText("");
         C1.setSelected(false);
         C2.setSelected(false);
         
         }
        }
        else if(rs1.next())
            {if(C2.isSelected() && !C1.isSelected())
        {  
                String msg=T1.getText();
               new student(msg).setVisible(true);
          dispose();}
             else
         {JOptionPane.showMessageDialog(login.this, "Sorry, Username or Password Error RETRY!!!","Login Error!", JOptionPane.ERROR_MESSAGE);
				T1.setText("");
				T2.setText("");
            C1.setSelected(false);
         C2.setSelected(false);
         }
        }
            
                
        else
         {JOptionPane.showMessageDialog(login.this, "Sorry, Username or Password or select checkbox Error RETRY!!!","Login Error!", JOptionPane.ERROR_MESSAGE);
				T1.setText("");
				T2.setText("");
                                           C1.setSelected(false);
         C2.setSelected(false);
         
         }
        
        } catch (SQLException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }
  
       String msg=T1.getText();
       
       
     
    }//GEN-LAST:event_B1ActionPerformed

    private void T1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T1ActionPerformed
      //  String msg=T1.getText();
        
    }//GEN-LAST:event_T1ActionPerformed

    private void C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_C1ActionPerformed

    private void C2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_C2ActionPerformed

    private void B2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B2ActionPerformed
        dispose();
    }//GEN-LAST:event_B2ActionPerformed

    private void T2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_T2ActionPerformed

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B1;
    private javax.swing.JButton B2;
    private javax.swing.JCheckBox C1;
    private javax.swing.JCheckBox C2;
    private javax.swing.JLabel L1;
    private javax.swing.JLabel L2;
    private javax.swing.JTextField T1;
    private javax.swing.JPasswordField T2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables

    private void showMessageDialog(String invalid_user, String inane_warning, int ERROR_MESSAGE) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void elif(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
