import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
//package bucky;

/**
 *
 * @author Administrator
 */
public class Change_pass extends javax.swing.JFrame {

    /**
     * Creates new form Change_pass
     */
    public Change_pass() {
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

        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        current = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        new_pass = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        confirm_pass = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("change passwrd");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(160, 0, 106, 31);

        jLabel2.setText("current passwd");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(26, 86, 90, 28);
        getContentPane().add(current);
        current.setBounds(160, 94, 184, 20);

        jLabel3.setText("new passwd");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(26, 125, 78, 27);

        new_pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                new_passActionPerformed(evt);
            }
        });
        getContentPane().add(new_pass);
        new_pass.setBounds(160, 132, 184, 20);

        jLabel4.setText("confirm new passwd");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(26, 170, 108, 22);
        getContentPane().add(confirm_pass);
        confirm_pass.setBounds(160, 171, 184, 20);

        jButton1.setText("ok");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(235, 210, 70, 53);

        jLabel6.setText("username");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(26, 61, 90, 19);
        getContentPane().add(username);
        username.setBounds(160, 60, 184, 20);

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\rohitraj\\Desktop\\body_bg.jpg")); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(0, 10, 390, 270);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void new_passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_new_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_new_passActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        Connection con=null;
        PreparedStatement pst=null;
        Statement st = null;
        ResultSet rs=null;
        try {
        String driver ="oracle.jdbc.driver.OracleDriver";
        Class.forName(driver);
        String JDBC_DRIVER = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
        String user= "system";
        String pass="iiita123";
        con = DriverManager.getConnection(JDBC_DRIVER,user,pass);
        //System.out.println("rohit");
            
    }catch (Exception ex) {
        JOptionPane.showMessageDialog(null,ex);
        
    }
    try {
     //   System.out.println("rohit");
        String user = username.getText();
        String pass = current.getText();
        String sql = "select password from login where username = '"+user+"'";
         st= con.createStatement();
         rs = st.executeQuery(sql);
         if(rs.next()){
         String t = rs.getString("password");
         
            if(t.equals(pass)){
                String newpass = new_pass.getText();
                sql = "update login set password = '"+newpass+"' where username = '"+user+"' ";
                pst= con.prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(null, "password changed successfully");
            } 
            else {
                JOptionPane.showMessageDialog(null, "invalid current password");
            }
         }
        
       
    }  
    catch(Exception ex){
        JOptionPane.showMessageDialog(null,ex);
    }
        
        
        
        
        
        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(Change_pass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Change_pass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Change_pass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Change_pass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Change_pass().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField confirm_pass;
    private javax.swing.JTextField current;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField new_pass;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
