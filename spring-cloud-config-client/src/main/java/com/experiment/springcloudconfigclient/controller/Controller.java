package com.experiment.springcloudconfigclient.controller;

import com.experiment.springcloudconfigclient.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("config")
public class Controller {

    @Autowired
    private Service service;


    @RequestMapping
    public String getConfigServerKey() {
        return service.getFromConfigServer();
    }
}
