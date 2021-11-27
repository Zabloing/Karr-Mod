package net.pongascreaj.client.renderer;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.pongascreaj.client.entmodel.ExampleEntityModel;
import net.pongascreaj.karr.Karr;
import net.pongascreaj.karr.entity.ExampleEntity;

public class ExampleEntityRenderer<Type extends ExampleEntity> extends MobRenderer<Type, ExampleEntityModel<Type>> {

    private static final ResourceLocation TEXTURE = new ResourceLocation(Karr.MOD_ID,
            "textures/entities/example_entity.png");

    public ExampleEntityRenderer(EntityRendererProvider.Context context) {
        super(context, new ExampleEntityModel<>(), 0.5f);
    }

    @Override
    public ResourceLocation getTextureLocation(Type pEntity) {
        return TEXTURE;
    }
}
