package com.assignment.base.vo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="test")
@Setter
@Getter
public class UserVO {

    @Id
    private String user_id;
    private String user_nm;

}
