package net.pongascreaj.karr.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.pongascreaj.karr.Karr;
import net.pongascreaj.karr.item.ModItems;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Karr.MOD_ID);
    //flesh_block
    public static final RegistryObject<Block> FLESH_BLOCK = registerBlock("flesh_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(6f)));
    //googic_bone
    public static final RegistryObject<Block> GOOGIC_BONE = registerBlock("googic_bone",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.STONE).strength(10f)));
    //fat_block
    public static final RegistryObject<Block> FAT_BLOCK = registerBlock("fat_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(8f)));
    //skin_block
    public static final RegistryObject<Block> SKIN_BLOCK = registerBlock("skin_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(12f).requiresCorrectToolForDrops()));
    //charred_googic_bone
    public static final RegistryObject<Block> CHARRED_GOOGIC_BONE = registerBlock("charred_googic_bone",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.STONE).strength(10f)));
    //charred_flesh_block
    public static final RegistryObject<Block> CHARRED_FLESH_BLOCK = registerBlock("charred_flesh_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.SAND).strength(8f)));


    //block stuff
    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
