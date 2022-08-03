package com.electricity.service;

import org.springframework.stereotype.Service;

@Service
public class BillServiceImplementation implements BillService {
    @Override
    public Double calculateBill(Integer units) {
        Double bill = Double.valueOf(0);
        ;
        if (units > 0 && units <= 100) {
            bill = Double.valueOf(units * 5);
        } else if (units > 100 && units <= 400) {
            bill = Double.valueOf(units * 6);
        } else if (units > 400) {
            bill = Double.valueOf(units * 8);
        }
        bill = bill + bill * 3 / 100;
        bill = bill + bill * 18 / 100;
        return bill;
    }
}
