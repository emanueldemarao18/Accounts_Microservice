package com.emanuel.accounts.controller;

import com.emanuel.accounts.constants.CustomerConstants;
import com.emanuel.accounts.dto.CustomerDto;
import com.emanuel.accounts.dto.ResponseDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path ="/api", produces = MediaType.APPLICATION_JSON_VALUE)
public class CustomerController {

    @PostMapping("/create")
        public ResponseEntity<ResponseDto> create (@RequestBody CustomerDto customerDto) {

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(new ResponseDto(CustomerConstants.STATUS_201,CustomerConstants.MESSAGE_201));

    }
}
