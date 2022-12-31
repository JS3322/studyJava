package code20221205_stock_local;

import code20221205_stock.studyJava0081_stock_abstract;

public class studyJava0082_stock_local extends studyJava0081_stock_abstract {

    /**
     * @param stockName  주식이름1
     * @param stockPrice 주식가격
     */
    public studyJava0082_stock_local(String stockName, String stockPrice) {
        super(stockName, stockPrice);
    }

    /**
     * 
     * @return 국내주식 getStockPrice()리턴값
     */
    @Override
    public String getExchangeRate() {
        return super.getStockPrice();
    }


}
