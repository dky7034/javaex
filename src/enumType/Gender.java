package enumType;

public enum Gender {
  MALE("남성"), FEMALE("여성");

  // 생성자
  Gender(String name) {
    this.name = name;
  }
}
