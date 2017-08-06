
import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ezio
 */
public class BookWindow extends javax.swing.JFrame {

    Connection con;
    Statement st;
    ResultSet rs;
    
    
    public BookWindow() {
        initComponents();
        connect();
    }

    public void connect() {
        try{
            String DRIVER = "sun.jdbc.odbc.JdbcOdbcDriver";
            Class.forName(DRIVER);
            
            String db = "jdbc:odbc:LibraryManagementDatabase";
            con = DriverManager.getConnection(db);
            
            st = con.createStatement();
        } catch(Exception e){
            System.err.println(e);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addBookFormButton = new javax.swing.JButton();
        updateBookButton = new javax.swing.JButton();
        showreportButton = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(750, 550));
        setMinimumSize(new java.awt.Dimension(750, 550));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        addBookFormButton.setFont(new java.awt.Font("Lithos Pro Regular", 1, 24)); // NOI18N
        addBookFormButton.setForeground(new java.awt.Color(0, 0, 255));
        addBookFormButton.setText("Add Book ");
        addBookFormButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBookFormButtonActionPerformed(evt);
            }
        });
        getContentPane().add(addBookFormButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, 260, 40));

        updateBookButton.setFont(new java.awt.Font("Lithos Pro Regular", 1, 24)); // NOI18N
        updateBookButton.setForeground(new java.awt.Color(0, 0, 255));
        updateBookButton.setText("Update Book");
        updateBookButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBookButtonActionPerformed(evt);
            }
        });
        getContentPane().add(updateBookButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, 260, 40));

        showreportButton.setFont(new java.awt.Font("Lithos Pro Regular", 1, 24)); // NOI18N
        showreportButton.setForeground(new java.awt.Color(0, 0, 255));
        showreportButton.setText("Show Book list");
        showreportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showreportButtonActionPerformed(evt);
            }
        });
        getContentPane().add(showreportButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, 260, 40));

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton4.setText("<< Back ");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(531, 410, 150, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Library.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addBookFormButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBookFormButtonActionPerformed
       AddBookForm adbookob = new AddBookForm();
       adbookob.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_addBookFormButtonActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        ControlPanel cp = new ControlPanel();
        cp.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void showreportButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showreportButtonActionPerformed
        String sql = "SELECT * FROM BookTable";

        try {
            rs = st.executeQuery(sql);

            //rs to arraylist save
            ArrayList<List<String>> l = new ArrayList<List<String>>();

            while (rs.next()) {
                String av = "No";
                String st = rs.getString("Availablity");

                if (st.compareTo("1") == 0) {
                    av = "Yes";
                }

                l.add(Arrays.asList(rs.getString("BookName"), rs.getString("AuthorName"), av));
            }
            //rs to arraylist finish

            //arraylist to string
            String[][] s = new String[l.size()][];
            for (int i = 0; i < l.size(); i++) {
                List<String> row = l.get(i);
                s[i] = row.toArray(new String[row.size()]);
            }
            //arraylist to string array finish


            //string array print
            for (String[] a : s) {
                for (String b : a) {
                    System.out.println(b);
                }
            }
            //stirng arra print finish


            BookListView b = new BookListView(s);
            b.setVisible(true);
            this.dispose();
        } catch (SQLException ex) {
            Logger.getLogger(BookWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_showreportButtonActionPerformed

    private void updateBookButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBookButtonActionPerformed
        UpdateBookView ob = new UpdateBookView();
        ob.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_updateBookButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BookWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new BookWindow().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBookFormButton;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton showreportButton;
    private javax.swing.JButton updateBookButton;
    // End of variables declaration//GEN-END:variables
}
