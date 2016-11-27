/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grayscale.demo;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/**
 *
 * @author Ryan Fadholi
 */
public class GrayscaleDemo {

    private static BufferedImage sourceImage;
    private static BufferedImage processedImage;

    public static BufferedImage getSourceImage() {
        return sourceImage;
    }

    public static BufferedImage getProcessedImage() {
        return processedImage;
    }
    
    public static void processGrayscaleAverage(){
        //Converts a color image to a Grayscale image, according to the Average formula.
        BufferedImage image = GrayscaleDemo.processedImage;
        for (int i = 0; i < image.getHeight(); i++) {
            for (int j = 0; j < image.getWidth(); j++) {
                int rgb = image.getRGB(j, i);
                Color currentPixel = new Color(rgb,true);
                //Find the average from all the color components for the given pixel.
                int grayLevel = (currentPixel.getRed() 
                                    + currentPixel.getGreen() 
                                    + currentPixel.getBlue()) / 3;
                
                Color grayColor = new Color(grayLevel,grayLevel,grayLevel);
                image.setRGB(j,i, grayColor.getRGB());
            }
        }
    }
    
    public static void processGrayscaleLuma(){
        //Converts a color image to a Grayscale image, according to the Luma Formula.
        BufferedImage image = GrayscaleDemo.processedImage;
        for (int i = 0; i < image.getHeight(); i++) {
            for (int j = 0; j < image.getWidth(); j++) {
                int rgb = image.getRGB(j, i);
                Color currentPixel = new Color(rgb,true);
                //Find the average from all the color components for the given pixel.
                double redColor = currentPixel.getRed() * 0.3;
                double greenColor = currentPixel.getGreen() * 0.59;
                double blueColor = currentPixel.getBlue() * 0.11;
                int grayLevel = (int)((redColor + greenColor + blueColor) / 3);
              
                Color grayColor = new Color(grayLevel,grayLevel,grayLevel);
                image.setRGB(j,i, grayColor.getRGB());
            }
        }
    }
    
    
    public static void saveSourceImage(String fileLocation, String imageType){
        
        File temp = new File(fileLocation);
        
        try {
            ImageIO.write(sourceImage, imageType, temp);
        } catch (IOException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
     public static void saveProcessedImage(String fileLocation, String imageType){
        
        File temp = new File(fileLocation);
        
        try {
            ImageIO.write(processedImage, imageType, temp);
        } catch (IOException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     
    public static boolean setImage(String fileDir){
         try {
            sourceImage = ImageIO.read(new File(fileDir));
            processedImage = ImageIO.read(new File(fileDir));
        } catch (IOException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }
    
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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }
}
