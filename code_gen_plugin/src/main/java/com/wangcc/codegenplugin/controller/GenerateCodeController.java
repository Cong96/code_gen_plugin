package com.wangcc.codegenplugin.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wangcc.codegenplugin.configs.WebGeneConfig;
import com.wangcc.codegenplugin.proto.Response;

@RestController
@RequestMapping("/gene/")
public class GenerateCodeController {
    @RequestMapping("assign_config")
    public Response assignConfig(@RequestParam WebGeneConfig config) {
        return null;
    }


}
