package lekavar.lma.drinkbeer.entities.damages;

import net.minecraft.network.chat.Component;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.LivingEntity;
//import net.minecraftforge.client.event.RenderGameOverlayEvent;

public class AlcoholDamage extends DamageSource {
    public AlcoholDamage() {
        super("drinkbeer.alcohol");
    }

    // TODO Check if needed
    /* Not sure about this override, the parent method should do just fine...
    @Override
    public Component getLocalizedDeathMessage(LivingEntity entity) {
        String str = "death.attack." + this.getMsgId();
        return Component.translatable(str, entity.getDisplayName());
    }
     */
}
