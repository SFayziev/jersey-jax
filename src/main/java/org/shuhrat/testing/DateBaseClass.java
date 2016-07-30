package org.shuhrat.testing;

import org.shuhrat.testing.model.Message;
import org.shuhrat.testing.model.Profile;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Admin on 28.07.2016.
 */
public class DateBaseClass {
    private  static Map<Long, Message>  messageMap= new HashMap<>();
    private  static Map<Long, Profile>  profileMap= new HashMap<>();

    public static Map<Long, Message> getMessageMap() {
        return messageMap;
    }

    public static Map<Long, Profile> getProfileMap() {
        return profileMap;
    }
}
