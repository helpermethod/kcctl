package dev.morling.kccli.command;

import dev.morling.kccli.util.ConfigurationContext;
import picocli.CommandLine.Command;

import javax.inject.Inject;

@Command(name = "reset", description = "Resets the offsets of the specified source connector")
public class ResetSourceConnectorOffsetsCommand implements Runnable{
    @Inject
    ConfigurationContext context;

    @Override
    public void run() {

    }
}
