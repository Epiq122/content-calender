package com.epiqdev.contentcalender.model;import java.time.LocalDateTime;public record Content(        Integer id,        String title,        String desc,        Status status,        Type contentType,        LocalDateTime dateCreated,        LocalDateTime dateUpdatedm,        String url) {}