package ua.artemii.knowledgesharing.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import lombok.SneakyThrows;

@SpringBootTest
@AutoConfigureMockMvc
class MathControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@Test
	@SneakyThrows
	void sum() {
		mockMvc.perform(get("/math/sum")
						.param("a", "1")
						.param("b", "4"))
				.andExpect(status().isOk());
	}

	@Test
	@SneakyThrows
	void difference() {
		mockMvc.perform(get("/math/difference")
						.param("a", "1")
						.param("b", "4"))
				.andExpect(status().isOk());
	}
}
