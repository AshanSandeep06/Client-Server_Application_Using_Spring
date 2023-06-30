package lk.epic.client_server.component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class InputHandlerInitializer {
    @Autowired
    private InputHandler inputHandler;

    @PostConstruct
    public void initialize(){
        Thread t1 = new Thread(inputHandler);
        t1.start();
    }
}
