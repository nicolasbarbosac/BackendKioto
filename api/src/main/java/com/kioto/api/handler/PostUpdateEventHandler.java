package com.kioto.api.handler;

import org.hibernate.event.spi.PostUpdateEvent;

public interface PostUpdateEventHandler extends Runnable {
    void register(PostUpdateEvent event);
}