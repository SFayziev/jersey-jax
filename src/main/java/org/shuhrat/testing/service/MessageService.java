package org.shuhrat.testing.service;

import org.shuhrat.testing.DateBaseClass;
import org.shuhrat.testing.model.Message;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by Admin on 28.07.2016.
 */
public class MessageService {
    Map<Long, Message > messageMap= DateBaseClass.getMessageMap();

    public MessageService() {
        if (messageMap.size()<1) {
            messageMap.put(1L, new Message(1, new Date(), "Paul", "Hello word"));
            messageMap.put(2L, new Message(2, new Date(), "Linda", "Hello Jersey"));
            messageMap.put(3L, new Message(3, new Date(), "Sasha", "Hello New Your"));
        }
    }

    public List<Message> getAll(){
        return new ArrayList<>(messageMap.values());
    }

    public Message getbyId(Long id){
        return messageMap.get(id);
    }

    public void  deletebyId(Long id){
         messageMap.remove(id);
    }

    public Message  postMessage(Message message){
        message.setCreate(new Date());
        message.setId(messageMap.size()+1);
        messageMap.put(message.getId() , message );
        return  message;
    }

    public Message  putMessage(Message message){
        message.setUpdated(new Date());
        messageMap.put(message.getId() , message );
        return messageMap.get(message.getId());
    }
}
