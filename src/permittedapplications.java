
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PRATYAKSH777
 */
public class permittedapplications extends javax.swing.JFrame {
 Connection con=null;
    PreparedStatement pst =null;
    ResultSet rs=null;
    /**
     * Creates new form permittedapplications
     */
    public permittedapplications() {
        initComponents();
        showuser();
         setSize(1000,730);
        setTitle("CHECK PERMITTED APLLICATIONS");
    }
     public ArrayList<User1> userList() 
    {ArrayList<User1> usersList1=new ArrayList<>();
     try
        {String a="A";
            Class.forName("com.mysql.jdbc.Driver");
        con =DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","mysql");
       String query="SELECT * FROM application WHERE applications='"+a+"'";
       Statement st=con.createStatement();
       ResultSet rs=st.executeQuery(query);
       User1 user1;
       while(rs.next())
       {user1=new User1(rs.getString("applicationno"),rs.getString("sid"),rs.getString("application"),rs.getString("datein"),rs.getString("dateout"),rs.getString("applications"));
         usersList1.add(user1);  
       }
        }
 
    
         catch (ClassNotFoundException ex) {
            Logger.getLogger(complainchecking.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
         Logger.getLogger(complainchecking.class.getName()).log(Level.SEVERE, null, ex);
     }
     return usersList1;
    }
    public void showuser() 
    {ArrayList<User1> list= userList();
    DefaultTableModel model= (DefaultTableModel)jTable1.getModel();
    Object[] row=new Object[6];
    for(int i=0;i<list.size();i++)
    {  row[0]=list.get(i).getapplicationno();
        row[1]=list.get(i).getsid();
    row[4]=list.get(i).getapplication();
    row[2]=list.get(i).getdatein();
    row[3]=list.get(i).getdateout();
    row[5]=list.get(i).getapplications();
    model.addRow(row);}
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jTable1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "APPLICATION NUMBER", "STUDENT ID", "APPLICATION", "DATE IN", "DATE OUT", " APPLICATION STATUS"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 50, 970, 540);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 51, 51));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/back1.png"))); // NOI18N
        jButton1.setText("BACK");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(400, 650, 137, 37);

        jLabel5.setForeground(new java.awt.Color(0, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\PRATYAKSH777\\Downloads\\vit1-1.jpg")); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(-450, -10, 1620, 720);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        wardern obj=new wardern();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(permittedapplications.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(permittedapplications.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(permittedapplications.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(permittedapplications.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new permittedapplications().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
