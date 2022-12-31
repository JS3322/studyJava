package code20221205_list;

import java.util.ArrayList;
import code20221205_stock.*;

//주식정보를 담는 class는 여러개 필요한가? > no > 1개만 필요 > static(서버 기동시점에서 자동생성)
public class studyJava0082_stockList {
    //필드
    /**
     * @Since studyJava0081_stock 인스턴스를 저장하는 배열 static
     */
    static private ArrayList<studyJava0081_stock> stockList = new ArrayList<>();

    //생성자 : 서버 기동시점에서 자동생성되므로 생성자가 필요한가? > no(인스턴스 만들 필요 없음)

    //메서드 : stock인스턴스를 지속적으로 저장하는 메서드 필요 : 메서드가 실행될 때 stock인스턴스 받아서 저장

    /**
     *
     * @param data studyJava0081_stock를 stockList(static) 필드값에 넣기
     */
    static public void addStock(studyJava0081_stock data) {
        //this? : 가장 가까운 class 지칭
        //class가 static일 경우(이미 1개만 있다는 걸 안다 = this필요있나?),
        //instance일 경우의 차이(어떤 인스턴스인지 알 필요가 있을까? = this필요함)
        stockList.add(data);
    }

    //1. 모든 stock(=stockList(static))을 조회하는 메서드 = static메서드
    static public void getStockInfo() {
        for(studyJava0081_stock item : stockList) {
            //2. stock(instance)안에 있는 name과 price를 조회하는 메서드 = static메서드x
            item.getStockInfo();
        }
    }
}
