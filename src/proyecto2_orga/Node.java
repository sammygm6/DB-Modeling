/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2_orga;
/**
 *
 * @author Sammy
 */
public class Node {

    public int key, height;
    public Node left, right;

    Node(int d) {
        key = d;
        height = 1;
    }
}
