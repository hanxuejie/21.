package edu.xcdq.sort;

/**
 * @Author:hanxuejie
 * @Date:2021/5/10 10:19
 */

public class User /*implements Comparable<User>*/ {
    private Integer uid;
    private String name;
    private Integer grade;

    public User(){
    }

    public User(Integer uid, String name, Integer grade) {
        this.uid = uid;
        this.name = name;
        this.grade = grade;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }


    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }

       /* @Override
        public int compareTo (User o){
            return this.getGrade() - o.getGrade();
        }*/
    }
