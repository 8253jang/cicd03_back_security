package web.mvc.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class TestController {

  /*  @Value("${OPEN_TEST}")
   private String OPEN_TEST;

    @Value("${OPEN_AGE}")
    private String OPEN_AGE;*/

    @GetMapping("/test")
    public ResponseEntity<String> test() {
       // System.out.println("OPEN_TEST = " + OPEN_TEST);
       // System.out.println("OPEN_AGE = " + OPEN_AGE);

        return ResponseEntity
                .ok()
                .contentType(MediaType.valueOf("text/plain;charset=UTF-8"))  //
                .body("CI/CD GitHub Action Slack - spring Security OK 시작! - Terraform 연결..22");
    }
}
