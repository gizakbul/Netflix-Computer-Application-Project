/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proje31;

import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Date;
import java.util.function.IntBinaryOperator;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class yonetimEkrani extends javax.swing.JFrame {

    /**
     * Creates new form yonetimEkrani
     */
    String pSure;
    int no,kul_id;
    public yonetimEkrani() {
        initComponents();
        setResizable(false);
        amblemImage();
        searchIcon();
        izleIcon();
        bolumSayisi.setVisible(false);
        btnIzle.setVisible(false);
        jSeparator2.setVisible(false);
        jSeparator4.setVisible(false);
        jLabel4.setVisible(false);
        puanBox.setVisible(false);     
    }
    public yonetimEkrani(int kid)
    {
        kul_id=kid;
        initComponents();
        setResizable(false);
        amblemImage();
        searchIcon();
        izleIcon();
        bolumSayisi.setVisible(false);
        btnIzle.setVisible(false);
        jSeparator2.setVisible(false);
        jSeparator4.setVisible(false);
        jLabel4.setVisible(false);
        puanBox.setVisible(false);
    }
    public yonetimEkrani(String gelen, int kid)
    {  
        kul_id=kid;
        initComponents();
        isimAra.setText(gelen);
        amblemImage();
        searchIcon();
        jLabel4.setVisible(false);
        puanBox.setVisible(false);
         try {

            Connection myConn = DriverManager.getConnection("jdbc:sqlite:database/netflixdb.db");
            String sorgu = "select * from program where ad=?";

            PreparedStatement mySt = myConn.prepareStatement(sorgu);
            mySt.setString(1, isimAra.getText());
            java.sql.ResultSet myRs = mySt.executeQuery();
            while (myRs.next()) {
                /*.setText(myRs.getString("pid"));
                no = Integer.parseInt(myRs.getString("pid"));*/
                bolumSayisi.setVisible(true);
                btnIzle.setVisible(true);
                jSeparator2.setVisible(true);
                jSeparator4.setVisible(true);
                //puanBox.setVisible(true);
                filmIsimPuan.setText("İsim: "+myRs.getString("ad")+",   IMDb :"+myRs.getString("puan"));
                filmTür.setText("Tür: "+myRs.getString("tur"));
                filmTipSüre.setText("Tip: "+myRs.getString("tip")+",  Süre: "+myRs.getString("pUzunlugu"));
                pSure=myRs.getString("pUzunlugu");
                no=Integer.parseInt(myRs.getString("pid"));
                
                for (int i = 1; i <= myRs.getInt("bolumSayisi"); i++) {
                    bolumSayisi.addItem("Bölüm " + i);
                }

                ImageIcon icon = new ImageIcon("pictures\\"+myRs.getString("ad") + ".png");
                Image img = icon.getImage();
                Image imgScale = img.getScaledInstance(filmResim.getWidth(), filmResim.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon scaledIcon = new ImageIcon(imgScale);
                filmResim.setIcon(scaledIcon);

            }
            izleIcon();

        } catch (Exception exc) {
            System.out.println(exc);
            exc.printStackTrace();
        }
    }
    public void izleIcon()
    {
        ImageIcon icon = new ImageIcon("pictures\\izleIcon.jpg");
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(btnIzle.getWidth(), btnIzle.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        btnIzle.setIcon(scaledIcon);
    }
    public void amblemImage()
    {
        ImageIcon icon = new ImageIcon("pictures\\beyazAmblem.png");
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(amblem.getWidth(), amblem.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        amblem.setIcon(scaledIcon);
    }
    public void searchIcon()
    {
        ImageIcon icon = new ImageIcon("pictures\\searchIcon.jpg");
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(isimArama.getWidth(), isimArama.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        isimArama.setIcon(scaledIcon);
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        amblem = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        isimArama = new javax.swing.JButton();
        türlerBox = new javax.swing.JComboBox<>();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        isimAra = new javax.swing.JTextField();
        bolumSayisi = new javax.swing.JComboBox<>();
        filmIsimPuan = new javax.swing.JLabel();
        filmTür = new javax.swing.JLabel();
        filmTipSüre = new javax.swing.JLabel();
        btnIzle = new javax.swing.JButton();
        filmResim = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        puanBox = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(1098, 750));
        jPanel3.setLayout(null);
        jPanel3.add(amblem);
        amblem.setBounds(0, 30, 230, 60);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("Diziler");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel1);
        jLabel1.setBounds(240, 30, 50, 20);

        jSeparator1.setForeground(new java.awt.Color(204, 0, 0));
        jPanel3.add(jSeparator1);
        jSeparator1.setBounds(240, 50, 820, 10);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 0, 0));
        jLabel2.setText("Filmler");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel2);
        jLabel2.setBounds(310, 30, 60, 20);

        jComboBox1.setBackground(new java.awt.Color(153, 153, 153));
        jComboBox1.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MENU", "Hesabım", "Listem", "Çıkış Yap" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel3.add(jComboBox1);
        jComboBox1.setBounds(950, 30, 100, 20);

        isimArama.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        isimArama.setMnemonic('P');
        isimArama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isimAramaActionPerformed(evt);
            }
        });
        jPanel3.add(isimArama);
        isimArama.setBounds(830, 60, 40, 30);

        türlerBox.setBackground(new java.awt.Color(204, 0, 0));
        türlerBox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        türlerBox.setForeground(new java.awt.Color(255, 255, 255));
        türlerBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Türler", "Aksiyon ve Macera", "Belgesel", "Fantastik Yapımlar", "Bilim ve Doğa", "Çocuk ve Aile", "Drama", "Gerilim", "Komedi", "Korku", "Romantik", "Reality Program", "Anime", "Bilim Kurgu" }));
        türlerBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                türlerBoxActionPerformed(evt);
            }
        });
        jPanel3.add(türlerBox);
        türlerBox.setBounds(500, 10, 200, 30);
        jPanel3.add(jSeparator3);
        jSeparator3.setBounds(240, 90, 820, 10);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Program İsmi Ara: ");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(270, 60, 110, 30);

        isimAra.setBackground(new java.awt.Color(204, 204, 204));
        isimAra.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        isimAra.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        isimAra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                isimAraMouseClicked(evt);
            }
        });
        jPanel3.add(isimAra);
        isimAra.setBounds(380, 60, 450, 30);

        bolumSayisi.setBackground(new java.awt.Color(102, 102, 102));
        bolumSayisi.setForeground(new java.awt.Color(249, 249, 249));
        jPanel3.add(bolumSayisi);
        bolumSayisi.setBounds(290, 160, 100, 22);

        filmIsimPuan.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel3.add(filmIsimPuan);
        filmIsimPuan.setBounds(390, 480, 310, 20);

        filmTür.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        filmTür.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel3.add(filmTür);
        filmTür.setBounds(390, 500, 310, 20);

        filmTipSüre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        filmTipSüre.setFocusable(false);
        jPanel3.add(filmTipSüre);
        filmTipSüre.setBounds(390, 520, 310, 20);

        btnIzle.setBackground(new java.awt.Color(153, 153, 153));
        btnIzle.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnIzle.setForeground(new java.awt.Color(255, 255, 255));
        btnIzle.setActionCommand("İZLE");
        btnIzle.setOpaque(false);
        btnIzle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIzleActionPerformed(evt);
            }
        });
        jPanel3.add(btnIzle);
        btnIzle.setBounds(520, 290, 60, 50);

        filmResim.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                filmResimMouseClicked(evt);
            }
        });
        jPanel3.add(filmResim);
        filmResim.setBounds(290, 190, 520, 270);
        jPanel3.add(jSeparator2);
        jSeparator2.setBounds(290, 470, 520, 10);
        jPanel3.add(jSeparator4);
        jSeparator4.setBounds(350, 540, 380, 10);

        puanBox.setBackground(new java.awt.Color(51, 0, 0));
        puanBox.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        puanBox.setForeground(new java.awt.Color(255, 0, 0));
        puanBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        puanBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                puanBoxActionPerformed(evt);
            }
        });
        jPanel3.add(puanBox);
        puanBox.setBounds(760, 150, 50, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 0, 0));
        jLabel4.setText("1-10 Arası Puanlayınız:");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(630, 150, 130, 30);

        jLabel5.setBackground(new java.awt.Color(204, 0, 0));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 0, 0));
        jLabel5.setText("TV Show");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel5);
        jLabel5.setBounds(380, 30, 70, 20);

        jScrollPane2.setViewportView(jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        dizilerEkran d = new dizilerEkran();
        d.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

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

    private void isimAramaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isimAramaActionPerformed
        // TODO add your handling code here:
        jLabel4.setVisible(false);
        puanBox.setVisible(false);
        
        try {
            Connection myConn = DriverManager.getConnection("jdbc:sqlite:database/netflixdb.db");
            String sorgu = "select * from program where ad=?";

            PreparedStatement mySt = myConn.prepareStatement(sorgu);
            mySt.setString(1, isimAra.getText());
            java.sql.ResultSet myRs = mySt.executeQuery();
            while (myRs.next()) {
                /*.setText(myRs.getString("pid"));
                no = Integer.parseInt(myRs.getString("pid"));*/
                
                bolumSayisi.setVisible(true);
                btnIzle.setVisible(true);
                jSeparator2.setVisible(true);
                jSeparator4.setVisible(true);
                filmIsimPuan.setText("İsim: "+myRs.getString("ad")+",   IMDb :"+myRs.getString("puan"));
                filmTür.setText("Tür: "+myRs.getString("tur"));
                filmTipSüre.setText("Tip: "+myRs.getString("tip")+",  Süre: "+myRs.getString("pUzunlugu"));
                pSure=myRs.getString("pUzunlugu");
                no=Integer.parseInt(myRs.getString("pid"));
                for (int i = 1; i <= myRs.getInt("bolumSayisi"); i++) {
                    bolumSayisi.addItem("Bölüm " + i);
                }

                ImageIcon icon = new ImageIcon("pictures\\"+myRs.getString("ad") + ".png");
                Image img = icon.getImage();
                Image imgScale = img.getScaledInstance(filmResim.getWidth(), filmResim.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon scaledIcon = new ImageIcon(imgScale);
                filmResim.setIcon(scaledIcon);

            }
            ImageIcon icon = new ImageIcon("pictures\\izleIcon.jpg");
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(btnIzle.getWidth(), btnIzle.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        btnIzle.setIcon(scaledIcon);

        } catch (Exception exc) {
            System.out.println(exc);
            exc.printStackTrace();
        }
    }//GEN-LAST:event_isimAramaActionPerformed

    private void türlerBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_türlerBoxActionPerformed
        // TODO add your handling code here:
         String gonderilenVeri=türlerBox.getSelectedItem().toString();
         new türAramaEkrani(gonderilenVeri,kul_id).setVisible(true);
    }//GEN-LAST:event_türlerBoxActionPerformed

    private void btnIzleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIzleActionPerformed
        // TODO add your handling code here:
        puanBox.setVisible(true);
        jLabel4.setVisible(true);
        btnIzle.setVisible(false);
        //puanBox.setSelectedIndex(0);
        
    }//GEN-LAST:event_btnIzleActionPerformed

    private void puanBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_puanBoxActionPerformed
        // TODO add your handling code here:
        
        try {
            String sorgu = "insert into kullaniciprogram(kid,pid,izlemeTarihi,izlemeSuresi, kBolum, puan) values (?,?,?,?,?,?)";
            Connection myConn = DriverManager.getConnection("jdbc:sqlite:database/netflixdb.db");
            PreparedStatement mySt1 = myConn.prepareStatement(sorgu);
            JOptionPane.showMessageDialog(null, "Puanlama İşlemi Başarıyla Gerçekleşti!", "", JOptionPane.INFORMATION_MESSAGE);
            mySt1.setInt(1, kul_id);
            mySt1.setInt(2, no);
            Date tarih = new Date();
            mySt1.setString(3, tarih.toString());
            mySt1.setString(4, pSure);
            mySt1.setString(5, bolumSayisi.getSelectedItem().toString());
            mySt1.setString(6, puanBox.getSelectedItem().toString());
            mySt1.executeUpdate();  
        }catch(Exception exc){
            System.out.println(exc);
            exc.printStackTrace();            
        }
    }//GEN-LAST:event_puanBoxActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        filmlerEkran f = new filmlerEkran();
        f.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        tvshowEkran t = new tvshowEkran();
        t.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel5MouseClicked

    private void filmResimMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_filmResimMouseClicked
        // TODO add your handling code here:
        btnIzle.setVisible(true);
    }//GEN-LAST:event_filmResimMouseClicked

    private void isimAraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_isimAraMouseClicked
        // TODO add your handling code here:
        //bolumSayisi.setSelectedIndex(0);
    }//GEN-LAST:event_isimAraMouseClicked

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
            java.util.logging.Logger.getLogger(yonetimEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(yonetimEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(yonetimEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(yonetimEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new yonetimEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel amblem;
    private javax.swing.JComboBox<String> bolumSayisi;
    private javax.swing.JButton btnIzle;
    private javax.swing.JLabel filmIsimPuan;
    private javax.swing.JLabel filmResim;
    private javax.swing.JLabel filmTipSüre;
    private javax.swing.JLabel filmTür;
    private javax.swing.JTextField isimAra;
    private javax.swing.JButton isimArama;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JComboBox<String> puanBox;
    private javax.swing.JComboBox<String> türlerBox;
    // End of variables declaration//GEN-END:variables
}
