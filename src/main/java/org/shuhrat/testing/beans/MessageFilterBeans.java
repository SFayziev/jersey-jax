package org.shuhrat.testing.beans;

import javax.ws.rs.QueryParam;

/**
 * Created by Lenovo on 01.08.2016.
 */
public class MessageFilterBeans {

    private @QueryParam("year") int year ;
    private @QueryParam("start") int start;
    private @QueryParam("recnum") int recnum;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getRecnum() {
        return recnum;
    }

    public void setRecnum(int recnum) {
        this.recnum = recnum;
    }
}
