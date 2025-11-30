package de.kneitzel;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Simple greeting value object used for demonstration purposes.
 *
 * <p>Instances are immutable and encapsulate a single name that is used when generating
 * a greeting string via {@link #toString()}.
 */
public class Greeting {

    /**
     * Default name used when no explicit name is provided. The default value is the German
     * word {@code "Welt"} ("world").
     */
    public static final String DEFAULT_NAME = "Welt";

    /**
     * The name to greet. Never {@code null}.
     */
    @NotNull
    private final String name;

    /**
     * Returns the name that will be greeted.
     *
     * @return the name to greet; never {@code null}.
     */
    public @NotNull String getName() {
        return name;
    }

    /**
     * Creates a new {@code Greeting} instance that greets the default name ({@link #DEFAULT_NAME}).
     */
    public Greeting() {
        this(null);
    }

    /**
     * Creates a new {@code Greeting} instance for the given name.
     *
     * @param name the name to greet; may be {@code null} in which case {@link #DEFAULT_NAME}
     *             will be used instead.
     */
    public Greeting(@Nullable final String name) {
        this.name = name == null ? DEFAULT_NAME : name;
    }

    /**
     * Returns a greeting string for this instance.
     *
     * <p>The greeting is formatted in German as {@code "Hallo <name>!"}. The returned string is
     * never {@code null}.
     *
     * @return a greeting such as {@code "Hallo Welt!"}; never {@code null}.
     */
    @NotNull
    @Override
    public String toString() {
        return "Hallo " + name + "!";
    }
}
