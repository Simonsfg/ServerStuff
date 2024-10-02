package org.simon.stuff.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.BuiltinItemRendererRegistry;
import org.simon.stuff.Stuff;
import org.simon.stuff.client.render.item.CoinItemRenderer;

public class StuffClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        BuiltinItemRendererRegistry.INSTANCE.register(Stuff.COIN_ITEM, (stack, mode, matrices, vertexConsumers, light, overlay) -> {
            // Implement rendering logic here
            new CoinItemRenderer().render(stack, mode, matrices, vertexConsumers, light, overlay);
        });
    }
}
