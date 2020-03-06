package com.spring.app;

import com.spring.service.CheckNumberService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CheckNumberController {

    private final CheckNumberService checkNumberService;

    public CheckNumberController(CheckNumberService checkNumberService) {
        this.checkNumberService = checkNumberService;
    }

    @GetMapping("/number")
    public String checkNumber() {
        return checkNumberService.oddOrEvenNumber();
    }


}
