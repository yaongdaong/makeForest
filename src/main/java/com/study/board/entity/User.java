package com.study.board.entity;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
public class User extends TimeEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String password;
    private Boolean enabled;
//
////    추가
//    private String nickname;
//    private String email;
//
//    @Enumerated(EnumType.STRING)
//    @Column(nullable = false)
//    private Role role;
//
//
//    @ManyToMany
//    @JoinTable(
//            name = "user_role",
//            joinColumns = @JoinColumn(name = "user_id"),
//            inverseJoinColumns = @JoinColumn(name = "role_id"))
//    private List<Role> roles = new ArrayList<>();
//
//
////    회원정보 수정을 위한 set method
//    public void modify(String nickname, String password){
//        this.nickname = nickname;
//        this.password = password;
//    }
//
////    소셜로그인시 이미 등록된 회원이라면 수정날짜만 업데이트하고 기존 데이터는 그대로 보존하도록 예외처리
//    public User updateModifiedDate(){
//        this.onPreUpdate();
//        return this;
//    }
//
//    public String getRoleValue(){
//        return this.role.getValue();
//    }
}