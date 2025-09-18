package net.rebelspark.more_discs_rebelspark.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
//OLD import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.minecraft.client.data.BlockStateModelGenerator;
import net.minecraft.client.data.ItemModelGenerator;
import net.minecraft.client.data.Model;
import net.minecraft.client.data.Models;
import net.rebelspark.more_discs_rebelspark.item.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {


      }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

        itemModelGenerator.register(ModItems.DOG_DISC_FRAGMENT, Models.GENERATED);
        itemModelGenerator.register(ModItems.MOOG_CITY2_DISC_FRAGMENT, Models.GENERATED);
        itemModelGenerator.register(ModItems.MINECRAFT_DISC_FRAGMENT, Models.GENERATED);
        itemModelGenerator.register(ModItems.THE_END_DISC_FRAGMENT, Models.GENERATED);

        itemModelGenerator.register(ModItems.EMPTY_DISC_CORE, Models.GENERATED);

        itemModelGenerator.register(ModItems.A_FAMILIAR_ROOM_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.ALPHA_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.ARIA_MATH_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.BACK_ON_DASH_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.BALLAD_OF_THE_CATS_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.BEGINNING_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.BEGINNING2_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.BIOME_FEST_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.BLIND_SPOTS_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.CASTLEMANIA_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.CASTLEMANIA2_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.CHRIS_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.CLARK_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.CONCRETE_HALLS_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.DANNY_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.DEAD_VOXEL_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.DEATH_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.DOG_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.DOOR_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.DREITON_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.DRY_HANDS_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.EXCUSE_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.EXECUTIONER_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.EQUINOXE_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.FLAKE_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.FLOATING_TREES_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.HAGGSTROM_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.HARDCOREMINECRAFT_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.HAUNT_MUSKIE_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.HEADBUG_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.INVINCIBLE_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.KEY_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.KI_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.LIVING_MICE_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.MICE_ON_VENUS_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.MINECRAFT_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.MOOG_CITY_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.MOOG_CITY2_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUTATION_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.OXYGENE_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.SUBWOOFER_LULLABY_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.SWEDEN_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.TASWELL_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.THE_END_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.WET_HANDS_MUSIC_DISC, Models.GENERATED);
    }
}