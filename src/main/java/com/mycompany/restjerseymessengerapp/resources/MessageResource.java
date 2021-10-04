/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.restjerseymessengerapp.resources;

import com.mycompany.restjerseymessengerapp.model.Message;
import com.mycompany.restjerseymessengerapp.service.MessageService;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author emer
 */
@Path("/messages")
public class MessageResource {
    
    @Inject
    MessageService ms;
    
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public List<Message> getMessages(){
        return ms.readMessages();
    }
    
    
}
