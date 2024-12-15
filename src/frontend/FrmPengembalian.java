/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frontend;

import backend.Peminjaman;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author FlaB
 */
public class FrmPengembalian extends javax.swing.JFrame {

    /**
     * Creates new form FrmPengembalian
     */
    public FrmPengembalian() {
        initComponents();
        tampilData();
        kosongkanForm();
    }

    public void kosongkanForm() {
        txtIdPeminjaman.setText("0");
        txtIdAnggota.setText("0");
        txtIdBuku.setText("0");
        txtTanggalPinjam.setText("");
        txtTanggalKembali.setText("");
        txtPegawai.setText("");
        
        txtIdPeminjaman.setEnabled(false);
        txtIdAnggota.setEnabled(false);
        txtIdBuku.setEnabled(false);
        txtTanggalPinjam.setEnabled(false);
        txtTanggalKembali.setEnabled(false);
        txtPegawai.setEnabled(false);
        
        btnSimpan.setEnabled(false);
    }

    public void tampilData() {
        String[] kolom = { "ID", "Id Anggota", "Id Buku", "Id Pegawai", "Tanggal Pinjam", "Tanggal Kembali" };
        ArrayList<Peminjaman> list = Peminjaman.getAll();
        Object rowData[] = new Object[6];

        tblPeminjaman.setModel(new DefaultTableModel(new Object[][] {}, kolom));

        if (!list.isEmpty()) {
            for (int i = 0; i < list.size(); i++) {
                rowData[0] = list.get(i).getIdPeminjaman();
                rowData[1] = list.get(i).getAnggota().getNama();
                rowData[2] = list.get(i).getBuku().getJudul();
                rowData[3] = list.get(i).getPegawai() != null ? list.get(i).getPegawai().getIdPegawai() : "NULL";
                rowData[4] = list.get(i).getTanggalPinjam();
                rowData[5] = list.get(i).getTanggalKembali();

                ((DefaultTableModel) tblPeminjaman.getModel()).addRow(rowData);
            }
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

        jLabel6 = new javax.swing.JLabel();
        txtIdAnggota = new javax.swing.JTextField();
        txtIdBuku = new javax.swing.JTextField();
        txtIdPeminjaman = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtTanggalPinjam = new javax.swing.JTextField();
        labelTanggalPeminjaman = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtPegawai = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtTanggalKembali = new javax.swing.JTextField();
        labelTanggalPeminjaman1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPeminjaman = new javax.swing.JTable();
        btnSimpan = new javax.swing.JToggleButton();
        txtCari = new javax.swing.JTextField();
        btnCari = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("FORM PENGEMBALIAN");

        txtIdAnggota.setEditable(false);

        txtIdBuku.setEditable(false);

        txtIdPeminjaman.setEditable(false);
        txtIdPeminjaman.setEnabled(false);

        jLabel1.setText("ID Peminjaman");

        jLabel2.setText("ID Anggota");

        jLabel3.setText("ID Buku");

        jLabel4.setText("Tanggal Peminjaman");

        txtTanggalPinjam.setEditable(false);

        labelTanggalPeminjaman.setText("YYYY-MM-DD");

        jLabel5.setText("Pegawai");

        txtPegawai.setEditable(false);

        jLabel7.setText("Tanggal Pengembailan");

        labelTanggalPeminjaman1.setText("YYYY-MM-DD");

        tblPeminjaman.setModel(new javax.swing.table.DefaultTableModel(
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
        tblPeminjaman.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPeminjamanMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblPeminjaman);

        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        txtCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCariActionPerformed(evt);
            }
        });

        btnCari.setText("Cari");
        btnCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(49, 49, 49)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel1))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtIdAnggota)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(txtIdPeminjaman, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, Short.MAX_VALUE))))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(174, 174, 174)
                            .addComponent(jLabel6))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(89, 89, 89)
                            .addComponent(jLabel3)
                            .addGap(18, 18, 18)
                            .addComponent(txtIdBuku, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(9, 9, 9)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtTanggalPinjam, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel5))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtTanggalKembali, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                                        .addComponent(txtPegawai))))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(labelTanggalPeminjaman1)
                                .addComponent(labelTanggalPeminjaman))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnSimpan)
                                .addGap(18, 18, 18)
                                .addComponent(txtCari)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCari))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtIdPeminjaman, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdAnggota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtIdBuku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtTanggalPinjam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelTanggalPeminjaman))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtTanggalKembali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelTanggalPeminjaman1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtPegawai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSimpan)
                    .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCari))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblPeminjamanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPeminjamanMouseClicked
        DefaultTableModel model = (DefaultTableModel) tblPeminjaman.getModel();
        int row = tblPeminjaman.getSelectedRow();

        if (row >= 0) {
            choosenPeminjaman = Peminjaman.getById(Integer.parseInt(model.getValueAt(row, 0).toString()));

            txtIdPeminjaman.setText(String.valueOf(choosenPeminjaman.getIdPeminjaman()));
            txtIdAnggota.setText(String.valueOf(choosenPeminjaman.getAnggota().getIdanggota()));
            txtIdBuku.setText(String.valueOf(choosenPeminjaman.getBuku().getIdBuku()));
            txtTanggalPinjam.setText(choosenPeminjaman.getTanggalPinjam());
            txtPegawai.setText(choosenPeminjaman.getAnggota().getNama());

            String tanggalKembali = choosenPeminjaman.getTanggalKembali();
            txtTanggalKembali.setText(tanggalKembali);
            if (tanggalKembali == null) {
                txtTanggalKembali.setEnabled(true);
                btnSimpan.setEnabled(true);
            } else {
                txtTanggalKembali.setEnabled(false);
                btnSimpan.setEnabled(false);
            }
        }
    }//GEN-LAST:event_tblPeminjamanMouseClicked

    private void txtCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCariActionPerformed

    private void btnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariActionPerformed
        cari(txtCari.getText());
    }//GEN-LAST:event_btnCariActionPerformed

    public void cari(String keyword) {
        String[] kolom = { "ID", "Id Anggota", "Id Buku", "Id Pegawai", "Tanggal Pinjam", "Tanggal Kembali" };
        ArrayList<Peminjaman> list = Peminjaman.search(keyword);
        Object rowData[] = new Object[6];

        tblPeminjaman.setModel(new DefaultTableModel(new Object[][] {}, kolom));

        if (list.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Tidak ada data yang sesuai dengan kata kunci: " + keyword);
        } else {
            for (int i = 0; i < list.size(); i++) {
                rowData[0] = list.get(i).getIdPeminjaman();
                rowData[1] = list.get(i).getAnggota().getNama();
                rowData[2] = list.get(i).getBuku().getJudul();
                rowData[3] = list.get(i).getPegawai() != null ? list.get(i).getPegawai().getIdPegawai() : "NULL";
                rowData[4] = list.get(i).getTanggalPinjam();
                rowData[5] = list.get(i).getTanggalKembali();

                ((DefaultTableModel) tblPeminjaman.getModel()).addRow(rowData);
            }
            //        JOptionPane.showMessageDialog(this, list.size() + " data ditemukan.");
        }
    }

    private void checkDateFormat(String inputTanggal) {
        if (inputTanggal.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Tanggal tidak boleh kosong.", "Peringatan",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }

        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date tanggal = dateFormat.parse(inputTanggal);

            labelTanggalPeminjaman.setText(dateFormat.format(tanggal));
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(this, "Format tanggal tidak valid. Gunakan format yyyy-MM-dd.", "Peringatan",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        try {
            String tanggalKembali = txtTanggalKembali.getText().trim();
            if (tanggalKembali.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Tanggal Kembali tidak boleh kosong.", "Peringatan",
                        JOptionPane.WARNING_MESSAGE);
                return;
            }

            this.checkDateFormat(tanggalKembali);

            choosenPeminjaman.setTanggalKembali(tanggalKembali);
            choosenPeminjaman.save();

            JOptionPane.showMessageDialog(this, "Data peminjaman berhasil disimpan.", "Sukses",
                JOptionPane.INFORMATION_MESSAGE);

            tampilData();
            kosongkanForm();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan saat menyimpan data peminjaman.", "Kesalahan",
                    JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnSimpanActionPerformed

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
            java.util.logging.Logger.getLogger(FrmPengembalian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPengembalian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPengembalian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPengembalian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPengembalian().setVisible(true);
            }
        });
    }

    private Peminjaman choosenPeminjaman;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCari;
    private javax.swing.JToggleButton btnSimpan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelTanggalPeminjaman;
    private javax.swing.JLabel labelTanggalPeminjaman1;
    private javax.swing.JTable tblPeminjaman;
    private javax.swing.JTextField txtCari;
    private javax.swing.JTextField txtIdAnggota;
    private javax.swing.JTextField txtIdBuku;
    private javax.swing.JTextField txtIdPeminjaman;
    private javax.swing.JTextField txtPegawai;
    private javax.swing.JTextField txtTanggalKembali;
    private javax.swing.JTextField txtTanggalPinjam;
    // End of variables declaration//GEN-END:variables
}