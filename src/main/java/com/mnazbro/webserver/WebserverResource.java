package com.mnazbro.webserver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class WebserverResource implements WebserverService {
    private static final Logger log = LoggerFactory.getLogger(WebserverResource.class);

    public WebserverResource() {
    }

    @Override
    public String hello() {
        return "Hello world!";
    }

    @Override
    public String helloName(String name) {
        return String.format("Hello %s!", name);
    }
}
