/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2_orga;

import java.awt.BorderLayout;
import java.awt.Rectangle;
import javax.swing.JInternalFrame;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;

/**
 *
 * @author Sammy
 */
public class proyecto extends javax.swing.JFrame {

    /**
     * Creates new form proyecto
     */
    public proyecto() {
        initComponents();
        this.jl_devil.setVisible(false);
        this.jl_pentagram.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_BMASTree = new javax.swing.JDialog();
        jd_BTree = new javax.swing.JDialog();
        jDesktopPane2 = new javax.swing.JDesktopPane();
        jInternalFrame3 = new javax.swing.JInternalFrame();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jl_devil = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jl_pentagram = new javax.swing.JLabel();
        jd_AVLTree = new javax.swing.JDialog();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jInternalFrame2 = new javax.swing.JInternalFrame();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        javax.swing.GroupLayout jd_BMASTreeLayout = new javax.swing.GroupLayout(jd_BMASTree.getContentPane());
        jd_BMASTree.getContentPane().setLayout(jd_BMASTreeLayout);
        jd_BMASTreeLayout.setHorizontalGroup(
            jd_BMASTreeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jd_BMASTreeLayout.setVerticalGroup(
            jd_BMASTreeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jd_BTree.setTitle("BTree");
        jd_BTree.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jInternalFrame3.setResizable(true);
        jInternalFrame3.setEnabled(false);
        jInternalFrame3.setFocusCycleRoot(false);
        jInternalFrame3.setVisible(true);

        javax.swing.GroupLayout jInternalFrame3Layout = new javax.swing.GroupLayout(jInternalFrame3.getContentPane());
        jInternalFrame3.getContentPane().setLayout(jInternalFrame3Layout);
        jInternalFrame3Layout.setHorizontalGroup(
            jInternalFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 484, Short.MAX_VALUE)
        );
        jInternalFrame3Layout.setVerticalGroup(
            jInternalFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 470, Short.MAX_VALUE)
        );

        jDesktopPane2.add(jInternalFrame3);
        jInternalFrame3.setBounds(0, 0, 500, 500);

        jd_BTree.getContentPane().add(jDesktopPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 500, 500));

        jButton6.setText("Delete");
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });
        jd_BTree.getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, -1, -1));

        jButton7.setText("Mod");
        jd_BTree.getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, -1, -1));

        jButton8.setText("Insert");
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton8MouseClicked(evt);
            }
        });
        jd_BTree.getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto2_orga/Images/8.png"))); // NOI18N
        jd_BTree.getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 420, 100, 70));

        jl_devil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto2_orga/Images/devil.png"))); // NOI18N
        jd_BTree.getContentPane().add(jl_devil, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 250, 260));

        jButton9.setText("?");
        jButton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton9MouseClicked(evt);
            }
        });
        jd_BTree.getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jButton10.setText("Print");
        jButton10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton10MouseClicked(evt);
            }
        });
        jd_BTree.getContentPane().add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        jl_pentagram.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto2_orga/Images/pentagramaBtree.jpg"))); // NOI18N
        jd_BTree.getContentPane().add(jl_pentagram, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 550, 520));

        jd_AVLTree.setTitle("AVLTree");
        jd_AVLTree.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto2_orga/Images/7.png"))); // NOI18N
        jd_AVLTree.getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, 130, 70));

        jButton1.setText("Borrar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jd_AVLTree.getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 350, -1, -1));

        jButton3.setText("Insertar");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jd_AVLTree.getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto2_orga/Images/oceanBackground.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        jd_AVLTree.getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 320, 180));

        jInternalFrame2.setResizable(true);
        jInternalFrame2.setEnabled(false);
        jInternalFrame2.setFocusCycleRoot(false);
        jInternalFrame2.setVisible(true);

        javax.swing.GroupLayout jInternalFrame2Layout = new javax.swing.GroupLayout(jInternalFrame2.getContentPane());
        jInternalFrame2.getContentPane().setLayout(jInternalFrame2Layout);
        jInternalFrame2Layout.setHorizontalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 484, Short.MAX_VALUE)
        );
        jInternalFrame2Layout.setVerticalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 440, Short.MAX_VALUE)
        );

        jDesktopPane1.add(jInternalFrame2);
        jInternalFrame2.setBounds(0, 0, 500, 470);

        jd_AVLTree.getContentPane().add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 500, 470));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto2_orga/Images/AVLBackground.jpg"))); // NOI18N
        jd_AVLTree.getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-120, -20, 600, -1));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 0, 0));
        jButton2.setText("B+Tree");
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 100, -1));

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 0, 0));
        jButton4.setText("AVLTree");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, -1, -1));

        jButton5.setBackground(new java.awt.Color(255, 255, 255));
        jButton5.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 0, 0));
        jButton5.setText("BTree");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 100, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto2_orga/Images/mainBackground.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 929, 247));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        // Evento para agregar un nuevo key al arbol para dibujar
        String key = JOptionPane.showInputDialog(null, "Ingrese nueva llave");
        if (key.matches("[0-9]*")) {
            this.ArbolAVL.root = this.ArbolAVL.insert(this.ArbolAVL.root, Integer.parseInt(key));
        }
        this.jDesktopPane1.removeAll();
        Rectangle tamaño = this.jInternalFrame2.getBounds();
        this.jInternalFrame2 = null;
        this.jInternalFrame2 = new JInternalFrame("Representación gráfica", true);
        this.jDesktopPane1.add(this.jInternalFrame2, JLayeredPane.DEFAULT_LAYER);
        this.jInternalFrame2.setVisible(true);
        this.jInternalFrame2.setBounds(tamaño);
        this.jInternalFrame2.setEnabled(false);
        this.jInternalFrame2.add(new DibujarArbol(ArbolAVL), BorderLayout.CENTER);
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        // evento para levantar la ventana de dialogo del arbol avl
        this.jd_AVLTree.pack();
        this.jd_AVLTree.setLocationRelativeTo(null);
        this.jd_AVLTree.setVisible(true);
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // Evento para borrar un nodo del AVLTree
        String Nodo_borrar = JOptionPane.showInputDialog(null, "Cual nodo desea borrar");
        if (Nodo_borrar.matches("[0-9]*")) {
            this.ArbolAVL.root = this.ArbolAVL.deleteNode(this.ArbolAVL.root, Integer.parseInt(Nodo_borrar));
        }this.jDesktopPane1.removeAll();
        Rectangle tamaño = this.jInternalFrame2.getBounds();
        this.jInternalFrame2 = null;
        this.jInternalFrame2 = new JInternalFrame("Representación gráfica", true);
        this.jDesktopPane1.add(this.jInternalFrame2, JLayeredPane.DEFAULT_LAYER);
        this.jInternalFrame2.setVisible(true);
        this.jInternalFrame2.setBounds(tamaño);
        this.jInternalFrame2.setEnabled(false);
        this.jInternalFrame2.add(new DibujarArbol(ArbolAVL), BorderLayout.CENTER);
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        // Evento para levantar el dialogo para el arbol B
        this.jd_BTree.pack();
        this.jd_BTree.setLocationRelativeTo(null);
        this.jd_BTree.setVisible(true);
    }//GEN-LAST:event_jButton5MouseClicked

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
        // Evento para borrar de un arbol B
        
    }//GEN-LAST:event_jButton6MouseClicked

    private void jButton9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseClicked
        // Evento para levantar el pentagrama con las virgenes si nos deja viktor
        String pentagram = JOptionPane.showInputDialog(null, "Nos da permiso Viktor?").toLowerCase();
        if (pentagram.equals("si") || pentagram.equals("s")) {
            this.jl_pentagram.setVisible(true);
        }
    }//GEN-LAST:event_jButton9MouseClicked

    private void jButton8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseClicked
        //Evento para insertar un nuevo nodo en el arbol b
        String key = JOptionPane.showInputDialog(null, "Ingrese nueva llave");
        if (key.matches("[0-9]*")) {
            if (this.ArbolB.isEmpty()) {
                this.ArbolB = new BTree(Integer.parseInt(key));
            }else{
                this.ArbolB.insert(Integer.parseInt(key));
            }
        }
        this.jDesktopPane2.removeAll();
        Rectangle tamaño = this.jInternalFrame3.getBounds();
        this.jInternalFrame3 = null;
        this.jInternalFrame3 = new JInternalFrame("Representación gráfica", true);
        this.jDesktopPane2.add(this.jInternalFrame3, JLayeredPane.DEFAULT_LAYER);
        this.jInternalFrame3.setVisible(true);
        this.jInternalFrame3.setBounds(tamaño);
        this.jInternalFrame3.setEnabled(false);
        this.jInternalFrame3.add(new DibujarArbolB(this.ArbolB), BorderLayout.CENTER);
    }//GEN-LAST:event_jButton8MouseClicked

    private void jButton10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton10MouseClicked
        //Evento temporal para imprimir el arbol b
        if (!this.ArbolB.isEmpty()) {
            this.ArbolB.print();
            System.out.println("----------------------------------");
            this.ArbolB.printNodes();
        }
    }//GEN-LAST:event_jButton10MouseClicked

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
            java.util.logging.Logger.getLogger(proyecto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(proyecto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(proyecto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(proyecto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new proyecto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JInternalFrame jInternalFrame2;
    private javax.swing.JInternalFrame jInternalFrame3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JDialog jd_AVLTree;
    private javax.swing.JDialog jd_BMASTree;
    private javax.swing.JDialog jd_BTree;
    private javax.swing.JLabel jl_devil;
    private javax.swing.JLabel jl_pentagram;
    // End of variables declaration//GEN-END:variables
AVLTree ArbolAVL = new AVLTree();
BTree ArbolB = new BTree();
}
