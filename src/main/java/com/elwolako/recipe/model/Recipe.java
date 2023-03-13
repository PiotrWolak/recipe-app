package com.elwolako.recipe.model;

import com.elwolako.recipe.dto.RecipeDTO;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Recipes")
@Data
@NoArgsConstructor
public class Recipe {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "author")
    private String author;
    @Column(name = "instruction")
    private String instruction;

    public Recipe(RecipeDTO recipeDTO) {
        if(recipeDTO.getId()!=null) {
            this.id = recipeDTO.getId();
        }
        this.name= recipeDTO.getName();
        this.author= recipeDTO.getAuthor();
        this.instruction= recipeDTO.getInstruction();
    }
}
