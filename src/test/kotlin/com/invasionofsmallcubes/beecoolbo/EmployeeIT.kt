package com.invasionofsmallcubes.beecoolbo

import org.amshove.kluent.`should equal to`
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.ActiveProfiles
import org.springframework.test.context.junit4.SpringRunner

@SpringBootTest
@ActiveProfiles("test")
@RunWith(SpringRunner::class)
class EmployeeIT {

    @Autowired
    lateinit var employeeRepository: EmployeeRepository

    @Test
    fun creationAndFind() {
        val employee = employeeRepository.save(Employee(name = "ciao"))
        val created = employeeRepository.findOne(employee.id)
        created.name `should equal to` "ciao"
    }
}