package com.flyonsky.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author luowengang
 * @date 2020/4/5 21:17
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {
    private Long id;

    private String name;

    private Integer age;

    private String email;
}
