package lk.simplecloud_consum.pojo;


/**
 * @author lk
 * @date 2019-04-11 21:55
 */

public class TbUser {


  private Integer userId;


  private String userName;

  private String userSex;

  private Integer userAge;

  private String userLoginId;

  private String userLoginPwd;


  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }


  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }


  public String getUserSex() {
    return userSex;
  }

  public void setUserSex(String userSex) {
    this.userSex = userSex;
  }


  public Integer getUserAge() {
    return userAge;
  }

  public void setUserAge(Integer userAge) {
    this.userAge = userAge;
  }


  public String getUserLoginId() {
    return userLoginId;
  }

  public void setUserLoginId(String userLoginId) {
    this.userLoginId = userLoginId;
  }


  public String getUserLoginPwd() {
    return userLoginPwd;
  }

  public void setUserLoginPwd(String userLoginPwd) {
    this.userLoginPwd = userLoginPwd;
  }

}
