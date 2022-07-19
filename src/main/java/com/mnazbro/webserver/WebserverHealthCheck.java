package com.mnazbro.webserver;

import com.codahale.metrics.health.HealthCheck;

public final class WebserverHealthCheck extends HealthCheck {
    public WebserverHealthCheck() {
    }

    @Override
    protected HealthCheck.Result check() throws Exception {
        return HealthCheck.Result.healthy();
    }
}
