package com.elwolako.recipe.controller;

import com.elwolako.recipe.dto.RecipeDTO;
import com.elwolako.recipe.service.RecipeService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@AllArgsConstructor
public class RecipeController {

    private RecipeService recipeService;


    @GetMapping("/test")
    public ResponseEntity<String> test(){
        return new ResponseEntity<>("Hello World!", HttpStatus.OK);
    }


    @PostMapping("/recipe/")
    public ResponseEntity<String> addRecipe(){
        return new ResponseEntity<>("Hello World!", HttpStatus.OK);
    }

    @GetMapping("/all")
    public ResponseEntity<RecipeDTO> getAllRecepies(){
        RecipeDTO recipeDTO = new RecipeDTO("Name", "description");
        return new ResponseEntity<>(recipeDTO, HttpStatus.OK);
    }
}

