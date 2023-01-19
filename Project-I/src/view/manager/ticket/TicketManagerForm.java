/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view.manager.ticket;

import static config.JDBCConnection.getJDBCConnection;
import constand.MySQLConstand;
import controller.TicketController;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.table.DefaultTableModel;
import model.book.Book;
import model.ticket.BookRequestTicket;
import model.ticket.BorrowTicket;
import model.ticket.ExtendTicket;
import model.ticket.LendTicket;
import model.ticket.PenaltyTicket;
import model.ticket.Ticket;
import model.user.User;
import view.other.NofiDialog;

/**
 *
 * @author Administrator
 */
public class TicketManagerForm extends javax.swing.JPanel {

    /**
     * Creates new form TicketManagerForm
     */
    private int count;
    TicketController ticketController = new TicketController();
    public void setCountToZ(){
        this.count = 0;
    }
    
    public int getCount(){
        return count;
    }
    
    public TicketManagerForm() {
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

        jPanel11 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        tf_searchid = new javax.swing.JTextField();
        btn_search = new view.other.MyButton();
        btn_checkticket = new view.other.MyButton();
        btn_createticket = new view.other.MyButton();
        jcb_type = new javax.swing.JComboBox<>();
        jcb_status = new javax.swing.JComboBox<>();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_ticket = new javax.swing.JTable();
        lb_checknumber = new javax.swing.JLabel();

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel8.setText("Tìm theo ID phiếu");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel9.setText("Tìm theo loại phiếu");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel10.setText("Tìm theo trạng thái");

        tf_searchid.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        btn_search.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_search.setText("Tìm kiếm");
        btn_search.setDefaultCapable(false);
        btn_search.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchbtn_searchActionPerformed(evt);
            }
        });

        btn_checkticket.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_checkticket.setText("Kiểm tra phiếu");
        btn_checkticket.setDefaultCapable(false);
        btn_checkticket.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_checkticket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_checkticketActionPerformed(evt);
            }
        });

        btn_createticket.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_createticket.setText("Tạo mới");
        btn_createticket.setDefaultCapable(false);
        btn_createticket.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_createticket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_createticketActionPerformed(evt);
            }
        });

        jcb_type.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jcb_type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Phiếu mượn", "Phiếu gia hạn", "Phiếu trả", "Phiếu phạt", "Phiếu yêu cầu sách" }));
        jcb_type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcb_typeActionPerformed(evt);
            }
        });

        jcb_status.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jcb_status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Đã xử lý", "Chưa xử lý", "" }));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(tf_searchid, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addComponent(btn_search, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jcb_type, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(btn_createticket, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(92, 92, 92)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jcb_status, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(btn_checkticket, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jcb_type, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_searchid, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jcb_status, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_createticket, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_search, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_checkticket, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15))
        );

        tb_ticket.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tb_ticket.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID phiếu", "Loại", "Ngày tạo", "Trạng thái"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb_ticket.setRowHeight(25);
        tb_ticket.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tb_ticket);

        lb_checknumber.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(lb_checknumber, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_checknumber, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_searchbtn_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchbtn_searchActionPerformed
        try {
            Class.forName(MySQLConstand.CLASS_NAME);
            Connection conn = getJDBCConnection();
            Statement st = conn.createStatement();

            String searchid = tf_searchid.getText().trim();
            String searchtype = String.valueOf(jcb_type.getSelectedItem());
            String searchstatus = String.valueOf(jcb_status.getSelectedItem());

            String sql = "select * from ";

            if(searchtype.equals("Phiếu mượn")) sql = sql + "borrowticket";
            else if (searchtype.equals("Phiếu gia hạn")) sql = sql + "extendticket";
            else if (searchtype.equals("Phiếu trả")) sql = sql + "lendticket";
            else if (searchtype.equals("Phiếu phạt")) sql = sql + "penaltyticket";
            else  sql = sql + "bookrequestticket";
            sql = sql + " where idTicket like '%" + searchid + "%' and status like '%" + searchstatus +"%' order by dateCreate desc" ;

            ResultSet rs = st.executeQuery(sql);
            ClearDataTable();
            setCountToZ();
            while (rs.next()) {
                String idticket = String.valueOf(rs.getInt("idTicket"));
                String type = searchtype;
                
               // String date = rs.getString("dateCreate");
                SimpleDateFormat  formatter = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
                String strDate = formatter.format(new Date(rs.getLong("dateCreate")) );
                
                String status = rs.getString("status");

                String tbData[] = {idticket, type, strDate, status};

                DefaultTableModel tbmodel = (DefaultTableModel) tb_ticket.getModel();
                tbmodel.addRow(tbData);
                count++;
                
            }
            conn.close();
            lb_checknumber.setText("Tìm được " + count + " phiếu!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btn_searchbtn_searchActionPerformed

    private void btn_createticketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_createticketActionPerformed
        Ticket createticket = SelectTicket();
        if(createticket != null){
            ChooseTypeTicket ctt = new ChooseTypeTicket(createticket);
        }
        else {
            ChooseTypeTicket ctt = new ChooseTypeTicket();
        }
    }//GEN-LAST:event_btn_createticketActionPerformed

    private void btn_checkticketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_checkticketActionPerformed
        Ticket checkticket = SelectTicket();
        if(checkticket != null){
            if (checkticket instanceof BorrowTicket){
                CheckBorrowTicketFrame ctf = new CheckBorrowTicketFrame((BorrowTicket)ticketController.getTicketById(checkticket.getId()));
            }
            if (checkticket instanceof  LendTicket){
                CheckLendTicketFrame ctf = new CheckLendTicketFrame(TicketController.getLendTicketById(checkticket.getId()));
            }
            if (checkticket instanceof  ExtendTicket){
                CheckExtendTicketFrame ctf = new CheckExtendTicketFrame(TicketController.getExtendTicketByID(checkticket.getId()));
            }
        }
    }//GEN-LAST:event_btn_checkticketActionPerformed

    private void jcb_typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcb_typeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcb_typeActionPerformed
    
    public void ClearDataTable() {
        DefaultTableModel tbmodel = (DefaultTableModel) tb_ticket.getModel();
        tbmodel.setRowCount(0);
    }
    
    public Ticket SelectTicket() {
        DefaultTableModel model = (DefaultTableModel) tb_ticket.getModel();
        int selectedRowIndex = tb_ticket.getSelectedRow();

        if (selectedRowIndex == -1) {
            return null;
        } else {
            String id = model.getValueAt(selectedRowIndex, 0).toString();
            String type = model.getValueAt(selectedRowIndex, 1).toString();
            if(type.equals("Phiếu mượn")){
                BorrowTicket ticket = searchBorrowTicketByID(id);
                return ticket;
            }
            else if(type.equals("Phiếu gia hạn")){
                ExtendTicket ticket = searchExtendTicketByID(id);
                return ticket;
            }
            else if(type.equals("Phiếu trả")){
                LendTicket ticket = searchLendTicketByID(id);
                return ticket;
            }
            else if(type.equals("Phiếu phạt")){
                PenaltyTicket ticket = searchPenaltyTicketByID(id);
                return ticket;
            }
            else if(type.equals("Phiếu yêu cầu sách")){
                BookRequestTicket ticket = searchBookRequestTicketByID(id);
                return ticket;
            }
        }
        return null;
    }
    
    public User searchUserByID(String ID){
        User user = new User();
        try{
            Class.forName(MySQLConstand.CLASS_NAME);
            Connection conn = getJDBCConnection();
            Statement st  = conn.createStatement();
            
            String sql = "select * from user where idUser='"+ID+"'";
            
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                String name = rs.getString("name");
                String yearbd = rs.getString("yearbirthday");
                String phone = rs.getString("phonenumber");
                String idcard = rs.getString("idcard");
                
                user.setName(name);
                user.setYearBirthday(Integer.parseInt(yearbd));
                user.setPhoneNumber(phone);
                user.setIdCard(idcard);
            }
            conn.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return user;
    }
    
    public Book searchBookByID(String ID) {
        Book book = new Book();
        try {
            Class.forName(MySQLConstand.CLASS_NAME);
            Connection conn = getJDBCConnection();
            Statement st = conn.createStatement();

            String sql = "select * from book where idBook='" + ID + "'";

            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                String name = rs.getString("name");
                String code = rs.getString("code");
                String author = rs.getString("author");
                String category = rs.getString("category");
                Short year = rs.getShort("year");
                String publisher = rs.getString("publisher");
                String status = rs.getString("status");
                
                book.setId(Integer.valueOf(ID));
                book.setName(name);
                book.setCode(code);
                book.setAuthor(author);
                book.setCategory(category);
                book.setYear(year);
                book.setPublisher(publisher);
                book.setStatus(status);
            }
            conn.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return book;
    }
    
    public BorrowTicket searchBorrowTicketByID(String ID) {
        BorrowTicket ticket = new BorrowTicket();
        
        try {
            Connection conn = getJDBCConnection();
            Statement st = conn.createStatement();

            String sql = "select * from borrowticket where idTicket='" + ID + "'";

            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                int idTicket = rs.getInt("idTicket");
                String idBook = rs.getString("idBook");
                String idUser = rs.getString("idUser");
//                String dateCreate = rs.getInt("dateCreate");
                String dateBorrow = rs.getString("borrowDate");
                String dateReturn = rs.getString("returnDate");
                String status = rs.getString("status");
                
                ticket.setId(idTicket);
                System.out.println(idTicket);
                ticket.setBook(searchBookByID(idBook));
                ticket.setBorrower(searchUserByID(idUser));
//                ticket.setDateCreate(dateCreate);
//                ticket.setBorrowedDate(dateBorrow);
//                ticket.setReturnDate(dateReturn);
//                ticket.setStatus();
            }
            conn.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return ticket;
    }
    
    public ExtendTicket searchExtendTicketByID(String ID) {
        ExtendTicket ticket = new ExtendTicket();
        

        try {
            Connection conn = getJDBCConnection();
            Statement st = conn.createStatement();

            String sql = "select * from extendticket where idTicket='" + ID + "'";

            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                int idTicket = rs.getInt("idTicket");
                int idBorrowTicket = rs.getInt("idBorrow");
                String dateCreate = rs.getString("dateCreate");
//                String olddateReturn = rs.getString("returnDate");
                String newDateReturn = rs.getString("newreturnDate");
                String status = rs.getString("status");
                
                ticket.setId(idTicket);
//                ticket.setBorrowTicket(borrowTicket);
//                ticket.setDateCreate(dateCreate);
//                ticket.setNewReturnDate(newDateReturn);
//                ticket.setStatus();
            }
            conn.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return ticket;
    }
    
    public LendTicket searchLendTicketByID(String ID) {
        LendTicket ticket = new LendTicket();
        

        try {
            Connection conn = getJDBCConnection();
            Statement st = conn.createStatement();

            String sql = "select * from lendticket where idTicket='" + ID + "'";

            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                int idTicket = rs.getInt("idTicket");
                int idBorrowTicket = rs.getInt("idBorrow");
                String dateCreate = rs.getString("dateCreate");
                String dateLend = rs.getString("lendDate");
                String status = rs.getString("status");
                
                ticket.setId(idTicket);
//                ticket.setBorrowTicket(borrowTicket);
//                ticket.setDateCreate(dateCreate);
//                ticket.setLendDate(dateLend);
//                ticket.setStatus();
            }
            conn.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return ticket;
    }
    
    public PenaltyTicket searchPenaltyTicketByID(String ID) {
        PenaltyTicket ticket = new PenaltyTicket();
        

        try {
            Connection conn = getJDBCConnection();
            Statement st = conn.createStatement();

            String sql = "select * from penaltyticket where idTicket='" + ID + "'";

            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                int idTicket = rs.getInt("idTicket");
                int idBorrowTicket = rs.getInt("idBorrow");
                String dateCreate = rs.getString("dateCreate");
//                String dateLend = rs.getString("lendDate");
                int penalty = rs.getInt("penalty");
                String status = rs.getString("status");
                
                ticket.setId(idTicket);
//                ticket.setBorrowTicket(borrowTicket);
//                ticket.setDateCreate(dateCreate);
                ticket.setPenalty(penalty);
//                ticket.setStatus();
            }
            conn.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return ticket;
    }
    
    public BookRequestTicket searchBookRequestTicketByID(String ID) {
        BookRequestTicket ticket = new BookRequestTicket();
        

        try {
            Connection conn = getJDBCConnection();
            Statement st = conn.createStatement();

            String sql = "select * from bookrequestticket where idTicket='" + ID + "'";

            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                int idTicket = rs.getInt("idTicket");
                String dateCreate = rs.getString("dateCreate");
                String name = rs.getString("name");
                String author = rs.getString("author");
                String status = rs.getString("status");
                
                ticket.setId(idTicket);
//                ticket.setDateCreate(dateCreate);
                ticket.setName(name);
                ticket.setAuthor(author);
//                ticket.setStatus();
            }
            conn.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return ticket;
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private view.other.MyButton btn_checkticket;
    private view.other.MyButton btn_createticket;
    private view.other.MyButton btn_search;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jcb_status;
    private javax.swing.JComboBox<String> jcb_type;
    private javax.swing.JLabel lb_checknumber;
    private javax.swing.JTable tb_ticket;
    private javax.swing.JTextField tf_searchid;
    // End of variables declaration//GEN-END:variables
}
