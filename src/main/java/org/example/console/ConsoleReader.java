package org.example.console;

import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class ConsoleReader {
    private Scanner scanner = new Scanner(System.in);

    public String readString(){
        return scanner.next();
    }

    public Double readDouble(){
        return scanner.nextDouble();
    }
}
