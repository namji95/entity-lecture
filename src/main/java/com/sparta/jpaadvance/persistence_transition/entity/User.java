//package com.sparta.jpaadvance.persistence_transition.entity;
//
//import jakarta.persistence.CascadeType;
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import jakarta.persistence.OneToMany;
//import jakarta.persistence.Table;
//import java.util.ArrayList;
//import java.util.List;
//import lombok.Getter;
//import lombok.Setter;
//
//@Entity
//@Getter
//@Setter
//@Table(name = "users")
//public class User {
//  @Id
//  @GeneratedValue(strategy = GenerationType.IDENTITY)
//  private Long id;
//
//  private String name;
//
//  @OneToMany(mappedBy = "user", cascade = CascadeType.PERSIST)
//  private List<Food> foodList = new ArrayList<>();
//
//  public void addFoodList(Food food) {
//    this.foodList.add(food);
//    food.setUser(this); // 외래키 설정
//  }
//}
