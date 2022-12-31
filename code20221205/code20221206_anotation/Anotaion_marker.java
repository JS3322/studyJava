package code20221206_anotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//적용대상
//정보유지대상
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Anotaion_marker {
    String elementName() default "주식 컨텐츠 가입회원";
    int cost();
    String[] roles() default {"주식", "그래프", "게임"};

}
