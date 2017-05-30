package com.testvagrant.mdb.core;

import com.testvagrant.mdb.utils.Commands;
import org.junit.Test;

import java.util.List;

public class CommandExecutorTest {


    @Test
    public void execTest() {
        CommandExecutor commandExecutor = new CommandExecutor();
        List<String> response = commandExecutor.exec(Commands.AndroidCommands.LIST_ALL_DEVICES).asList();
    }

}
