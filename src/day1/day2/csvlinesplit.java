package day2;

public class csvlinesplit {
    String sdvsplit(String csvline) {
        String[] values = csvline.split(",");
        if (values.length > 3 || values.length <= 2) {
            return "invalid input";
        } else {
            String name = values[0];
            String age = values[1];
            String dept = values[2];
            return "Name: " + name + ", Age: " + age + ", Department:" + dept;

        }
    }
}
