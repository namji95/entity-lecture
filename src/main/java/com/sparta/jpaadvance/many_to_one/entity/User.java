//package com.sparta.jpaadvance.many_to_one.entity;
//
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
//
//  @Id
//  @GeneratedValue(strategy = GenerationType.IDENTITY)
//  private Long id;
//  private String name;
//
//  // 양방향 시 필요한 코드
//  @OneToMany(mappedBy = "user")
//  private List<Food> foodList = new ArrayList<>();
//
//  public void addFoodList(Food food) {
//    this.foodList.add(food);
//    food.setUser(this); // 외래 키(연관 관계) 설정
//  }
//}
//
///*
//N 대 1 단방향 관계 (음식 Entity가 N의 관계로 외래 키의 주인)
//
//@Entity
//@Table(name = "food")
//public class Food {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//    private String name;
//    private double price;
//
//    @ManyToOne
//    @JoinColumn(name = "user_id")
//    private User user;
//}
//
//@Entity
//@Table(name = "users")
//public class User {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//    private String name;
//}
//
//--------------------------------------------------------------
//
//N 대 1 양방향 관계  (음식 Entity가 N의 관계로 외래 키의 주인)
//
//@Entity
//@Table(name = "food")
//public class Food {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//    private String name;
//    private double price;
//
//    @ManyToOne
//    @JoinColumn(name = "user_id")
//    private User user;
//}
//
//@Entity
//@Table(name = "users")
//public class User {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//    private String name;
//
//    @OneToMany(mappedBy = "user")
//    private List<Food> foodList = new ArrayList<>();
//}
// */
