package bean;

import　java.io.Serializable;

public class RegisterBean implements Serializable {
  private String name;
  private String age;
  private String[] langs;

  public RegisterBean() {
  }

  public void setName(String name){
    this.name = name;
  }
  public void setAge(String age){
    this.age = age;
  }
  public void setLangs(String[] langs){
    this.langs = langs;
  }

  public String getName(){
    return name;
  }
  public String getAge(){
    return age;
  }
  public String getLangs(){
    return langs;
  }

  public String getJpnAge(){
    String JpnAge;
    if (age.equals("child")){
      jpnAge="１８歳未満"
    }else{
      jpnAge="１８歳以上"
    }
  }

  public String getJpnAge(){
    String strLangs = "";
    for (int i = 0;)
  }
  return strLangs
}