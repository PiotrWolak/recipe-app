package com.elwolako.recipe.controller;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.beans.factory.annotation.Value;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class RecipeControllerTest {
    @Value(value="${local.server.port}")
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void getAll_initialDataPresent_dataIsReturned() throws Exception {
        String expectedJsonData = "[{\"id\":1,\"name\":\"Kisiel\",\"author\":\"me@gmail.com\",\"instruction\":\"1. open kisiel, 2. throw kisiel into a boiling water, 3. stir\"}";
        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/all",
                String.class)).contains(expectedJsonData);
    }

}