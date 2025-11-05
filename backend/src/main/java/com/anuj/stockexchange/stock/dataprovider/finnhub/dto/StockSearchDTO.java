package com.anuj.stockexchange.stock.dataprovider.finnhub.dto;

import java.util.List;

public record StockSearchDTO(int count, List<StockSearchDetailsDTO> result) {

}
