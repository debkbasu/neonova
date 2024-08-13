package learn.self.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api/v1")
public class TechController {
	
	
	@GetMapping("/callnxt")
	public ResponseEntity<String> callTheNextAPI() {
		
		final String uri = "http://localhost:8080/rest/api/v1/gethello";

	    RestTemplate restTemplate = new RestTemplate();
	    String result = restTemplate.getForObject(uri, String.class);

	    System.out.println("**"+result+"***");
		
		return new ResponseEntity<>(result, HttpStatus.OK);
	}

}
