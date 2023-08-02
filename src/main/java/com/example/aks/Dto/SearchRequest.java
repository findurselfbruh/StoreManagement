package com.example.aks.Dto;

import lombok.Data;

@Data
public class SearchRequest {
    private String searchByName;
    private String searchByGmail;
    private long searchByProductId;
    private long searchByCustomerId;
    private long searchByQty;
    private long searchByTotalPrice;
    private long searchByShopId;

}
