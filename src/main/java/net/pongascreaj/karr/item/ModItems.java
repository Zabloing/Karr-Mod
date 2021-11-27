package net.pongascreaj.karr.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.pongascreaj.karr.Karr;

//TODO CREATE FLUID
public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Karr.MOD_ID);
    //squid_flesh
    public static final RegistryObject<Item> SQUID_FLESH = ITEMS.register("squid_flesh",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD)));
    //sheep_milk_bucket
    public static final RegistryObject<Item> SHEEP_MILK_BUCKET = ITEMS.register("sheep_milk_bucket",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD)));
    //goat_milk_bucket
    public static final RegistryObject<Item> GOAT_MILK_BUCKET = ITEMS.register("goat_milk_bucket",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD)));
    //oil_bucket
    public static final RegistryObject<Item> OIL_BUCKET = ITEMS.register("oil_bucket",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    //blood_bucket
    public static final RegistryObject<Item> BLOOD_BUCKET = ITEMS.register("blood_bucket",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    //urine_bucket
    public static final RegistryObject<Item> URINE_BUCKET = ITEMS.register("urine_bucket",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    //rice
    public static final RegistryObject<Item> RICE = ITEMS.register("rice",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD)));
    //spinal_bucket
    public static final RegistryObject<Item> SPINAL_BUCKET = ITEMS.register("spinal_bucket",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    //acid_bucket
    public static final RegistryObject<Item> ACID_BUCKET = ITEMS.register("acid_bucket",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    //skin_flake
    public static final RegistryObject<Item> SKIN_FLAKE = ITEMS.register("skin_flake",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(64)));
    //mystery_meat
    public static final RegistryObject<Item> MYSTERY_MEAT = ITEMS.register("mystery_meat",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(64)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
