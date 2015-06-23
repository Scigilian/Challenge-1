package com.scigilian.challenge.controllers;

import com.scigilian.challenge.dto.ResponseData;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class BasicController {

    @RequestMapping(method = RequestMethod.POST, value = "/api/loadFile")
    public @ResponseBody ResponseData loadFile(@RequestBody MultipartFile file) {
        /*
         Parse the file
         */
        return new ResponseData();
    }
}
