
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rohitraj
 */
public class Inventory_management extends javax.swing.JFrame {

    /**
     * Creates new form Inventory_management
     */
    public Inventory_management() {
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

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setLayout(null);

        jButton2.setText("data_analysis");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(968, 463, 110, 45);

        jButton3.setText("sell_product");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3);
        jButton3.setBounds(968, 167, 100, 45);

        jButton4.setText("Search_product");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4);
        jButton4.setBounds(380, 170, 109, 45);

        jButton6.setText("dashboard");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton6);
        jButton6.setBounds(968, 589, 100, 45);

        jButton7.setText("overview");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton7);
        jButton7.setBounds(968, 259, 110, 45);

        jButton8.setText("password_ch");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton8);
        jButton8.setBounds(968, 359, 110, 45);

        jButton9.setText("graph");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton9);
        jButton9.setBounds(383, 463, 100, 45);

        jButton10.setText("notification");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton10);
        jButton10.setBounds(383, 581, 100, 45);

        jButton11.setText("Add_product");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton11);
        jButton11.setBounds(383, 259, 100, 45);

        jButton12.setText("chart");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton12);
        jButton12.setBounds(383, 359, 100, 45);

        jButton1.setText("Logout");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(1150, 589, 110, 45);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\rohitraj\\Desktop\\inventory_management-300x300.jpg")); // NOI18N
        jPanel2.add(jLabel1);
        jLabel1.setBounds(570, 190, 410, 360);

        jLabel3.setIcon(new javax.swing.ImageIcon("E:\\project\\coollogo_com-295572602.png")); // NOI18N
        jPanel2.add(jLabel3);
        jLabel3.setBounds(220, 30, 1100, 90);

        jLabel2.setIcon(new javax.swing.ImageIcon("E:\\project\\rsz_software-background-chimoosoft-desktop-48006.jpg")); // NOI18N
        jPanel2.add(jLabel2);
        jLabel2.setBounds(0, -120, 1520, 900);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1517, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 901, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed

        
        notification n = new notification();
        //n.notifyy();
        n.setVisible(true);
        n.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        Toolkit tk = Toolkit.getDefaultToolkit();
    Dimension screenSize = tk.getScreenSize();
    int screenHeight = screenSize.height;
    int screenWidth = screenSize.width;
    
    //setSize(screenWidth / 2, screenHeight / 2);
    n.setLocation(screenWidth/4,screenHeight/4);
  
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed

        Connection con=null;
    Statement st=null;
    ResultSet rs=null;
        try {
        String driver ="oracle.jdbc.driver.OracleDriver";
        Class.forName(driver);
        String JDBC_DRIVER = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
        String user= "system";
        String pass="iiita123";
        con = DriverManager.getConnection(JDBC_DRIVER,user,pass);
    //    System.out.println("rohit");
        
    }catch (Exception ex) {
        JOptionPane.showMessageDialog(null,ex);
        
    }
        DefaultCategoryDataset objDataset = new DefaultCategoryDataset();
        
           try {
             
                //String user1 = P_id.getText();
                String sql = "select P_NAME ,P_QUANTITY from PRODUCT_TABLE  " ;
                //System.out.println("rohit");
                st= con.createStatement();
                rs = st.executeQuery(sql);
                while(rs.next()){
                    int n = Integer.parseInt(rs.getString("P_QUANTITY"));
                    
                    objDataset.setValue(new Double(n), "Quantity", rs.getString("P_NAME"));
                    //System.out.println("rohit");
                    //jTextarea1.setText(male.getText());
                     }
                JFreeChart chart = ChartFactory.createLineChart3D("Line Chart", "products", "Quantity", objDataset, PlotOrientation.VERTICAL, false, false, false);
            chart.setBackgroundPaint(Color.WHITE);
            chart.getTitle().setPaint(Color.RED);
            CategoryPlot p = chart.getCategoryPlot();
            p.setRangeGridlinePaint(Color.BLUE);
Toolkit tk = Toolkit.getDefaultToolkit();
    Dimension screenSize = tk.getScreenSize();
    int screenHeight = screenSize.height;
    int screenWidth = screenSize.width;
 
            ChartFrame frame = new ChartFrame("Line Chart", chart);
            frame.setVisible(true);
            frame.setSize(400, 500);
            frame.setLocation(screenWidth/4,screenHeight/4);
  frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                
            } 
                catch(Exception ex){
                    JOptionPane.showMessageDialog(null,ex);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        data_analysis d = new data_analysis();
        try {
            d.analysis();
        } catch (SQLException ex) {
            Logger.getLogger(Inventory_management.class.getName()).log(Level.SEVERE, null, ex);
        }
        d.setVisible(true);
        d.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        Toolkit tk = Toolkit.getDefaultToolkit();
    Dimension screenSize = tk.getScreenSize();
    int screenHeight = screenSize.height;
    int screenWidth = screenSize.width;
    
    //setSize(screenWidth / 2, screenHeight / 2);
    d.setLocation(screenWidth/4,screenHeight/4);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed

Change_pass p = new Change_pass();
//n.notifyy();
        p.setVisible(true);
        p.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        Toolkit tk = Toolkit.getDefaultToolkit();
    Dimension screenSize = tk.getScreenSize();
    int screenHeight = screenSize.height;
    int screenWidth = screenSize.width;
    
    //setSize(screenWidth / 2, screenHeight / 2);
    p.setLocation(screenWidth/4,screenHeight/4);        
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
                JOptionPane.showMessageDialog(null,"LOGGED OUT");
               WindowEvent winClosingEvent = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent); 

         // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

          search_product sd = new  search_product();
            sd.setVisible(true);
             sd.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
             Toolkit tk = Toolkit.getDefaultToolkit();
    Dimension screenSize = tk.getScreenSize();
    int screenHeight = screenSize.height;
    int screenWidth = screenSize.width;
    sd.setLocation(screenWidth/4,screenHeight/4);
        
        // TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed


                ADD_Product ad = new ADD_Product();
        ad.setVisible(true);
        ad.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        Toolkit tk = Toolkit.getDefaultToolkit();
    Dimension screenSize = tk.getScreenSize();
    int screenHeight = screenSize.height;
    int screenWidth = screenSize.width;
    
    //setSize(screenWidth / 2, screenHeight / 2);
    ad.setLocation(screenWidth/4,screenHeight/4);

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        purchase_product p = new purchase_product();
        p.setVisible(true);
                p.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        Toolkit tk = Toolkit.getDefaultToolkit();
    Dimension screenSize = tk.getScreenSize();
    int screenHeight = screenSize.height;
    int screenWidth = screenSize.width;
 p.setLocation(screenWidth/4,screenHeight/4);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed

         Overview o = new Overview();
         o.update();
       o.setVisible(true);          
       o.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        Toolkit tk = Toolkit.getDefaultToolkit();
    Dimension screenSize = tk.getScreenSize();
    int screenHeight = screenSize.height;
    int screenWidth = screenSize.width;
    
    //setSize(screenWidth / 2, screenHeight / 2);
    o.setLocation(screenWidth/4,screenHeight/4);
  
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed

        Connection con=null;
    Statement st=null;
    ResultSet rs=null;
        try {
        String driver ="oracle.jdbc.driver.OracleDriver";
        Class.forName(driver);
        String JDBC_DRIVER = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
        String user= "system";
        String pass="iiita123";
        con = DriverManager.getConnection(JDBC_DRIVER,user,pass);
    //    System.out.println("rohit");
        
    }catch (Exception ex) {
        JOptionPane.showMessageDialog(null,ex);
        
    }
        //DefaultCategoryDataset objDataset = new DefaultCategoryDataset();
        DefaultPieDataset objDataset = new DefaultPieDataset();
           try {
             
                //String user1 = P_id.getText();
                String sql = "select P_NAME ,P_QUANTITY from PRODUCT_TABLE  " ;
                //System.out.println("rohit");
                st= con.createStatement();
                rs = st.executeQuery(sql);
                while(rs.next()){
                    int n = Integer.parseInt(rs.getString("P_QUANTITY"));
                    
                    objDataset.setValue(rs.getString("P_NAME"),n);
                    //System.out.println("rohit");
                    //jTextarea1.setText(male.getText());
                     }
                
            } 
                catch(Exception ex){
                    JOptionPane.showMessageDialog(null,ex);
        }
        //DefaultPieDataset objDataset = new DefaultPieDataset();
       
        
       JFreeChart objChart = ChartFactory.createPieChart (
    "Demo Pie Chart",   //Chart title
    objDataset,          //Chart Data 
    true,               // include legend?
    true,               // include tooltips?
    false               // include URLs?
    );
       ChartFrame frame = new ChartFrame("Demo", objChart);
frame.pack();
frame.setVisible(true);
  Toolkit tk = Toolkit.getDefaultToolkit();
    Dimension screenSize = tk.getScreenSize();
    int screenHeight = screenSize.height;
    int screenWidth = screenSize.width;
   
 frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
frame.setLocation(screenWidth/4,screenHeight/4);
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

        Connection con=null;
    Statement st=null;
    ResultSet rs=null;
        try {
        String driver ="oracle.jdbc.driver.OracleDriver";
        Class.forName(driver);
        String JDBC_DRIVER = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
        String user= "system";
        String pass="iiita123";
        con = DriverManager.getConnection(JDBC_DRIVER,user,pass);
    //    System.out.println("rohit");
        
    }catch (Exception ex) {
        JOptionPane.showMessageDialog(null,ex);
        
    }
        DefaultCategoryDataset objDataset = new DefaultCategoryDataset();
        
           try {
             
                //String user1 = P_id.getText();
                String sql = "select P_NAME ,P_QUANTITY from PRODUCT_TABLE  " ;
                //System.out.println("rohit");
                st= con.createStatement();
                rs = st.executeQuery(sql);
                while(rs.next()){
                    int n = Integer.parseInt(rs.getString("P_QUANTITY"));
                    
                    objDataset.setValue(n,"Q1",rs.getString("P_NAME"));
                    //System.out.println("rohit");
                    //jTextarea1.setText(male.getText());
                     }
                
            } 
                catch(Exception ex){
                    JOptionPane.showMessageDialog(null,ex);
        }
        
        
JFreeChart objChart = ChartFactory.createBarChart(
       "Demo Bar Chart",     //Chart title
    "Different Products",     //Domain axis label
    "Product quantity",         //Range axis label
    objDataset,         //Chart Data 
    PlotOrientation.VERTICAL, // orientation
    true,             // include legend?
    true,             // include tooltips?
    false             // include URLs?
);
Toolkit tk = Toolkit.getDefaultToolkit();
    Dimension screenSize = tk.getScreenSize();
    int screenHeight = screenSize.height;
    int screenWidth = screenSize.width;
   
ChartFrame frame = new ChartFrame("Demo", objChart);
frame.pack();
frame.setVisible(true);
frame.setLocation(screenWidth/4,screenHeight/4);
 frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);                
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(Inventory_management.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inventory_management.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inventory_management.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inventory_management.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new Inventory_management().setVisible(true);
                // Inventory_form n = new Inventory_form();
                 Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
                new Inventory_management().setSize(screenSize.width, screenSize.height);
                //n.setVisible(true);
                
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu jPopupMenu1;
    // End of variables declaration//GEN-END:variables
}
