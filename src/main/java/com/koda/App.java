package com.koda;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("\nEMPLOYEE LIST\n");

        // List
        System.out.println("Penggunaan List");
        System.out.println("========================");
        List<Employee> list = new ArrayList<>();

        list.add(new Employee("KR001", "Andi", "Frontend", "IT", 7000000));
        list.add(new Employee("KR002", "Budi", "Backend", "IT", 5000000));
        list.add(new Employee("KR003", "Citra", "DevOps", "IT", 7000000));

        for (Employee employee : list) {
            System.out.println(employee.employeeId + " - " + employee.name + " - " +
                    employee.salary);
        }

        // Map
        System.out.println("\nPenggunaan Map");
        System.out.println("========================");
        Map<String, Employee> map = new HashMap<>();

        map.put("emp1", new Employee("KR001", "Andi", "Frontend", "IT", 7000000));
        map.put("emp2", new Employee("KR002", "Budi", "Backend", "IT", 5000000));
        map.put("emp3", new Employee("KR003", "Citra", "DevOps", "IT", 7000000));

        for (Employee employee : map.values()) {
            System.out.println(employee.employeeId + " - " + employee.name + " - " +
                    employee.salary);
        }

        // Set
        System.out.println("\nPenggunaan Set");
        System.out.println("========================");
        Set<Employee> set = new HashSet<>();

        set.add(new Employee("KR001", "Andi", "Frontend", "IT", 7000000));
        set.add(new Employee("KR001", "Andi", "Frontend", "IT", 7000000));
        set.add(new Employee("KR002", "Budi", "Backend", "IT", 5000000));
        set.add(new Employee("KR003", "Citra", "DevOps", "IT", 7000000));

        for (Employee employee : set) {
            System.out.println(employee.employeeId + " - " + employee.name + " - " +
                    employee.salary);
        }

        // Queue
        System.out.println("\nPenggunaan Queue");
        System.out.println("========================");
        Queue<Employee> queue = new ArrayDeque<>();

        queue.offer(new Employee("KR001", "Andi", "Frontend", "IT", 7000000));
        queue.offer(new Employee("KR002", "Budi", "Backend", "IT", 5000000));
        queue.offer(new Employee("KR003", "Citra", "DevOps", "IT", 7000000));

        for (Employee employee : queue) {
            System.out.println(employee.employeeId + " - " + employee.name + " - " +
                    employee.salary);
        }
    }
}
