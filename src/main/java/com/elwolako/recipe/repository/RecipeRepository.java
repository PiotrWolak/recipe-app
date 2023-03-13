package com.elwolako.recipe.repository;

import com.elwolako.recipe.model.Recipe;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RecipeRepository extends ListCrudRepository<Recipe, Integer> {


    @Query(
            value = "SELECT R.name FROM RECIPES r",
            nativeQuery = true)
    List<String> findAllRecNames();

}
