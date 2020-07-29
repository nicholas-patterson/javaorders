package com.nicholas.javaorders.services;

import com.nicholas.javaorders.models.Agent;
import com.nicholas.javaorders.repositories.AgentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;

@Service(value = "agentService")
public class AgentServiceImpl implements AgentService{

    @Autowired
    AgentRepository agentRepository;


    @Override
    public Agent getAgentById(long id) {
        Agent agent = agentRepository.findById(id).orElseThrow(()
                -> new EntityNotFoundException());

        return agent;
    }
}
