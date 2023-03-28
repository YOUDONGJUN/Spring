package com.bit.spring.model;

import lombok.Data;

import java.sql.Date;
@Data
public class BoardDTO {
    private int id;
    private int writerId;
    private String writerNickname;
    private String title;
    private String content;
    private Date entryDate;
    private Date modifyDate;
}
