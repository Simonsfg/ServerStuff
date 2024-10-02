package org.simon.stuff.client.render.item;

import org.simon.stuff.item.CoinItem;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class CoinItemRenderer extends GeoItemRenderer<CoinItem> {
    public CoinItemRenderer() {
        super(new CoinItemModel());
    }
}
