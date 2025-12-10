package com.tenshiku.tenshiOrigins;

import com.starshootercity.OriginsAddon;
import com.starshootercity.abilities.types.Ability;
import com.tenshiku.tenshiOrigins.Powers.DragonFireBall;
import com.tenshiku.tenshiOrigins.Powers.HelmetSunProtection;
import com.tenshiku.tenshiOrigins.Powers.DaylightWeakness;
import com.tenshiku.tenshiOrigins.Powers.Carnivorous;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public final class TenshiOrigins extends OriginsAddon {

    private final HelmetSunProtection helmetSunProtection = new HelmetSunProtection();
    private final DaylightWeakness daylightWeakness = new DaylightWeakness();

    @Override
    public @NotNull String getNamespace() {
        return "tenshiorigins";
    }

    @Override
    public @NotNull List<Ability> getRegisteredAbilities() {
        return List.of(
                helmetSunProtection,
                daylightWeakness,
                new Carnivorous(),
                new DragonFireBall()
        );
    }

    @Override
    public void onRegister() {
        getLogger().info("TenshiOrigins addon has been loaded!");
        getLogger().info("Powers registered:");
        getLogger().info("  - tenshiorigins:helmet_sun_protection");
        getLogger().info("  - tenshiorigins:daylight_weakness");
        getLogger().info("  - tenshiorigins:carnivorous");
        getLogger().info("  - tenshiorigins:dragon_fireball");
        getLogger().info("Add these powers to your vampire origin configuration.");

        daylightWeakness.startTask(this);
    }
}