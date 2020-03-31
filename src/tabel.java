

import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.File;
import java.io.InputStream;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;


import java.util.HashMap;
import java.util.Map;

//report import
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;




/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mahes
 */
public class tabel extends javax.swing.JFrame {

   
    /**
     * Creates new form tabel
     */
     public Connection conn;
     public ResultSet rs;
     public PreparedStatement pst;
     
     connect_db koneksi =  new connect_db();
    
     Map<String, Object> param = new HashMap<String, Object>();
     
 
   
    
    public tabel() throws Exception {
        initComponents();
        
             setDefaultCloseOperation(tabel.DISPOSE_ON_CLOSE);
        
         DefaultTableModel model = new DefaultTableModel ( );
         
             ttable.setModel(model);
             
             model.addColumn("Kode Penumpang");
             model.addColumn("Status");
             model.addColumn("Rute Awal");
             model.addColumn("Divisi");
             model.addColumn("Rute Tujuan");
             model.addColumn("Tgl Berangkat");
             model.addColumn("Nominal");
             model.addColumn("Total Harga");
             model.addColumn("Saldo keluar");
             model.addColumn("nama sopir");
         
            
            
        
        
        
        
        
           conn = null;
        conn = DriverManager.getConnection("jdbc:mysql://localhost/otw","root","");
       
        setLocationRelativeTo(null);
        
        
        
        
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnKembali = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ttable = new javax.swing.JTable();
        btnCetak = new javax.swing.JButton();
        btnhapus = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnRefresh = new javax.swing.JButton();
        txtcari = new javax.swing.JTextField();
        btncari = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        jPanel2.setBackground(new java.awt.Color(255, 51, 102));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Commercial_50px.png"))); // NOI18N
        jLabel1.setText("PERATURAN");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_No_Smoking_48px.png"))); // NOI18N
        jLabel3.setText("Dilarang Merokok Pada Terminal");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Fire_Element_48px.png"))); // NOI18N
        jLabel4.setText("Diarang Membawa Bahan mudah Terbakar");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_No_Animals_48px.png"))); // NOI18N
        jLabel5.setText("Dilarang Membawa Bianatang Peliharaan");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_No_Beverages_48px.png"))); // NOI18N
        jLabel6.setText("Dilarang Membawa Makanan dan Minuman");

        btnKembali.setBackground(new java.awt.Color(255, 102, 102));
        btnKembali.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnKembali.setForeground(new java.awt.Color(255, 255, 255));
        btnKembali.setText("KEMBALI");
        btnKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKembaliActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(btnKembali, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel1)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(jLabel1)
                .addGap(43, 43, 43)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addGap(28, 28, 28)
                .addComponent(jLabel6)
                .addGap(27, 27, 27)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnKembali, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        ttable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ttable.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ttable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        ttable.setGridColor(new java.awt.Color(255, 51, 102));
        jScrollPane1.setViewportView(ttable);

        btnCetak.setBackground(new java.awt.Color(255, 51, 102));
        btnCetak.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnCetak.setForeground(new java.awt.Color(255, 255, 255));
        btnCetak.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Print_48px_1.png"))); // NOI18N
        btnCetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCetakActionPerformed(evt);
            }
        });

        btnhapus.setBackground(new java.awt.Color(255, 153, 0));
        btnhapus.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnhapus.setForeground(new java.awt.Color(255, 255, 255));
        btnhapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Delete_48px.png"))); // NOI18N
        btnhapus.setText("Hapus");
        btnhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhapusActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("DATA PENUMPANG ");

        btnRefresh.setBackground(new java.awt.Color(0, 102, 102));
        btnRefresh.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnRefresh.setForeground(new java.awt.Color(255, 255, 255));
        btnRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Refresh_40px.png"))); // NOI18N
        btnRefresh.setText("Segarkan");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        txtcari.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        txtcari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcariActionPerformed(evt);
            }
        });

        btncari.setBackground(new java.awt.Color(255, 51, 204));
        btncari.setForeground(new java.awt.Color(255, 255, 255));
        btncari.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Find_User_Male_16px.png"))); // NOI18N
        btncari.setText("Cari");
        btncari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncariActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 332, Short.MAX_VALUE)
                        .addComponent(btncari, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtcari, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(162, 162, 162))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnCetak, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnhapus, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane1))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jLabel2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtcari, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btncari, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnhapus, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnCetak, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(86, Short.MAX_VALUE))
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

    private void btnhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhapusActionPerformed
        // TODO add your handling code here:
        
        
        
         try {
        int r = ttable.getSelectedRow();
        if(JOptionPane.showConfirmDialog(null,"Serius Mau Dihapus Ni ?","Hapus",JOptionPane.YES_NO_OPTION)==JOptionPane.NO_OPTION) return;
        Statement save= conn.createStatement();
        String query="DELETE FROM trip WHERE ktr_trip = '"+ ttable.getValueAt(r, 0) +"'";
      
        save.executeUpdate(query);
       
        JOptionPane.showMessageDialog(null,"Yess Data Terhapus ^__^");
        save.close();
      
    }
    catch(Exception ex) {
        System.err.println("error (11) : " +ex);
    }
        
        
        
       
    }//GEN-LAST:event_btnhapusActionPerformed

    private void btnKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKembaliActionPerformed
      
    }//GEN-LAST:event_btnKembaliActionPerformed

    private void btnCetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCetakActionPerformed
      
     try{
         
        String namaFile = "src/laporan/laporantrip.jasper";
         
         HashMap parameter = new HashMap();
         File report_file = new File(namaFile);
         JasperReport jasperReport = (JasperReport) JRLoader.loadObject(report_file.getPath());
         JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameter, conn);
         JasperViewer.viewReport(jasperPrint,true);
         JasperViewer.setDefaultLookAndFeelDecorated(true);
         
     }catch(Exception e){
         
        JOptionPane.showMessageDialog(null, e.getMessage());
        System.out.println(e);
     }
        
        
    }//GEN-LAST:event_btnCetakActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        
         try {
            String sql = "SELECT * FROM trip";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            DefaultTableModel dtm = (DefaultTableModel) ttable.getModel();
        dtm.setRowCount(0);
        String [] data = new String[10];
        int i = 1;
       
        while(rs.next()) {
            data[0] = rs.getString("ktr_trip");
            data[1] = rs.getString("rute");
            data[2] = rs.getString("status");
            data[3] = rs.getString("jenis");
            data[4] = rs.getString("tujuan");
            data[5] = rs.getString("berangkat");
            data[6] = rs.getString("nominal");
            data[7] = rs.getString("total");
            data[8] = rs.getString("saldo_isi");
            data[9] = rs.getString("nm_sopir");
          
            dtm.addRow(data);
            i++;
        }
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btncariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncariActionPerformed
        // TODO add your handling code here:
         DefaultTableModel model = new DefaultTableModel ( );
         
             ttable.setModel(model);
             
             model.addColumn("Kode Penumpang");
             model.addColumn("Penumpang");
             model.addColumn("Jenis Kelamin");
             model.addColumn("Status");
             model.addColumn("Rute Awal");
             model.addColumn("Rute Tujuan");
             model.addColumn("Jenis Kendaraan");
             model.addColumn("Nominal");
             model.addColumn("Jumlah");
            
        try{
        
            String sql = "Select * from trip where ktr_trip like '%" + txtcari.getText() + "'" ;
            
            ResultSet rs = pst.executeQuery(sql);
             DefaultTableModel dtm = (DefaultTableModel) ttable.getModel();
        dtm.setRowCount(0);
           String [] data = new String[9];
        int i = 1;
       
        while(rs.next()) {
            
            data[0] = rs.getString("ktr_trip");
            data[1] = rs.getString("Status");
            data[2] = rs.getString("rute");
            data[3] = rs.getString("berangkat");
            data[4] = rs.getString("jenis");
            data[5] = rs.getString("tujuan");
            data[6] = rs.getString("nominal");
            data[7] = rs.getString("total");
            data[8] =  rs.getString("saldo_isi");
          
       
          
  
          
          
            dtm.addRow(data);
            i++;

                
            
        
    }
        } catch (SQLException ex) {
            Logger.getLogger(tabel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btncariActionPerformed

    private void txtcariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcariActionPerformed

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
            java.util.logging.Logger.getLogger(tabel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tabel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tabel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tabel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
           
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCetak;
    private javax.swing.JButton btnKembali;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btncari;
    private javax.swing.JButton btnhapus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable ttable;
    private javax.swing.JTextField txtcari;
    // End of variables declaration//GEN-END:variables

    
}