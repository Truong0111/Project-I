/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view.login.frame;

import static config.JDBCConnection.getJDBCConnection;
import constand.MySQLConstand;
import java.awt.Color;
import static java.lang.Thread.sleep;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JProgressBar;
import javax.swing.UIManager;
import model.user.User;
import view.manager.ManagerFrame;
import view.user.UserFrame;

/**
 *
 * @author Administrator
 */
public class LoadingFrame extends javax.swing.JFrame {
    pbThread t1;
    private User user;
    
    /**
     * Creates new form LoadingFrame
     */
    public LoadingFrame() {
        initComponents();
        setLocationRelativeTo(null);
        
        t1 = new pbThread(progress);
        t1.start();
    }
    
    public LoadingFrame(User user) {
        this.user = user;
        initComponents();
        setLocationRelativeTo(null);
        
        t1 = new pbThread(progress);
        t1.start();
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
        lb_des = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        progress = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setLocationByPlatform(true);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(673, 449));

        jPanel1.setLayout(null);

        lb_des.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jPanel1.add(lb_des);
        lb_des.setBounds(40, 380, 580, 30);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/hustlogo.png"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 20, 70, 103);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel2.setText("Hệ thống quản lý sách thư viện");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(150, 50, 440, 110);

        progress.setForeground(new java.awt.Color(0, 255, 0));
        progress.setBorder(null);
        jPanel1.add(progress);
        progress.setBounds(40, 344, 580, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/loginloadingbackground.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 700, 450);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 673, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 449, Short.MAX_VALUE)
        );

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
            java.util.logging.Logger.getLogger(LoadingFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoadingFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoadingFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoadingFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoadingFrame().setVisible(true);
            }
        });
    }
    
    class pbThread extends Thread{
        JProgressBar pbar;
        pbThread(JProgressBar pbar){
            pbar = progress;
        }
        
        public void run(){
            int min = 0;
            int max = 100;
            UIManager.put( "nimbusOrange", new Color( 0, 255, 0 ) );
            progress.setStringPainted(true);
            progress.setForeground(Color.black);
            progress.setMaximum(max);
            progress.setMinimum(min);
            progress.setValue(0);
            
            boolean check = true;
            lb_des.setText("Kiểm tra hệ thống");
            progress.setValue(30);
            
            Sleep(1500);
            
            lb_des.setText("Kiểm tra kết nối cơ sở dữ liệu");
            
            Sleep(1000);
            
            try {
                Class.forName(MySQLConstand.CLASS_NAME);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(LoadingFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
            Connection conn;
            
            long start = System.currentTimeMillis(); 
            do{
                conn = getConn();
                long end = System.currentTimeMillis();
                if(end - start > 5000){
                    ErrorConn();
                    check = false;
                }
            }
            
            while(conn == null);
            lb_des.setText("Kết nối cơ sở dữ liệu thành công!");
            progress.setValue(60);
            Sleep(1000);
            
            lb_des.setText("Kiểm tra dữ liệu người dùng");
            // Kiem tra du lieu nguoi dung
            Sleep(1000);
            progress.setValue(90);
            
            lb_des.setText("Hoàn thành kiểm tra!");
            progress.setValue(100);
            Sleep(1000);
            
            if(!check){
                //thong bao loi~
            }
            else{
                LoginFrame lf = new LoginFrame();
            }
            dispose();
        }
        
        public Connection getConn(){
            try {
                Class.forName(MySQLConstand.CLASS_NAME);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(LoadingFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
            Connection conn = getJDBCConnection();
            return conn;
        }
        
        public void ErrorConn(){
            lb_des.setText("Không thể kết nối với cơ sở dữ liệu, vui lòng thử lại");
            Sleep(3000);
            dispose();
        }
        
        public void Sleep(int time){
            try {
                sleep(time);
            } catch (InterruptedException ex) {
                Logger.getLogger(LoadingFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lb_des;
    private javax.swing.JProgressBar progress;
    // End of variables declaration//GEN-END:variables
}
