package com.marvellousinfosystems.First;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Laptop
{
    @GetMapping("LaptopDetails")
    public String DisplayLaptopDetails()
    {
        return "Its Core I7 Second Gen Laptop";
    }
}
