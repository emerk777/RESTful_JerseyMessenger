/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.restjerseymessengerapp.service;

import com.mycompany.restjerseymessengerapp.model.Message;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author emer
 */
public class MessageService {
    
    public List<Message> readMessages(){
        
        List<Message> list = new ArrayList<>();
        
        Message message1 = new Message(1l, "Hello Message1", "Emer");
        Message message2 = new Message(2l, "Hello Message2", "Emer");
        
        list.add(message1);
        list.add(message2);
        
        return list;
    
    }
    
}
