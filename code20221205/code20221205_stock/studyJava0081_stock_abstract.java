package code20221205_stock;

/*
abstract : 추상클래스
1. 추상클래스와 일반클래스는 포함관계 : 추상클래스는 일반클래스와 동일하게 기능 할 수 있다
2. 인스턴스 만들지 못한다! >> 인스턴스를 만들려면 상속 받아서 구현해야 된다! : 인스턴스를 바로 만들지 못하게 안전장치
3. 추상메서드 존재 : 코드부분{}이 없는 선언만 한 메서드 (껍데기) : 상속받은 구현class의 메서드는 @Override로 재정의 필수
 */

/*
mission1 : studyJava0082_stock_local은 studyJava0081_stock_abstract 상속받아 구현하되,
추상메서드 getExchangeRate()의 {}코드부분에 return 값이 stockPrice이 되도록 구현하시오
mission2 :  studyJava0082_stock_global은 studyJava0081_stock_abstract 상속받아 구현하되,
추상메서드 getExchangeRate()의 {}코드부분에 return 값이 stockPrice에 현재 환율이 적용되어
달러로 변환하여 출력하도록 하시오
예) stockPrice의 값이 10000원 일 경우, 환율 1달러당 1293원을 적용하여, (몇 달러)인지 return값에 출력
mission3 : 삼성전자 1주당 가격 60000원과 애플 1주당 가격 80000원의 인스턴스를 만들어서
환율을 출력하는 메서드를 구현하고 실행하여 console창에 출력하시오
 */
public abstract class studyJava0081_stock_abstract {

    private String stockName;
    private String stockPrice;
    private String exchangeRate;

    public studyJava0081_stock_abstract(String stockName, String stockPrice) {
        this.stockName = stockName;
        this.stockPrice = stockPrice;
    }
    public String getStockName() {
        return this.stockName;
    }
    protected String getStockPrice() {
        return this.stockPrice;
    }
    public abstract String getExchangeRate();
}
