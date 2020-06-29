package com.buildingresttutorialservice.buildingrestservicetutorial.payroll;

import org.springframework.data.jpa.repository.JpaRepository;

interface OrderRepository extends JpaRepository<Order, Long> {
}