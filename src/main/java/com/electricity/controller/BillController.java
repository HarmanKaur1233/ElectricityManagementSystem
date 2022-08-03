package com.electricity.controller;

import com.electricity.service.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bill")
public class BillController {
    @Autowired
    BillService billService;

    @GetMapping("/{units}")
    public ResponseEntity calculateBill(@PathVariable("units") Integer units) {
        Double bill = billService.calculateBill(units);
        return new ResponseEntity(bill, HttpStatus.OK);
    }
}
