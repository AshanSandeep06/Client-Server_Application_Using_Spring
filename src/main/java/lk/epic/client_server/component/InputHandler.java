package lk.epic.client_server.component;

import lk.epic.client_server.util.InputQueue;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class InputHandler implements Runnable{

    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            String input = scanner.nextLine();
            InputQueue.add(input);
        }
    }
}
