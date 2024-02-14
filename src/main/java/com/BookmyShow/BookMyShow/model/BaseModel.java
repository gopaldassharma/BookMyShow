package com.BookmyShow.BookMyShow.model;
import lombok.Getter;
import java.util.Date;

@Getter
public abstract class BaseModel {
    private long id;
    private Date createdAt;
    private Date updatedAt;
}
