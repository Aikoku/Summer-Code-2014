/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Images;

//import com.mpatric.mp3agic.ID3v2;
//import com.mpatric.mp3agic.Mp3File;
//import java.io.RandomAccessFile;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.io.File;
import java.util.*;

/**
 *
 * @author Mark
 */
public class ImageViewer extends javax.swing.JFrame {

    /**
     * Creates new form ImageViewer
     */
    static private String newline = "\n";
    private JTextArea log;
    private JFileChooser fc;
    
    public ImageViewer() {
//        initComponents();
        
       

        //Create the log first, because the action listener
        //needs to refer to it.
        log = new JTextArea(5,20);
        log.setMargin(new Insets(5,5,5,5));
        log.setEditable(false);
        JScrollPane logScrollPane = new JScrollPane(log);
        jButton2.addActionListener(this);

       
        add(logScrollPane, BorderLayout.CENTER);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Show");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Browse");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    String imgPath;
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        imgPath = jTextField1.getText();
//        "C:/Users/Mark/Desktop/images/fang.gif";
        System.out.println(imgPath);
        LoadAnImage icon = new LoadAnImage();
        ImageIcon image = icon.ImageIcon(imgPath);
        jLabel1.setIcon(image);
    }//GEN-LAST:event_jButton1ActionPerformed

    
    
    

//    private JTextArea log;
//    private JFileChooser fc;
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        //Set up the file chooser.
        if (fc == null) {
            fc = new JFileChooser();

	    //Add a custom file filter and disable the default
	    //(Accept All) file filter.
            fc.addChoosableFileFilter(new ImageFilter());
            fc.setAcceptAllFileFilterUsed(false);

	    //Add custom icons for file types.
            fc.setFileView(new ImageFileView());

	    //Add the preview pane.
            fc.setAccessory(new ImagePreview(fc));
        }
        
        
        //Show it.
        int returnVal = fc.showDialog(ImageViewer.this,
                                      "Attach");

        //Process the results.
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fc.getSelectedFile();
            log.append("Attaching file: " + file.getName()
                       + "." + newline);
        } else {
            log.append("Attachment cancelled by user." + newline);
        }
        log.setCaretPosition(log.getDocument().getLength());

        //Reset the file chooser for the next time it's shown.
        fc.setSelectedFile(null);
        
        
        
        
//        if (fc == null) {
//            fc = new JFileChooser();
//
//	    //Add a custom file filter and disable the default
//	    //(Accept All) file filter.
//            fc.addChoosableFileFilter(new ImageFilter());
//            fc.setAcceptAllFileFilterUsed(false);
//
//	    //Add custom icons for file types.
//            fc.setFileView(new ImageFileView());
//
//	    //Add the preview pane.
//            fc.setAccessory(new ImagePreview(fc));
//        }
//
//        //Show it.
//        int returnVal = fc.showDialog(ImageViewer.this,
//                                      "Attach");
//
//        //Process the results.
//        if (returnVal == JFileChooser.APPROVE_OPTION) {
//            File file = fc.getSelectedFile();
//            log.append("Attaching file: " + file.getName()
//                       + ".\n");
//            System.out.println("path "+ file.getPath());
//        } else {
//            log.append("Attachment cancelled by user.\n");
//        }
//        log.setCaretPosition(log.getDocument().getLength());
//
//        //Reset the file fc for the next time it's shown.
//        fc.setSelectedFile(null);
        
        
        
        
        
//        fc = new JFileChooser();
//        fc.setCurrentDirectory(new java.io.File("."));
////        fc.setDialogTitle(fctitle);
//        fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
//        fc.setAcceptAllFileFilterUsed(false);
//        
//        fc.setFileView(new ImageFileView());
//        fc.addChoosableFileFilter(new ImageFilter());
////        if (fc.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
////            System.out.println("getCurrentDirectory(): "
////                    + fc.getCurrentDirectory());
////            System.out.println("getSelectedFile() : "
////                    + fc.getSelectedFile());
////        LoadAnImage icon = new LoadAnImage();
////        imgPath = ""+fc.getSelectedFile();
////        ImageIcon image = icon.ImageIcon(imgPath);
////        jLabel1.setIcon(image);
////        } else {
////            System.out.println("No Selection ");
////        }
//        
//        
//        int returnVal = fc.showDialog(ImageViewer.this,
//                                      "Attach");
//        
//        if (returnVal == JFileChooser.APPROVE_OPTION) {
//            File file = fc.getSelectedFile();
//            
//            System.out.println("Attaching file: " + file.getPath()
//                       + ".\n");
//            log.append("Attaching file: " + file.getPath()
//                       + ".\n");
//        } else {
//            System.out.println("Attachment cancelled by user.\n");
//            log.append("Attachment cancelled by user.\n");
//        }
//        
//        System.out.println();
//        log.setCaretPosition(log.getDocument().getLength());
//
//        //Reset the file fc for the next time it's shown.
//        fc.setSelectedFile(null);

    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    
    private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("FileChooserDemo2");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Add content to the window.
        frame.add(new ImageViewer());

        //Display the window.
        frame.pack();
        frame.setVisible(true);
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
            java.util.logging.Logger.getLogger(ImageViewer.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ImageViewer.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ImageViewer.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ImageViewer.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new ImageViewer().setVisible(true);
                UIManager.put("swing.boldMetal", Boolean.FALSE);
                createAndShowGUI();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
