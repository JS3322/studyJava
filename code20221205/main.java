/*
모듈화 : 프로그램을 조각조각 내어서 관리하는 방식
*class로 상속 및 인스턴스, import Math.Random() 패키지 모듈 가져와서 씀, import Scanner 키보드 데이터 받는 모듈 사용
*static으로 선언한 메서드를 그냥 가져다 씀
 */

//class를 묶어서 관리하는 package를 불러오는 import
//* : package안에 있는 모든 class를 불러옴

import static code20221205_list.studyJava0082_stockList.*;
import code20221205_stock.*;
import code20221205_stock_global.studyJava0082_stock_global;
import code20221205_stock_local.studyJava0082_stock_local;
import code20221206_accountDepth3_depth3.studyJava0091_accountStock;
import code20221206_anotation.Anotaion_marker;


//mission1 : code20221205_stock 안에 있는 studyJava0081_stock class에 주식 가격(stockPrice)를 변경하는 메서드를 만들어서 실행시키시오
//mission2 : studyJava0081_stock 정보를 저장하는 새로운 package를 만들어서 main 메서드에서 호출해 보시오
//예) ArrayList<studyJava0081_stock> 필드값을 가지는 studyJava0082_stockList class를 만들어서, main메서드에서 호출하기
//mission3 : studyJava0082_stockList에서 studyJava0081_stock 인스턴스 1개의 정보를 조회하는 메서드와
//studyJava0082_stockList 모든 정보를 조회하는 메서드를 구성하여 실행하시오
// (단, static메서드를 어떨 때 쓰면 좋을지 구상하고 구현하시오)

public class main {

    public static void main(String[] args) {
        System.out.println("hello world");

//        /삼성전자 1주당 가격 60000원과 애플 1주당 가격 80000원의 인스턴스를 만들어서
        studyJava0082_stock_local samsungStock = new studyJava0082_stock_local("삼성전자", "60000");
        studyJava0082_stock_global appleStock = new studyJava0082_stock_global("애플", "80000");

//        System.out.println(samsungStock.getExchangeRate());
//        System.out.println(appleStock.getExchangeRate());

        studyJava0091_accountStock instance1 = new studyJava0091_accountStock(
                "idExample", "pwExample", "emailExample", "nameExample",
                "0110000100001"
        );

        studyJava0091_accountStock instance2 = new studyJava0091_accountStock(
                "2idExample", "2pwExample", "2emailExample", "2nameExample",
                "20110000100001"
        );

        instance1.addStockList(new studyJava0082_stock_global("애플", "80000"));
        instance1.addStockList(new studyJava0082_stock_local("삼성전자", "50000"));

        instance2.addStockList(new studyJava0082_stock_global("테슬라", "40000"));

        instance1.getInfo();
        instance2.getInfo();



//        studyJava0081_stock stockInstanceExample = new studyJava0081_stock("애플", "5000");
//        System.out.println(stockInstanceExample.getStockPrice());
//        stockInstanceExample.setStockPrice("10000");
//        System.out.println(stockInstanceExample.getStockPrice());
//
//        addStock(stockInstanceExample);
//        System.out.println("------------");
//        getStockInfo();


    }

}
