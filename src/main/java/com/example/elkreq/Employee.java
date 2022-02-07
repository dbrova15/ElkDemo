package com.example.elkreq;


import lombok.Data;
import lombok.experimental.Accessors;


@Data
@Accessors(chain = true)
public class Employee {
    /*
    {"status":"success","data":{"id":1,"employee_name":"Tiger Nixon","employee_salary":320800,"employee_age":61,"profile_image":""},"message":"Successfully! Record has been fetched."}
     */
    String success;
    DataEmp data;
    String message;

    @Override
    public String toString() {
        return "Employee{" +
                "success='" + success + '\'' +
                ", data=" + data +
                ", message='" + message + '\'' +
                '}';
    }
}
