/*
 * package com.example.demo;
 * 
 * import static org.junit.jupiter.api.Assertions.assertEquals;
 * 
 * import javax.net.ssl.SSLEngineResult.Status;
 * 
 * import org.junit.jupiter.api.Test; import org.junit.jupiter.api.TestTemplate;
 * import org.mockito.Mock; import org.mockito.Mockito; import
 * org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest; import
 * org.springframework.boot.test.context.SpringBootTest; import
 * org.springframework.boot.test.context.SpringBootTest.WebEnvironment; import
 * org.springframework.boot.test.mock.mockito.MockBean; import
 * org.springframework.boot.test.web.client.TestRestTemplate; import
 * org.springframework.boot.web.server.LocalServerPort; import
 * org.springframework.http.HttpEntity; import
 * org.springframework.http.HttpMethod; import
 * org.springframework.test.web.servlet.MockMvc; import
 * org.springframework.web.util.UriComponentsBuilder;
 * 
 * import static
 * org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*; import
 * static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
 * import com.example.demo.JunitService;
 * 
 * //@WebMvcTest(JunitController.class)
 * 
 * @SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT) class
 * JunitApplicationTests {
 * 
 * @LocalServerPort private int port;
 * 
 * @Autowired TestRestTemplate restTemplate;
 * 
 * // @Autowired // MockMvc mvc;
 * 
 * @MockBean JunitService jService;
 * 
 * @MockBean ComUsersRepository cu;
 * 
 * @Test public void secondTest() {
 * 
 * Mockito.when(jService.getUser()).thenReturn("users213"); HttpEntity<String> h
 * = new HttpEntity<String>(null, null); String sh =
 * restTemplate.exchange("http://localhost:" + port + "/api/getUser",
 * HttpMethod.GET, h, String.class) .getBody(); System.out.println(sh); }
 * 
 * 
 * @Test void firstTest(){ try {
 * Mockito.when(jService.getUser()).thenReturn("hmm");
 * 
 * String h=mvc.perform(get("/api/getUser")) .andExpect(status().isOk())
 * .andReturn().getResponse().getContentAsString(); assertEquals("hmm", h);
 * 
 * 
 * } catch (Exception e) { // TODO Auto-generated catch block
 * e.printStackTrace(); } }
 * 
 * 
 * }
 */