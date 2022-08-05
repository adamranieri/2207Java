package dev.ranieri.annotations;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// lombok uses annotations as way for the developer to avoid
// writing boilerplate unhelpful code
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {

    private int id;
    private String fname;
    private String lname;

}
