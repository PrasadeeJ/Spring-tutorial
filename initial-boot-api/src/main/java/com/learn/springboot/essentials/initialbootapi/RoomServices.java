package com.learn.springboot.essentials.initialbootapi;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by prjayasuriya on 8/7/2018.
 */

@Service
public class RoomServices {

    private static List<Room> rooms = new ArrayList<>();
    static {
        for (int i = 0; i <10 ; i++){
            rooms.add(new Room(i , "Room" + i, "R" + i , "Q"));

        }
    }

    public List<Room> getAllRooms(){
        return rooms;
    }


}
