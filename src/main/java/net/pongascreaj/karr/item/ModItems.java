package net.pongascreaj.karr.item;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.pongascreaj.karr.Karr;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Karr.MOD_ID);

    public static final RegistryObject<Item> SQUID_FLESH = ITEMS.register("squid_flesh",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
