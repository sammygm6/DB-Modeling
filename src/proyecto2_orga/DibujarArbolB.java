/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2_orga;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.util.HashMap;
import javax.swing.JPanel;

/**
 *
 * @author Sammy
 */
public class DibujarArbolB extends JPanel {

    private BTree miArbol;
    private HashMap posicionNodos = null;
    private HashMap subtreeSizes = null;
    private boolean dirty = true;
    private int parent2child = 20, child2child = 30;
    private Dimension empty = new Dimension(0, 0);
    private FontMetrics fm = null;

    public DibujarArbolB(BTree miArbol) {
        this.miArbol = miArbol;
        this.setBackground(Color.WHITE);
        posicionNodos = new HashMap();
        subtreeSizes = new HashMap();
        dirty = true;
        repaint();
    }

    private void calcularPosiciones() {
        posicionNodos.clear();
        subtreeSizes.clear();
        BTreeNode root = this.miArbol.root;
        if (root != null) {
            calcularTamanoSubarbol(root);
            calcularPosicion(root, Integer.MAX_VALUE, Integer.MAX_VALUE, 0);
        }
    }

    private Dimension calcularTamanoSubarbol(BTreeNode n) {

        if (n == null) {
            return new Dimension(0, 0);
        }
        
        Dimension ld = calcularTamanoSubarbol(n.c[0]);
        Dimension rd = calcularTamanoSubarbol(n.c[n.c.length - 1]);

        int h = fm.getHeight() + parent2child + Math.max(ld.height, rd.height);
        int w = ld.width + child2child + rd.width;

        Dimension d = new Dimension(w, h);
        subtreeSizes.put(n, d);

        return d;
    }

    private void calcularPosicion(BTreeNode n, int left, int right, int top) {

        if (n == null) {
            return;
        }
        Dimension ld = (Dimension) subtreeSizes.get(n.c[0]);
        if (ld == null) {
            ld = empty;
        }

        Dimension rd = (Dimension) subtreeSizes.get(n.c[n.c.length - 1]);
        if (rd == null) {
            rd = empty;
        }

        int center = 0;

        if (right != Integer.MAX_VALUE) {
            center = right - rd.width - child2child / 2;
        } else if (left != Integer.MAX_VALUE) {
            center = left + ld.width + child2child / 2;
        }
        int width = fm.stringWidth(Integer.toString(n.c.length));

        posicionNodos.put(n, new Rectangle(center - width / 2 - 3, top, width + 6, fm.getHeight()));

        calcularPosicion(n.c[0], Integer.MAX_VALUE, center - child2child / 2, top + fm.getHeight() + parent2child);
        calcularPosicion(n.c[n.c.length - 1], center + child2child / 2, Integer.MAX_VALUE, top + fm.getHeight() + parent2child);

    }

    private void dibujarArbol(Graphics2D g, BTreeNode n, int puntox, int puntoy, int yoffs) {

        if (n == null) {
            return;
        }
        Rectangle r = (Rectangle) posicionNodos.get(n);
        g.draw(r);
        String salida = "";
        for (int i = 0; i < n.key.length; i++) {
            salida += Integer.toString(n.key[i]);
        }
        g.drawString(salida, r.x + 3, r.y + yoffs);

        g.drawLine(puntox, puntoy, (int) (r.x + r.width / 2), r.y);

        dibujarArbol(g, n.c[0], (int) (r.x + r.width / 2), r.y + r.height, yoffs);
        dibujarArbol(g, n.c[n.c.length-1], (int) (r.x + r.width / 2), r.y + r.height, yoffs);

    }

    public void paint(Graphics g) {
        super.paint(g);
        fm = g.getFontMetrics();

        if (dirty) {
            calcularPosiciones();
            dirty = false;
        }

        Graphics2D g2d = (Graphics2D) g;
        g2d.translate(getWidth() / 2, parent2child);
        dibujarArbol(g2d, this.miArbol.root, Integer.MAX_VALUE, Integer.MAX_VALUE,
                fm.getLeading() + fm.getAscent());
        fm = null;
    }

}
