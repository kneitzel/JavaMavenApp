package de.kneitzel;

import org.jetbrains.annotations.NotNull;
import java.util.Objects;

/**
 * Entry point for the JavaMavenApp application.
 *
 * <p>This final utility class is not instantiable and provides the application's main method.
 * It coordinates startup behavior and is responsible for high-level program initialization.
 *
 * @since 1.0
 */
public final class JavaApp {

    /**
     * Private constructor to prevent instantiation of this utility class.
     *
     * <p>The class only exposes static behavior and should never be instantiated.
     */
    private JavaApp() {}

    /**
     * Application entry point.
     *
     * <p>This method initializes a {@code Greeting} instance and writes its string representation
     * to standard output. The method does not parse or use {@code args} currently; they are
     * preserved for future extensions.
     *
     * @param args the command-line arguments supplied to the application; must not be {@code null}.
     *             Currently unused and preserved for future extensions.
     */
    static void main(@NotNull final String[] args) {
        // Validate the parameter and reference it to avoid unused-parameter inspections.
        Objects.requireNonNull(args, "args must not be null");

        final Greeting greeting = new Greeting(null);
        System.out.println(greeting);
    }
}
