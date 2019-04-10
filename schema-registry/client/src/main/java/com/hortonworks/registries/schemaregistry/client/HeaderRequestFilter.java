package com.hortonworks.registries.schemaregistry.client;

import javax.ws.rs.client.ClientRequestContext;
import javax.ws.rs.client.ClientRequestFilter;
import javax.ws.rs.ext.Provider;
import java.io.IOException;

@Provider
public class HeaderRequestFilter implements ClientRequestFilter {
    @Override
    public void filter(ClientRequestContext requestContext) throws IOException {
        requestContext.getHeaders().add("X-Registry-Client-Version", "0.3.0.5-fts");
        requestContext.getHeaders().add("User-Agent", "schema-registry-client-0.3.0.5-fts");
    }
}
