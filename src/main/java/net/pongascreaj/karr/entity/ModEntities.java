package net.pongascreaj.karr.entity;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.pongascreaj.karr.Karr;

public class ModEntities {
    //registration stuff
    public static final DeferredRegister<EntityType<?>> ENTITIES =
            DeferredRegister.create(ForgeRegistries.ENTITIES, Karr.MOD_ID);
    public static void register(IEventBus eventBus) {
        ENTITIES.register(eventBus);
    }

    //example_entity
    public static final RegistryObject<EntityType<ExampleEntity>> EXAMPLE_ENTITY = ENTITIES.register("example_entity", () ->
            EntityType.Builder.of(ExampleEntity::new, MobCategory.CREATURE).sized(0.8f, 0.6f)
                    .build(new ResourceLocation(Karr.MOD_ID, "example_entity").toString()));
}
