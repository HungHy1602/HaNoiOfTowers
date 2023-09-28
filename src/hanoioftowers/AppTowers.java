/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hanoioftowers;

/* Name: Le Cong Hung
Student Code: SE161248
Purpose: Problem 2 - AppTowers.
 */
public class AppTowers {

    public static void doAppTowers(int topN, char from, char inter, char to) {
        // Base case: When there's only one disk to move.
        if (topN == 1) {
            System.out.println("Disk 1 from " + from + " to " + to);
        } else {
            // Move (topN - 1) disks from 'from' to 'inter' using 'to' as auxiliary peg.
            doAppTowers(topN - 1, from, to, inter);

            // Move the top disk from 'from' to 'to'.
            System.out.println("Disk " + topN + " from " + from + " to " + to);

            // Move the (topN - 1) disks from 'inter' to 'to' using 'from' as auxiliary peg.
            doAppTowers(topN - 1, inter, from, to);
        }
    }
}
