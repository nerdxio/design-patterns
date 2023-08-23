package io.nerd.templatemethod;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class TemplateDemo {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Network network = null;
        System.out.print("Input user name: ");
        String userName = reader.readLine();
        System.out.print("Input password: ");
        String password = reader.readLine();

        // Enter the message.
        System.out.print("Input message: ");
        String message = reader.readLine();

        System.out.println("""
                Choose social network for posting message.
                1 - Facebook
                2 - Twitter""");

        int choice = Integer.parseInt(reader.readLine());

        // Create a proper network object and send the message.
        if (choice == 1) {
            network = new Facebook(userName, password);
        } else if (choice == 2) {
            network = new Twitter(userName, password);
        }
        network.post(message);

    }
}
