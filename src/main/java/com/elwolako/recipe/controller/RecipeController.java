package com.elwolako.recipe.controller;

import com.elwolako.recipe.dto.RecipeDTO;
import com.elwolako.recipe.model.Recipe;
import com.elwolako.recipe.service.RecipeService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.regex.Pattern;

@Controller
@AllArgsConstructor
public class RecipeController {
    private static final String SIMPLE_EMAIL_REGEX_PATTERN = "^(.+)@(\\S+)$";

    private RecipeService recipeService;


    @PutMapping(value ="/recipe", consumes = {"application/json"})
    public ResponseEntity<Recipe> updateRecipe(@Valid @RequestBody RecipeDTO recipeDTO){
        validateRecipeDTO(recipeDTO);
        Recipe recipe = recipeService.updateRecipe(recipeDTO);
        return new ResponseEntity<>(recipe, HttpStatus.OK);
    }

    @DeleteMapping("/recipe")
    public ResponseEntity<String> removeRecipe(@RequestParam int id){
        recipeService.removeRecipe(id);
        return new ResponseEntity<>("Recipe " + id + " Removed", HttpStatus.OK);
    }

    @GetMapping("/names")
    public ResponseEntity<List<String>> getAllNames(){
        List<String> allRecipesNames = recipeService.getAllRecipeNames();
        return new ResponseEntity<>(allRecipesNames,HttpStatus.OK);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Recipe>> getAllRecipes(){
        List<Recipe> allRecipesNames = recipeService.getAll();
        return new ResponseEntity<>(allRecipesNames,HttpStatus.OK);
    }


    private void validateRecipeDTO(RecipeDTO recipeDTO){
        if(!isEmail(recipeDTO.getAuthor())){
            throw new IllegalArgumentException("Author is not a valid email address");
        }
    }


    private boolean isEmail(String email){
        return Pattern.compile(SIMPLE_EMAIL_REGEX_PATTERN).matcher(email).matches();
    }
}

