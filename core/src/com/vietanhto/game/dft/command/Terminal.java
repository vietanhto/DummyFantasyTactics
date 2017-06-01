package com.vietanhto.game.dft.command;

import java.util.Scanner;

/**
 * @author vietto
 */
public class Terminal {
    public static void main(String args[]) {
        final Scanner scanner = new Scanner(System.in);
        while (true) {
            final String command = scanner.nextLine();

            if (command.equals("quit")) {
                System.out.println("bye!");
                break;
            }
        }
    }
}
