package com.company;

import java.util.Scanner;

public class Main extends Menu {

    /**
     * @author andri
     * @see WrongInputConsoleParametersException,Menu
     * @since 1.8
     */

    public static void main(String[] args) throws WrongInputConsoleParametersException {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            /**
             * @author andri
             * @since 1.8
             * @see Menu
             */
            menu();
            switch (scanner.next()) {
                // 1 Завдання
                case "1": {
                    System.out.println("Напишіть слово");
                    scanner = new Scanner(System.in);
                    String scan = scanner.nextLine();

                    if (scan.length() == 5) {
                        /**
                         * @since 1.8
                         * @author andri
                         * @param
                         * */
                        System.out.println(isPalindrome(scan));
                    } else {
                        /**
                         * @since 1.8
                         * @author andri
                         * @see WrongInputConsoleParametersException
                         * @exception WrongInputConsoleParametersException
                         * */
                        throw new WrongInputConsoleParametersException("Неправильно введені дані");
                    }
                    break;
                }
                // 2 Завдання
                case "2": {
                    System.out.println("Напишіть слово");
                    scanner = new Scanner(System.in);
                    String scan = scanner.nextLine();

                    String newString = scan.toLowerCase().replaceAll("[aeiuoеіаои]", "-");
                    System.out.println(newString);
                    break;
                }
                // 3 Завдання
                case "3": {
                    System.out.println("Напишіть слово");
                    scanner = new Scanner(System.in);
                    String scan = scanner.nextLine();
                    int count = 0;

                    if (scan.length() != 0) {
                        count++;
                        for (int i = 0; i < scan.length(); i++) {
                            if (scan.charAt(i) == ' ') {
                                count++;
                            }
                        }
                    }
                    System.out.println("Ви написали слів: " + count);
                    break;
                }
            }
        }
    }


    /**
     * @param str
     * @author andri
     * @see java code convention
     * @since 1.8
     */

    /* Checks if the word is a palindrome */
    public static boolean isPalindrome(String str) {
        return str.equalsIgnoreCase(new StringBuffer(str).reverse().toString());
    }

}

