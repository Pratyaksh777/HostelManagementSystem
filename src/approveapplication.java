

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PRATYAKSH777
 */
public class approveapplication extends javax.swing.JFrame {
 Connection con=null;
    PreparedStatement pst =null;
    ResultSet rs=null;
    public String X;
    /**
     * Creates new form approveapplication
     */
    public approveapplication() {
        initComponents();
        showuser();
        setSize(1000,775);
        setTitle("STUDENT APPLICATION CHECKING");
    }
    public ArrayList<User2> userList2() 
    {ArrayList<User2> usersList2=new ArrayList<>();
     try
        {Class.forName("com.mysql.jdbc.Driver");
        String c="W";
        con =DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","mysql");
       String query="SELECT * FROM application WHERE applications='"+c+"'";
       Statement st=con.createStatement();
       ResultSet rs=st.executeQuery(query);
       User2 user2;
       while(rs.next())
       {user2=new User2(rs.getString("applicationno"), rs.getString("sid"),rs.getString("application"),rs.getString("datein"),rs.getString("dateout"),rs.getString("applications"));
         usersList2.add(user2);  
       }
        }
 
    
         catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(complainchecking.class.getName()).log(Level.SEVERE, null, ex);
        }
     return usersList2;
    }
    public void showuser() 
    {ArrayList<User2> list1= userList2();
    DefaultTableModel model= (DefaultTableModel)jTable1.getModel();
    Object[] row=new Object[6];
    for(int i=0;i<list1.size();i++)
    {row[0]=list1.get(i).getapplicationno();
        row[1]=list1.get(i).getsid();
    row[4]=list1.get(i).getapplication();
     row[2]=list1.get(i).getdatein();
      row[3]=list1.get(i).getdateout();
    row[5]=list1.get(i).getapplications();
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

        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 255, 255));
        jLabel3.setText("APPLICATION OF STUDENT");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(180, 180, 340, 29);

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Mongolian Baiti", 1, 18)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 220, 939, 240);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 255, 0));
        jButton1.setText("SUBMIT");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(220, 680, 115, 33);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(51, 51, 51));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/back1.png"))); // NOI18N
        jButton3.setText("BACK");
        jButton3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.setContentAreaFilled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(660, 687, 120, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 255, 255));
        jLabel4.setText("Approval   Status");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(360, 590, 160, 30);

        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "W", "A", "D" }));
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(550, 590, 52, 30);

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Application Number", "Student ID", "Application", "Date IN", "Date OUT", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(12, 13, 964, 160);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel6.setText("Proctor Number");
        jLabel6.setOpaque(true);
        getContentPane().add(jLabel6);
        jLabel6.setBounds(530, 480, 112, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Parent Number");
        jLabel7.setOpaque(true);
        getContentPane().add(jLabel7);
        jLabel7.setBounds(530, 540, 111, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Student Name");
        jLabel8.setOpaque(true);
        getContentPane().add(jLabel8);
        jLabel8.setBounds(30, 480, 120, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setOpaque(true);
        getContentPane().add(jLabel10);
        jLabel10.setBounds(160, 540, 120, 30);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setOpaque(true);
        getContentPane().add(jLabel11);
        jLabel11.setBounds(160, 480, 320, 30);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setOpaque(true);
        getContentPane().add(jLabel12);
        jLabel12.setBounds(660, 540, 110, 30);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setOpaque(true);
        getContentPane().add(jLabel13);
        jLabel13.setBounds(660, 480, 110, 30);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel14.setOpaque(true);
        getContentPane().add(jLabel14);
        jLabel14.setBounds(520, 180, 160, 30);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel15.setText("Student Number");
        jLabel15.setOpaque(true);
        getContentPane().add(jLabel15);
        jLabel15.setBounds(30, 540, 116, 30);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 255, 255));
        jLabel16.setText("D-Deny");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(620, 640, 100, 20);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 255, 255));
        jLabel17.setText("A-Approve");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(620, 620, 100, 20);

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 255, 255));
        jLabel18.setText("W-Waiting");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(620, 600, 100, 20);

        jLabel9.setForeground(new java.awt.Color(0, 255, 255));
        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\PRATYAKSH777\\Downloads\\vit1-1.jpg")); // NOI18N
        getContentPane().add(jLabel9);
        jLabel9.setBounds(-450, 30, 1620, 720);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Connection con=null;
   PreparedStatement pst =null;

  if(jLabel13.getText().length()!=0)
  {try
   {int row=jTable1.getSelectedRow();
   String value=(jTable1.getModel().getValueAt(row, 0).toString());
   String a =jTextArea1.getText();
       Class.forName("com.mysql.jdbc.Driver");
    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","mysql");
   pst=con.prepareStatement("update application SET applications= ? where applicationno='"+value+"'");
       String status;
    status=jComboBox1.getSelectedItem().toString();
    pst.setString(1, status);
pst.executeUpdate();
DefaultTableModel model= (DefaultTableModel)jTable1.getModel();
model.setRowCount(0);
showuser();
    JOptionPane.showMessageDialog(approveapplication.this,"Updated Sucessfully!!!");
    jTextArea1.setText("");
    
    jLabel10.setText("");
    jLabel11.setText("");
    jLabel12.setText("");
    jLabel13.setText("");
    jLabel14.setText("");
     jComboBox1.setSelectedIndex(0);
   
    
   }    catch (ClassNotFoundException ex) {
            Logger.getLogger(studentinfo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(studentinfo.class.getName()).log(Level.SEVERE, null, ex);
        }
   finally{
       try{con.close();
       pst.close();
      
           
       } catch (SQLException ex) {
           Logger.getLogger(studentinfo.class.getName()).log(Level.SEVERE, null, ex);
       }
   }}
  
 else
  JOptionPane.showMessageDialog(approveapplication.this, "Sorry,Please Select a student RETRY!!!","Error!", JOptionPane.ERROR_MESSAGE);
        

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        wardern obj=new wardern();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
         int i =jTable1.getSelectedRow();
       TableModel model=jTable1.getModel();
      jTextArea1.setText(model.getValueAt(i,2).toString());
       X=jTextArea1.getText();
       String status=model.getValueAt(i,3).toString();
       switch(status)
       {       case"W": jComboBox1.setSelectedIndex(0);break;
       case"A": jComboBox1.setSelectedIndex(1);break;
         case"D": jComboBox1.setSelectedIndex(2);break;
       }
       jLabel14.setText(model.getValueAt(i,1).toString());
        Connection con=null;
   PreparedStatement pst =null;
   ResultSet rs=null;
      String a=jLabel14.getText();
   try
   {Class.forName("com.mysql.jdbc.Driver");
    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","mysql");
    pst=con.prepareStatement("select * from admin where sid='"+a+"'");
    rs=pst.executeQuery();
    while(rs.next())
    {jLabel11.setText(rs.getString("sname"));
    jLabel10.setText(rs.getString("sno"));
    jLabel13.setText(rs.getString("sproctno"));
    jLabel12.setText(rs.getString("sparentno"));
    }
   }    catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(studentinfo.class.getName()).log(Level.SEVERE, null, ex);
        }
   finally{
       try{con.close();
       pst.close();
       rs.close();
           
       } catch (SQLException ex) {
           Logger.getLogger(studentinfo.class.getName()).log(Level.SEVERE, null, ex);
       }
   }
      
    }//GEN-LAST:event_jTable1MouseClicked

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
            java.util.logging.Logger.getLogger(approveapplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(approveapplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(approveapplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(approveapplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new approveapplication().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
