package com.invasionofsmallcubes.beecoolbo

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping


@Controller
class HomeController {
    @RequestMapping(value = "/")
    fun index(): String {
        return "index"
    }
    @RequestMapping(value = "/login")
    fun login(): String {
        return "login"
    }
}