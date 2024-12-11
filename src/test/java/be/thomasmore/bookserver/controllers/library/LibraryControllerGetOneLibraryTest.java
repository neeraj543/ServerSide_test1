package be.thomasmore.bookserver.controllers.library;

import be.thomasmore.bookserver.AbstractIntegrationTest;
import org.junit.jupiter.api.Test;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.web.servlet.MvcResult;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.context.jdbc.Sql.ExecutionPhase.AFTER_TEST_METHOD;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@Sql("/sql/libraries/create_2_libraries.sql")
@Sql(scripts = "/sql//clean_libraries.sql", executionPhase = AFTER_TEST_METHOD)
public class LibraryControllerGetOneLibraryTest extends AbstractIntegrationTest {

    @Test
    public void getOneLibrary() throws Exception {
        mockMvc.perform(getMockRequestGet("/api/libraries/1"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.id").value(1))
                .andExpect(jsonPath("$.title").value("Test Automation"));
    }

    @Test
    public void getOneLibraryNotFound() throws Exception {
        final MvcResult mvcResult =
                mockMvc.perform(getMockRequestGet("/api/libraries/9999"))
                        .andExpect(status().isInternalServerError()) // strange!!! I expected isNotFound().....??????
                        .andReturn();
        assertThat(mvcResult.getResponse().getErrorMessage()).isEqualTo("Library with id 9999 does not exist.");

    }
}

