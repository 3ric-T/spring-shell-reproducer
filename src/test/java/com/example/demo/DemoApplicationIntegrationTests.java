package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.shell.test.ShellAssertions;
import org.springframework.shell.test.ShellScreen;
import org.springframework.shell.test.ShellTestClient;
import org.springframework.shell.test.autoconfigure.ShellTest;
import org.springframework.test.context.ContextConfiguration;

@ShellTest()
@ContextConfiguration(classes = DemoApplication.class)
class DemoApplicationIntegrationTests {
    @Test
    void testCommandExecution(@Autowired ShellTestClient client) throws Exception {
        // when
        ShellScreen shellScreen = client.sendCommand("help");

        // then
        ShellAssertions.assertThat(shellScreen).containsText("AVAILABLE COMMANDS");
    }
}