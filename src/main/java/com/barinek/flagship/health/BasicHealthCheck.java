package com.barinek.flagship.health;

public class BasicHealthCheck implements HealthCheck {
    @Override
    public String getName() {
        return "Basic";
    }

    @Override
    public String getStatus() {
        return "Service is operating normally";
    }
}
