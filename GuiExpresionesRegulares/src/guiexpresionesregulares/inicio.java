package guiexpresionesregulares;

import java.awt.Event;
import java.io.*;
import java.nio.file.Files;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.*;

public class inicio extends javax.swing.JFrame {

    JFileChooser sec = new JFileChooser();
    File archivo;

    FileInputStream entrada;
    FileOutputStream salida;

    public inicio() {
        initComponents();
    }

    public String AbrirArchivo(File archivo) {
        String documento = "";
        try {
            entrada = new FileInputStream(archivo);
            int ascci;
            while ((ascci = entrada.read()) != -1) {
                char caracter = (char) ascci;
                documento += caracter;
            }
        } catch (Exception e) {
        }
        return documento;
    }

    private String regexJava(String _rg) {
        Pattern regex = Pattern.compile(_rg);
        String ln = "", text = "";
        Matcher emparejador = regex.matcher(txtarea.getText());
        boolean esCoincidente;
        while(esCoincidente = emparejador.find()){
            text += emparejador.group();
        }
        return text;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        btnabrir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtarea = new javax.swing.JTextArea();
        btncomillas = new javax.swing.JButton();
        btncomillas1 = new javax.swing.JButton();
        btncomillas2 = new javax.swing.JButton();
        btncomillas3 = new javax.swing.JButton();
        btncomillas4 = new javax.swing.JButton();
        btncomillas5 = new javax.swing.JButton();
        btncomillas6 = new javax.swing.JButton();
        btncomillas7 = new javax.swing.JButton();
        btncomillas8 = new javax.swing.JButton();
        btncomillas9 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnabrir.setText("Abrir Archivo");
        btnabrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnabrirActionPerformed(evt);
            }
        });

        txtarea.setColumns(20);
        txtarea.setRows(5);
        jScrollPane1.setViewportView(txtarea);

        btncomillas.setText("Comillas");
        btncomillas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncomillasActionPerformed(evt);
            }
        });

        btncomillas1.setText("Longitud 7 o mas");
        btncomillas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncomillas1ActionPerformed(evt);
            }
        });

        btncomillas2.setText("Finalizar no vocal");
        btncomillas2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncomillas2ActionPerformed(evt);
            }
        });

        btncomillas3.setText("Inician con M ");
        btncomillas3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncomillas3ActionPerformed(evt);
            }
        });

        btncomillas4.setText("IP");
        btncomillas4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncomillas4ActionPerformed(evt);
            }
        });

        btncomillas5.setText("Fecha y hora");
        btncomillas5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncomillas5ActionPerformed(evt);
            }
        });

        btncomillas6.setText("Correos electronicos");
        btncomillas6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncomillas6ActionPerformed(evt);
            }
        });

        btncomillas7.setText("Telefonos");
        btncomillas7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncomillas7ActionPerformed(evt);
            }
        });

        btncomillas8.setText("URL");
        btncomillas8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncomillas8ActionPerformed(evt);
            }
        });

        btncomillas9.setText("Codigo postal");
        btncomillas9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncomillas9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 531, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnabrir))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btncomillas5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btncomillas7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btncomillas6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btncomillas8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btncomillas9))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btncomillas1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btncomillas2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btncomillas3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btncomillas)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btncomillas4)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btncomillas1)
                    .addComponent(btncomillas2)
                    .addComponent(btncomillas3)
                    .addComponent(btncomillas)
                    .addComponent(btncomillas4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btncomillas5)
                    .addComponent(btncomillas7)
                    .addComponent(btncomillas6)
                    .addComponent(btncomillas8)
                    .addComponent(btncomillas9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnabrir)
                .addGap(13, 13, 13))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnabrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnabrirActionPerformed
        if (sec.showDialog(null, "abrir") == JFileChooser.APPROVE_OPTION) {
            archivo = sec.getSelectedFile();
            if (archivo.canRead()) {
                if (archivo.getName().endsWith("txt")) {
                    String documento = AbrirArchivo(archivo);
                    txtarea.setText(documento);
                } else {
                    JOptionPane.showMessageDialog(null, "Archivo no compatible");
                }
            }
        }
        txtarea.setEditable(true);
        // String [] lineas = txtarea.split("\n");
    }//GEN-LAST:event_btnabrirActionPerformed

    private void btncomillasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncomillasActionPerformed

                JOptionPane.showMessageDialog(this, regexJava("'([^”])*'"));
    }//GEN-LAST:event_btncomillasActionPerformed

    private void btncomillas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncomillas1ActionPerformed
        JOptionPane.showMessageDialog(this, regexJava("[a-zA-Z]{7,}"));
    }//GEN-LAST:event_btncomillas1ActionPerformed

    private void btncomillas2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncomillas2ActionPerformed
        JOptionPane.showMessageDialog(this, regexJava("[a-zA-ZAáéíóú]+([^aeiou]$)"));
    }//GEN-LAST:event_btncomillas2ActionPerformed

    private void btncomillas3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncomillas3ActionPerformed
       JOptionPane.showMessageDialog(this, regexJava("M([b-d]|[f-h]|[j-n]|[p-t]|[v-z])+[a-z]{0,}"));
    }//GEN-LAST:event_btncomillas3ActionPerformed

    private void btncomillas4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncomillas4ActionPerformed
     JOptionPane.showMessageDialog(this, regexJava("^([1-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])(\\.([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])){3}$"));
    }//GEN-LAST:event_btncomillas4ActionPerformed

    private void btncomillas5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncomillas5ActionPerformed
        JOptionPane.showMessageDialog(this, regexJava("^([0][1-9]|[12][0-9]|3[01])(\\/|-)([0][1-9]|[1][0-2])\\2(\\d{4})(\\s)([0-1][1-9]|[2][0-3])(:)([0-5][0-9])$"));
    }//GEN-LAST:event_btncomillas5ActionPerformed

    private void btncomillas6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncomillas6ActionPerformed
        JOptionPane.showMessageDialog(this, regexJava("[A-Za-z]+@[a-z]+\\.[a-z]+ "));
    }//GEN-LAST:event_btncomillas6ActionPerformed

    private void btncomillas7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncomillas7ActionPerformed
       JOptionPane.showMessageDialog(this, regexJava( "(?:[+]?(?:[0-9]{1,5}|\\\\x28[0-9]{1,5}\\\\x29)[ ]?)?[0-9]{2}(?:[0-9][ ]?){6}[0-9]"));
    }//GEN-LAST:event_btncomillas7ActionPerformed

    private void btncomillas8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncomillas8ActionPerformed
       JOptionPane.showMessageDialog(this, regexJava("(https?:\\/\\/(?:www\\.|(?!www))[a-zA-Z0-9][a-zA-Z0-9-]+[a-zA-Z0-9]\\.[^\\s]{2,}|www\\.[a-zA-Z0-9][a-zA-Z0-9-]+[a-zA-Z0-9]\\.[^\\s]{2,}|https?:\\/\\/(?:www\\.|(?!www))[a-zA-Z0-9]\\.[^\\s]{2,}|www\\.[a-zA-Z0-9]\\.[^\\s]{2,})"));
    }//GEN-LAST:event_btncomillas8ActionPerformed

    private void btncomillas9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncomillas9ActionPerformed
        JOptionPane.showMessageDialog(this, regexJava("^\\d{4,5}$"));
    }//GEN-LAST:event_btncomillas9ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnabrir;
    private javax.swing.JButton btncomillas;
    private javax.swing.JButton btncomillas1;
    private javax.swing.JButton btncomillas2;
    private javax.swing.JButton btncomillas3;
    private javax.swing.JButton btncomillas4;
    private javax.swing.JButton btncomillas5;
    private javax.swing.JButton btncomillas6;
    private javax.swing.JButton btncomillas7;
    private javax.swing.JButton btncomillas8;
    private javax.swing.JButton btncomillas9;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtarea;
    // End of variables declaration//GEN-END:variables
}
