package org.shuhrat.testing.service;

import org.shuhrat.testing.DateBaseClass;
import org.shuhrat.testing.model.Message;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by Admin on 28.07.2016.
 */
public class MessageService {
    Map<Long, Message > messageMap= DateBaseClass.getMessageMap();

    public MessageService() {
        if (messageMap.size()<1) {
            messageMap.put(1L, new Message(1, LocalDate.now() , "Paul", "Hello word"));
            messageMap.put(2L, new Message(2, LocalDate.now() , "Linda", "Hello Jersey"));
            messageMap.put(3L, new Message(3, LocalDate.now() , "Sasha", "Hello New Your"));
        }
    }

    public List<Message> getAll(){
        return new ArrayList<>(messageMap.values());
    }

    public List<Message> getAllbyYear(int year){
        return messageMap.values().stream().filter(message -> message.getCreate().getYear() == year).collect(Collectors.toList());
    }

    public List<Message> getAllbyPagination (int start, int recNum ){
        return  getAll().subList( start , start+recNum);
    }

    public Message getbyId(Long id){
        return messageMap.get(id);
    }

    public void  deletebyId(Long id){
         messageMap.remove(id);
    }

    public Message  postMessage(Message message){
        message.setCreate(LocalDate.now());
        message.setId(messageMap.size()+1);
        messageMap.put(message.getId() , message );
        return  message;
    }

    public Message  putMessage(Message message){
        message.setUpdated(LocalDate.now());
        messageMap.put(message.getId() , message );
        return messageMap.get(message.getId());
    }
}
