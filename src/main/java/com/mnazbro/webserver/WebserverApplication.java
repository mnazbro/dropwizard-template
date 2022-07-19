package com.mnazbro.webserver;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public final class WebserverApplication extends Application<WebserverConfig> {
    public static void main(String[] args) throws Exception {
        new WebserverApplication().run(args);
    }


    @Override
    public void initialize(Bootstrap<WebserverConfig> bootstrap) {

    }

    @Override
    public void run(WebserverConfig configuration, Environment environment) {
        environment.healthChecks().register("health", new WebserverHealthCheck());
        environment.jersey().register(new WebserverResource());
        environment.jersey().register(new WebserverCombinedResource());
    }
}
