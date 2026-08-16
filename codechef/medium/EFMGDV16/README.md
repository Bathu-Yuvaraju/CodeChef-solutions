# EFMGDV16

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-16T14:57:03.842Z  

```java
import java.util.ArrayList;
import java.util.Scanner;

class Student {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class Main {
    public static void main(String[] args) {
        
        // Create an ArrayList students
        ArrayList<Student> students = new ArrayList<>();
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int age = sc.nextInt();
            students.add(new Student(name, age));
        }

        System.out.println("Student Names:");
        // Print the names of all the students by traversing through the ArrayList
        for (Student student : students) {
            System.out.println(student.getName());
        }
        
        sc.close();
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/EFMGDV16)