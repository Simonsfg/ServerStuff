package org.simon.stuff;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import org.simon.stuff.item.CoinItem;
import software.bernie.geckolib.GeckoLib;
import net.minecraft.registry.Registries;

public class Stuff implements ModInitializer {
    public static final String MOD_ID = "stuff";
    public static final Item COIN_ITEM = new CoinItem(new FabricItemSettings());

    @Override
    public void onInitialize() {
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, "coin_item"), COIN_ITEM);
        GeckoLib.initialize();
    }
}
