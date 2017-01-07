package com.hoofmen.mapchat.messages;

import com.hoofmen.mapchat.messages.beans.MapMessage;
import com.hoofmen.mapchat.messages.beans.MapMessageRequest;

import java.util.List;

/**
 * Created by osman on 1/3/17.
 */
public interface MessageDAO {

    List<MapMessage> getAllMapMessages(MapMessageRequest mapMessageRequest);

    List<MapMessage> getMapMessages(MapMessageRequest mapMessageRequest);

    void saveMapMessage(MapMessage mapMessage);
}