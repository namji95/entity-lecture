package com.sparta.jpaadvance.one_to_many.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "food")
public class Food {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String name;
  private double price;

  @OneToMany
  @JoinColumn(name = "food_id") // users 테이블에 food_id 컬럼
  private List<User> userList = new ArrayList<>();
}

/*
1 대 N 단방향 관계 (외래 키를 관리하는 주인은 음식 Entity이지만 실제 외래 키는 고객 Entity가 가지고 있습니다.)

@Entity
@Table(name = "food")
public class Food {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private double price;

    @OneToMany
    @JoinColumn(name = "food_id") // users 테이블에 food_id 컬럼
    private List<User> userList = new ArrayList<>();
}

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
}

--------------------------------------------------------------

1 대 N 양방향 관계 (외래 키를 관리하는 주인은 음식 Entity이지만 실제 외래 키는 고객 Entity가 가지고 있습니다.)
- 1 대 N 관계에서는 일반적으로 양방향 관계가 존재하지 않습니다.
- 1 대 N 관계에서 양방향 관계를 맺으려면
  음식 Entity를 외래 키의 주인으로 정해주기 위해
  고객 Entity에서 mappedBy 옵션을 사용해야 하지만
  @ManyToOne 애너테이션은 mappedBy 속성을 제공하지 않습니다.
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

		@ManyToOne
		@JoinColumn(name = "food_id", insertable = false, updatable = false)
		private Food food;
}
- N 관계의 Entity인 고객 Entity에서 @JoinColum의 insertable 과 updatable 옵션을 false로 설정하여
  양쪽으로 JOIN 설정을 하면 양방향처럼 설정할 수는 있습니다.
 */
