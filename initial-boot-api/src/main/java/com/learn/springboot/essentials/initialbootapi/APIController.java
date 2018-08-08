package com.learn.springboot.essentials.initialbootapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by prjayasuriya on 8/7/2018.
 */

@RestController
@RequestMapping("/api")

public class APIController {
    public RoomServices roomServices;

    @Autowired
    public APIController(RoomServices roomServices){
        super();
        this.roomServices = roomServices;
    }

    @GetMapping("/rooms")
    public List<Room> getAllRooms(){
        return this.roomServices.getAllRooms();
    }

}
