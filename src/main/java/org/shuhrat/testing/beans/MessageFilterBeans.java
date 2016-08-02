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

    public int getStart() {
        return start;
    }

    public int getRecnum() {
        return recnum;
    }

}
