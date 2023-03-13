package com.elwolako.recipe.dto;

import com.elwolako.recipe.model.Recipe;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RecipeDTO {
    Integer id;
    @NotBlank(message = "Name cannot be empty")
    @Size( max = 128)
    String name;

    @Size( max = 128)
    String author;

    @NotBlank
    @Size( max = 1024)
    String instruction;

    public RecipeDTO(Recipe recipeDTO) {
        this.id= recipeDTO.getId();
        this.name= recipeDTO.getName();
        this.author= recipeDTO.getAuthor();
        this.instruction= recipeDTO.getInstruction();
    }
}
