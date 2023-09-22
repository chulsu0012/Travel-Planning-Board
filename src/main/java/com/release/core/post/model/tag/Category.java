package com.release.core.post.model.tag;

import lombok.Getter;

@Getter
public class Category {

    private int id;
    private String name;

    public Category(int id, String name) {
        this.id = id;
        this.name = name;
    }

}