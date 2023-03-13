package com.elwolako.recipe.service;

import com.elwolako.recipe.model.Recipe;
import com.elwolako.recipe.repository.RecipeRepository;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RecipeServiceTest {

    RecipeRepository mockRepo = Mockito.mock(RecipeRepository.class);
    RecipeService underTest = new RecipeService(mockRepo);

    @Test
    public void getAll_repositoryContainsNoRecipes_returnEmptyList() throws Exception {
        //given
        Recipe recipe = new Recipe();
        recipe.setAuthor("Me@me.me");
        Mockito.when(mockRepo.findAll()).thenReturn(List.of(recipe));
        //when
        List<Recipe> all = underTest.getAll();
        //then
        assertEquals(1,all.size());
        assertEquals(recipe,all.get(0));

    }

}