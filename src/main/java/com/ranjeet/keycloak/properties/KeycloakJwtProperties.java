package com.ranjeet.keycloak.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * will be use @Data for auto getter and setter
 */
@ConfigurationProperties(prefix = "jwt.auth.converter")
@Component
public class KeycloakJwtProperties {

    private String principalAttribute;
    private String resourceId;

    public KeycloakJwtProperties() {
    }

    public KeycloakJwtProperties(String principalAttribute, String resourceId) {
        this.principalAttribute = principalAttribute;
        this.resourceId = resourceId;
    }

    public String getPrincipalAttribute() {
        return principalAttribute;
    }

    public void setPrincipalAttribute(String principalAttribute) {
        this.principalAttribute = principalAttribute;
    }

    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }
}
