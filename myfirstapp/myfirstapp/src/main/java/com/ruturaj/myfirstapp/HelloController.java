package com.ruturaj.myfirstapp;
import org.springframework.web.bind.annotation.PathVariable;
//public class HelloController {

//package com.ruturaj.myfirstapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {


    @GetMapping("/hello")
    public String sayHello() {
        return "Welcome in the Spring Boot ... Ruturaj_ 🔥";



    }

    @GetMapping("/product")
    public Product getProductDetails() {
        // आपण एका ग्रामीण उत्पादनाचा (Organic Honey) ऑब्जेक्ट बनवूया
        Product p = new Product(101, "सेंद्रिय मध (Organic Honey)", 250.00);

        // आपण थेट Java Object परत पाठवत आहोत
        return p;
    }
    // ही ओळ सर्वात वर Imports मध्ये ॲड कर

    // ... तुझे आधीचे कोड ...

    // १. URL मध्ये आपण {id} असा एक रिकामा डबा ठेवला आहे
    @GetMapping("/product/{id}")
    public Product getProductById(@PathVariable int id) {

        // २. @PathVariable मुळे URL मधला नंबर थेट या 'id' व्हेरिएबल मध्ये आला!
        // आता आपण तोच ID वापरून प्रॉडक्ट बनवून परत पाठवू.

        Product p = new Product(id, "स्पेशल डायनॅमिक प्रॉडक्ट", 999.00);
        return p;
    }
}