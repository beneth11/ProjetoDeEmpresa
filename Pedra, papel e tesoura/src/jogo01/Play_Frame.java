/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rock_paper_scissors;

import java.awt.Color;
import java.awt.Image;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

/**
 *
 * @author 1BestCsharp
 */
public class Play_Frame extends javax.swing.JFrame {

    
    // create borders
    Border gray_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.DARK_GRAY);
    Border orange_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.ORANGE);
    
    // images path
    String rock = "br/edu/imagens/rock.png";
    String paper = "br/edu/imagens/paper.png";
    String scissors = "br/edu/imagens/scissors.png";
    
    // create an arraylist
    ArrayList<String> list = new ArrayList<>();
    Random random = new Random();
    int your_wins = 0, computer_wins = 0;
    String random_selection;
    
    
    /**
     * Creates new form Play_Frame
     */
    public Play_Frame() {
        initComponents();
        
        // set borders
        jLabel_You.setBorder(gray_border);
        jLabel_Computer.setBorder(gray_border);
        jLabel_Rock_.setBorder(gray_border);
        jLabel_Paper_.setBorder(gray_border);
        jLabel_Scissors.setBorder(gray_border);
        
        // display images in jlabels
        displayImage(rock, jLabel_Rock_, 110,90);
        displayImage(paper, jLabel_Paper_, 110,90);
        displayImage(scissors, jLabel_Scissors, 110,90);
        
        // add items to the list
        list.add(rock);
        list.add(paper);
        list.add(scissors);
        
    }
    
    
    // create a function to display images in jlabel
    public void displayImage(String imagePath, JLabel label, int width, int height)
    {
        /*
        ****** Images You Can Use ******
        
        https://pixabay.com/vectors/stone-rock-nature-pebble-zen-576268/
        https://pixabay.com/vectors/certificate-paper-parchment-roll-154169/
        https://pixabay.com/vectors/scissors-cut-hairdresser-1297454/
        
        OR
        https://pixabay.com/vectors/rock-paper-scissors-rock-hand-296854/
        https://pixabay.com/vectors/rock-paper-scissors-scissors-hand-296853/
        https://pixabay.com/vectors/rock-paper-scissors-paper-hand-296855/
        
        */
        
        // get the image
        ImageIcon imgIco = new ImageIcon(getClass().getResource(imagePath));
        
        // resize the image
        Image img = imgIco.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
        
        // set image into the jLabel
        label.setIcon(new ImageIcon(img));
        
    }
    
    
    // creat a function to get the winner
    public void getWinner(String you, String computer)
    {
        if(you.equals(computer))
        {
            System.out.println("Draw");
        }
        else if(you.equals(rock))
        {
            if(computer.equals(scissors))
            {
                your_wins++;
                jLabel_YourWins.setText(String.valueOf(your_wins));
            }
            else
            {
                computer_wins++;
                jLabel_ComputerWins.setText(String.valueOf(computer_wins));
            }
        }
        
        else if(you.equals(paper))
        {
            if(computer.equals(rock))
            {
                your_wins++;
                jLabel_YourWins.setText(String.valueOf(your_wins));
            }
            else
            {
                computer_wins++;
                jLabel_ComputerWins.setText(String.valueOf(computer_wins));
            }
        }
        
        
        
        else if(you.equals(scissors))
        {
            if(computer.equals(paper))
            {
                your_wins++;
                jLabel_YourWins.setText(String.valueOf(your_wins));
            }
            else
            {
                computer_wins++;
                jLabel_ComputerWins.setText(String.valueOf(computer_wins));
            }
        }
           
        // you can stop when you or the computer reach 3 wins
        // if you want to just keep playing
        // remove this if section
        /*
        if(your_wins == 3 || computer_wins == 3)
        {
            int yes_no = JOptionPane.showConfirmDialog(null, "Play a New Partie", "Play Again", JOptionPane.YES_NO_OPTION);
            if(yes_no == 0)// yes == 0
            {
                jLabel_Computer.setIcon(null);
                jLabel_You.setIcon(null);
                your_wins = 0;
                computer_wins = 0;
                jLabel_YourWins.setText(String.valueOf(your_wins));
                jLabel_ComputerWins.setText(String.valueOf(computer_wins));
            }
            
        }*/
        
        
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
        jLabel_You = new javax.swing.JLabel();
        jLabel_Computer = new javax.swing.JLabel();
        jLabel_YourWins = new javax.swing.JLabel();
        jLabel_ComputerWins = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel_Rock_ = new javax.swing.JLabel();
        jLabel_Paper_ = new javax.swing.JLabel();
        jLabel_Scissors = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel_You.setBackground(new java.awt.Color(204, 204, 255));
        jLabel_You.setOpaque(true);

        jLabel_Computer.setBackground(new java.awt.Color(204, 204, 255));
        jLabel_Computer.setOpaque(true);

        jLabel_YourWins.setFont(new java.awt.Font("SansSerif", 0, 36)); // NOI18N
        jLabel_YourWins.setForeground(new java.awt.Color(0, 153, 51));
        jLabel_YourWins.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel_YourWins.setText("0");

        jLabel_ComputerWins.setFont(new java.awt.Font("SansSerif", 0, 36)); // NOI18N
        jLabel_ComputerWins.setForeground(new java.awt.Color(255, 0, 0));
        jLabel_ComputerWins.setText("0");

        jLabel5.setFont(new java.awt.Font("SansSerif", 0, 36)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("-");

        jLabel_Rock_.setBackground(new java.awt.Color(204, 204, 255));
        jLabel_Rock_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_Rock_.setOpaque(true);
        jLabel_Rock_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_Rock_MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_Rock_MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_Rock_MouseExited(evt);
            }
        });

        jLabel_Paper_.setBackground(new java.awt.Color(204, 204, 255));
        jLabel_Paper_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_Paper_.setOpaque(true);
        jLabel_Paper_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_Paper_MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_Paper_MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_Paper_MouseExited(evt);
            }
        });

        jLabel_Scissors.setBackground(new java.awt.Color(204, 204, 255));
        jLabel_Scissors.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_Scissors.setOpaque(true);
        jLabel_Scissors.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_ScissorsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_ScissorsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_ScissorsMouseExited(evt);
            }
        });

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Você");

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Computador");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(jLabel_Rock_, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel_Paper_, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel_Scissors, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(119, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                    .addComponent(jLabel_You, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_YourWins, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel_ComputerWins, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel_Computer, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(43, 43, 43))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel_Computer, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                            .addComponent(jLabel_You, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_YourWins, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_ComputerWins, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_Rock_, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Paper_, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Scissors, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
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

    private void jLabel_Rock_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Rock_MouseClicked
        // display rock image
        displayImage(rock, jLabel_You,160,120);
        // make a random selection
        random_selection = list.get(random.nextInt(list.size()));
        // display image 
        displayImage(random_selection, jLabel_Computer,160,120);
        getWinner(rock, random_selection);
    }//GEN-LAST:event_jLabel_Rock_MouseClicked

    private void jLabel_Paper_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Paper_MouseClicked
        // display paper image
        displayImage(paper, jLabel_You,160,120);
        // make a random selection
        random_selection = list.get(random.nextInt(list.size()));
        // display image 
        displayImage(random_selection, jLabel_Computer,160,120);
        getWinner(paper, random_selection);
    }//GEN-LAST:event_jLabel_Paper_MouseClicked

    private void jLabel_ScissorsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_ScissorsMouseClicked
       // display scissors image
       displayImage(scissors, jLabel_You,160,120);
       // make a random selection
        random_selection = list.get(random.nextInt(list.size()));
        // display image 
        displayImage(random_selection, jLabel_Computer,160,120);
        getWinner(scissors, random_selection);
    }//GEN-LAST:event_jLabel_ScissorsMouseClicked

    private void jLabel_Rock_MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Rock_MouseEntered
        // change border
        jLabel_Rock_.setBorder(orange_border);
    }//GEN-LAST:event_jLabel_Rock_MouseEntered

    private void jLabel_Rock_MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Rock_MouseExited
        // change border
        jLabel_Rock_.setBorder(gray_border);
    }//GEN-LAST:event_jLabel_Rock_MouseExited

    private void jLabel_Paper_MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Paper_MouseEntered
        // change border
        jLabel_Paper_.setBorder(orange_border);
    }//GEN-LAST:event_jLabel_Paper_MouseEntered

    private void jLabel_Paper_MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Paper_MouseExited
        // change border
        jLabel_Paper_.setBorder(gray_border);
    }//GEN-LAST:event_jLabel_Paper_MouseExited

    private void jLabel_ScissorsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_ScissorsMouseEntered
        // change border
        jLabel_Scissors.setBorder(orange_border);
    }//GEN-LAST:event_jLabel_ScissorsMouseEntered

    private void jLabel_ScissorsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_ScissorsMouseExited
        // change border
        jLabel_Scissors.setBorder(gray_border);
    }//GEN-LAST:event_jLabel_ScissorsMouseExited

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
            java.util.logging.Logger.getLogger(Play_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Play_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Play_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Play_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Play_Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_Computer;
    private javax.swing.JLabel jLabel_ComputerWins;
    private javax.swing.JLabel jLabel_Paper_;
    private javax.swing.JLabel jLabel_Rock_;
    private javax.swing.JLabel jLabel_Scissors;
    private javax.swing.JLabel jLabel_You;
    private javax.swing.JLabel jLabel_YourWins;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
