package org.shuhrat.testing.service;


import org.junit.Test;

/**
 * Created by Admin on 01.08.2016.
 */
public class MessageServiceTest {

    @Test
    public void getAllbyYear() throws Exception {
        MessageService messageService=new MessageService();

        messageService.getAllbyYear(2016).forEach(p-> System.out.println(p.getCreate())); ;


    }

}