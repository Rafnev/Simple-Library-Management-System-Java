import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class UpdateStudentView extends javax.swing.JFrame {

    Connection con;
    Statement st;
    ResultSet rs;
    
    String studentRollG;
    
    
    public UpdateStudentView() {
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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        studentSrcTf = new javax.swing.JTextField();
        searchB = new javax.swing.JButton();
        deleteB = new javax.swing.JButton();
        updateB = new javax.swing.JButton();
        selectedL = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        changedStudentNameTf = new javax.swing.JTextField();
        changedPhoneTf = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        changedAddressTf = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        changedDeptCb = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(750, 550));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Student Name");

        studentSrcTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentSrcTfActionPerformed(evt);
            }
        });

        searchB.setFont(new java.awt.Font("Lithos Pro Regular", 1, 18)); // NOI18N
        searchB.setForeground(new java.awt.Color(0, 0, 255));
        searchB.setText("Search");
        searchB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBActionPerformed(evt);
            }
        });

        deleteB.setFont(new java.awt.Font("Lithos Pro Regular", 1, 18)); // NOI18N
        deleteB.setForeground(new java.awt.Color(0, 0, 255));
        deleteB.setText("Delete");
        deleteB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBActionPerformed(evt);
            }
        });

        updateB.setFont(new java.awt.Font("Lithos Pro Regular", 1, 18)); // NOI18N
        updateB.setForeground(new java.awt.Color(0, 0, 255));
        updateB.setText("Update");
        updateB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBActionPerformed(evt);
            }
        });

        selectedL.setForeground(new java.awt.Color(255, 0, 51));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Roll", "Dept.", "Telephone", "Address"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Name");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Phone");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Address");

        changedDeptCb.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        changedDeptCb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ARC", "BBA", "CE", "CSE", "IPE", "ME", "TEX" }));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Dept.");

        jButton1.setFont(new java.awt.Font("Lithos Pro Regular", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 255));
        jButton1.setText("<<Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(studentSrcTf, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(selectedL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(updateB)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(deleteB)
                            .addComponent(searchB))
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(changedStudentNameTf, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(changedPhoneTf, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(101, 101, 101))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(changedAddressTf, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(changedDeptCb, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1)
                                .addGap(138, 138, 138))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(studentSrcTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(deleteB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(updateB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(selectedL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(291, 291, 291))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(changedStudentNameTf)))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(changedAddressTf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(changedDeptCb, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(135, 135, 135))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(changedPhoneTf, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void studentSrcTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentSrcTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_studentSrcTfActionPerformed

    private void searchBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBActionPerformed
        
        selectedL.setText("");
        
        DefaultTableModel m = (DefaultTableModel) jTable1.getModel();
        m.setRowCount(0);
        
        if(studentSrcTf.getText().trim().toString().equals("")){
            selectedL.setText("Enter Valid Student Name");
        } else {
            
            String sql = "SELECT * FROM StudentTable WHERE StudentName LIKE '" + studentSrcTf.getText().trim().toString().toLowerCase() + "'";            
            
            try {
                rs = st.executeQuery(sql);
                
                //rs to arraylist save
                ArrayList<List<String>> l = new ArrayList<List<String>>();

                while (rs.next()) {
                    
                    l.add(Arrays.asList(rs.getString("StudentName"), rs.getString("StudentRoll"), rs.getString("Department"), rs.getString("TelephoneNumber"), rs.getString("Address")));
                }
                //rs to arraylist finish

                //arraylist to string
                String[][] s = new String[l.size()][];
                for (int i = 0; i < l.size(); i++) {
                    List<String> row = l.get(i);
                    s[i] = row.toArray(new String[row.size()]);
                }
                //arraylist to string array finish


                /*
                //string array print
                for (String[] a : s) {
                    for (String b : a) {
                        System.out.println(b);
                    }
                }
                //stirng arra print finish
                * 
                */
                DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

                for (String[] row : s) {
                    model.addRow(row);
                }
                
                if(s.length == 0) {
                    selectedL.setText("No Student Found");
                }

            } catch (SQLException ex) {
                Logger.getLogger(UpdateStudentView.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_searchBActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int r = jTable1.getSelectedRow();
        //int c = jTable1.getSelectedColumn();
        
        changedStudentNameTf.setText(jTable1.getModel().getValueAt(r, 0).toString());
        changedPhoneTf.setText(jTable1.getModel().getValueAt(r, 3).toString());
        changedAddressTf.setText(jTable1.getModel().getValueAt(r, 4).toString());
        studentRollG = jTable1.getModel().getValueAt(r, 1).toString();
        changedDeptCb.setSelectedItem((Object)jTable1.getModel().getValueAt(r, 2).toString());

    }//GEN-LAST:event_jTable1MouseClicked

    private void updateBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBActionPerformed
        selectedL.setText("");
        
        if(jTable1.getSelectedRow() == -1 ){
            selectedL.setText("No Student Selected");
        } else {
            
            String sql = "UPDATE StudentTable SET StudentName = '" + changedStudentNameTf.getText().toString() +  
                    "', TelephoneNumber = '" + changedPhoneTf.getText().toString() + 
                    "', Address = '" + changedAddressTf.getText().toString() + 
                    "', Department = '" + changedDeptCb.getSelectedItem().toString() + "' WHERE StudentRoll LIKE '" + studentRollG + "'";
            
            
            //System.out.println(sql);
            
            try {
                st.executeUpdate(sql);
                
                DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                model.setValueAt(changedStudentNameTf.getText().toString(), jTable1.getSelectedRow(), 0);
                model.setValueAt(changedDeptCb.getSelectedItem().toString(), jTable1.getSelectedRow(), 2);
                model.setValueAt(changedPhoneTf.getText().toString(), jTable1.getSelectedRow(), 3);
                model.setValueAt(changedAddressTf.getText().toString(), jTable1.getSelectedRow(), 4);
                
            } catch (SQLException ex) {
                Logger.getLogger(UpdateBookView.class.getName()).log(Level.SEVERE, null, ex);
            }
               
        }
    }//GEN-LAST:event_updateBActionPerformed

    private void deleteBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBActionPerformed
        selectedL.setText("");
        
        if(jTable1.getSelectedRow() == -1 ){
            selectedL.setText("No Student Selected");
        } else {
            String sql = "DELETE FROM StudentTable WHERE StudentRoll LIKE '" + studentRollG + "'";
            System.out.println(sql);
            try {
                st.executeUpdate(sql);
                
                DefaultTableModel m = (DefaultTableModel) jTable1.getModel();
                m.setRowCount(0);
                
                JOptionPane.showMessageDialog(null, "Deleted");
                
            } catch (SQLException ex) {
                Logger.getLogger(UpdateBookView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_deleteBActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 StudentWindow obbw = new StudentWindow();
        obbw.setVisible(true);
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateStudentView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateStudentView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateStudentView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateStudentView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new UpdateStudentView().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField changedAddressTf;
    private javax.swing.JComboBox changedDeptCb;
    private javax.swing.JTextField changedPhoneTf;
    private javax.swing.JTextField changedStudentNameTf;
    private javax.swing.JButton deleteB;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton searchB;
    private javax.swing.JLabel selectedL;
    private javax.swing.JTextField studentSrcTf;
    private javax.swing.JButton updateB;
    // End of variables declaration//GEN-END:variables
}
