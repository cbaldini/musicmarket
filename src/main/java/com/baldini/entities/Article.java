package com.baldini.entities;

import com.baldini.enums.FormatsEnum;
import com.baldini.enums.GoldmineScalesEnum;
import javax.persistence.Entity;

@Entity
public class Article {
    private Long id;
    private Album album;
    private Enum<FormatsEnum> format;
    private Seller seller;
    private Float price;
    private String condition;
    private Enum<GoldmineScalesEnum> goldmineScale;
}
