package com.futureappsmobile.data;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.*;

@RestController
@RequestMapping(path = "/date")
public class ModelController {

    private static final List<Model> list = new ArrayList<>();

    static {

        Calendar d = Calendar.getInstance();

        String date = null;
        String hour = null;

        date = new SimpleDateFormat("dd/MM/yyyy").format(d.getTime());
        hour = new SimpleDateFormat("HH:mm:ss").format(d.getTime());
        TimeZone timeZone = d.getTimeZone();

        list.add(new Model(date, hour, timeZone));

    }

    @GetMapping
    public ResponseEntity<List<Model>> getDate(){
        return ResponseEntity.ok(list);
    }

}
