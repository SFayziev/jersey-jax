package org.shuhrat.testing.model;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Admin on 28.07.2016.
 */
@XmlRootElement
public class Message implements Serializable {
    private static final long serialVersionUID = -8039686696076334523L;

    private long id;
    private LocalDate create;
    private LocalDate updated;
    private String author;
    private String text;
    private Map<Long , Comment> comments= new HashMap<>();

    public Message(){

    }
    public Message(int id , LocalDate create, String author, String text) {
        this.id=id;
        this.create = LocalDate.now();
        this.author = author;
        this.text = text;

    }

    public LocalDate getUpdated() {
        return updated;
    }

    public void setUpdated(LocalDate updated) {
        this.updated = updated;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDate getCreate() {
        return create;
    }

    @XmlTransient
    public Map<Long, Comment> getComments() {
        return comments;
    }

    public void setComments(Map<Long, Comment> comments) {
        this.comments = comments;
    }

    public void setCreate(LocalDate create) {
        this.create = create;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
