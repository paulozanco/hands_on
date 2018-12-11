package com.example;

import com.example.health.dropwizardHealthCheck;
import com.example.resources.dropwizardResource;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class dropwizardApplication extends Application<dropwizardConfiguration> {

    public static void main(final String[] args) throws Exception {
        new dropwizardApplication().run(args);
    }

    @Override
    public String getName() {
        return "dropwizard";
    }

    @Override
    public void initialize(final Bootstrap<dropwizardConfiguration> bootstrap) {
    }

    @Override
    public void run(final dropwizardConfiguration configuration,
                    final Environment environment) {
        final dropwizardResource resource = new dropwizardResource(
                configuration.getTemplate(),
                configuration.getDefaultName()
        );

        final dropwizardHealthCheck healthCheck =
                new dropwizardHealthCheck(configuration.getTemplate());

        environment.healthChecks().register("template", healthCheck);
        environment.jersey().register(resource);
    }

}
