package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;
import lombok.Setter;
import lombok.Getter;

@Entity
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ValidationEntity{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @Size(min=2,max=10,message="must be 2 to 10 characters")
    private String username;
    @Email(message="Email is valid")
    private String email;
    @Size(min=2,max=10,message="must be 2 to 10 characters")
    @NotNull(message="Password is mandatory")
    private String password;
    @Max(30) @Positive(message="Age must be a Positive number")
    private int age;

    // public Long getId(){
    //     return id;
    // }
    // public void setId(Long id){
    //     this.id=id;
    // }
    // public String getUsername(){
    //     return username;
    // }
    // public void setId(String username){
    //     this.username=username;
    // }
    // public String getEmail(){
    //     return email;
    // }
    // public void setEmail(String email){
    //     this.email=email;
    // }
    // public String getPassword(){
    //     return password;
    // }
    // public void setPassword(String password){
    //     this.password=password;
    // }
    // public int getAge(){
    //     return age;
    // }
    // public void setId(int age){
    //     this.age=age;
    // }
    // public ValidationEntity(Long id,@NotNull @Size(min=2,max=10,message="must be 2 to 10 characters") String username,
    // @Email(message="Email is valid") String email,
    // @Size(min=2,max=10,message="must be 2 to 10 characters") @NotNull(message="Password is mandatory") String password,
    // @Max(30) @Positive(message="Age must be a Positive number") int age){
    //     this.id=id;
    //     this.username=username;
    //     this.email=email;
    //     this.password=password;
    //     this.age=age;
    // }
    // public ValidationEntity(){
        
    // }
}