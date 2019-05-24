package com.example.demo.entity;

import java.math.BigDecimal;

public class Cart {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cart.id
     *
     * @mbggenerated Wed May 22 18:20:39 CST 2019
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cart.gid
     *
     * @mbggenerated Wed May 22 18:20:39 CST 2019
     */
    private Integer gid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cart.img
     *
     * @mbggenerated Wed May 22 18:20:39 CST 2019
     */
    private String img;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cart.name
     *
     * @mbggenerated Wed May 22 18:20:39 CST 2019
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cart.type
     *
     * @mbggenerated Wed May 22 18:20:39 CST 2019
     */
    private String type;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cart.price
     *
     * @mbggenerated Wed May 22 18:20:39 CST 2019
     */
    private BigDecimal price;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cart.num
     *
     * @mbggenerated Wed May 22 18:20:39 CST 2019
     */
    private Integer num;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cart.user_name
     *
     * @mbggenerated Wed May 22 18:20:39 CST 2019
     */
    private String userName;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cart.id
     *
     * @return the value of cart.id
     *
     * @mbggenerated Wed May 22 18:20:39 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cart.id
     *
     * @param id the value for cart.id
     *
     * @mbggenerated Wed May 22 18:20:39 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cart.gid
     *
     * @return the value of cart.gid
     *
     * @mbggenerated Wed May 22 18:20:39 CST 2019
     */
    public Integer getGid() {
        return gid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cart.gid
     *
     * @param gid the value for cart.gid
     *
     * @mbggenerated Wed May 22 18:20:39 CST 2019
     */
    public void setGid(Integer gid) {
        this.gid = gid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cart.img
     *
     * @return the value of cart.img
     *
     * @mbggenerated Wed May 22 18:20:39 CST 2019
     */
    public String getImg() {
        return img;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cart.img
     *
     * @param img the value for cart.img
     *
     * @mbggenerated Wed May 22 18:20:39 CST 2019
     */
    public void setImg(String img) {
        this.img = img == null ? null : img.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cart.name
     *
     * @return the value of cart.name
     *
     * @mbggenerated Wed May 22 18:20:39 CST 2019
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cart.name
     *
     * @param name the value for cart.name
     *
     * @mbggenerated Wed May 22 18:20:39 CST 2019
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cart.type
     *
     * @return the value of cart.type
     *
     * @mbggenerated Wed May 22 18:20:39 CST 2019
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cart.type
     *
     * @param type the value for cart.type
     *
     * @mbggenerated Wed May 22 18:20:39 CST 2019
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cart.price
     *
     * @return the value of cart.price
     *
     * @mbggenerated Wed May 22 18:20:39 CST 2019
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cart.price
     *
     * @param price the value for cart.price
     *
     * @mbggenerated Wed May 22 18:20:39 CST 2019
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cart.num
     *
     * @return the value of cart.num
     *
     * @mbggenerated Wed May 22 18:20:39 CST 2019
     */
    public Integer getNum() {
        return num;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cart.num
     *
     * @param num the value for cart.num
     *
     * @mbggenerated Wed May 22 18:20:39 CST 2019
     */
    public void setNum(Integer num) {
        this.num = num;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cart.user_name
     *
     * @return the value of cart.user_name
     *
     * @mbggenerated Wed May 22 18:20:39 CST 2019
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cart.user_name
     *
     * @param userName the value for cart.user_name
     *
     * @mbggenerated Wed May 22 18:20:39 CST 2019
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    @Override
    public String toString() {
        return "Cart{" +
                "id=" + id +
                ", gid=" + gid +
                ", img='" + img + '\'' +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", price=" + price +
                ", num=" + num +
                ", userName='" + userName + '\'' +
                '}';
    }
}