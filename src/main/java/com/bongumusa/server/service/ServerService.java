package com.bongumusa.server.service;

import com.bongumusa.server.model.Server;

import java.io.IOException;
import java.util.Collection;

public interface ServerService {
    Server create(Server server);

    Server ping(String ipAddress) throws IOException;

    Collection<Server> list(int Limit);

    Server get(Long id);

    Server update(Server server);

    Boolean delete(Long id);
}
