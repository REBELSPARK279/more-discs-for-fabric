package net.rebelspark.more_discs_rebelspark.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.rebelspark.more_discs_rebelspark.item.ModItems;
import net.rebelspark.more_discs_rebelspark.util.ModTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        valueLookupBuilder(ItemTags.CREEPER_DROP_MUSIC_DISCS)

                //COMMON

                .add(ModItems.DEAD_VOXEL_MUSIC_DISC)
                .add(ModItems.DRY_HANDS_MUSIC_DISC)
                .add(ModItems.EXCUSE_MUSIC_DISC)
                .add(ModItems.FLOATING_TREES_MUSIC_DISC)
                .add(ModItems.HAUNT_MUSKIE_MUSIC_DISC)
                .add(ModItems.HEADBUG_MUSIC_DISC)
                .add(ModItems.KEY_MUSIC_DISC)
                .add(ModItems.KI_MUSIC_DISC)
                .add(ModItems.SWEDEN_MUSIC_DISC)

                //UNCOMMON

                .add(ModItems.BLIND_SPOTS_MUSIC_DISC)
                .add(ModItems.DOOR_MUSIC_DISC)
                .add(ModItems.LIVING_MICE_MUSIC_DISC)
                .add(ModItems.MOOG_CITY_MUSIC_DISC)
                .add(ModItems.MUTATION_MUSIC_DISC)

        ;

    }
}
