package net.pongascreaj.karr.events;

import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.pongascreaj.karr.Karr;
import net.pongascreaj.karr.entity.ExampleEntity;
import net.pongascreaj.karr.entity.ModEntities;

@Mod.EventBusSubscriber(modid = Karr.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEvents {

    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(ModEntities.EXAMPLE_ENTITY.get(), ExampleEntity.createAttributes().build());

    }
}
