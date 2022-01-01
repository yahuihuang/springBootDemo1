package com.myyhhuang.springbootdemo1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@Tag(name = "myApi", description = "API測試接口")
public class MyController {
    @Operation(summary = "測試")
    @GetMapping("/test1")
    public String test1(@Parameter(description = "測試參數") String testParam) {
        return "test1,2,3,4...";
    }
}
