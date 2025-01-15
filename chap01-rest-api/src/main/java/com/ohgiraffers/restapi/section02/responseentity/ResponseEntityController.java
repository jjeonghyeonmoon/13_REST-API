package com.ohgiraffers.restapi.section02.responseentity;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/entity")
public class ResponseEntityController {

    /* comment.
    *   ResponseEntity 란?
    *   결과 데이터 & HTTP 상태 코드를 직접 제어할수있는 클래스이다.
    *   내부에 HTTPStatus, HttpHeaders, HttpBody 를 포함한다.*/

    private List<UserDTO> users;

    public ResponseEntityController(){
        users = new ArrayList<>();

        users.add(new UserDTO(1,"user01","pass01","너구리", LocalDate.now()));
        users.add(new UserDTO(2,"user02","pass02","푸바오", LocalDate.now()));
        users.add(new UserDTO(3,"user03","pass03","러바로", LocalDate.now()));
    }
}
