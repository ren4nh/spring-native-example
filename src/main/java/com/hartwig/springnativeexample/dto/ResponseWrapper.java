package com.hartwig.springnativeexample.dto;

import java.util.List;

public record ResponseWrapper<T>(List<T> results) {
}
