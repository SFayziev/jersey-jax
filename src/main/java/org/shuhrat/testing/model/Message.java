package org.shuhrat.testing.model;

import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by Admin on 28.07.2016.
 */
@XmlRootElement
public class Message implements Serializable {
    private static final long serialVersionUID = -8039686696076334523L;

    private long id;
    private Date create;
    private Date updated;
    private String author;
    private String text;

    public Message(){

    }
    public Message(int id ,  Date create, String author, String text) {
        this.id=id;
        this.create = create;
        this.author = author;
        this.text = text;
    }


    public Date getUpdated() {
        return updated == null?getCreate(): updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getCreate() {
        return create;
    }

    public void setCreate(Date create) {
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
