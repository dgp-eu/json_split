/*
 * Copyright 2026 Daniel-Gheorghe Popiniuc
 */
package io.github.dgp_eu.json_split.cli;

import io.github.dgp_eu.tools.core.CommonInteractiveClass;
import picocli.CommandLine;



/**
 * Main Command Line
 */
@CommandLine.Command(
    name = "top",
    subcommands = {
            JsonSplit.class
    }
)
public final class ApplicationJsonSplit {

    /**
     * Constructor empty
     */
    private ApplicationJsonSplit() {
        super();
    }

    /**
     * Constructor
     *
     * @param args command-line arguments
     */
    /* default */ static void main(final String... args) {
        CommonInteractiveClass.startMeUpWithParameters("logs/JsonSplit-", "/json-split-pom.xml");
        final int intJsonExitCode = new CommandLine(new ApplicationJsonSplit()).execute(args);
        CommonInteractiveClass.shutMeDownWithParameters(intJsonExitCode, args[0]);
    }

}
