package lk.epic.client_server.controller;

import lk.epic.client_server.util.InputQueue;
import lk.epic.client_server.util.MessageUtil;
import lk.epic.client_server.util.ResponseUtil;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

@RestController
@CrossOrigin
@RequestMapping("/server")
public class ServerController {
    private BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    String response;
    private static int id;

    @PostMapping
    @ResponseStatus(HttpStatus.ACCEPTED)
    public ResponseEntity<String> getResponseFromServer(@ModelAttribute MessageUtil client) {
        System.out.println(++id + "-" + client.getClientName() + " - Client Says : " + client.getMessage());
        response = "Hello" + id + " - Client";
        return ResponseEntity.ok(response);
    }
}
