/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grayscale.demo;

import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
/**
 *
 * @author Ryan Fadholi
 * Based on Rezi Apriliansyah's Citra GUI
 */

public class GUI extends javax.swing.JFrame {
    private String file;
    /**
     * Creates new form ImageProcessing
     */
    public GUI() {
        initComponents();
        
        //Sets the frame position to the center of the screen.
        this.setLocationRelativeTo(null);
        
        mSaveProcessed.setEnabled(false);
        mPreprocessing.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Pilih_file = new javax.swing.JFileChooser();
        Tempat_Gambar1 = new javax.swing.JScrollPane();
        Gambar1 = new javax.swing.JLabel();
        Tempat_Gambar2 = new javax.swing.JScrollPane();
        Gambar2 = new javax.swing.JLabel();
        leftImageLabel = new javax.swing.JLabel();
        rightImageLabel = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mFile = new javax.swing.JMenu();
        mLoad_Image = new javax.swing.JMenuItem();
        mSaveProcessed = new javax.swing.JMenu();
        ProcessedBMP = new javax.swing.JMenuItem();
        ProcessedJPG = new javax.swing.JMenuItem();
        ProcessedPNG = new javax.swing.JMenuItem();
        mClose = new javax.swing.JMenuItem();
        mPreprocessing = new javax.swing.JMenu();
        mGrayscaleAverage = new javax.swing.JMenuItem();
        mGrayscaleLuma = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("RGB -> Grayscale Conversion Demo");
        setMinimumSize(new java.awt.Dimension(600, 400));
        setResizable(false);
        setSize(new java.awt.Dimension(1200, 800));

        Tempat_Gambar1.setViewportView(Gambar1);

        Tempat_Gambar2.setViewportView(Gambar2);

        leftImageLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        leftImageLabel.setText("Source Image");

        rightImageLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rightImageLabel.setText("Processed Image");

        jMenuBar1.setPreferredSize(new java.awt.Dimension(110, 21));

        mFile.setText("File");

        mLoad_Image.setText("Load Image");
        mLoad_Image.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mLoad_ImageActionPerformed(evt);
            }
        });
        mFile.add(mLoad_Image);

        mSaveProcessed.setLabel("Save Processed Image As....");

        ProcessedBMP.setText("BMP");
        ProcessedBMP.setToolTipText("");
        ProcessedBMP.setPreferredSize(new java.awt.Dimension(50, 22));
        ProcessedBMP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProcessedBMPActionPerformed(evt);
            }
        });
        mSaveProcessed.add(ProcessedBMP);

        ProcessedJPG.setText("JPG");
        ProcessedJPG.setPreferredSize(new java.awt.Dimension(50, 22));
        ProcessedJPG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProcessedJPGActionPerformed(evt);
            }
        });
        mSaveProcessed.add(ProcessedJPG);

        ProcessedPNG.setText("PNG");
        ProcessedPNG.setPreferredSize(new java.awt.Dimension(50, 22));
        ProcessedPNG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProcessedPNGActionPerformed(evt);
            }
        });
        mSaveProcessed.add(ProcessedPNG);

        mFile.add(mSaveProcessed);

        mClose.setText("Close");
        mClose.setName(""); // NOI18N
        mClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mCloseActionPerformed(evt);
            }
        });
        mFile.add(mClose);

        jMenuBar1.add(mFile);

        mPreprocessing.setText("Processing");

        mGrayscaleAverage.setText("Grayscale");
        mGrayscaleAverage.setActionCommand("Grayscale (Average)");
        mGrayscaleAverage.setPreferredSize(new java.awt.Dimension(180, 22));
        mGrayscaleAverage.setRequestFocusEnabled(false);
        mGrayscaleAverage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mGrayscaleAverageActionPerformed(evt);
            }
        });
        mPreprocessing.add(mGrayscaleAverage);

        mGrayscaleLuma.setText("Grayscale (Luma)");
        mGrayscaleLuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mGrayscaleLumaActionPerformed(evt);
            }
        });
        mPreprocessing.add(mGrayscaleLuma);

        jMenuBar1.add(mPreprocessing);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Tempat_Gambar1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(leftImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 276, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Tempat_Gambar2, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rightImageLabel))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(leftImageLabel)
                    .addComponent(rightImageLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Tempat_Gambar2, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)
                    .addComponent(Tempat_Gambar1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RefreshImageCanvas(boolean showRightImage){
         ImageIcon leftIcon = new ImageIcon(GrayscaleDemo.getSourceImage());
         ImageIcon rightIcon = new ImageIcon(GrayscaleDemo.getProcessedImage());
         
         mPreprocessing.setEnabled(true);
        
         Gambar1.setIcon(leftIcon);
         Tempat_Gambar1.getVerticalScrollBar().setValue(0);
         Tempat_Gambar1.getHorizontalScrollBar().setValue(0);
         
         if(showRightImage){
             Gambar2.setIcon(rightIcon);
             Tempat_Gambar1.getVerticalScrollBar().setValue(0);
             Tempat_Gambar1.getHorizontalScrollBar().setValue(0);
             mSaveProcessed.setEnabled(true);
         }
         else{
             Gambar2.setIcon(null);
         }
         
         Tempat_Gambar1.getVerticalScrollBar().setValue(0);
         Tempat_Gambar1.getHorizontalScrollBar().setValue(0);
         
    }
    
    private void chooseSaveDir(boolean isProcessed, String imageType){
        //Opens a dialogue where user can choose a directory, in this case
        //the directory will be used to save the source/processed image.
      
        String chosenDir;
        
        //Setting the File Chooser dialogue.
        JFileChooser chooser = new JFileChooser();
        chooser.setCurrentDirectory(new java.io.File("."));
        chooser.setDialogTitle("Choose Saving Directory");
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        chooser.setAcceptAllFileFilterUsed(false);

        //If the user selected a valid directory, open a SaveDialog_GUI
        //directed to the directory chosen.
        if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            chosenDir = chooser.getSelectedFile().toString();
            new SaveDialog_GUI(chosenDir,isProcessed,imageType).setVisible(true);
        } else {
            System.out.println("No Selection ");
        }
    }
    
    private void mGrayscaleAverageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mGrayscaleAverageActionPerformed

        GrayscaleDemo.processGrayscaleAverage();
        RefreshImageCanvas(true);
    }//GEN-LAST:event_mGrayscaleAverageActionPerformed

    private void mCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mCloseActionPerformed
        dispose();
    }//GEN-LAST:event_mCloseActionPerformed

    private void mLoad_ImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mLoad_ImageActionPerformed

        FileNameExtensionFilter textFilter = new FileNameExtensionFilter("Image file","bmp","jpg","png");
        Pilih_file.setFileFilter(textFilter);
        Pilih_file.setSelectedFile(null);
        Pilih_file.showOpenDialog(this);
        file = Pilih_file.getSelectedFile().toString();
        
        //Try to load image into a BufferedImage. Show the loaded image to
        //the left pane if loading is successful.
        if(GrayscaleDemo.setImage(file)){
            RefreshImageCanvas(false);
        }
    }//GEN-LAST:event_mLoad_ImageActionPerformed

    private void ProcessedBMPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProcessedBMPActionPerformed
        chooseSaveDir(true,"BMP");
    }//GEN-LAST:event_ProcessedBMPActionPerformed

    private void ProcessedJPGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProcessedJPGActionPerformed
        chooseSaveDir(true,"JPG");
    }//GEN-LAST:event_ProcessedJPGActionPerformed

    private void ProcessedPNGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProcessedPNGActionPerformed
        chooseSaveDir(true,"PNG");
    }//GEN-LAST:event_ProcessedPNGActionPerformed

    private void mGrayscaleLumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mGrayscaleLumaActionPerformed
        
        GrayscaleDemo.processGrayscaleLuma();
        RefreshImageCanvas(true);
    }//GEN-LAST:event_mGrayscaleLumaActionPerformed
     
    /**
     * @param args the command line arguments
     */
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Gambar1;
    private javax.swing.JLabel Gambar2;
    private javax.swing.JFileChooser Pilih_file;
    private javax.swing.JMenuItem ProcessedBMP;
    private javax.swing.JMenuItem ProcessedJPG;
    private javax.swing.JMenuItem ProcessedPNG;
    private javax.swing.JScrollPane Tempat_Gambar1;
    private javax.swing.JScrollPane Tempat_Gambar2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel leftImageLabel;
    private javax.swing.JMenuItem mClose;
    private javax.swing.JMenu mFile;
    private javax.swing.JMenuItem mGrayscaleAverage;
    private javax.swing.JMenuItem mGrayscaleLuma;
    private javax.swing.JMenuItem mLoad_Image;
    private javax.swing.JMenu mPreprocessing;
    private javax.swing.JMenu mSaveProcessed;
    private javax.swing.JLabel rightImageLabel;
    // End of variables declaration//GEN-END:variables
}
