package com.example.demo.controller;

public class JsonFormat {

    private final String id;
    private final String content;

    public JsonFormat(String id, String content) {
        this.id = id;
        this.content = content;
    }

    public String getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

}