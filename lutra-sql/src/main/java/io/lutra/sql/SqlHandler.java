package io.lutra.sql;

public interface SqlHandler<I,O>{
    O channelProcess(I input);
}
