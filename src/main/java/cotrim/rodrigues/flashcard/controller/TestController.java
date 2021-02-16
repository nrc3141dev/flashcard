package cotrim.rodrigues.flashcard.controller;

import java.util.Arrays;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class TestController {

	@GetMapping("/")
	public String hello() {
		return "hello";
	}
	
	@PostMapping("/upload")
	public String uploadFile(@RequestParam MultipartFile[] arquivos) {
		return Arrays.asList(arquivos).stream().map(MultipartFile::getOriginalFilename).reduce("", (x, y) -> x + ", " + y);
	}
}
