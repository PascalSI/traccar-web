package org.traccar.web.server.model;

public interface ICommandHandler {
    void success(String data);
    void fail(String reason);
}
