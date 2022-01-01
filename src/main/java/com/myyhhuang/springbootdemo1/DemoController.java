package com.myyhhuang.springbootdemo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@Tag(name = "myApi", description = "API測試接口")
@RequestMapping("/api")
public class DemoController {
        @Autowired
        DemoService demoService;

        @Operation(summary = "回覆日期時間", description = "回覆客戶日期時間，並打招呼.")
        @ApiResponse(responseCode = "401", description = "沒有權限", content = @Content)
        @ApiResponse(responseCode = "404", description = "找不到路徑", content = @Content)
        @GetMapping(value = "/{name}")
        public ResponseEntity<String> getServerTime(@PathVariable(value = "name", required = true) String name,
                        @RequestParam(value = "age", required = false) Integer age) {
                if (age >= 20) {
                        return ResponseEntity.ok("Hello " + name + ", 現在時間: " +
                                        demoService.getServerTime() +
                                        ", 您的年紀是 " + age + " .");
                } else {
                        return new ResponseEntity<String>("The String ResponseBody with custom status code (401 沒有權限)",
                                        HttpStatus.FORBIDDEN);
                }
        }
}
