/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Images;

/**
 *
 * @author Mark
 */
import java.awt.*;
import java.io.*;
import javax.swing.*;
public class LoadAnImage {
    public ImageIcon ImageIcon(String filename){
        ImageIcon icon = new ImageIcon(filename);
        return icon;
    }
    public static void main(String[] args) throws IOException {
        LoadAnImage icon = new LoadAnImage(); 
        ImageIcon image = icon.ImageIcon("C:/Users/Mark/Desktop/images/baby.jpg"); // Fill in the path to an existing image
        
        //Check if file exists or not.
        File file = new File(image.toString()); //THIS DOESNT WORK BECAUSE HE CANT FIND SYMBOL CONSTRUCTOR FILE.
        boolean exists = file.exists();
    if (!exists) {
      // It returns false if File or directory does not exist
      System.out.println("the file or directory you are searching does not exist : " + exists);
    }else{
      // It returns true if File or directory exists
      System.out.println("the file or directory you are searching does exist : " + exists);
      JLabel label = new JLabel(); //Make new label where image will be on printed.
        label.setIcon(image);
        JFrame gallery = new JFrame();
        gallery.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gallery.getContentPane().add(label);
        gallery.pack();
        gallery.setLocation(500,450);
        gallery.setVisible(true);
      
    }
  }
}