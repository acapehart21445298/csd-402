/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numberpattern;

/**
 *
 * @author arrin
 */
public class NumberPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    for (int row = 1; row <= 7; row++) {

        for (int space = 7; space > row; space--) {
            System.out.print("   ");
        }

        int number = 1;

        for (int col = 1; col <= row; col++) {
            System.out.printf("%-3d", number);
            number *= 2;
        }

        number /= 4;

        for (int col = row - 1; col >= 1; col--) {
            System.out.printf("%-3d", number);
            number /= 2;
        }

        // Move the @ to the same column on every row
        for (int space = row; space < 7; space++) {
            System.out.print("   ");
        }

        System.out.println(" @");
        }
    }
}
