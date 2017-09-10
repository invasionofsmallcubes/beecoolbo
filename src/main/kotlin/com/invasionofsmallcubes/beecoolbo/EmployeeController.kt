package com.invasionofsmallcubes.beecoolbo

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.PageRequest
import org.springframework.data.domain.Sort
import org.springframework.data.rest.webmvc.RepositoryRestController
import org.springframework.http.HttpHeaders
import org.springframework.http.HttpStatus.OK
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod.GET
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.ResponseBody


@RepositoryRestController
class EmployeeController @Autowired constructor(val repo: EmployeeRepository) {

    @RequestMapping(method = arrayOf(GET),
            path = arrayOf("employees"))
    @ResponseBody
    fun getEmployees(@RequestParam("_sort", required = false, defaultValue = "id") _sort: String,
                     @RequestParam("_order", required = false, defaultValue = "DESC") _order: String,
                     @RequestParam("_start", required = false, defaultValue = "0") _start: Int,
                     @RequestParam("_end", required = false, defaultValue = "20") _end: Int): ResponseEntity<MutableIterable<Employee>> {
        val pr = PageRequest(_start, 20, Sort.Direction.valueOf(_order), _sort)
        val result = repo.findAll(pr)
        val headers = HttpHeaders()
        headers.add("X-Total-Count", result.count().toString())
        return ResponseEntity(result.content, headers, OK)
    }
}