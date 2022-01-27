package com.sakadream.jsf.bean; 
import java.util.ArrayList;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties; 

@JsonIgnoreProperties(ignoreUnknown = true)
public class ReasonOption{
    public String label;
    public boolean hidden;
    public boolean restrict;
    public Category category;
    public Value value;
    public Date createdAt;
    public Date updatedAt;
    public int id;
    public ArrayList<Object> reasonOptions;
}
