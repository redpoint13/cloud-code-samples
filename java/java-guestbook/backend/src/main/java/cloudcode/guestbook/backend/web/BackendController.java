package cloudcode.guestbook.backend.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


import java.util.Map;
import java.util.ArrayList;

import java.net.*;
import java.io.*;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;


@Controller
public class BackendController {

    private String mongoUri = String.format("mongodb://%s:%s@%s:%s/admin", 
        System.getenv("MONGO_USERNAME"), System.getenv("MONGO_PASSWORD"), System.getenv("MONGO_HOST"), System.getenv("MONGO_PORT")); 

    @GetMapping("/messages")
    @ResponseBody
    public String main(Model model) throws IOException {
        return "[]";
    }
}