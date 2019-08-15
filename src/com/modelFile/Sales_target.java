package com.my.db;

public class Sales_target {
  private String id;
  private String user_code;
  private java.sql.Timestamp data_ym;
  private String role_code;
  private String target;
  private java.sql.Timestamp create_dt;
  private String create_by;
  private java.sql.Timestamp modify_dt;
  private String modify_by;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getUser_code() {
    return user_code;
  }

  public void setUser_code(String user_code) {
    this.user_code = user_code;
  }

  public java.sql.Timestamp getData_ym() {
    return data_ym;
  }

  public void setData_ym(java.sql.Timestamp data_ym) {
    this.data_ym = data_ym;
  }

  public String getRole_code() {
    return role_code;
  }

  public void setRole_code(String role_code) {
    this.role_code = role_code;
  }

  public String getTarget() {
    return target;
  }

  public void setTarget(String target) {
    this.target = target;
  }

  public java.sql.Timestamp getCreate_dt() {
    return create_dt;
  }

  public void setCreate_dt(java.sql.Timestamp create_dt) {
    this.create_dt = create_dt;
  }

  public String getCreate_by() {
    return create_by;
  }

  public void setCreate_by(String create_by) {
    this.create_by = create_by;
  }

  public java.sql.Timestamp getModify_dt() {
    return modify_dt;
  }

  public void setModify_dt(java.sql.Timestamp modify_dt) {
    this.modify_dt = modify_dt;
  }

  public String getModify_by() {
    return modify_by;
  }

  public void setModify_by(String modify_by) {
    this.modify_by = modify_by;
  }
}
