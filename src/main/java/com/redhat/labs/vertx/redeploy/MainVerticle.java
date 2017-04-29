package com.redhat.labs.vertx.redeploy;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.logging.Logger;
import io.vertx.core.logging.LoggerFactory;

public class MainVerticle extends AbstractVerticle {

    private static final Logger LOG = LoggerFactory.getLogger(MainVerticle.class);
    private static final long DELAY = 1000;

    @Override
    public void start() {
        vertx.setPeriodic(DELAY, l -> LOG.error("Bonjour Vert.x World!") );
    }
}
