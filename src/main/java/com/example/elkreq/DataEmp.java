package com.example.elkreq;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class DataEmp {
    /*
    "id":1,"employee_name":"Tiger Nixon","employee_salary":320800,"employee_age":61,"profile_image":""
     */
    int id;
    String employee_name;
    int employee_salary;
    int employee_age;
    String profile_image;

}
