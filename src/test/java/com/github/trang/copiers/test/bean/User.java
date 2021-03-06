package com.github.trang.copiers.test.bean;

import com.google.common.base.MoreObjects;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * 用户信息
 */
@Getter
@Setter
@NoArgsConstructor
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer age;
    private Byte sex;
    private Double height;
    private Integer weight;
    private String name;
    private List<String> hobbits;
    private Boolean handsome;
    private Map<String, Object> house;
    private User wife;
    private List<User> sub;

    public static User of(String name, Integer age) {
        User user = new User();
        user.setName(name);
        user.setAge(age);
        return user;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this).omitNullValues()
                .add("age", age)
                .add("sex", sex)
                .add("height", height)
                .add("weight", weight)
                .add("name", name)
                .add("hobbits", hobbits)
                .add("handsome", handsome)
                .add("house", house)
                .add("wife", wife)
                .add("sub", sub)
                .toString();
    }

}