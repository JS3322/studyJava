package code20221205_stock_global;

import code20221205_stock.studyJava0081_stock_abstract;

public class studyJava0082_stock_global extends studyJava0081_stock_abstract {
    public studyJava0082_stock_global(String stockName, String stockPrice) {
        super(stockName, stockPrice);
    }

    @Override
    public String getExchangeRate() {
        //환율 1달러당 1293원을 적용 (y* 환율(1293) = stockPrice * 1(1달러))
        double localPrice = Double.parseDouble(super.getStockPrice()) / (double)1293;
        return Double.toString(localPrice);
    }
}
