package org.shuhrat.testing.service;

import org.shuhrat.testing.DateBaseClass;
import org.shuhrat.testing.model.Comment;
import org.shuhrat.testing.model.Message;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by Admin on 02.08.2016.
 */

public class CommentService {
    Map<Long, Message > messageMap= DateBaseClass.getMessageMap();

    public List<Comment> getAllComments (Long mesId){
        return new ArrayList<>(messageMap.get(mesId).getComments().values());
    }

    public Comment getComment(Long mesid , Long commId){
        return messageMap.get(mesid).getComments().get(commId);
    }

    public Comment putComment(Long mesid , Long commId, Comment comment){
        messageMap.get(mesid).getComments().put(commId, comment);
        return  getComment(mesid, commId);
    }

    public Comment postComment(Long mesid, Comment comment){
        Long commId= (long) (messageMap.get(mesid).getComments().size() + 1);
        comment.setId(commId);
        messageMap.get(mesid).getComments().put(commId,  comment);
        return  getComment(mesid, commId);
    }

    public void delComment(Long mesid , Long commId){
        messageMap.get(mesid).getComments().remove(commId);
    }

}
