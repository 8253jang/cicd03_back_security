package web.mvc.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class TestController {


    @GetMapping("/test")
    public ResponseEntity<String> test() {
        return ResponseEntity
                .ok()
                .contentType(MediaType.valueOf("text/plain;charset=UTF-8"))  //
                .body("spring Security OK 시작! 잘되는지 궁금해요~ 좋아요! OK");
    }
}
