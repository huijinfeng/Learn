package com.jinf.learnspring;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * @author jinfeng
 * @since 2022/3/22 16:20
 */
public class MainTest {
    public static void main(String[] args) {
        System.out.println(getMostCharInString("hello world"));
    }


    public static Map<Character, Integer> getMostCharInString(String str) {
        Optional<Map.Entry<Integer, Integer>> reduce = str.chars().collect(HashMap<Integer, Integer>::new, (map, c) -> map.compute(c, (k, v) -> v == null ? 1 : v + 1), HashMap::get)
                .entrySet()
                .stream()
                .reduce((cur, next) -> next.getValue() > cur.getValue() ? next : cur);
        if (reduce.isPresent()) {
            Map.Entry<Integer, Integer> entry = reduce.get();
            Map<Character, Integer> result = new HashMap<>();
            result.put((char) entry.getKey().intValue(), entry.getValue());
            return result;
        }
        return new HashMap<>();
    }

    @Data
    static class School {
        @Autowired
        private Student student;
    }

    @Data
    @AllArgsConstructor
    static class Student {
        private String name;
    }

    @Bean
    public Student student() {
        return new Student("HJF");
    }
}
