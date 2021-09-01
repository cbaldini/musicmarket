package com.baldini.entities;

import com.baldini.enums.GendersEnum;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;

@Entity
public class Band {
    private Long id;
    private String name;
    private Enum<GendersEnum> gender;
    @ManyToMany
    private List<Artist> artists;
}
