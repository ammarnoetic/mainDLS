package com.example.demo.controller;

import com.example.demo.model.RouteMcg;
import com.example.demo.service.SendMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DlsController {

    @Autowired
    private SendMessage sendMessage;

    @PostMapping(value = "/send")
    public ResponseEntity<?> sendMcg(@RequestBody RouteMcg routeMcg){

//        sendMessage.sendMcg(routeMcg);
        try{
            System.out.println("line 22");
            sendMessage.sendMcg(routeMcg);
        }
        catch(Exception e){
            System.out.println("Failed to send mcg");
            return ResponseEntity.ok("Failure");

        }
        return ResponseEntity.ok("Successfuly Sent mcg");
    }

}
