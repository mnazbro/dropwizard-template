package com.mnazbro.webserver;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.dropwizard.Configuration;
import org.immutables.value.Value;

@Value.Immutable
@JsonDeserialize(as = ImmutableWebserverConfig.class)
public abstract class WebserverConfig extends Configuration {
}
