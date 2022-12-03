package io.github.sjouwer.dontdisappear.mixin;

import io.github.sjouwer.dontdisappear.DontDisappear;
import net.minecraft.block.entity.BlockEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(BlockEntity.class)
public abstract class MixinBlockEntity {

    @Inject(method = "getSquaredRenderDistance", at = @At("HEAD"), cancellable = true)
    public void getSquaredRenderDistance(CallbackInfoReturnable<Double> info) {
        info.setReturnValue((double) DontDisappear.getConfig().squaredBlockEntityRenderDistance());
    }
}
