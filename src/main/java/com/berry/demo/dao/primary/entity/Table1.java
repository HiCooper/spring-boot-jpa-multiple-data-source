package com.berry.demo.dao.primary.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Title
 * Description
 * Copyright (c) 2018
 * Company  上海思贤信息技术股份有限公司
 *
 * @author HiCooper
 * @version 1.0
 * @date 2018/7/13 17:39
 */
@Entity
@Data
@Table(name="table1_test")
public class Table1 implements Serializable {


    @Id
    @GeneratedValue
    private Long id ;

    @Column
    private String name;
}
