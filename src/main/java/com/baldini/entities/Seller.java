package com.baldini.entities;

import java.util.List;

public class Seller {
    private Long id;
    private User user;
    private String phone;
    private String address;
    private String state;
    private String country;
    private List<Article> articles;
}
