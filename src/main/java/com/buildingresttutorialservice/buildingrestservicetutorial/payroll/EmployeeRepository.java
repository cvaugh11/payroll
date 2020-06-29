package com.buildingresttutorialservice.buildingrestservicetutorial.payroll;

import org.springframework.data.jpa.repository.JpaRepository;

interface EmployeeRepository extends JpaRepository<Employee, Long> {

}