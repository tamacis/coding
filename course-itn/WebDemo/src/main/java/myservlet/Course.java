package myservlet;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public @Data
class Course {
    int id;
    String title;
    String duration;
    int price;

}