package com.project.http.controller.dto;

import lombok.AccessLevel;
import lombok.Builder;

@Builder(access = AccessLevel.PRIVATE)
public record ProjectResponse<T> (
        boolean success,
        String message,
        T data
) {
    public static <T> ProjectResponse<T> of(T data, String message) {
        return ProjectResponse.<T>builder()
                .success(true)
                .message(message)
                .data(data)
                .build();
    }

    public static ProjectResponse<?> of(String message) {
        return ProjectResponse.builder()
                .success(false)
                .message(message)
                .build();
    }
}
