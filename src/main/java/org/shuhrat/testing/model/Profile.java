package org.shuhrat.testing.model;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.crypto.Data;
import java.util.Date;

/**
 * Created by Admin on 28.07.2016.
 */
@XmlRootElement
public class Profile {
    private int id;
    private String name;
    private String fullname;
    private Date regDate;

    public Profile(){

    }


    public Profile(int id, String name, String fullname , Date regDate) {
        this.id = id;
        this.fullname=fullname;
        this.name = name;
        this.regDate = regDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getRegDate() {
        return regDate;
    }

    public void setRegDate(Date regDate) {
        this.regDate = regDate;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }
}
