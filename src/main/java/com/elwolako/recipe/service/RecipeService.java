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

    public Optional<Recipe> getRecipeById(int id){
        return recipeRepository.findById(id);
    }

//    public Optional<Recipe> updateRecipeById(int id, RecipeDTO newRecipe){
//        return recipeRepository.s
//    }
//    public String createRecipe(String name, String description){
//        return recipeRepository.save(new Recipe(name,description));
//    }

}
