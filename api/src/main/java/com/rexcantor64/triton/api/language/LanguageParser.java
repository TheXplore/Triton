package com.rexcantor64.triton.api.language;

import java.util.function.Function;

import com.rexcantor64.triton.api.config.FeatureSyntax;
import net.md_5.bungee.api.chat.BaseComponent;

/**
 * The class responsible by translating messages with placeholders
 */
public interface LanguageParser {

    /**
     * Parses Triton's placeholders in a string and returns the result
     *
     * @param language The {@link Language#getName() name of the language} to use. If invalid, this will fallback
     *                 to the main language without warning.
     * @param syntax   The {@link FeatureSyntax} that'll be used for Triton's placeholders syntax.
     * @param input    The input {@link String}.
     * @return The input but with Triton's placeholders replaced by the message in the provided language.
     */
    String parseString(String language, FeatureSyntax syntax, String input);

    /**
     * Parses Triton's placeholders in a {@link BaseComponent} array and returns the result
     *
     * @param language The {@link Language#getName() name of the language} to use. If invalid, this will fallback
     *                 to the main language without warning.
     * @param syntax   The {@link FeatureSyntax} that'll be used for Triton's placeholders syntax.
     * @param input    The input {@link BaseComponent}.
     * @return The input but with Triton's placeholders replaced by the message in the provided language.
     */
    BaseComponent[] parseComponent(String language, FeatureSyntax syntax, BaseComponent... input);
    
    //ILUMINARY START
    /**
     * converts minimessage input to gson serialized parsed component
     */
    void setMiniMessageParser(Function<String, String> parser);
    //ILUMINARY STOP
}
