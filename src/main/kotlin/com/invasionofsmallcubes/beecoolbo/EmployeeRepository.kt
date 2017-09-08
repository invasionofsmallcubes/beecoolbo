package com.invasionofsmallcubes.beecoolbo

import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.stereotype.Repository

@Repository
interface EmployeeRepository : PagingAndSortingRepository<Employee, Long>