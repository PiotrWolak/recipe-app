package com.elwolako.recipe.service;

import com.elwolako.recipe.dto.RecipeDTO;
import com.elwolako.recipe.model.Recipe;
import com.elwolako.recipe.repository.RecipeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class RecipeService {
    private RecipeRepository recipeRepository;
    public List<String> getAllRecipeNames(){
     return recipeRepository.findAllRecNames();
    }
    public List<Recipe> getAll(){
        return recipeRepository.findAll();
    }

    public Recipe updateRecipe(RecipeDTO newRecipe){
        return recipeRepository.save(new Recipe(newRecipe));
    }
    public Recipe createRecipe(RecipeDTO recipeDTO){
        return recipeRepository.save(new Recipe(recipeDTO));
    }

    public void removeRecipe(int id){
        recipeRepository.deleteById(id);
    }

}
