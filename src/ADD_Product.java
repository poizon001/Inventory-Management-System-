
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rohitraj
 */
public class ADD_Product extends javax.swing.JFrame {

    /**
     * Creates new form ADD_Product
     */
    public ADD_Product() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Product_name = new javax.swing.JTextField();
        Product_id = new javax.swing.JTextField();
        Product_category = new javax.swing.JTextField();
        Price = new javax.swing.JTextField();
        Product_quantity = new javax.swing.JTextField();
        add_button = new javax.swing.JButton();
        add_button1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel1.setText("Product_name");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(70, 49, 111, 24);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel2.setText("Product_id");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(70, 131, 111, 22);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel3.setText("Product_category");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 200, 180, 22);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel4.setText("Product_quantity");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(41, 286, 140, 22);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel5.setText("Price");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(60, 363, 130, 30);
        jPanel1.add(Product_name);
        Product_name.setBounds(222, 45, 191, 32);

        Product_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Product_idActionPerformed(evt);
            }
        });
        jPanel1.add(Product_id);
        Product_id.setBounds(222, 121, 191, 32);
        jPanel1.add(Product_category);
        Product_category.setBounds(222, 192, 191, 32);

        Price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PriceActionPerformed(evt);
            }
        });
        jPanel1.add(Price);
        Price.setBounds(222, 353, 191, 32);
        jPanel1.add(Product_quantity);
        Product_quantity.setBounds(222, 276, 191, 32);

        add_button.setText("add");
        add_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_buttonActionPerformed(evt);
            }
        });
        jPanel1.add(add_button);
        add_button.setBounds(431, 328, 51, 57);

        add_button1.setText("close");
        add_button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_button1ActionPerformed(evt);
            }
        });
        jPanel1.add(add_button1);
        add_button1.setBounds(504, 328, 57, 57);

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\rohitraj\\Desktop\\body_bg.jpg")); // NOI18N
        jPanel1.add(jLabel6);
        jLabel6.setBounds(0, 0, 580, 410);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 583, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 412, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Product_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Product_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Product_idActionPerformed

    private void PriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PriceActionPerformed

    private void add_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_buttonActionPerformed

        
                Connection con=null;
        PreparedStatement pst=null;
        ResultSet rs=null;
        try {
        String driver ="oracle.jdbc.driver.OracleDriver";
        Class.forName(driver);
        String JDBC_DRIVER = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
        String user= "system";
        String pass="iiita123";
        con = DriverManager.getConnection(JDBC_DRIVER,user,pass);
        System.out.println("rohit");
            
    }catch (Exception ex) {
        JOptionPane.showMessageDialog(null,ex);
        
    }
    try {
        
        String sql = "insert into Product_table values(?,?,?,?,?)";
        pst= con.prepareStatement(sql);
        pst.setString(1,Product_id.getText());
        pst.setString(2,Product_name.getText());
       
        pst.setString(3,Product_category.getText());
        pst.setString(4,Product_quantity.getText());
        pst.setString(5,Price.getText());
        pst.execute();
        
        //System.out.println("rohit");
        JOptionPane.showMessageDialog(null, "data submitted");
    }    catch(Exception ex){
        JOptionPane.showMessageDialog(null,ex);
    }
 
        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_add_buttonActionPerformed

    private void add_button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_button1ActionPerformed

        
       WindowEvent winClosingEvent = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent); 

        
        
        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_add_button1ActionPerformed

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
            java.util.logging.Logger.getLogger(ADD_Product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ADD_Product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ADD_Product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ADD_Product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ADD_Product().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Price;
    private javax.swing.JTextField Product_category;
    private javax.swing.JTextField Product_id;
    private javax.swing.JTextField Product_name;
    private javax.swing.JTextField Product_quantity;
    private javax.swing.JButton add_button;
    private javax.swing.JButton add_button1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}