/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view.login.frame;

import controller.Decode;
import static config.JDBCConnection.getJDBCConnection;
import constand.MySQLConstand;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import model.user.Account;
import model.user.User;
import view.manager.ManagerFrame;
import view.other.NofiDialog;
import view.user.UserFrame;

/**
 *
 * @author Administrator
 */
public class LoginFrame extends javax.swing.JFrame {

    /**
     * Creates new form LoginFrame
     */
    public LoginFrame() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Hệ thống quản lý sách thư viện");
    }
    

    
    public User user = new User();
    public Account account = new Account();

    public void setUser(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setAccount(Account account){
        this.account = account;
    }

    public Account getAccount(){
        return account;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tf_username = new javax.swing.JTextField();
        tf_password = new javax.swing.JPasswordField();
        btn_login = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel4.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setText("Đăng nhập");
        jPanel4.add(jLabel2);
        jLabel2.setBounds(340, 120, 118, 37);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Tên đăng nhập");
        jPanel4.add(jLabel1);
        jLabel1.setBounds(120, 190, 119, 50);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Mật khẩu");
        jPanel4.add(jLabel3);
        jLabel3.setBounds(140, 270, 119, 50);

        tf_username.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jPanel4.add(tf_username);
        tf_username.setBounds(300, 190, 257, 50);

        tf_password.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tf_password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tf_passwordKeyPressed(evt);
            }
        });
        jPanel4.add(tf_password);
        tf_password.setBounds(300, 270, 257, 50);

        btn_login.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_login.setText("Đăng nhập");
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });
        jPanel4.add(btn_login);
        btn_login.setBounds(540, 360, 98, 43);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ask.png"))); // NOI18N
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel4.add(jLabel5);
        jLabel5.setBounds(120, 380, 40, 40);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/loginbackground.jpg"))); // NOI18N
        jPanel4.add(jLabel4);
        jLabel4.setBounds(0, 0, 800, 530);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 533, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
        try{
            checkAccount();
            Class.forName(MySQLConstand.CLASS_NAME);
            Connection conn = getJDBCConnection();
            Statement stm = conn.createStatement();

            String idUser = String.valueOf(account.getIdAccount());
            String role = account.getRole();

            String sql = "select * from user where idUser='" + idUser + "'";
            ResultSet rs = stm.executeQuery(sql);
            
            
            if(rs.next()){
                user.setAccount(account);
                user.setName(rs.getString("name"));
                user.setYearBirthday(Integer.parseInt(rs.getString("yearbirthday")));
                user.setPhoneNumber(rs.getString("phonenumber"));
                user.setIdCard(rs.getString("idcard"));
                LoadingFrame lf = new LoadingFrame(user);
                lf.setVisible(true);
                dispose();
            }
            conn.close();
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btn_loginActionPerformed

    private void tf_passwordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_passwordKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            try{
            checkAccount();
            Class.forName(MySQLConstand.CLASS_NAME);
            Connection conn = getJDBCConnection();
            Statement stm = conn.createStatement();

            String idUser = String.valueOf(account.getIdAccount());
            String role = account.getRole();

            String sql = "select * from user where idUser='" + idUser + "'";
            ResultSet rs = stm.executeQuery(sql);

            if(rs.next()){
                user.setAccount(account);
                user.setName(rs.getString("name"));
                user.setYearBirthday(Integer.parseInt(rs.getString("yearbirthday")));
                user.setPhoneNumber(rs.getString("phonenumber"));
                user.setIdCard(rs.getString("idcard"));
                LoadingFrame lf = new LoadingFrame(user);
                lf.setVisible(true);
                dispose();
            }
            conn.close();
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
        }
    }//GEN-LAST:event_tf_passwordKeyPressed
    
    public void checkAccount(){
        try {
            Class.forName(MySQLConstand.CLASS_NAME);
            Connection conn = getJDBCConnection();
            String username = tf_username.getText();
            String password = String.valueOf(tf_password.getPassword());
            String passwordDB= Decode.decodePassword(password);
            Statement stm = conn.createStatement();

            String sql = "select * from account where username='" + username + "' and password='" + passwordDB + "'";
            ResultSet rs = stm.executeQuery(sql);
            
            if (rs.next()) {
                String idUser = rs.getString("idUser");
                String role = rs.getString("role");
                String mail = rs.getString("mail");
                
                account.setIdAccount(Integer.parseInt(idUser));
                account.setRole(role);
                account.setMail(mail);
                account.setUsername(username);
                account.setPassword(password);
            }
            else{
                NofiDialog nd = new NofiDialog("Sai tên đăng nhập hoặc mật khẩu");
                nd.setVisible(true);
            }
            conn.close();
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
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
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_login;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPasswordField tf_password;
    private javax.swing.JTextField tf_username;
    // End of variables declaration//GEN-END:variables
}
