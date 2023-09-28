/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hanoioftowers;

import static hanoioftowers.AppTowers.doAppTowers;

/* Name: Le Cong Hung
Student Code: SE161248
Purpose: Problem 2 - AppTowers.
 */
public class Main {

    public static void main(String[] args) {
        int n = 2; // Number of disks
        char source = 'A', auxiliary = 'B', destination = 'C';

        // Call the Towers of Hanoi solver with the specified parameters.
        doAppTowers(n, source, auxiliary, destination);
    }
}
