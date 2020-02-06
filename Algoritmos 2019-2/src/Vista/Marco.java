/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.Algoritmos;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Remote
 */
public class Marco extends javax.swing.JFrame {

    /**
     * Creates new form Marco
     */
    Algoritmos algoritmos = new Algoritmos();

    public Marco() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Btninsertion = new javax.swing.JButton();
        scrollArea = new javax.swing.JScrollPane();
        txtAreaRespuesta = new javax.swing.JTextArea();
        BtnBinarySort = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtInfo = new javax.swing.JTextArea();
        txtSalida = new javax.swing.JLabel();
        txtEntrada = new javax.swing.JLabel();
        BtnMerge = new javax.swing.JButton();
        BtnRecorridoMatriz = new javax.swing.JButton();
        BtnSelectionSort = new javax.swing.JButton();
        BtnBubble = new javax.swing.JButton();
        BtnShake = new javax.swing.JButton();
        BtnRadix = new javax.swing.JButton();
        BtnCouting = new javax.swing.JButton();
        BtnQuickSort = new javax.swing.JButton();
        BtnQuickSort4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        Btninsertion.setText("Insertion Sort");
        Btninsertion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtninsertionMouseClicked(evt);
            }
        });
        getContentPane().add(Btninsertion);
        Btninsertion.setBounds(380, 10, 110, 30);

        txtAreaRespuesta.setColumns(20);
        txtAreaRespuesta.setRows(5);
        txtAreaRespuesta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        scrollArea.setViewportView(txtAreaRespuesta);

        getContentPane().add(scrollArea);
        scrollArea.setBounds(0, 266, 530, 140);

        BtnBinarySort.setText("Binary Sort");
        BtnBinarySort.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnBinarySortMouseClicked(evt);
            }
        });
        getContentPane().add(BtnBinarySort);
        BtnBinarySort.setBounds(380, 60, 110, 30);

        txtInfo.setColumns(20);
        txtInfo.setRows(5);
        txtInfo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jScrollPane1.setViewportView(txtInfo);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 140, 530, 96);

        txtSalida.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtSalida.setText("Salida:");
        getContentPane().add(txtSalida);
        txtSalida.setBounds(0, 230, 100, 40);

        txtEntrada.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtEntrada.setText("Entrada:");
        getContentPane().add(txtEntrada);
        txtEntrada.setBounds(0, 110, 80, 30);

        BtnMerge.setText("MergeSort");
        BtnMerge.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnMergeMouseClicked(evt);
            }
        });
        getContentPane().add(BtnMerge);
        BtnMerge.setBounds(260, 60, 110, 30);

        BtnRecorridoMatriz.setText("AlgoritmosRecorrido");
        BtnRecorridoMatriz.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnRecorridoMatrizMouseClicked(evt);
            }
        });
        getContentPane().add(BtnRecorridoMatriz);
        BtnRecorridoMatriz.setBounds(190, 100, 130, 30);

        BtnSelectionSort.setText("Selection Sort");
        getContentPane().add(BtnSelectionSort);
        BtnSelectionSort.setBounds(260, 10, 110, 30);

        BtnBubble.setText("Bubble Sort");
        getContentPane().add(BtnBubble);
        BtnBubble.setBounds(130, 10, 120, 30);

        BtnShake.setText("Shake Sort");
        BtnShake.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnShakeMouseClicked(evt);
            }
        });
        getContentPane().add(BtnShake);
        BtnShake.setBounds(10, 10, 110, 30);

        BtnRadix.setText("Radix Sort");
        BtnRadix.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnRadixMouseClicked(evt);
            }
        });
        getContentPane().add(BtnRadix);
        BtnRadix.setBounds(130, 60, 120, 30);

        BtnCouting.setText("Couting Sort");
        BtnCouting.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnCoutingMouseClicked(evt);
            }
        });
        getContentPane().add(BtnCouting);
        BtnCouting.setBounds(10, 60, 110, 30);

        BtnQuickSort.setText("Quick Sort");
        BtnQuickSort.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnQuickSortMouseClicked(evt);
            }
        });
        getContentPane().add(BtnQuickSort);
        BtnQuickSort.setBounds(70, 100, 110, 30);

        BtnQuickSort4.setText("Quick Sort Four");
        BtnQuickSort4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnQuickSort4MouseClicked(evt);
            }
        });
        getContentPane().add(BtnQuickSort4);
        BtnQuickSort4.setBounds(330, 100, 120, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtninsertionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtninsertionMouseClicked
        // TODO add your handling code here:
        String entradaArray = JOptionPane.showInputDialog(this, "Ingrese el arreglo", "Arreglo", 1);
        String[] eArray = entradaArray.split(",");

        ArrayList<Integer> arrayList = new ArrayList<>();

        asignarCreacionArreglo(arrayList, eArray);

       // algoritmos.InsertionSort(arrayList);
        algoritmos.InsertionSortRecursive(arrayList);
        this.txtAreaRespuesta.setText("");
        for (int i = 0; i < arrayList.size(); i++) {
            this.txtAreaRespuesta.setText(this.txtAreaRespuesta.getText() + "\n" + "[" + i + "]: " + arrayList.get(i));
        }

    }//GEN-LAST:event_BtninsertionMouseClicked

    private void BtnBinarySortMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnBinarySortMouseClicked
        // TODO add your handling code here:

        String entradaArray = JOptionPane.showInputDialog(this, "Ingrese el arreglo", "Arreglo", 1);
        String[] eArray = entradaArray.split(",");

        ArrayList<Integer> arrayList = new ArrayList<>();

        asignarCreacionArreglo(arrayList, eArray);

        algoritmos.binarySort(arrayList, Integer.parseInt(JOptionPane.showInputDialog(this, "Valor a buscar: ", "Busqueda", 1)), this.txtAreaRespuesta);


    }//GEN-LAST:event_BtnBinarySortMouseClicked

    private void BtnMergeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnMergeMouseClicked
        // TODO add your handling code here:
        try {
            String entradaArray = JOptionPane.showInputDialog(this, "Ingrese el arreglo", "Arreglo", 1);
            String[] eArray = entradaArray.split(",");

            ArrayList<Integer> arrayList = new ArrayList<>();

            asignarCreacionArreglo(arrayList, eArray);
            algoritmos.mergeSort(arrayList, 0, arrayList.size() - 1);
            this.txtAreaRespuesta.setText("");
            for (int i = 0; i < arrayList.size(); i++) {
                this.txtAreaRespuesta.setText(this.txtAreaRespuesta.getText() + "\n[" + i + "]: " + arrayList.get(i));

            }
        } catch (Exception e) {
            System.out.println("error: " + e);
        }


    }//GEN-LAST:event_BtnMergeMouseClicked

    private void BtnRecorridoMatrizMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnRecorridoMatrizMouseClicked
        // TODO add your handling code here:
        String eTamano = JOptionPane.showInputDialog("Ingrese el tamaño de la matriz");
        String[] Tamano = eTamano.split(",");
        int[][] matrizEjemplo = new int[Integer.parseInt(Tamano[0])][Integer.parseInt(Tamano[1])];
        algoritmos.algoritmosRecorrido(matrizEjemplo);
    }//GEN-LAST:event_BtnRecorridoMatrizMouseClicked

    private void BtnShakeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnShakeMouseClicked
        // TODO add your handling code here:
        String entradaArray = JOptionPane.showInputDialog(this, "Ingrese el arreglo", "Arreglo", 1);
        String[] eArray = entradaArray.split(",");

        ArrayList<Integer> arrayList = new ArrayList<>();

        asignarCreacionArreglo(arrayList, eArray);
        
        algoritmos.bubbleSort(arrayList);
        
         this.txtAreaRespuesta.setText("");
        for (int i = 0; i < arrayList.size(); i++) {
            this.txtAreaRespuesta.setText(this.txtAreaRespuesta.getText() + "\n[" + i + "]: " + arrayList.get(i));

        }
    }//GEN-LAST:event_BtnShakeMouseClicked

    private void BtnRadixMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnRadixMouseClicked
        // TODO add your handling code here:
        String entradaArray = JOptionPane.showInputDialog(this, "Ingrese el arreglo", "Arreglo", 1);
        String[] eArray = entradaArray.split(",");

        ArrayList<Integer> arrayList = new ArrayList<>();

        asignarCreacionArreglo(arrayList, eArray);
        
        algoritmos.RadixSort(arrayList);
        
        this.txtAreaRespuesta.setText("");
        
        for (int i = 0; i < arrayList.size(); i++) {
            this.txtAreaRespuesta.setText(this.txtAreaRespuesta.getText() + "\n[" + i + "]: " + arrayList.get(i));

        }
    }//GEN-LAST:event_BtnRadixMouseClicked

    private void BtnCoutingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnCoutingMouseClicked
        // TODO add your handling code here:
         String entradaArray = JOptionPane.showInputDialog(this, "Ingrese el arreglo", "Arreglo", 1);
        String[] eArray = entradaArray.split(",");

        ArrayList<Integer> arrayList = new ArrayList<>();

        asignarCreacionArreglo(arrayList, eArray);
        
        arrayList = algoritmos.Counting(arrayList);
        
        this.txtAreaRespuesta.setText("");
        
        for (int i = 0; i < arrayList.size(); i++) {
            this.txtAreaRespuesta.setText(this.txtAreaRespuesta.getText() + "\n[" + i + "]: " + arrayList.get(i));

        }
    }//GEN-LAST:event_BtnCoutingMouseClicked

    private void BtnQuickSortMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnQuickSortMouseClicked
        // TODO add your handling code here:
        
        String entradaArray = JOptionPane.showInputDialog(this, "Ingrese el arreglo", "Arreglo", 1);
        String[] eArray = entradaArray.split(",");

        ArrayList<Integer> arrayList = new ArrayList<>();

        asignarCreacionArreglo(arrayList, eArray);
        
        algoritmos.QuickSort(arrayList,0,arrayList.size()-1);
        
        this.txtAreaRespuesta.setText("");
        
        this.Respuesta(arrayList);
    }//GEN-LAST:event_BtnQuickSortMouseClicked

    private void BtnQuickSort4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnQuickSort4MouseClicked
        // TODO add your handling code here:
        
        String entradaArray = JOptionPane.showInputDialog(this, "Ingrese el arreglo", "Arreglo", 1);
        String[] eArray = entradaArray.split(",");

        ArrayList<Integer> arrayList = new ArrayList<>();

        asignarCreacionArreglo(arrayList, eArray);
        
        algoritmos.QuickSortForFingers(arrayList,0,arrayList.size()-1);
        
        this.txtAreaRespuesta.setText("");
        
        this.Respuesta(arrayList);
    }//GEN-LAST:event_BtnQuickSort4MouseClicked

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Marco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Marco().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBinarySort;
    private javax.swing.JButton BtnBubble;
    private javax.swing.JButton BtnCouting;
    private javax.swing.JButton BtnMerge;
    private javax.swing.JButton BtnQuickSort;
    private javax.swing.JButton BtnQuickSort4;
    private javax.swing.JButton BtnRadix;
    private javax.swing.JButton BtnRecorridoMatriz;
    private javax.swing.JButton BtnSelectionSort;
    private javax.swing.JButton BtnShake;
    private javax.swing.JButton Btninsertion;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane scrollArea;
    private javax.swing.JTextArea txtAreaRespuesta;
    private javax.swing.JLabel txtEntrada;
    private javax.swing.JTextArea txtInfo;
    private javax.swing.JLabel txtSalida;
    // End of variables declaration//GEN-END:variables

    private void asignarCreacionArreglo(ArrayList<Integer> arrayList, String[] eArray) {
        for (int i = 0; i < eArray.length; i++) {
            int valueInt = Integer.parseInt(eArray[i]);
            arrayList.add(valueInt);
        }
    }
    
    private void Respuesta(ArrayList<Integer> arrayList){
          for (int i = 0; i < arrayList.size(); i++) {
            this.txtAreaRespuesta.setText(this.txtAreaRespuesta.getText() + "\n[" + i + "]: " + arrayList.get(i));

        }
    }
}
