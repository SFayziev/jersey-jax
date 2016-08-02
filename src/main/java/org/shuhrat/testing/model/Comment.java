package org.shuhrat.testing.model;

import javax.ws.rs.GET;
import javax.xml.bind.annotation.XmlRootElement;
import java.time.LocalDate;

/**
 * Created by Admin on 02.08.2016.
 */
@XmlRootElement
public class Comment {

    private long id ;
    private String commentText;
    private LocalDate creatdate=LocalDate.now();

    public Comment(long id,  String commentText, LocalDate creatdate) {
        this.id = id;
        this.commentText = commentText;
        this.creatdate = creatdate;
    }

    public Comment() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }



    public String getCommentText() {
        return commentText;
    }

    public void setCommentText(String commentText) {
        this.commentText = commentText;
    }

    public LocalDate getCreatdate() {
        return creatdate;
    }

    public void setCreatdate(LocalDate creatdate) {
        this.creatdate = creatdate;
    }
}
