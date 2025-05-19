package web.mvc.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class TestController {

//    @GetMapping("/test")
//    public String test(){
//        log.info("test요청됨....");
//        return "spring Security OK 시작! 잘되는지 궁금해요~";
//    }
    @GetMapping("/test")
    public ResponseEntity<String> test() {
        return ResponseEntity
                .ok()
                .contentType(MediaType.valueOf("text/plain;charset=UTF-8"))  // ✅ 반드시 필요
                .body("spring Security OK 시작! 잘되는지 궁금해요~ 좋아요! OK");
    }
}
