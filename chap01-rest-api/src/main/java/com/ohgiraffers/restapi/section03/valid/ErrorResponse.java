package com.ohgiraffers.restapi.section03.valid;


import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class ErrorResponse {

    private String code;        //에러코드
    private String description; //에러설명
    private String detail;      // 부가설명
}
