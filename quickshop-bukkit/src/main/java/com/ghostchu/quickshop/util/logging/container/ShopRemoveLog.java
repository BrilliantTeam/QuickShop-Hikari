package com.ghostchu.quickshop.util.logging.container;

import com.ghostchu.quickshop.api.shop.ShopInfoStorage;
import com.ghostchu.quickshop.common.obj.QUser;
import lombok.Data;

@Data
public class ShopRemoveLog {
    private static int v = 2;
    private QUser player;
    private String reason;
    private ShopInfoStorage shop;

    public ShopRemoveLog(QUser player, String reason, ShopInfoStorage shop) {
        this.player = player;
        this.reason = reason;
        this.shop = shop;
    }
}
