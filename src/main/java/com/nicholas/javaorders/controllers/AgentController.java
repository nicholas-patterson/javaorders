package com.nicholas.javaorders.controllers;

import com.nicholas.javaorders.models.Agent;
import com.nicholas.javaorders.services.AgentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/agents")
public class AgentController {

    @Autowired
    private AgentService agentService;


    // http://localhost:2019/agents/agent/{id}

    @GetMapping(path = "/agent/{id}", produces = {"application/json"})
    public ResponseEntity<Agent> getAgent(@PathVariable long id){
        Agent agent = agentService.getAgentById(id);

        return new ResponseEntity<>(agent, HttpStatus.OK);
    }
}
