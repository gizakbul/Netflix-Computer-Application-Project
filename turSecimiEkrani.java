/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proje31;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class turSecimiEkrani extends javax.swing.JFrame {

    /**
     * Creates new form turSecimiEkrani
     */
    int count = 0;
    ArrayList<String> secilen = new ArrayList<String>();
    
    public turSecimiEkrani() {
        initComponents();
        setResizable(false);
        aksiyonImage();
        belgeselImage();
        fantastikImage();
        bilimveDogaImage();
        cocukveAileImage();
        dramaImage();
        gerilimImage();
        komediImage();
        korkuImage();
        romantikImage();
        realityImage();
        animeImage();
        bilimKurguImage();
        amblemImage();
    }
    public void amblemImage()
    {
        ImageIcon icon = new ImageIcon("pictures\\1.jpg");
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(amblem.getWidth(), amblem.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        amblem.setIcon(scaledIcon);
    }
    
    public void aksiyonImage()
    {
        ImageIcon icon = new ImageIcon("pictures\\AksiyonveMacera.jpg");
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(AksiyonveMacera.getWidth(), AksiyonveMacera.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        AksiyonveMacera.setIcon(scaledIcon);
    }
    public void belgeselImage()
    {   
        ImageIcon icon = new ImageIcon("pictures\\belgesel1.png");
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(Belgesel.getWidth(), Belgesel.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        Belgesel.setIcon(scaledIcon);
        
    }
    public void fantastikImage()
    {   
        ImageIcon icon = new ImageIcon("pictures\\fantastik1.jpg");
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(FantastikYapımlar.getWidth(), FantastikYapımlar.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        FantastikYapımlar.setIcon(scaledIcon);
        
    }
    public void bilimveDogaImage()
    {   
        ImageIcon icon = new ImageIcon("pictures\\bilimveDoğa1.jpg");
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(BilimveDoğa.getWidth(), BilimveDoğa.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        BilimveDoğa.setIcon(scaledIcon);
        
    }
    public void cocukveAileImage()
    {   
        ImageIcon icon = new ImageIcon("pictures\\çocukveAile1.jpg");
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(ÇocukveAile.getWidth(), ÇocukveAile.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        ÇocukveAile.setIcon(scaledIcon);
    }
    public void dramaImage()
    {   
        ImageIcon icon = new ImageIcon("pictures\\Drama1.jpeg");
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(Drama.getWidth(), Drama.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        Drama.setIcon(scaledIcon);
    }
    public void gerilimImage()
    {   
        ImageIcon icon = new ImageIcon("pictures\\Gerilim1.jpg");
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(Gerilim.getWidth(), Gerilim.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        Gerilim.setIcon(scaledIcon);
    }
    public void komediImage()
    {   
        ImageIcon icon = new ImageIcon("pictures\\komedi1.jpg");
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(Komedi.getWidth(), Komedi.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        Komedi.setIcon(scaledIcon);
    }
    public void korkuImage()
    {   
        ImageIcon icon = new ImageIcon("pictures\\korku1.jpeg");
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(Korku.getWidth(), Korku.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        Korku.setIcon(scaledIcon);
    }
    public void romantikImage()
    {   
        ImageIcon icon = new ImageIcon("pictures\\romantik1.jpg");
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(Romantik.getWidth(), Romantik.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        Romantik.setIcon(scaledIcon);
    }
    public void realityImage()
    {   
        ImageIcon icon = new ImageIcon("pictures\\reality1.jpg");
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(RealityProgram.getWidth(), RealityProgram.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        RealityProgram.setIcon(scaledIcon);
    }
    public void animeImage()
    {   
        ImageIcon icon = new ImageIcon("pictures\\anime1.jpg");
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(Anime.getWidth(), Anime.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        Anime.setIcon(scaledIcon);
    }
    public void bilimKurguImage()
    {   
        ImageIcon icon = new ImageIcon("pictures\\bilimKurgu1.jpg");
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(BilimKurgu.getWidth(), BilimKurgu.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        BilimKurgu.setIcon(scaledIcon);
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
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        AksiyonveMacera = new javax.swing.JLabel();
        Belgesel = new javax.swing.JLabel();
        FantastikYapımlar = new javax.swing.JLabel();
        BilimveDoğa = new javax.swing.JLabel();
        ÇocukveAile = new javax.swing.JLabel();
        Drama = new javax.swing.JLabel();
        Gerilim = new javax.swing.JLabel();
        Komedi = new javax.swing.JLabel();
        Korku = new javax.swing.JLabel();
        Romantik = new javax.swing.JLabel();
        aksiyonBox = new javax.swing.JCheckBox();
        belgeselBox = new javax.swing.JCheckBox();
        fantastikBox = new javax.swing.JCheckBox();
        bilimvedoğaBox = new javax.swing.JCheckBox();
        çocukBox = new javax.swing.JCheckBox();
        dramaBox = new javax.swing.JCheckBox();
        gerilimBox = new javax.swing.JCheckBox();
        komediBox = new javax.swing.JCheckBox();
        korkuBox = new javax.swing.JCheckBox();
        romantikBox = new javax.swing.JCheckBox();
        RealityProgram = new javax.swing.JLabel();
        Anime = new javax.swing.JLabel();
        BilimKurgu = new javax.swing.JLabel();
        realityBox = new javax.swing.JCheckBox();
        animeBox = new javax.swing.JCheckBox();
        bilimkurguBox = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        Tür2 = new javax.swing.JLabel();
        Tür3 = new javax.swing.JLabel();
        Tür11 = new javax.swing.JLabel();
        Tür12 = new javax.swing.JLabel();
        Tür21 = new javax.swing.JLabel();
        Tür22 = new javax.swing.JLabel();
        Tür31 = new javax.swing.JLabel();
        Tür32 = new javax.swing.JLabel();
        amblem = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        Tür1 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        OturumAç = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jButton1.setBackground(new java.awt.Color(204, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Geç");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Başlamadan Önce Sevdiğiniz 3 Adet Tür Seçmelisiniz");

        jButton2.setBackground(new java.awt.Color(204, 0, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Devam Et");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        aksiyonBox.setBackground(new java.awt.Color(0, 0, 0));
        aksiyonBox.setForeground(new java.awt.Color(255, 255, 255));
        aksiyonBox.setText("Aksiyon ve Macera");
        aksiyonBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aksiyonBoxActionPerformed(evt);
            }
        });

        belgeselBox.setBackground(new java.awt.Color(0, 0, 0));
        belgeselBox.setForeground(new java.awt.Color(255, 255, 255));
        belgeselBox.setText("Belgesel");
        belgeselBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                belgeselBoxActionPerformed(evt);
            }
        });

        fantastikBox.setBackground(new java.awt.Color(0, 0, 0));
        fantastikBox.setForeground(new java.awt.Color(255, 255, 255));
        fantastikBox.setText("Fantastik Yapımlar");
        fantastikBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fantastikBoxActionPerformed(evt);
            }
        });

        bilimvedoğaBox.setBackground(new java.awt.Color(0, 0, 0));
        bilimvedoğaBox.setForeground(new java.awt.Color(255, 255, 255));
        bilimvedoğaBox.setText("Bilim ve Doğa");
        bilimvedoğaBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bilimvedoğaBoxActionPerformed(evt);
            }
        });

        çocukBox.setBackground(new java.awt.Color(0, 0, 0));
        çocukBox.setForeground(new java.awt.Color(255, 255, 255));
        çocukBox.setText("Çocuk ve Aile");
        çocukBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                çocukBoxActionPerformed(evt);
            }
        });

        dramaBox.setBackground(new java.awt.Color(0, 0, 0));
        dramaBox.setForeground(new java.awt.Color(255, 255, 255));
        dramaBox.setText("Drama");
        dramaBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dramaBoxActionPerformed(evt);
            }
        });

        gerilimBox.setBackground(new java.awt.Color(0, 0, 0));
        gerilimBox.setForeground(new java.awt.Color(255, 255, 255));
        gerilimBox.setText("Gerilim");
        gerilimBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gerilimBoxActionPerformed(evt);
            }
        });

        komediBox.setBackground(new java.awt.Color(0, 0, 0));
        komediBox.setForeground(new java.awt.Color(255, 255, 255));
        komediBox.setText("Komedi");
        komediBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                komediBoxActionPerformed(evt);
            }
        });

        korkuBox.setBackground(new java.awt.Color(0, 0, 0));
        korkuBox.setForeground(new java.awt.Color(255, 255, 255));
        korkuBox.setText("Korku");
        korkuBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                korkuBoxActionPerformed(evt);
            }
        });

        romantikBox.setBackground(new java.awt.Color(0, 0, 0));
        romantikBox.setForeground(new java.awt.Color(255, 255, 255));
        romantikBox.setText("Romantik");
        romantikBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                romantikBoxActionPerformed(evt);
            }
        });

        realityBox.setBackground(new java.awt.Color(0, 0, 0));
        realityBox.setForeground(new java.awt.Color(255, 255, 255));
        realityBox.setText("Reality Program");
        realityBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                realityBoxActionPerformed(evt);
            }
        });

        animeBox.setBackground(new java.awt.Color(0, 0, 0));
        animeBox.setForeground(new java.awt.Color(255, 255, 255));
        animeBox.setText("Anime");
        animeBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                animeBoxActionPerformed(evt);
            }
        });

        bilimkurguBox.setBackground(new java.awt.Color(0, 0, 0));
        bilimkurguBox.setForeground(new java.awt.Color(255, 255, 255));
        bilimkurguBox.setText("Bilim Kurgu");
        bilimkurguBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bilimkurguBoxActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));

        Tür2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Tür2.setForeground(new java.awt.Color(255, 255, 255));

        Tür3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Tür3.setForeground(new java.awt.Color(255, 255, 255));

        Tür11.setForeground(new java.awt.Color(153, 153, 153));

        Tür12.setForeground(new java.awt.Color(153, 153, 153));

        Tür21.setForeground(new java.awt.Color(153, 153, 153));

        Tür22.setForeground(new java.awt.Color(153, 153, 153));

        Tür31.setForeground(new java.awt.Color(153, 153, 153));

        Tür32.setForeground(new java.awt.Color(153, 153, 153));

        amblem.setText("jLabel3");

        Tür1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Tür1.setForeground(new java.awt.Color(255, 255, 255));

        OturumAç.setBackground(new java.awt.Color(204, 0, 0));
        OturumAç.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        OturumAç.setForeground(new java.awt.Color(255, 255, 255));
        OturumAç.setText("Oturum Aç");
        OturumAç.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OturumAçActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(dramaBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Drama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(AksiyonveMacera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(aksiyonBox, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(amblem, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(realityBox, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                            .addComponent(RealityProgram, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(gerilimBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Gerilim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Belgesel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(belgeselBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(55, 55, 55)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(fantastikBox, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(FantastikYapımlar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                            .addComponent(Komedi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(komediBox, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Anime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(animeBox, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(BilimKurgu, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                    .addComponent(korkuBox, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                    .addComponent(bilimkurguBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bilimvedoğaBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Korku, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BilimveDoğa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(62, 62, 62)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(çocukBox, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ÇocukveAile, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(Romantik, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(romantikBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(303, 303, 303))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel1)
                        .addGap(75, 75, 75)
                        .addComponent(OturumAç, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(478, 478, 478)
                        .addComponent(jButton2))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 1081, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator3)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Tür1, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                                    .addComponent(Tür11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Tür12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(188, 188, 188)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Tür2, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                                    .addComponent(Tür21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Tür22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(184, 184, 184)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Tür3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Tür31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Tür32, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE))))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(497, 497, 497)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(345, 345, 345)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(amblem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 9, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(OturumAç, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(AksiyonveMacera, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Belgesel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(FantastikYapımlar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BilimveDoğa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(ÇocukveAile, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(aksiyonBox)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(fantastikBox)
                                    .addComponent(belgeselBox))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                                .addComponent(Komedi, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bilimvedoğaBox)
                                    .addComponent(çocukBox))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Korku, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                                    .addComponent(Romantik, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Drama, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Gerilim, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(dramaBox)
                        .addComponent(gerilimBox))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(komediBox)
                        .addComponent(korkuBox)
                        .addComponent(romantikBox)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BilimKurgu, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                    .addComponent(Anime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(RealityProgram, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(realityBox)
                    .addComponent(animeBox)
                    .addComponent(bilimkurguBox))
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Tür3, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(Tür2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Tür1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(4, 4, 4)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Tür31, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                    .addComponent(Tür21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Tür11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Tür32, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                    .addComponent(Tür12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Tür22, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addGap(66, 66, 66))
        );

        BilimveDoğa.getAccessibleContext().setAccessibleName("BilimveDoğa");

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1100, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        if (count == 3) {
            for (int i = 0; i < 3; i++) {
                System.out.println(secilen.get(i));
            }
            jLabel2.setText("Film Önerilerinizi Görmek İçin Aşağı İnmelisiniz");
            Tür1.setText(secilen.get(0));
            Tür2.setText(secilen.get(1));
            Tür3.setText(secilen.get(2));
            try {
                Connection myConn = DriverManager.getConnection("jdbc:sqlite:database/netflixdb.db");
                String sorgu = "select ad,puan from program where pid in(select pid from turprogram where tid in(select tid from tur where ad=?)) order by puan desc limit 1";
                PreparedStatement mySt = myConn.prepareStatement(sorgu);
                mySt.setString(1, Tür1.getText());
                java.sql.ResultSet myRs = mySt.executeQuery();
                while (myRs.next()) {
                    Tür11.setText(myRs.getString("ad")+"   IMDb : "+myRs.getString("puan"));
                    //Tür11.setText(myRs.getString());
                }

            } catch (Exception e) {
                System.out.println(e);
            }
            try {
                Connection myConn = DriverManager.getConnection("jdbc:sqlite:database/netflixdb.db");
                String sorgu = "select ad,puan from program where pid in(select pid from turprogram where tid in(select tid from tur where ad=?)) order by puan desc limit 2";
                PreparedStatement mySt = myConn.prepareStatement(sorgu);
                mySt.setString(1, Tür1.getText());
                java.sql.ResultSet myRs = mySt.executeQuery();
                while (myRs.next()) {
                    Tür12.setText(myRs.getString("ad")+"   IMDb : "+myRs.getString("puan"));
                }

            } catch (Exception e) {
                System.out.println(e);
            }
            
            try {
                Connection myConn = DriverManager.getConnection("jdbc:sqlite:database/netflixdb.db");
                String sorgu = "select ad,puan from program where pid in(select pid from turprogram where tid in(select tid from tur where ad=?)) order by puan desc limit 1";
                PreparedStatement mySt = myConn.prepareStatement(sorgu);
                mySt.setString(1, Tür2.getText());
                java.sql.ResultSet myRs = mySt.executeQuery();
                while (myRs.next()) {
                    Tür21.setText(myRs.getString("ad")+"   IMDb : "+myRs.getString("puan"));
                }

            } catch (Exception e) {
                System.out.println(e);
            }
            try {
                Connection myConn = DriverManager.getConnection("jdbc:sqlite:database/netflixdb.db");
                String sorgu = "select ad,puan from program where pid in(select pid from turprogram where tid in(select tid from tur where ad=?)) order by puan desc limit 2";
                PreparedStatement mySt = myConn.prepareStatement(sorgu);
                mySt.setString(1, Tür2.getText());
                java.sql.ResultSet myRs = mySt.executeQuery();
                while (myRs.next()) {
                    Tür22.setText(myRs.getString("ad")+"   IMDb : "+myRs.getString("puan"));
                }

            } catch (Exception e) {
                System.out.println(e);
            }
            
            try {
                Connection myConn = DriverManager.getConnection("jdbc:sqlite:database/netflixdb.db");
                String sorgu = "select ad,puan from program where pid in(select pid from turprogram where tid in(select tid from tur where ad=?)) order by puan desc limit 1";
                PreparedStatement mySt = myConn.prepareStatement(sorgu);
                mySt.setString(1, Tür3.getText());
                java.sql.ResultSet myRs = mySt.executeQuery();
                while (myRs.next()) {
                    Tür31.setText(myRs.getString("ad")+"   IMDb : "+myRs.getString("puan"));
                }

            } catch (Exception e) {
                System.out.println(e);
            }
            try {
                Connection myConn = DriverManager.getConnection("jdbc:sqlite:database/netflixdb.db");
                String sorgu = "select ad,puan from program where pid in(select pid from turprogram where tid in(select tid from tur where ad=?)) order by puan desc limit 2";
                PreparedStatement mySt = myConn.prepareStatement(sorgu);
                mySt.setString(1, Tür3.getText());
                java.sql.ResultSet myRs = mySt.executeQuery();
                while (myRs.next()) {
                    Tür32.setText(myRs.getString("ad")+"   IMDb : "+myRs.getString("puan"));
                }
                
                jButton2.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
                }
        });

            } catch (Exception e) {
                System.out.println(e);
            }

        } else {

            JOptionPane.showMessageDialog(null, "3 adet tür seçmelisiniz.", "", JOptionPane.WARNING_MESSAGE);
        }
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void aksiyonBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aksiyonBoxActionPerformed
        // TODO add your handling code here:
        if (aksiyonBox.isSelected()) {
            secilen.add(aksiyonBox.getText());
            count++;
        } else {
            secilen.remove(aksiyonBox.getText());
            count--;
        }
    }//GEN-LAST:event_aksiyonBoxActionPerformed

    private void belgeselBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_belgeselBoxActionPerformed
        // TODO add your handling code here:
        if (belgeselBox.isSelected()) {
            secilen.add(belgeselBox.getText());
            count++;
        } else {
            secilen.remove(belgeselBox.getText());
            count--;
        }
    }//GEN-LAST:event_belgeselBoxActionPerformed

    private void fantastikBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fantastikBoxActionPerformed
        // TODO add your handling code here:
        if (fantastikBox.isSelected()) {
            secilen.add(fantastikBox.getText());
            count++;
        } else {
            secilen.remove(fantastikBox.getText());
            count--;
        }
    }//GEN-LAST:event_fantastikBoxActionPerformed

    private void bilimvedoğaBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bilimvedoğaBoxActionPerformed
        // TODO add your handling code here:
        if (bilimvedoğaBox.isSelected()) {
            secilen.add(bilimvedoğaBox.getText());
            count++;
        } else {
            secilen.remove(bilimvedoğaBox.getText());
            count--;
        }
    }//GEN-LAST:event_bilimvedoğaBoxActionPerformed

    private void çocukBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_çocukBoxActionPerformed
        // TODO add your handling code here:
        if (çocukBox.isSelected()) {
            secilen.add(çocukBox.getText());
            count++;
        } else {
            secilen.remove(çocukBox.getText());
            count--;
        }
    }//GEN-LAST:event_çocukBoxActionPerformed

    private void dramaBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dramaBoxActionPerformed
        // TODO add your handling code here:
        if (dramaBox.isSelected()) {
            secilen.add(dramaBox.getText());
            count++;
        } else {
            secilen.remove(dramaBox.getText());
            count--;
        }
    }//GEN-LAST:event_dramaBoxActionPerformed

    private void gerilimBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gerilimBoxActionPerformed
        // TODO add your handling code here:
        if (gerilimBox.isSelected()) {
            secilen.add(gerilimBox.getText());
            count++;
        } else {
            secilen.remove(gerilimBox.getText());
            count--;
        }
    }//GEN-LAST:event_gerilimBoxActionPerformed

    private void komediBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_komediBoxActionPerformed
        // TODO add your handling code here:
        if (komediBox.isSelected()) {
            secilen.add(komediBox.getText());
            count++;
        } else {
            secilen.remove(komediBox.getText());
            count--;
        }
    }//GEN-LAST:event_komediBoxActionPerformed

    private void korkuBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_korkuBoxActionPerformed
        // TODO add your handling code here:
        if (korkuBox.isSelected()) {
            secilen.add(korkuBox.getText());
            count++;
        } else {
            secilen.remove(korkuBox.getText());
            count--;
        }
    }//GEN-LAST:event_korkuBoxActionPerformed

    private void romantikBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_romantikBoxActionPerformed
        // TODO add your handling code here:
        if (romantikBox.isSelected()) {
            secilen.add(romantikBox.getText());
            count++;
        } else {
            secilen.remove(romantikBox.getText());
            count--;
        }
    }//GEN-LAST:event_romantikBoxActionPerformed

    private void realityBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_realityBoxActionPerformed
        // TODO add your handling code here:
        if (realityBox.isSelected()) {
            secilen.add(realityBox.getText());
            count++;
        } else {
            secilen.remove(realityBox.getText());
            count--;
        }
    }//GEN-LAST:event_realityBoxActionPerformed

    private void animeBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_animeBoxActionPerformed
        // TODO add your handling code here:
        if (animeBox.isSelected()) {
            secilen.add(animeBox.getText());
            count++;
        } else {
            secilen.remove(animeBox.getText());
            count--;
        }
    }//GEN-LAST:event_animeBoxActionPerformed

    private void bilimkurguBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bilimkurguBoxActionPerformed
        // TODO add your handling code here:
        if (bilimkurguBox.isSelected()) {
            secilen.add(bilimkurguBox.getText());
            count++;
        } else {
            secilen.remove(bilimkurguBox.getText());
            count--;
        }
    }//GEN-LAST:event_bilimkurguBoxActionPerformed

    private void OturumAçActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OturumAçActionPerformed
        // TODO add your handling code here:
        
        girisEkrani gE = new girisEkrani();
        gE.setVisible(true);
        dispose();
    }//GEN-LAST:event_OturumAçActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
       // JOptionPane.showMessageDialog(null, "Kaydınız Başarıyla Tamamlandı!","", JOptionPane.WARNING_MESSAGE);
        Object[] sorgu = {"OTURUM AÇ"};
        int sorgu2 = JOptionPane.showOptionDialog(rootPane,"Şimdi Oturum Açmak İster Misiniz ?" , "Kaydınız Başarıyla Tamamlandı!", JOptionPane.OK_OPTION, JOptionPane.QUESTION_MESSAGE, null, (Object[]) sorgu, sorgu[0]);
        if(sorgu2==0)
        {
            girisEkrani g = new girisEkrani();
            g.setVisible(true);
            dispose();
        }
       /* yonetimEkrani ye = new yonetimEkrani();
        ye.setVisible(true);
        dispose();*/
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(turSecimiEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(turSecimiEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(turSecimiEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(turSecimiEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new turSecimiEkrani().setVisible(true);
            }
        });
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AksiyonveMacera;
    private javax.swing.JLabel Anime;
    private javax.swing.JLabel Belgesel;
    private javax.swing.JLabel BilimKurgu;
    private javax.swing.JLabel BilimveDoğa;
    private javax.swing.JLabel Drama;
    private javax.swing.JLabel FantastikYapımlar;
    private javax.swing.JLabel Gerilim;
    private javax.swing.JLabel Komedi;
    private javax.swing.JLabel Korku;
    private javax.swing.JButton OturumAç;
    private javax.swing.JLabel RealityProgram;
    private javax.swing.JLabel Romantik;
    private javax.swing.JLabel Tür1;
    private javax.swing.JLabel Tür11;
    private javax.swing.JLabel Tür12;
    private javax.swing.JLabel Tür2;
    private javax.swing.JLabel Tür21;
    private javax.swing.JLabel Tür22;
    private javax.swing.JLabel Tür3;
    private javax.swing.JLabel Tür31;
    private javax.swing.JLabel Tür32;
    private javax.swing.JCheckBox aksiyonBox;
    private javax.swing.JLabel amblem;
    private javax.swing.JCheckBox animeBox;
    private javax.swing.JCheckBox belgeselBox;
    private javax.swing.JCheckBox bilimkurguBox;
    private javax.swing.JCheckBox bilimvedoğaBox;
    private javax.swing.JCheckBox dramaBox;
    private javax.swing.JCheckBox fantastikBox;
    private javax.swing.JCheckBox gerilimBox;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JCheckBox komediBox;
    private javax.swing.JCheckBox korkuBox;
    private javax.swing.JCheckBox realityBox;
    private javax.swing.JCheckBox romantikBox;
    private javax.swing.JLabel ÇocukveAile;
    private javax.swing.JCheckBox çocukBox;
    // End of variables declaration//GEN-END:variables

}
