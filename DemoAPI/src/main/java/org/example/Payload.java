package org.example;

public class Payload {
    public  static String returnJsonSTring()
    {
        String s="""
                {
                "dashboard": {
                "purchaseAmount": 910,
                "website": "rahulshettyacademy.com"
                },
                                
                "courses": [
                                
                {
                                
                "title": "Selenium Python",
                                
                "price": 50,
                                
                "copies": 6
                                
                },
                                
                {
                                
                "title": "Cypress",
                                
                "price": 40,
                                
                "copies": 4
                                
                },
                                
                {
                                
                "title": "RPA",
                                
                "price": 45,
                                
                "copies": 10
                                
                }
                                
                ]
                                
                }""";
        return s;

    }
}
