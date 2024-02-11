package com.game.entity;

public class Cart  {
    private Long id;
    private String content;
    private String button1;
    private int nextCart1;
    private String button2;
    private int nextCart2;

    public Cart(Long id, String content, String button1, int nextCart1, String button2, int nextCart2) {
        this.id = id;
        this.content = content;
        this.button1 = button1;
        this.nextCart1 = nextCart1;
        this.button2 = button2;
        this.nextCart2 = nextCart2;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getButton1() {
        return button1;
    }

    public void setButton1(String button1) {
        this.button1 = button1;
    }

    public int getNextCart1() {
        return nextCart1;
    }

    public void setNextCart1(int nextCart1) {
        this.nextCart1 = nextCart1;
    }

    public String getButton2() {
        return button2;
    }

    public void setButton2(String button2) {
        this.button2 = button2;
    }

    public int getNextCart2() {
        return nextCart2;
    }

    public void setNextCart2(int nextCart2) {
        this.nextCart2 = nextCart2;
    }
}