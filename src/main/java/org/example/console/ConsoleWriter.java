package org.example.console;

import org.springframework.stereotype.Component;

@Component
public class ConsoleWriter {
    public void write(String msg){
        System.out.println(msg);
    }
}
