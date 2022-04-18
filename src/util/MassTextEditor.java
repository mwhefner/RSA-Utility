package util;

import java.util.Scanner;
import util.Decryption;
import util.Encryption;
import util.Generators;

public class MassTextEditor
{
    /** Primary input */
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args)
    {
        char option = 'x';
        boolean success = false;
        do
        {
            option = prompt();
            switch(option)
            {
                case 'E':
                case 'e':
                    success = EncryptProcess();
                    break;
                default: success = true;
            }
            System.out.println("Process Success: " + success + ". \n");
        } while (option != 'x' && option != 'X');
        System.out.println("Thank you for using my utility - goodbye!");
    }

    public static boolean EncryptProcess()
    {
        if (Encryption.setupEncryption())
        {
            Encryption.encrypt();
            return true;
        }
        return false;
    }


    public static char prompt()
    {
        String temp;
        System.out.println("Type E to edit and X to exit.");
        temp = input.next();
        if (temp.length() == 1)
        {
            return temp.toCharArray()[0];
        }
        return 'a';
    }
}
