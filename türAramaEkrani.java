/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proje31;

import java.awt.Image;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.ImageIcon;
import java.sql.ResultSet;
import java.sql.*;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class türAramaEkrani extends javax.swing.JFrame {

    /**
     * Creates new form türAramaEkrani
     */
    int kul_id;
    private JTextField txtGelenler;
    public türAramaEkrani() {
        initComponents();
        setResizable(false);
    }
    public türAramaEkrani(int kid)
    {
        kul_id=kid;
        initComponents();
    }
   
    public türAramaEkrani(String gelenVeri, int kid)
    {
        initComponents();
        kul_id=kid;
        jLabel2.setText(gelenVeri+" Türündeki Filmler Aşağıda Listelenmiştir");
        
        try {
            Connection myConn = DriverManager.getConnection("jdbc:sqlite:database/netflixdb.db");
            String sorgu = "select * from program where pid in(select pid from turprogram where tid in(select tid from tur where ad=?))";

            PreparedStatement mySt = myConn.prepareStatement(sorgu);
            mySt.setString(1, gelenVeri);
            java.sql.ResultSet myRs = mySt.executeQuery();
            
            while (myRs.next()) {
                
                programTablo.setVisible(true);
               
                String Row[] =  {myRs.getString("ad"), myRs.getString("bolumSayisi"),myRs.getString("pUzunlugu"),myRs.getString("puan"),myRs.getString("tip") };
                
                DefaultTableModel tblModel = (DefaultTableModel)programTablo.getModel();
                tblModel.addRow(Row);
            }
            
        } catch (Exception exc) {
            System.out.println(exc);
            exc.printStackTrace();
        }
        
        ImageIcon icon = new ImageIcon("pictures\\şeffafAmblem.png");
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        jLabel1.setIcon(scaledIcon);
        
        arkaPlan.setVisible(true);
        ImageIcon icon1 = new ImageIcon("pictures\\arkaPlan (2).jpg");
        Image img1 = icon1.getImage();
        Image imgScale1 = img1.getScaledInstance(arkaPlan.getWidth(), arkaPlan.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon1 = new ImageIcon(imgScale1);
        arkaPlan.setIcon(scaledIcon1);  
    }
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        btnGeri = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        programTablo = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        filmSeç = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        arkaPlan = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setPreferredSize(new java.awt.Dimension(1100, 600));

        jPanel1.setPreferredSize(new java.awt.Dimension(1100, 600));
        jPanel1.setLayout(null);

        btnGeri.setBackground(new java.awt.Color(204, 0, 0));
        btnGeri.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnGeri.setForeground(new java.awt.Color(255, 255, 255));
        btnGeri.setText("Geri");
        btnGeri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGeriActionPerformed(evt);
            }
        });
        jPanel1.add(btnGeri);
        btnGeri.setBounds(60, 460, 85, 31);

        programTablo.setAutoCreateRowSorter(true);
        programTablo.setBackground(new java.awt.Color(51, 51, 51));
        programTablo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        programTablo.setForeground(new java.awt.Color(255, 255, 255));
        programTablo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "İsim", "Bölüm Sayısı", "Süre", "IMDb", "Tip"
            }
        ));
        programTablo.setGridColor(new java.awt.Color(0, 0, 0));
        programTablo.setRequestFocusEnabled(false);
        programTablo.setSelectionBackground(new java.awt.Color(0, 0, 0));
        programTablo.setShowGrid(false);
        programTablo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                programTabloMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(programTablo);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(290, 200, 490, 220);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel2);
        jLabel2.setBounds(270, 170, 560, 30);
        jPanel1.add(jLabel1);
        jLabel1.setBounds(370, 0, 320, 170);

        filmSeç.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.add(filmSeç);
        filmSeç.setBounds(410, 450, 290, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Tablodan Film Seçiniz :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(290, 450, 130, 30);

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("İZLE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(710, 450, 60, 30);

        jComboBox1.setBackground(new java.awt.Color(51, 51, 51));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MENU", "Hesabım", "Listem", "Çıkış Yap" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(977, 20, 80, 20);
        jPanel1.add(arkaPlan);
        arkaPlan.setBounds(0, 0, 1100, 600);

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void programTabloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_programTabloMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_programTabloMouseClicked

    private void btnGeriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGeriActionPerformed
        // TODO add your handling code here:
        yonetimEkrani ye = new yonetimEkrani();
        ye.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnGeriActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         String gonderilen=filmSeç.getText();
         new yonetimEkrani(gonderilen,kul_id).setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        if(evt.getSource() == jComboBox1)
       {
           JComboBox cb = (JComboBox)evt.getSource();
           String msg = (String)cb.getSelectedItem();
           switch(msg)
           {
               case "Çıkış Yap": 
                   Object[] sorgu = {"Evet","Hayır"};
                   int sorgu2 = JOptionPane.showOptionDialog(rootPane,"Şimdi Çıkış Yapmak İster Misiniz?" , "Oturumunuz Sonlandırılmak Üzere", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, (Object[]) sorgu, sorgu[1]);
                   if(sorgu2==0)
                   {
                       girisEkrani ge = new girisEkrani();
                       ge.setVisible(true);
                       dispose();
                       //System.exit(0); 
                   }
                   else if(sorgu2==1)
                   {
                       return;
                   }
           }
       }
    }//GEN-LAST:event_jComboBox1ActionPerformed

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
            java.util.logging.Logger.getLogger(türAramaEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(türAramaEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(türAramaEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(türAramaEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new türAramaEkrani().setVisible(true);
            }
        });
    }

    public void gelenlerVeriler(String tür){
        //Gelen verileri txtGelenlere Aktarıyoruz.
         txtGelenler.setText(tür);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel arkaPlan;
    private javax.swing.JButton btnGeri;
    private javax.swing.JTextField filmSeç;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable programTablo;
    // End of variables declaration//GEN-END:variables
}

