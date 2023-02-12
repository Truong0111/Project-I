/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view.user;

import java.awt.Color;
import view.login.frame.LoginFrame;
import java.awt.Frame;
import model.user.User;
import view.user.checkinfo.CheckInfoForm;
import view.user.search.SearchBookForm;
import view.other.ClockThread;
import view.other.MyButton;

/**
 *
 * @author Administrator
 */
public class UserFrame extends javax.swing.JFrame {
    private User user;
    /**
     * Creates new form UserFrame
     */
    public UserFrame() {
        initComponents();
        setLocationRelativeTo(null);
        ClockThread th= new ClockThread(lb_clock);
        th.start();
    }
    
    public UserFrame(User user) {
        this.user = user;
        initComponents();
        setLocationRelativeTo(null);
        lb_hello.setText("Xin chào, " + user.getName());
        ClockThread th = new ClockThread(lb_clock);
        th.start();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popmenu = new javax.swing.JPopupMenu();
        logout = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        lb_hello = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        btn_search = new view.other.MyButton();
        btn_userinfo = new view.other.MyButton();
        btn_ticketinfo = new view.other.MyButton();
        btn_borrowinfo = new view.other.MyButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lb_clock = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        pn_main = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        popmenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        popmenu.setPreferredSize(new java.awt.Dimension(247, 50));

        logout.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        logout.setText("Đăng xuất");
        logout.setPreferredSize(new java.awt.Dimension(117, 28));
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        popmenu.add(logout);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(49, 127, 129));

        jPanel2.setBackground(new java.awt.Color(49, 127, 129));

        jPanel5.setBackground(new java.awt.Color(49, 127, 129));

        lb_hello.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lb_hello.setForeground(new java.awt.Color(255, 255, 255));
        lb_hello.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_hello.setText("hello");
        lb_hello.setComponentPopupMenu(popmenu);
        lb_hello.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lb_hello.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lb_helloMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_hello, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lb_hello, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));

        jSeparator2.setBackground(new java.awt.Color(255, 255, 255));

        btn_search.setBackground(new java.awt.Color(49, 127, 129));
        btn_search.setBorder(null);
        btn_search.setForeground(new java.awt.Color(255, 255, 255));
        btn_search.setText("Tìm kiếm sách");
        btn_search.setBorderColor(new java.awt.Color(49, 127, 129));
        btn_search.setBorderPainted(false);
        btn_search.setColor(new java.awt.Color(49, 127, 129));
        btn_search.setColorClick(new java.awt.Color(63, 163, 166));
        btn_search.setColorOver(new java.awt.Color(0, 102, 102));
        btn_search.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btn_search.setMargin(new java.awt.Insets(3, 14, 3, 14));
        btn_search.setRadius(20);
        btn_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchActionPerformed(evt);
            }
        });

        btn_userinfo.setBackground(new java.awt.Color(49, 127, 129));
        btn_userinfo.setBorder(null);
        btn_userinfo.setForeground(new java.awt.Color(255, 255, 255));
        btn_userinfo.setText("Kiểm tra thông tin");
        btn_userinfo.setBorderColor(new java.awt.Color(49, 127, 129));
        btn_userinfo.setBorderPainted(false);
        btn_userinfo.setColor(new java.awt.Color(49, 127, 129));
        btn_userinfo.setColorClick(new java.awt.Color(63, 163, 166));
        btn_userinfo.setColorOver(new java.awt.Color(0, 102, 102));
        btn_userinfo.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btn_userinfo.setMargin(new java.awt.Insets(3, 14, 3, 14));
        btn_userinfo.setRadius(20);
        btn_userinfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_userinfoActionPerformed(evt);
            }
        });

        btn_ticketinfo.setBackground(new java.awt.Color(49, 127, 129));
        btn_ticketinfo.setBorder(null);
        btn_ticketinfo.setForeground(new java.awt.Color(255, 255, 255));
        btn_ticketinfo.setText("Thông tin phiếu");
        btn_ticketinfo.setBorderColor(new java.awt.Color(49, 127, 129));
        btn_ticketinfo.setBorderPainted(false);
        btn_ticketinfo.setColor(new java.awt.Color(49, 127, 129));
        btn_ticketinfo.setColorClick(new java.awt.Color(63, 163, 166));
        btn_ticketinfo.setColorOver(new java.awt.Color(0, 102, 102));
        btn_ticketinfo.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btn_ticketinfo.setMargin(new java.awt.Insets(3, 14, 3, 14));
        btn_ticketinfo.setRadius(20);
        btn_ticketinfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ticketinfoActionPerformed(evt);
            }
        });

        btn_borrowinfo.setBackground(new java.awt.Color(49, 127, 129));
        btn_borrowinfo.setBorder(null);
        btn_borrowinfo.setForeground(new java.awt.Color(255, 255, 255));
        btn_borrowinfo.setText("Thông tin sách mượn");
        btn_borrowinfo.setBorderColor(new java.awt.Color(49, 127, 129));
        btn_borrowinfo.setBorderPainted(false);
        btn_borrowinfo.setColor(new java.awt.Color(49, 127, 129));
        btn_borrowinfo.setColorClick(new java.awt.Color(63, 163, 166));
        btn_borrowinfo.setColorOver(new java.awt.Color(0, 102, 102));
        btn_borrowinfo.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btn_borrowinfo.setMargin(new java.awt.Insets(3, 14, 3, 14));
        btn_borrowinfo.setRadius(20);
        btn_borrowinfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_borrowinfoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_userinfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_ticketinfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_borrowinfo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                    .addComponent(btn_search, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(btn_search, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_borrowinfo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_ticketinfo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_userinfo, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 399, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3.setBackground(new java.awt.Color(49, 127, 129));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Hệ thống quản lý sách thư viện");
        jLabel1.setToolTipText("");
        jLabel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel1MouseDragged(evt);
            }
        });
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel1MousePressed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("✖");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("➖");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        lb_clock.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_clock.setForeground(new java.awt.Color(255, 255, 255));
        lb_clock.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_clock.setText("clock");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(lb_clock, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(lb_clock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(245, 245, 245));
        jPanel4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        pn_main.setBackground(new java.awt.Color(245, 245, 245));
        pn_main.setLayout(new java.awt.BorderLayout());

        jLabel4.setBackground(new java.awt.Color(245, 245, 245));
        jLabel4.setFont(new java.awt.Font("Arial", 2, 20)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Kết hợp những điều hiểu biết với những kinh nghiệm và kiến thức sẵn có - đó là nguyên tắc cần thiết khi lựa chọn sách. ");
        pn_main.add(jLabel4, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pn_main, javax.swing.GroupLayout.DEFAULT_SIZE, 1149, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pn_main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private int xMouse,yMouse;
    private void jLabel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse - 251, y - yMouse);
    }//GEN-LAST:event_jLabel1MouseDragged

    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jLabel1MousePressed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        this.dispose();
        LoginFrame lf = new LoginFrame();
    }//GEN-LAST:event_logoutActionPerformed

    private void lb_helloMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_helloMousePressed
        popmenu.show(lb_hello, 50, -50);
    }//GEN-LAST:event_lb_helloMousePressed

    private void btn_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchActionPerformed
        pn_main.removeAll();
        SearchBookForm sbf = new SearchBookForm();
        pn_main.add(sbf);
        isSelect(btn_search);
        pack();
    }//GEN-LAST:event_btn_searchActionPerformed

    private void btn_userinfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_userinfoActionPerformed
        pn_main.removeAll();
        CheckInfoForm cif = new CheckInfoForm(user);
        pn_main.add(cif);
        isSelect(btn_userinfo);
        pack();
    }//GEN-LAST:event_btn_userinfoActionPerformed

    private void btn_ticketinfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ticketinfoActionPerformed
        // TODO add your handling code here:
        pn_main.removeAll();
        CheckTicket cif = new CheckTicket(user);
        pn_main.add(cif);
        isSelect(btn_borrowinfo);
        pack();
    }//GEN-LAST:event_btn_ticketinfoActionPerformed

    private void btn_borrowinfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_borrowinfoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_borrowinfoActionPerformed

    public void isSelect(MyButton btn){
        btn_search.setColor(new Color(49,127,129));
        btn_borrowinfo.setColor(new Color(49,127,129));
        btn_userinfo.setColor(new Color(49,127,129));
        btn.setColor(new Color(63,163,166));
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
            java.util.logging.Logger.getLogger(UserFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private view.other.MyButton btn_borrowinfo;
    private view.other.MyButton btn_search;
    private view.other.MyButton btn_ticketinfo;
    private view.other.MyButton btn_userinfo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lb_clock;
    private javax.swing.JLabel lb_hello;
    private javax.swing.JMenuItem logout;
    private javax.swing.JPanel pn_main;
    private javax.swing.JPopupMenu popmenu;
    // End of variables declaration//GEN-END:variables
}
