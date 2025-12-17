package com.example.demo.entity;

@Entity
public class StudentEntity{
    private Integer id;
    private String name;
    private String email; 
    private String password;
    private Date created;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public String getPassword(){
        return password;
    }
    public void setPassword(){
        this.password=password;
    }
    public Date getCreated(){
        return created;
    }
    public void setCreated(){
        this.created=cr
    }

