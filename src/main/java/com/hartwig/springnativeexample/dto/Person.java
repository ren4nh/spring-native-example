package com.hartwig.springnativeexample.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Person(
        String name,
        String gender,
        String url,
        @JsonProperty("hair_color") String hairColor,
        @JsonProperty("birth_year") String birthYear,
        @JsonProperty("eye_color") String eyeColor) {
}
