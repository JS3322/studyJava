/*
code20221205_stock라는 패키지 안에 class를 여러개 다루어서 관리 : class들을 관리 하는 단위 package
클래스의 카테고리화
 */
package code20221205_stock;

public class studyJava0081_stock {
    //필드 : class라는 데이터 단위에 저장되는 데이터변수 이름들
    //private : class내부에서만 쓸 수 있는 접근제한자
    private String stockName;
    private String stockPrice;

    //생성자 : 인스턴스를 처음에 만들 때 초기값 설정
    //studyJava0081_stock(String stockName) : 외부에서 인자값(매개변수)을 받아서 생성
    //인자값 : 외부에서 데이터 선물을 줄 때 지칭하는 별칭 (외부인 시점)
    //매개변수 : 외부에서 데이터를 받아서 변수에 저장하는 변수명을 지칭 (생성자 시점)
    //public : class 외부에서 접근할 수 있는 접근제한자

    /**
     * 
     * @param stockName 주식이름1
     * @param stockPrice 주식가격
     */
    public studyJava0081_stock(String stockName, String stockPrice) {
        //this : 가장 가까운 class
        this.stockName = stockName;
        this.stockPrice = stockPrice;
    }

    //메서드

    /**
     * 
     * @return 주식이름
     */
    public String getStockName() {
        return this.stockName;
    }

    /**
     * 
     * @return 1주 주식 가격
     */
    public String getStockPrice() {
        return this.stockPrice;
    }

    /**
     * 
     * @param stockPrice 변경하고 싶은 주식가격
     */
    public void setStockPrice(String stockPrice) {
        this.stockPrice = stockPrice;
    }
    public void getStockInfo() {
        System.out.println(getStockName());
        System.out.println(getStockPrice());
    }
}
